package defpackage;

import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kpj implements ahyl {
    final /* synthetic */ YouTubeControlsOverlay b;
    private int d;
    boolean a = false;
    private long c = -1;

    public kpj(YouTubeControlsOverlay youTubeControlsOverlay) {
        this.b = youTubeControlsOverlay;
    }

    @Override // defpackage.ahyl
    public final void h(int i, long j) {
        Optional empty;
        this.b.n.c(j);
        YouTubeControlsOverlay youTubeControlsOverlay = this.b;
        aidv aidvVar = youTubeControlsOverlay.n.d;
        if (aidvVar == null) {
            youTubeControlsOverlay.E();
            aidvVar = this.b.n.d;
        }
        if (i == 1) {
            this.b.f159J.a(true);
            this.b.a.h(true);
            this.b.Q();
            if (aidvVar != null && aidvVar.i()) {
                this.a = true;
                aidvVar.h(i, j);
            }
            this.b.g.q();
            return;
        }
        if (i == 2) {
            this.b.Q();
            this.b.n.nN();
            if (aidvVar != null && aidvVar.i() && this.a) {
                aidvVar.h(i, j);
                aidvVar.g(true);
            }
            this.b.g.p(j);
            return;
        }
        if (i != 3 && i != 4) {
            if (evr.T(this.b.H)) {
                this.c = j;
                this.b.I.n(new acqx(acsb.c(112394)));
            }
            YouTubeControlsOverlay youTubeControlsOverlay2 = this.b;
            if (youTubeControlsOverlay2.P) {
                if (youTubeControlsOverlay2.K.a()) {
                    YouTubeControlsOverlay youTubeControlsOverlay3 = this.b;
                    this.d = youTubeControlsOverlay3.t;
                    youTubeControlsOverlay3.C();
                    return;
                }
                this.b.Q();
                return;
            }
            return;
        }
        if (evr.T(this.b.H)) {
            acra acraVar = this.b.I;
            acqx acqxVar = new acqx(acsb.c(112394));
            long j2 = this.c;
            if (i == 3) {
                if (j2 < 0) {
                    empty = Optional.empty();
                } else {
                    aone createBuilder = asic.a.createBuilder();
                    createBuilder.copyOnWrite();
                    asic asicVar = (asic) createBuilder.instance;
                    asicVar.b |= 1;
                    asicVar.c = anaf.ag(j - j2);
                    createBuilder.copyOnWrite();
                    asic asicVar2 = (asic) createBuilder.instance;
                    asicVar2.b = 2 | asicVar2.b;
                    asicVar2.d = false;
                    asic asicVar3 = (asic) createBuilder.build();
                    aone createBuilder2 = asht.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    asht ashtVar = (asht) createBuilder2.instance;
                    asicVar3.getClass();
                    ashtVar.E = asicVar3;
                    ashtVar.c |= 8388608;
                    empty = Optional.of((asht) createBuilder2.build());
                }
            } else if (i == 4) {
                aone createBuilder3 = asic.a.createBuilder();
                createBuilder3.copyOnWrite();
                asic asicVar4 = (asic) createBuilder3.instance;
                asicVar4.b = 2 | asicVar4.b;
                asicVar4.d = true;
                asic asicVar5 = (asic) createBuilder3.build();
                aone createBuilder4 = asht.a.createBuilder();
                createBuilder4.copyOnWrite();
                asht ashtVar2 = (asht) createBuilder4.instance;
                asicVar5.getClass();
                ashtVar2.E = asicVar5;
                ashtVar2.c |= 8388608;
                empty = Optional.of((asht) createBuilder4.build());
            } else {
                empty = Optional.empty();
            }
            acraVar.I(3, acqxVar, (asht) empty.orElse(null));
        }
        this.b.a.h(false);
        this.b.f159J.a(false);
        this.b.n.nN();
        if (!this.b.K.a()) {
            this.b.C();
        } else if (this.d != 0) {
            this.b.Q();
        } else if (i == 3) {
            this.b.nf();
        } else {
            this.b.P(true);
        }
        this.b.F();
        this.c = -1L;
        if (aidvVar != null && aidvVar.i() && this.a) {
            this.a = false;
            aidvVar.h(i, j);
        }
        this.b.n.nU();
        YouTubeControlsOverlay youTubeControlsOverlay4 = this.b;
        if (youTubeControlsOverlay4.P && i == 4) {
            return;
        }
        youTubeControlsOverlay4.c.a();
        if (evr.aX(this.b.R)) {
            YouTubeControlsOverlay youTubeControlsOverlay5 = this.b;
            ahvb ahvbVar = youTubeControlsOverlay5.g;
            kli kliVar = youTubeControlsOverlay5.Q;
            aupb aupbVar = kliVar.a;
            kliVar.a = aupb.SEEK_SOURCE_UNKNOWN;
            ahvbVar.s(j, aupbVar);
            return;
        }
        this.b.g.r(j);
    }
}
