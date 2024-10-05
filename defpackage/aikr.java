package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aikr implements aikp {
    private static final acsc c = acsb.b(28631);
    public final acra a;
    public String b;
    private final aioc d;
    private final ayqw e = new ayqw();
    private final aypn f;
    private String g;

    public aikr(acra acraVar, aioc aiocVar, aypn aypnVar) {
        this.a = acraVar;
        this.d = aiocVar;
        this.f = aypnVar;
    }

    @Override // defpackage.aikp
    public final void a(aikb aikbVar) {
        if (aikbVar.c().h()) {
            this.a.n(new acqx((acrb) aikbVar.c().c()));
        }
    }

    @Override // defpackage.aikp
    public final void b(aikb aikbVar) {
        if (aikbVar.c().h()) {
            this.a.I(3, new acqx((acrb) aikbVar.c().c()), null);
        }
    }

    @Override // defpackage.aikp
    public final void c() {
        if (this.e.a() == 0) {
            final int i = 0;
            this.e.d(this.d.ae(aidf.j, aidf.k).X(new ayrs(this) { // from class: aikq
                public final /* synthetic */ aikr a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i == 0) {
                        this.a.b = ((ahdp) obj).b();
                        return;
                    }
                    aikr aikrVar = this.a;
                    acqx acqxVar = new acqx(acrb.PUSH_NOTIFICATION_DISMISSAL);
                    aikrVar.a.n(acqxVar);
                    aikrVar.a.I(3, acqxVar, null);
                }
            }));
            final int i2 = 1;
            this.e.d(this.f.X(new ayrs(this) { // from class: aikq
                public final /* synthetic */ aikr a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i2 == 0) {
                        this.a.b = ((ahdp) obj).b();
                        return;
                    }
                    aikr aikrVar = this.a;
                    acqx acqxVar = new acqx(acrb.PUSH_NOTIFICATION_DISMISSAL);
                    aikrVar.a.n(acqxVar);
                    aikrVar.a.I(3, acqxVar, null);
                }
            }));
        }
        String str = this.b;
        if (str == null || Objects.equals(this.g, str)) {
            return;
        }
        this.a.d(c, null, null);
        this.g = this.b;
    }

    @Override // defpackage.aikp
    public final void d() {
        this.a.I(3, new acqx(acrb.PUSH_NOTIFICATION), null);
    }

    @Override // defpackage.aikp
    public final void e() {
        if (this.e.a() > 0) {
            this.a.t();
            this.g = null;
            this.b = null;
            this.e.c();
        }
    }
}
