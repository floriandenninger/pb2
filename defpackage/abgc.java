package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abgc implements swv {
    public final aayb a;
    public final aahd b;
    private final afsy c;

    public abgc(aayb aaybVar, afsy afsyVar, aahd aahdVar) {
        aaybVar.getClass();
        this.a = aaybVar;
        afsyVar.getClass();
        this.c = afsyVar;
        aahdVar.getClass();
        this.b = aahdVar;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return avsi.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        avsi avsiVar = (avsi) obj;
        apxf apxfVar = avsiVar.c;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if (apxfVar.pY(avsh.b)) {
            apxf apxfVar2 = avsiVar.c;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            final avsh avshVar = (avsh) apxfVar2.pX(avsh.b);
            if ((avshVar.c & 1) == 0) {
                return ayph.s(new IllegalStateException("command must have kidGaiaId."));
            }
            if (avshVar.d.size() == 0) {
                return ayph.s(new IllegalStateException("command must have blocklist content. "));
            }
            aayb aaybVar = this.a;
            final aaya aayaVar = new aaya(aaybVar.f, this.c.c(), null, null, null);
            aayaVar.a = avshVar.d;
            aayaVar.b = avshVar.e;
            apxf apxfVar3 = avsiVar.c;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            aayaVar.l(apxfVar3.c);
            return ayph.j(new aypj() { // from class: abga
                @Override // defpackage.aypj
                public final void a(ayue ayueVar) {
                    abgc abgcVar = abgc.this;
                    aaya aayaVar2 = aayaVar;
                    avsh avshVar2 = avshVar;
                    aayb aaybVar2 = abgcVar.a;
                    aaybVar2.a.e(aayaVar2, new abgb(abgcVar, avshVar2, ayueVar));
                }
            });
        }
        return ayph.s(new IllegalStateException("command must have UpdateKidsBlacklistEndpoint extension."));
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
