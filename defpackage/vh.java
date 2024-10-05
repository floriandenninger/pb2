package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.youtube.R;
import java.lang.reflect.Method;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class vh implements ri {
    private static Method a;
    private static Method b;
    private static Method c;
    private final Rect A;
    private Rect B;
    private Context d;
    public ug e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    int k;
    public View l;
    public AdapterView.OnItemClickListener m;
    final Handler n;
    public boolean o;
    public PopupWindow p;
    final vd q;
    private ListAdapter r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private DataSetObserver w;
    private final vg x;
    private final vf y;
    private final vd z;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public vh(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        if (this.v) {
            return this.t;
        }
        return 0;
    }

    public final Drawable c() {
        return this.p.getBackground();
    }

    public void e(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.w;
        if (dataSetObserver == null) {
            this.w = new ve(this);
        } else {
            ListAdapter listAdapter2 = this.r;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.r = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.w);
        }
        ug ugVar = this.e;
        if (ugVar != null) {
            ugVar.setAdapter(this.r);
        }
    }

    public final void f(Drawable drawable) {
        this.p.setBackgroundDrawable(drawable);
    }

    public final void g(int i) {
        this.g = i;
    }

    public final void j(int i) {
        this.t = i;
        this.v = true;
    }

    @Override // defpackage.ri
    public final ListView jC() {
        return this.e;
    }

    @Override // defpackage.ri
    public final void k() {
        this.p.dismiss();
        this.p.setContentView(null);
        this.e = null;
        this.n.removeCallbacks(this.q);
    }

    public final int o() {
        if (u()) {
            return this.e.getSelectedItemPosition();
        }
        return -1;
    }

    public ug p(Context context, boolean z) {
        return new ug(context, z);
    }

    public final void q() {
        ug ugVar = this.e;
        if (ugVar != null) {
            ugVar.a = true;
            ugVar.requestLayout();
        }
    }

    public final void r(int i) {
        Drawable background = this.p.getBackground();
        if (background == null) {
            this.f = i;
        } else {
            background.getPadding(this.A);
            this.f = this.A.left + this.A.right + i;
        }
    }

    @Override // defpackage.ri
    public final void s() {
        int i;
        int maxAvailableHeight;
        int makeMeasureSpec;
        if (this.e == null) {
            Context context = this.d;
            new vd(this, 1);
            ug p = p(context, !this.o);
            this.e = p;
            p.setAdapter(this.r);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new vc(this));
            this.e.setOnScrollListener(this.y);
            this.p.setContentView(this.e);
        }
        Drawable background = this.p.getBackground();
        if (background != null) {
            background.getPadding(this.A);
            i = this.A.top + this.A.bottom;
            if (!this.v) {
                this.t = -this.A.top;
            }
        } else {
            this.A.setEmpty();
            i = 0;
        }
        boolean z = this.p.getInputMethodMode() == 2;
        View view = this.l;
        int i2 = this.t;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = b;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(this.p, view, Integer.valueOf(i2), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            }
            maxAvailableHeight = this.p.getMaxAvailableHeight(view, i2);
        } else {
            maxAvailableHeight = this.p.getMaxAvailableHeight(view, i2, z);
        }
        if (this.s != -1) {
            int i3 = this.f;
            if (i3 == -2) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.A.left + this.A.right), CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            } else if (i3 == -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.A.left + this.A.right), 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
            maxAvailableHeight = this.e.b(makeMeasureSpec, maxAvailableHeight);
            i = maxAvailableHeight > 0 ? i + this.e.getPaddingTop() + this.e.getPaddingBottom() : 0;
        }
        int i4 = maxAvailableHeight + i;
        boolean x = x();
        jk.e(this.p, this.u);
        if (this.p.isShowing()) {
            if (jw.aj(this.l)) {
                int i5 = this.f;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.l.getWidth();
                }
                int i6 = this.s;
                if (i6 == -1) {
                    if (true != x) {
                        i4 = -1;
                    }
                    if (x) {
                        this.p.setWidth(this.f == -1 ? -1 : 0);
                        this.p.setHeight(0);
                    } else {
                        this.p.setWidth(this.f == -1 ? -1 : 0);
                        this.p.setHeight(-1);
                    }
                } else if (i6 != -2) {
                    i4 = i6;
                }
                this.p.setOutsideTouchable(true);
                this.p.update(this.l, this.g, this.t, i5 < 0 ? -1 : i5, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int i7 = this.f;
        if (i7 == -1) {
            i7 = -1;
        } else if (i7 == -2) {
            i7 = this.l.getWidth();
        }
        int i8 = this.s;
        if (i8 == -1) {
            i4 = -1;
        } else if (i8 != -2) {
            i4 = i8;
        }
        this.p.setWidth(i7);
        this.p.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = a;
            if (method2 != null) {
                try {
                    method2.invoke(this.p, true);
                } catch (Exception unused2) {
                }
            }
        } else {
            this.p.setIsClippedToScreen(true);
        }
        this.p.setOutsideTouchable(true);
        this.p.setTouchInterceptor(this.x);
        if (this.i) {
            jk.d(this.p, this.h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = c;
            if (method3 != null) {
                try {
                    method3.invoke(this.p, this.B);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            this.p.setEpicenterBounds(this.B);
        }
        lo.lG(this.p, this.l, this.g, this.t, this.j);
        this.e.setSelection(-1);
        if (!this.o || this.e.isInTouchMode()) {
            q();
        }
        if (this.o) {
            return;
        }
        this.n.post(this.z);
    }

    public final void t(Rect rect) {
        this.B = rect != null ? new Rect(rect) : null;
    }

    @Override // defpackage.ri
    public final boolean u() {
        return this.p.isShowing();
    }

    public final void v(PopupWindow.OnDismissListener onDismissListener) {
        this.p.setOnDismissListener(onDismissListener);
    }

    public final void w(int i) {
        ug ugVar = this.e;
        if (!u() || ugVar == null) {
            return;
        }
        ugVar.a = false;
        ugVar.setSelection(i);
        if (ugVar.getChoiceMode() != 0) {
            ugVar.setItemChecked(i, true);
        }
    }

    public final boolean x() {
        return this.p.getInputMethodMode() == 2;
    }

    public final void y() {
        this.p.setInputMethodMode(2);
    }

    public final void z() {
        this.o = true;
        this.p.setFocusable(true);
    }

    public vh(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public vh(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        this.s = -2;
        this.f = -2;
        this.u = 1002;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.q = new vd(this, 2);
        this.x = new vg(this);
        this.y = new vf(this);
        this.z = new vd(this, 0);
        this.A = new Rect();
        this.d = context;
        this.n = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nx.n, i, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.t = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.v = true;
        }
        obtainStyledAttributes.recycle();
        ss ssVar = new ss(context, attributeSet, i);
        this.p = ssVar;
        ssVar.setInputMethodMode(1);
    }
}
