package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class smd implements swv {
    public final slv a;
    private final /* synthetic */ int b;

    public smd(slv slvVar, int i) {
        this.b = i;
        this.a = slvVar;
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.swv
    public final aomu a() {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? aqkq.b : aqkj.b;
        }
        return aqko.b;
    }

    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, swu swuVar) {
        int i = this.b;
        final int i2 = 1;
        if (i == 0) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a.a();
                return ayph.f();
            }
            final slv slvVar = this.a;
            slvVar.getClass();
            return ayph.t(new ayrm() { // from class: ajig
                @Override // defpackage.ayrm
                public final void a() {
                    if (i2 != 0) {
                        slvVar.a();
                    } else {
                        slvVar.a();
                    }
                }
            }).E(ayqr.a());
        }
        if (i == 1) {
            final aqkj aqkjVar = (aqkj) obj;
            final sls a = slu.a();
            a.l = 1;
            int i3 = aqkjVar.c;
            if ((i3 & 1) != 0) {
                a.a = aqkjVar.d;
            }
            if ((i3 & 2) != 0) {
                a.b = aqkjVar.e;
            }
            if ((i3 & 4) != 0) {
                a.c = aqkjVar.f;
            }
            if ((i3 & 32) != 0) {
                awnw awnwVar = aqkjVar.i;
                if (awnwVar == null) {
                    awnwVar = awnw.a;
                }
                a.e = awnwVar;
            }
            int i4 = aqkjVar.c;
            if ((i4 & 8) != 0) {
                a.d = aqkjVar.g;
            }
            if ((i4 & 64) != 0) {
                awnw awnwVar2 = aqkjVar.j;
                if (awnwVar2 == null) {
                    awnwVar2 = awnw.a;
                }
                a.f = awnwVar2;
            }
            if ((aqkjVar.c & 512) != 0) {
                aqrd aqrdVar = aqkjVar.k;
                if (aqrdVar == null) {
                    aqrdVar = aqrd.a;
                }
                if ((aqrdVar.b & 4) != 0) {
                    aqrd aqrdVar2 = aqkjVar.k;
                    if (aqrdVar2 == null) {
                        aqrdVar2 = aqrd.a;
                    }
                    a.k = aqrdVar2.d;
                }
            }
            a.g = swuVar;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                slv slvVar2 = this.a;
                awos awosVar = aqkjVar.h;
                if (awosVar == null) {
                    awosVar = awos.a;
                }
                slvVar2.b(awosVar, a.a());
                return ayph.f();
            }
            final byte[] bArr = null;
            return ayph.t(new ayrm(aqkjVar, a, bArr) { // from class: smb
                public final /* synthetic */ aqkj a;
                public final /* synthetic */ sls b;

                @Override // defpackage.ayrm
                public final void a() {
                    smd smdVar = smd.this;
                    aqkj aqkjVar2 = this.a;
                    sls slsVar = this.b;
                    slv slvVar3 = smdVar.a;
                    awos awosVar2 = aqkjVar2.h;
                    if (awosVar2 == null) {
                        awosVar2 = awos.a;
                    }
                    slvVar3.b(awosVar2, slsVar.a());
                }
            }).E(ayqr.a());
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.a();
            return ayph.f();
        }
        final slv slvVar3 = this.a;
        slvVar3.getClass();
        final int i5 = 0;
        return ayph.t(new ayrm() { // from class: ajig
            @Override // defpackage.ayrm
            public final void a() {
                if (i5 != 0) {
                    slvVar3.a();
                } else {
                    slvVar3.a();
                }
            }
        }).E(ayqr.a());
    }
}
