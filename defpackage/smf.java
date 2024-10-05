package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class smf implements swv {
    public final slx a;
    private final /* synthetic */ int b;

    public smf(slx slxVar, int i) {
        this.b = i;
        this.a = slxVar;
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.swv
    public final aomu a() {
        int i = this.b;
        if (i == 0) {
            return aqks.b;
        }
        if (i != 1) {
            return i != 2 ? autt.b : audt.b;
        }
        return aqkp.b;
    }

    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, final swu swuVar) {
        int i = this.b;
        if (i == 0) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a.a();
                return ayph.f();
            }
            final slx slxVar = this.a;
            slxVar.getClass();
            final int i2 = 0;
            return ayph.t(new ayrm() { // from class: sme
                @Override // defpackage.ayrm
                public final void a() {
                    if (i2 != 0) {
                        slxVar.a();
                    } else {
                        slxVar.a();
                    }
                }
            }).E(ayqr.a());
        }
        final int i3 = 1;
        if (i == 1) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a.a();
                return ayph.f();
            }
            final slx slxVar2 = this.a;
            slxVar2.getClass();
            return ayph.t(new ayrm() { // from class: sme
                @Override // defpackage.ayrm
                public final void a() {
                    if (i3 != 0) {
                        slxVar2.a();
                    } else {
                        slxVar2.a();
                    }
                }
            }).E(ayqr.a());
        }
        final byte[] bArr = null;
        if (i != 2) {
            final autt auttVar = (autt) obj;
            if ((auttVar.c & 1) == 0 || swuVar.a == null) {
                return ayph.f();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                slx slxVar3 = this.a;
                awos awosVar = auttVar.d;
                if (awosVar == null) {
                    awosVar = awos.a;
                }
                slxVar3.b(awosVar, swuVar.a);
                return ayph.f();
            }
            return ayph.t(new ayrm(auttVar, swuVar, bArr) { // from class: smr
                public final /* synthetic */ autt a;
                public final /* synthetic */ swu b;

                @Override // defpackage.ayrm
                public final void a() {
                    smf smfVar = smf.this;
                    autt auttVar2 = this.a;
                    swu swuVar2 = this.b;
                    slx slxVar4 = smfVar.a;
                    awos awosVar2 = auttVar2.d;
                    if (awosVar2 == null) {
                        awosVar2 = awos.a;
                    }
                    slxVar4.b(awosVar2, swuVar2.a);
                }
            }).E(ayqr.a());
        }
        final audt audtVar = (audt) obj;
        if ((audtVar.c & 1) == 0 || swuVar.a == null) {
            return ayph.f();
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            slx slxVar4 = this.a;
            awos awosVar2 = audtVar.d;
            if (awosVar2 == null) {
                awosVar2 = awos.a;
            }
            slxVar4.b(awosVar2, swuVar.a);
            return ayph.f();
        }
        return ayph.t(new ayrm(audtVar, swuVar, bArr) { // from class: smn
            public final /* synthetic */ audt a;
            public final /* synthetic */ swu b;

            @Override // defpackage.ayrm
            public final void a() {
                smf smfVar = smf.this;
                audt audtVar2 = this.a;
                swu swuVar2 = this.b;
                slx slxVar5 = smfVar.a;
                awos awosVar3 = audtVar2.d;
                if (awosVar3 == null) {
                    awosVar3 = awos.a;
                }
                slxVar5.b(awosVar3, swuVar2.a);
            }
        }).E(ayqr.a());
    }
}
