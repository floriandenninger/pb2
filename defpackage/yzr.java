package defpackage;

import android.R;
import android.content.res.Resources;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class yzr {
    private final aeb a;
    public final View b;
    public int c;
    public long d;
    public long e;
    private int f;
    private zcg g;

    public yzr() {
    }

    public static int g(Resources resources) {
        if (resources != null) {
            return resources.getInteger(R.integer.config_mediumAnimTime);
        }
        return 0;
    }

    private final void n(boolean z, boolean z2) {
        this.g.c(this.b);
        if (z2) {
            if ((z ? this.e : this.d) > 0 && jw.aj(this.b)) {
                final int i = 1;
                final int i2 = 0;
                if (z) {
                    long j = this.e;
                    this.b.setVisibility(0);
                    o(1);
                    this.g.b(this.b, j, new zcf(this) { // from class: zap
                        public final /* synthetic */ yzr a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.zcf
                        public final void a() {
                            if (i2 != 0) {
                                this.a.i();
                            } else {
                                this.a.m();
                            }
                        }
                    });
                    return;
                }
                long j2 = this.d;
                this.b.setVisibility(0);
                o(3);
                this.g.a(this.b, j2, new zcf(this) { // from class: zap
                    public final /* synthetic */ yzr a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.zcf
                    public final void a() {
                        if (i != 0) {
                            this.a.i();
                        } else {
                            this.a.m();
                        }
                    }
                });
                return;
            }
        }
        if (z) {
            m();
        } else {
            i();
        }
    }

    private final void o(int i) {
        if (i == this.c) {
            return;
        }
        this.c = i;
        int i2 = 0;
        while (true) {
            aeb aebVar = this.a;
            if (i2 >= aebVar.b) {
                return;
            }
            ((zch) aebVar.b(i2)).nE(i, this);
            i2++;
        }
    }

    public void a(boolean z, boolean z2) {
        if (z2 && z == e()) {
            return;
        }
        n(z, z2);
    }

    public final void b(boolean z) {
        a(false, z);
    }

    public final void c(boolean z) {
        a(true, z);
    }

    public final boolean d() {
        int i = this.c;
        return i == 0 || i == 3;
    }

    public final boolean e() {
        int i = this.c;
        return i == 2 || i == 1;
    }

    public final boolean f() {
        int i = this.c;
        return i == 2 || i == 3;
    }

    public final void h(zch zchVar) {
        aeb aebVar = this.a;
        zchVar.getClass();
        aebVar.add(zchVar);
    }

    public final void i() {
        this.b.setVisibility(this.f);
        o(0);
    }

    public final void j(zch zchVar) {
        aeb aebVar = this.a;
        zchVar.getClass();
        aebVar.remove(zchVar);
    }

    public final void k(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        if (this.c == 0) {
            i();
        }
    }

    public final void l(zcg zcgVar) {
        zcgVar.getClass();
        this.g = zcgVar;
    }

    public final void m() {
        this.b.setVisibility(0);
        o(2);
    }

    public yzr(View view) {
        this(view, null);
    }

    public yzr(View view, byte[] bArr) {
        this(view, g(view.getResources()), 8);
    }

    public yzr(View view, long j, int i) {
        this(view, j, new nqh(2), i);
    }

    public yzr(View view, long j, zcg zcgVar, int i) {
        view.getClass();
        this.b = view;
        this.a = new aeb();
        l(zcgVar);
        this.e = j;
        this.d = j;
        this.f = i;
        n(view.getVisibility() == 0, false);
    }
}
