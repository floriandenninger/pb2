package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aixc extends ajbh {
    public final axpg a;
    final shf b;
    private final aaoz f;
    private final aypn g;
    private final aadw j;
    private long h = -1;
    public float c = 1.0f;
    public boolean d = false;
    public boolean e = false;

    public aixc(axpg axpgVar, aaoz aaozVar, shf shfVar, aypn aypnVar, aadw aadwVar) {
        this.a = axpgVar;
        this.f = aaozVar;
        this.b = shfVar;
        this.g = aypnVar;
        this.j = aadwVar;
    }

    @Override // defpackage.ajbh
    public final void aj(ahef ahefVar) {
        aigj aigjVar = aigj.PLAYBACK_PENDING;
        aign aignVar = aign.NEW;
        int ordinal = ahefVar.c().ordinal();
        if (ordinal == 2) {
            boolean l = ahefVar.l();
            this.e = l;
            if (l && this.c > 1.0f) {
                y();
            }
            ((aixb) this.a.get()).F(this.c);
            return;
        }
        if (ordinal == 4) {
            this.d = true;
        } else if (ordinal == 7) {
            this.d = false;
        } else {
            if (ordinal != 9) {
                return;
            }
            z();
        }
    }

    @Override // defpackage.ajbh
    public final void ak(ahcr ahcrVar) {
        if (this.d) {
            return;
        }
        this.c = ahcrVar.a();
    }

    @Override // defpackage.ajbh
    public final void c(String str) {
        z();
    }

    @Override // defpackage.ajbh
    public final void e(aheg ahegVar) {
        long e = ahegVar.e();
        if (ahegVar.j() && this.e) {
            if ((this.c <= 1.0f || ahegVar.f() - e >= 500) && (this.c >= 1.0f || e - ahegVar.h() >= 500)) {
                return;
            }
            y();
            ((aixb) this.a.get()).F(this.c);
        }
    }

    @Override // defpackage.ajbh
    public final void v(ahej ahejVar) {
        if (ahejVar.a() == 3) {
            z();
            return;
        }
        if (ahejVar.a() == 2) {
            long d = this.b.d();
            avvf avvfVar = this.f.get().c.t;
            if (avvfVar == null) {
                avvfVar = avvf.a;
            }
            int i = avvfVar.c * 1000;
            long j = this.h;
            if (j != -1 && i > 0 && d - j > i) {
                this.c = 1.0f;
            }
            this.h = -1L;
            ((aixb) this.a.get()).F(this.c);
        }
    }

    public final void w() {
        ayqw ayqwVar = new ayqw();
        if (aifk.H(this.j)) {
            final int i = 1;
            ayqwVar.d(this.g.X(new ayrs(this) { // from class: aixa
                public final /* synthetic */ aixc a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i2 = i;
                    if (i2 == 0) {
                        this.a.ak((ahcr) obj);
                        return;
                    }
                    if (i2 == 1) {
                        this.a.d = ((ahel) obj).a().a() != 0;
                        return;
                    }
                    if (i2 == 2) {
                        this.a.z();
                        return;
                    }
                    if (i2 != 3) {
                        if (i2 == 4) {
                            this.a.e((aheg) obj);
                            return;
                        } else {
                            this.a.v((ahej) obj);
                            return;
                        }
                    }
                    aixc aixcVar = this.a;
                    ahds ahdsVar = (ahds) obj;
                    aigj aigjVar = aigj.PLAYBACK_PENDING;
                    aign aignVar = aign.NEW;
                    int ordinal = ahdsVar.b().ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 7) {
                            return;
                        }
                        aixcVar.z();
                        return;
                    }
                    PlayerResponseModel a = ahdsVar.a();
                    if (a != null && a.C()) {
                        r1 = true;
                    }
                    aixcVar.e = r1;
                    if (r1 && aixcVar.c > 1.0f) {
                        aixcVar.y();
                    }
                    ((aixb) aixcVar.a.get()).F(aixcVar.c);
                }
            }));
            final int i2 = 0;
            ayqwVar.d(ahbw.c(this.g, aipq.l).X(new ayrs(this) { // from class: aixa
                public final /* synthetic */ aixc a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i22 = i2;
                    if (i22 == 0) {
                        this.a.ak((ahcr) obj);
                        return;
                    }
                    if (i22 == 1) {
                        this.a.d = ((ahel) obj).a().a() != 0;
                        return;
                    }
                    if (i22 == 2) {
                        this.a.z();
                        return;
                    }
                    if (i22 != 3) {
                        if (i22 == 4) {
                            this.a.e((aheg) obj);
                            return;
                        } else {
                            this.a.v((ahej) obj);
                            return;
                        }
                    }
                    aixc aixcVar = this.a;
                    ahds ahdsVar = (ahds) obj;
                    aigj aigjVar = aigj.PLAYBACK_PENDING;
                    aign aignVar = aign.NEW;
                    int ordinal = ahdsVar.b().ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 7) {
                            return;
                        }
                        aixcVar.z();
                        return;
                    }
                    PlayerResponseModel a = ahdsVar.a();
                    if (a != null && a.C()) {
                        r1 = true;
                    }
                    aixcVar.e = r1;
                    if (r1 && aixcVar.c > 1.0f) {
                        aixcVar.y();
                    }
                    ((aixb) aixcVar.a.get()).F(aixcVar.c);
                }
            }));
            final int i3 = 2;
            ayqwVar.d(ahbw.c(this.g, aipq.m).X(new ayrs(this) { // from class: aixa
                public final /* synthetic */ aixc a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i22 = i3;
                    if (i22 == 0) {
                        this.a.ak((ahcr) obj);
                        return;
                    }
                    if (i22 == 1) {
                        this.a.d = ((ahel) obj).a().a() != 0;
                        return;
                    }
                    if (i22 == 2) {
                        this.a.z();
                        return;
                    }
                    if (i22 != 3) {
                        if (i22 == 4) {
                            this.a.e((aheg) obj);
                            return;
                        } else {
                            this.a.v((ahej) obj);
                            return;
                        }
                    }
                    aixc aixcVar = this.a;
                    ahds ahdsVar = (ahds) obj;
                    aigj aigjVar = aigj.PLAYBACK_PENDING;
                    aign aignVar = aign.NEW;
                    int ordinal = ahdsVar.b().ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 7) {
                            return;
                        }
                        aixcVar.z();
                        return;
                    }
                    PlayerResponseModel a = ahdsVar.a();
                    if (a != null && a.C()) {
                        r1 = true;
                    }
                    aixcVar.e = r1;
                    if (r1 && aixcVar.c > 1.0f) {
                        aixcVar.y();
                    }
                    ((aixb) aixcVar.a.get()).F(aixcVar.c);
                }
            }));
            final int i4 = 5;
            ayqwVar.d(ahbw.c(this.g, aipq.o).X(new ayrs(this) { // from class: aixa
                public final /* synthetic */ aixc a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i22 = i4;
                    if (i22 == 0) {
                        this.a.ak((ahcr) obj);
                        return;
                    }
                    if (i22 == 1) {
                        this.a.d = ((ahel) obj).a().a() != 0;
                        return;
                    }
                    if (i22 == 2) {
                        this.a.z();
                        return;
                    }
                    if (i22 != 3) {
                        if (i22 == 4) {
                            this.a.e((aheg) obj);
                            return;
                        } else {
                            this.a.v((ahej) obj);
                            return;
                        }
                    }
                    aixc aixcVar = this.a;
                    ahds ahdsVar = (ahds) obj;
                    aigj aigjVar = aigj.PLAYBACK_PENDING;
                    aign aignVar = aign.NEW;
                    int ordinal = ahdsVar.b().ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 7) {
                            return;
                        }
                        aixcVar.z();
                        return;
                    }
                    PlayerResponseModel a = ahdsVar.a();
                    if (a != null && a.C()) {
                        r1 = true;
                    }
                    aixcVar.e = r1;
                    if (r1 && aixcVar.c > 1.0f) {
                        aixcVar.y();
                    }
                    ((aixb) aixcVar.a.get()).F(aixcVar.c);
                }
            }));
            final int i5 = 4;
            ayqwVar.d(ahbw.c(this.g, aipq.k).X(new ayrs(this) { // from class: aixa
                public final /* synthetic */ aixc a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i22 = i5;
                    if (i22 == 0) {
                        this.a.ak((ahcr) obj);
                        return;
                    }
                    if (i22 == 1) {
                        this.a.d = ((ahel) obj).a().a() != 0;
                        return;
                    }
                    if (i22 == 2) {
                        this.a.z();
                        return;
                    }
                    if (i22 != 3) {
                        if (i22 == 4) {
                            this.a.e((aheg) obj);
                            return;
                        } else {
                            this.a.v((ahej) obj);
                            return;
                        }
                    }
                    aixc aixcVar = this.a;
                    ahds ahdsVar = (ahds) obj;
                    aigj aigjVar = aigj.PLAYBACK_PENDING;
                    aign aignVar = aign.NEW;
                    int ordinal = ahdsVar.b().ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 7) {
                            return;
                        }
                        aixcVar.z();
                        return;
                    }
                    PlayerResponseModel a = ahdsVar.a();
                    if (a != null && a.C()) {
                        r1 = true;
                    }
                    aixcVar.e = r1;
                    if (r1 && aixcVar.c > 1.0f) {
                        aixcVar.y();
                    }
                    ((aixb) aixcVar.a.get()).F(aixcVar.c);
                }
            }));
            final int i6 = 3;
            ayqwVar.d(ahbw.c(this.g, aipq.n).X(new ayrs(this) { // from class: aixa
                public final /* synthetic */ aixc a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i22 = i6;
                    if (i22 == 0) {
                        this.a.ak((ahcr) obj);
                        return;
                    }
                    if (i22 == 1) {
                        this.a.d = ((ahel) obj).a().a() != 0;
                        return;
                    }
                    if (i22 == 2) {
                        this.a.z();
                        return;
                    }
                    if (i22 != 3) {
                        if (i22 == 4) {
                            this.a.e((aheg) obj);
                            return;
                        } else {
                            this.a.v((ahej) obj);
                            return;
                        }
                    }
                    aixc aixcVar = this.a;
                    ahds ahdsVar = (ahds) obj;
                    aigj aigjVar = aigj.PLAYBACK_PENDING;
                    aign aignVar = aign.NEW;
                    int ordinal = ahdsVar.b().ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 7) {
                            return;
                        }
                        aixcVar.z();
                        return;
                    }
                    PlayerResponseModel a = ahdsVar.a();
                    if (a != null && a.C()) {
                        r1 = true;
                    }
                    aixcVar.e = r1;
                    if (r1 && aixcVar.c > 1.0f) {
                        aixcVar.y();
                    }
                    ((aixb) aixcVar.a.get()).F(aixcVar.c);
                }
            }));
        }
    }

    public final void y() {
        this.h = -1L;
        this.c = 1.0f;
    }

    public final void z() {
        this.h = this.b.d();
    }
}
