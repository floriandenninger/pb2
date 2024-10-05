package defpackage;

import j$.util.Optional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ilp {
    public final Executor a;
    public final String b;
    public auki c = auki.a;
    public boolean d;
    public int e;
    public int f;
    public final vgz g;

    public ilp(vgz vgzVar, aok aokVar, Executor executor, shf shfVar) {
        this.g = vgzVar;
        this.a = executor;
        this.b = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date(shfVar.c()));
        ynm.n(aokVar, vgzVar.a(), hue.n, new zfi() { // from class: iln
            @Override // defpackage.zfi
            public final void a(Object obj) {
                ilp ilpVar = ilp.this;
                iop iopVar = (iop) obj;
                if (!ilpVar.b.equals(iopVar.e)) {
                    ilpVar.f = 0;
                    ilpVar.e = 0;
                } else {
                    ilpVar.f = iopVar.c;
                    ilpVar.e = iopVar.d;
                    ilpVar.d = iopVar.b | ilpVar.d;
                }
            }
        });
    }

    public final void a(auki aukiVar) {
        aukiVar.getClass();
        this.c = aukiVar;
    }

    public final boolean b() {
        return d() == 2;
    }

    public final int d() {
        auki aukiVar = this.c;
        int i = aukiVar.b;
        if ((i & 2) != 0) {
            if (aukiVar.d > 0 && this.d) {
                return 4;
            }
        } else if ((i & 1) == 0) {
            return 3;
        }
        if ((i & 1) == 0) {
            return 2;
        }
        int i2 = aukiVar.c;
        if (i2 == 0) {
            return 3;
        }
        return (i2 <= 0 || this.e < i2) ? 2 : 3;
    }

    public final void c() {
        if (this.d) {
            auki aukiVar = this.c;
            if ((aukiVar.b & 2) != 0 && aukiVar.d > 0) {
                Optional.empty();
                return;
            }
        }
        this.e++;
        Optional.of(this.g.b(new ilo(this, 1), this.a));
    }
}
