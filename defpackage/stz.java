package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class stz implements swv {
    private final axpg a;
    private final boolean b;
    private final ayqi c;

    public stz(axpg axpgVar, ammv ammvVar, ayqi ayqiVar) {
        this.a = axpgVar;
        this.b = ((Boolean) ammvVar.e(false)).booleanValue();
        this.c = ayqiVar;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return awpn.b;
    }

    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, swu swuVar) {
        awpn awpnVar = (awpn) obj;
        sww swwVar = (sww) this.a.get();
        if (awpnVar.c.size() <= 0) {
            return ayph.f();
        }
        if (!this.b) {
            return ayph.z(aypn.w(awpnVar.c).A(new sty(swwVar, swuVar, 0)));
        }
        aypn w = aypn.w(awpnVar.c);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int i = aypn.a;
        aysw.c(availableProcessors, "parallelism");
        aysw.c(i, "prefetch");
        azlw azlwVar = new azlw(w, availableProcessors, i);
        ayrv ayrvVar = aynu.q;
        ayqi ayqiVar = this.c;
        int i2 = aypn.a;
        aysw.c(i2, "prefetch");
        azmf azmfVar = new azmf(azlwVar, ayqiVar, i2);
        ayrv ayrvVar2 = aynu.q;
        sty styVar = new sty(swwVar, swuVar, 1);
        int i3 = aypn.a;
        aysw.c(Integer.MAX_VALUE, "maxConcurrency");
        aysw.c(i3, "prefetch");
        azlt azltVar = new azlt(azmfVar, styVar, i3);
        ayrv ayrvVar3 = aynu.q;
        int i4 = aypn.a;
        aysw.c(i4, "prefetch");
        azma azmaVar = new azma(azltVar, i4);
        ayrv ayrvVar4 = aynu.j;
        ayyt ayytVar = new ayyt(azmaVar);
        ayrv ayrvVar5 = aynu.p;
        return ayytVar;
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
