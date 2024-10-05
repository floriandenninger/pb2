package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rc {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final qq e;
    private final boolean f;
    private final int g;
    private boolean h;
    private rd i;
    private ra j;
    private final PopupWindow.OnDismissListener k;

    public rc(Context context, qq qqVar, View view, boolean z) {
        this(context, qqVar, view, z, R.attr.actionOverflowMenuStyle);
    }

    public final ra a() {
        ra rlVar;
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                rlVar = new qk(this.d, this.a, this.g, this.f);
            } else {
                rlVar = new rl(this.d, this.e, this.a, this.g, this.f);
            }
            rlVar.j(this.e);
            rlVar.p(this.k);
            rlVar.l(this.a);
            rlVar.d(this.i);
            rlVar.m(this.h);
            rlVar.n(this.b);
            this.j = rlVar;
        }
        return this.j;
    }

    public final void b() {
        if (h()) {
            this.j.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        ra raVar = this.j;
        if (raVar != null) {
            raVar.m(z);
        }
    }

    public final void e(rd rdVar) {
        this.i = rdVar;
        ra raVar = this.j;
        if (raVar != null) {
            raVar.d(rdVar);
        }
    }

    public final void f() {
        if (!i()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void g(int i, int i2, boolean z, boolean z2) {
        ra a = a();
        a.q(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, jw.e(this.a)) & 7) == 5) {
                i -= this.a.getWidth();
            }
            a.o(i);
            a.r(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.g = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.s();
    }

    public final boolean h() {
        ra raVar = this.j;
        return raVar != null && raVar.u();
    }

    public final boolean i() {
        if (h()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        g(0, 0, false, false);
        return true;
    }

    public rc(Context context, qq qqVar, View view, boolean z, int i) {
        this.b = 8388611;
        this.k = new rb(this);
        this.d = context;
        this.e = qqVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }
}
