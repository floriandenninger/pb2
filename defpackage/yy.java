package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yy {
    final yx a;
    final axln b = new axln(null);

    public yy(yx yxVar) {
        this.a = yxVar;
    }

    public final View a(int i, int i2, int i3, int i4) {
        int d = this.a.d();
        int c = this.a.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View e = this.a.e(i);
            this.b.d(d, c, this.a.b(e), this.a.a(e));
            this.b.c();
            this.b.b(i3);
            if (this.b.e()) {
                return e;
            }
            if (i4 != 0) {
                this.b.c();
                this.b.b(i4);
                if (this.b.e()) {
                    view = e;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean b(View view) {
        this.b.d(this.a.d(), this.a.c(), this.a.b(view), this.a.a(view));
        this.b.c();
        this.b.b(24579);
        return this.b.e();
    }
}
