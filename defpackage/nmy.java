package defpackage;

import com.google.protos.youtube.api.innertube.CardboardModeRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nmy extends fks implements ahhb {
    public aulm a;
    private final ayqw b;
    private final aioc c;
    private final nmx d;
    private boolean e;

    public nmy(fln flnVar, aioc aiocVar, abds abdsVar, ypa ypaVar, zaw zawVar, acra acraVar, ahnj ahnjVar) {
        super(flnVar);
        this.c = aiocVar;
        this.b = new ayqw();
        nmx nmxVar = new nmx(abdsVar, ypaVar, zawVar, acraVar);
        this.d = nmxVar;
        nmxVar.F = ahnjVar;
        this.e = false;
    }

    public final void e() {
        aulm aulmVar;
        if (this.e && (aulmVar = this.a) != null) {
            this.d.lt(ahbj.o(aulmVar));
        }
    }

    @Override // defpackage.flm
    public final void kG() {
        this.b.c();
    }

    @Override // defpackage.flm
    public final void kH() {
        this.b.d(this.c.ao().h(ahbw.e(1)).Y(new ayrs() { // from class: nmw
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                atzr atzrVar;
                nmy nmyVar = nmy.this;
                ahdv ahdvVar = (ahdv) obj;
                apod apodVar = null;
                if (ahdvVar.a() != null) {
                    aseo aseoVar = ahdvVar.a().a.f;
                    if (aseoVar == null) {
                        aseoVar = aseo.a;
                    }
                    if (aseoVar.b == 78882851) {
                        atzrVar = (atzr) aseoVar.c;
                    } else {
                        atzrVar = atzr.a;
                    }
                    aulq aulqVar = atzrVar.n;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    if (aulqVar.pY(CardboardModeRendererOuterClass.cardboardModeRenderer)) {
                        aulq aulqVar2 = ahdvVar.a().i.n;
                        if (aulqVar2 == null) {
                            aulqVar2 = aulq.a;
                        }
                        apodVar = (apod) aulqVar2.pX(CardboardModeRendererOuterClass.cardboardModeRenderer);
                    }
                }
                if (apodVar != null) {
                    aony aonyVar = apodVar.b;
                    if (aonyVar.isEmpty()) {
                        return;
                    }
                    aulm aulmVar = ((apoe) aonyVar.get(0)).b;
                    if (aulmVar == null) {
                        aulmVar = aulm.a;
                    }
                    nmyVar.a = aulmVar;
                    nmyVar.e();
                }
            }
        }, ktf.s));
    }

    @Override // defpackage.ahhb
    public final void qF(ahkm ahkmVar, ahki ahkiVar) {
        this.e = true;
        e();
    }

    @Override // defpackage.ahhb
    public final void qG() {
        this.e = false;
    }
}
