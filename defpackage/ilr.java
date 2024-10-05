package defpackage;

import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ilr {
    public View a;
    public View b;
    public View c;
    public View d;
    public TextView e;
    private boolean f;

    public final void a(boolean z) {
        boolean z2 = !z;
        this.f = z2;
        if (z2) {
            c();
        }
    }

    public final void b() {
        c();
        whu.I(this.c, false);
        whu.I(this.b, false);
        this.d.setOnClickListener(null);
        this.d.setClickable(false);
    }

    public final void c() {
        this.a.clearAnimation();
        whu.I(this.a, false);
    }

    public final void d(String str, Runnable runnable) {
        str.getClass();
        c();
        this.e.setText(str);
        whu.I(this.c, true);
        whu.I(this.b, true);
        whu.I(this.d, runnable != null);
        if (runnable != null) {
            this.d.setOnClickListener(new ilq(runnable, 0));
        }
        etx.P(this.c);
        etx.P(this.b);
    }

    public final void e() {
        if (this.f) {
            return;
        }
        etx.O(this.a, 1500L);
        whu.I(this.b, false);
        this.b.setOnClickListener(null);
        this.b.setClickable(false);
    }
}
