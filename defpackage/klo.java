package defpackage;

import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class klo implements ahyl {
    final /* synthetic */ InteractiveInlineMutedControlsOverlay b;
    boolean a = false;
    private long c = -1;

    public klo(InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay) {
        this.b = interactiveInlineMutedControlsOverlay;
    }

    @Override // defpackage.ahyl
    public final void h(int i, long j) {
        this.b.g.c(j);
        InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay = this.b;
        aidv aidvVar = interactiveInlineMutedControlsOverlay.g.d;
        if (i == 1) {
            if (evr.T(interactiveInlineMutedControlsOverlay.h)) {
                this.c = j;
                this.b.f.mM().n(new acqx(acsb.c(112394)));
            }
            if (aidvVar != null && aidvVar.i()) {
                this.a = true;
                aidvVar.h(i, j);
            }
            this.b.o.h(i, j);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                if (evr.T(interactiveInlineMutedControlsOverlay.h)) {
                    long j2 = this.c;
                    if (j2 >= 0) {
                        long abs = Math.abs(j - j2);
                        aone createBuilder = asic.a.createBuilder();
                        createBuilder.copyOnWrite();
                        asic asicVar = (asic) createBuilder.instance;
                        asicVar.b = 1 | asicVar.b;
                        asicVar.c = anaf.ag(abs);
                        asic asicVar2 = (asic) createBuilder.build();
                        aone createBuilder2 = asht.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        asht ashtVar = (asht) createBuilder2.instance;
                        asicVar2.getClass();
                        ashtVar.E = asicVar2;
                        ashtVar.c |= 8388608;
                        this.b.f.mM().I(3, new acqx(acsb.c(112394)), (asht) createBuilder2.build());
                    }
                }
                atxq a = atxr.a();
                long j3 = this.c;
                a.copyOnWrite();
                ((atxr) a.instance).h((float) (j3 / 1000));
                a.copyOnWrite();
                ((atxr) a.instance).g((float) (j / 1000));
                String str = this.b.p;
                if (str != null) {
                    a.copyOnWrite();
                    ((atxr) a.instance).f(str);
                }
                arpn a2 = arpp.a();
                a2.copyOnWrite();
                ((arpp) a2.instance).dy((atxr) a.build());
                this.b.n.c((arpp) a2.build());
                gof gofVar = this.b.G.c;
                this.b.i.a = gofVar != null ? gofVar.f() : "";
            } else if (i != 4) {
                return;
            }
            this.c = -1L;
            if (aidvVar != null && aidvVar.i() && this.a) {
                this.a = false;
                aidvVar.h(i, j);
            }
            this.b.g.nU();
            this.b.m.i(j);
            this.b.o.h(i, j);
            return;
        }
        if (aidvVar != null && aidvVar.i() && this.a) {
            aidvVar.h(i, j);
            aidvVar.g(true);
        }
        this.b.o.h(i, j);
    }
}
