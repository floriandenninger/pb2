package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hdt {
    public final View a;
    public how b;
    public boolean c;
    private final hoz d;
    private final boolean e;
    private final View f;
    private final View g;
    private final View h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private final jqr m;

    public hdt(how howVar, hoz hozVar, boolean z, jqr jqrVar, View view, View view2, View view3, View view4, byte[] bArr) {
        this.b = howVar;
        this.d = hozVar;
        this.e = z;
        this.m = jqrVar;
        this.a = view;
        this.f = view2;
        this.g = view3;
        this.h = view4;
    }

    static boolean d(boolean z, boolean z2) {
        return z && z2;
    }

    private final void e(boolean z, boolean z2, int i) {
        if (z != z2) {
            hfq a = this.m.a(acsb.c(i));
            a.h(z2);
            a.g();
        }
    }

    public final void a() {
        if (fkc.D(this.a)) {
            this.l = fkc.D(this.h);
            this.j = fkc.D(this.g);
            this.k = this.g.isEnabled();
            this.i = fkc.D(this.f);
        }
    }

    public final void b(boolean z) {
        a();
        fhe.H(this.a, z);
        how howVar = this.b;
        boolean z2 = false;
        if (howVar != null && howVar.D()) {
            z2 = true;
        }
        c(z2, z);
    }

    public final void c(boolean z, boolean z2) {
        boolean d = d(z, z2);
        fhe.H(this.f, d);
        boolean d2 = d(z, z2);
        fhe.H(this.g, d2);
        hoz hozVar = this.d;
        boolean z3 = true;
        boolean z4 = hozVar != null && hozVar.d >= hozVar.b;
        this.g.setEnabled(z4);
        this.g.findViewById(R.id.shorts_camera_next_button).setEnabled(z4);
        boolean z5 = this.e;
        boolean c = this.d.c();
        if (!z5 ? z || !z2 : !c || !z2) {
            z3 = false;
        }
        fhe.H(this.h, z3);
        if (z2 && this.c) {
            e(this.i, d, 96642);
            e(this.l, z3, 96652);
            boolean z6 = this.j;
            boolean z7 = this.k;
            if (z6 == d2 && z7 == z4) {
                return;
            }
            if (!z6) {
                if (d2) {
                    if (z4) {
                        this.m.a(acsb.c(96644)).e();
                        return;
                    } else {
                        this.m.a(acsb.c(98531)).e();
                        return;
                    }
                }
                return;
            }
            if (!d2) {
                if (z7) {
                    this.m.a(acsb.c(96644)).d();
                    return;
                } else {
                    this.m.a(acsb.c(98531)).d();
                    return;
                }
            }
            if (z4) {
                this.m.a(acsb.c(98531)).d();
                this.m.a(acsb.c(96644)).e();
            } else {
                this.m.a(acsb.c(96644)).d();
                this.m.a(acsb.c(98531)).e();
            }
        }
    }
}
