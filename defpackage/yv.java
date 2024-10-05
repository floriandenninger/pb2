package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yv implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static yv a;
    public static yv b;
    public final View c;
    private final CharSequence d;
    private final int e;
    private final Runnable f = new yu(this, 1);
    private final Runnable g = new yu(this, 0);
    private int h;
    private int i;
    private yw j;
    private boolean k;

    public yv(View view, CharSequence charSequence) {
        this.c = view;
        this.d = charSequence;
        this.e = jx.c(ViewConfiguration.get(view.getContext()));
        d();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(yv yvVar) {
        yv yvVar2 = a;
        if (yvVar2 != null) {
            yvVar2.c.removeCallbacks(yvVar2.f);
        }
        a = yvVar;
        if (yvVar != null) {
            yvVar.c.postDelayed(yvVar.f, ViewConfiguration.getLongPressTimeout());
        }
    }

    private final void d() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
    }

    public final void a() {
        if (b == this) {
            b = null;
            yw ywVar = this.j;
            if (ywVar != null) {
                ywVar.a();
                this.j = null;
                d();
                this.c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (a == this) {
            b(null);
        }
        this.c.removeCallbacks(this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        int height;
        int i;
        long j;
        int longPressTimeout;
        long j2;
        if (jw.aj(this.c)) {
            b(null);
            yv yvVar = b;
            if (yvVar != null) {
                yvVar.a();
            }
            b = this;
            this.k = z;
            yw ywVar = new yw(this.c.getContext());
            this.j = ywVar;
            View view = this.c;
            int i2 = this.h;
            int i3 = this.i;
            boolean z2 = this.k;
            CharSequence charSequence = this.d;
            if (ywVar.b()) {
                ywVar.a();
            }
            ywVar.c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = ywVar.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = ywVar.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i2 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = ywVar.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = ywVar.a.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (!(context instanceof Activity)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(ywVar.e);
                if (ywVar.e.left < 0 && ywVar.e.top < 0) {
                    Resources resources = ywVar.a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    ywVar.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(ywVar.g);
                view.getLocationOnScreen(ywVar.f);
                int[] iArr = ywVar.f;
                int i4 = iArr[0];
                int[] iArr2 = ywVar.g;
                iArr[0] = i4 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i2) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ywVar.b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = ywVar.b.getMeasuredHeight();
                int i5 = ywVar.f[1];
                int i6 = ((i + i5) - dimensionPixelOffset3) - measuredHeight;
                int i7 = i5 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i6 >= 0) {
                        layoutParams.y = i6;
                    } else {
                        layoutParams.y = i7;
                    }
                } else if (measuredHeight + i7 <= ywVar.e.height()) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i6;
                }
            }
            ((WindowManager) ywVar.a.getSystemService("window")).addView(ywVar.b, ywVar.d);
            this.c.addOnAttachStateChangeListener(this);
            if (this.k) {
                j2 = 2500;
            } else {
                if ((jw.j(this.c) & 1) == 1) {
                    j = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j - longPressTimeout;
            }
            this.c.removeCallbacks(this.g);
            this.c.postDelayed(this.g, j2);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.j != null && this.k) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.c.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                d();
                a();
            }
        } else if (this.c.isEnabled() && this.j == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.h) > this.e || Math.abs(y - this.i) > this.e) {
                this.h = x;
                this.i = y;
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
