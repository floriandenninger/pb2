package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nxl {
    static final nxj a = nxj.b(nxh.HIDDEN, aypn.r());
    public static final /* synthetic */ int f = 0;
    public final azqw b;
    public final azqw c;
    public final aypn d;
    public final aypn e;
    private final azqw g;

    public nxl(final nxm nxmVar, nvz nvzVar, nyk nykVar, byte[] bArr) {
        azqw av = azqv.ap().av();
        this.b = av;
        azqw av2 = azqv.ap().av();
        this.c = av2;
        azqw av3 = azqy.ap().av();
        this.g = av3;
        final int i = 1;
        aypn J2 = nykVar.b.M(nxb.f).S(av, new ayro() { // from class: nxi
            @Override // defpackage.ayro
            public final Object a(Object obj, Object obj2) {
                if (i == 0) {
                    return nxmVar.d(((Boolean) obj).booleanValue(), (amsx) obj2);
                }
                nxm nxmVar2 = nxmVar;
                nxu nxuVar = (nxu) obj;
                int i2 = nxl.f;
                return new nxk(nxuVar, nxmVar2.a(nxuVar, ((Integer) obj2).intValue()));
            }
        }).J();
        this.e = J2;
        aypn h = aypn.D(aypn.z(a), av3, J2.A(nxb.e).A(nxb.d)).h(ntu.g);
        aypn d = nvzVar.d();
        aypn b = nvzVar.b();
        nxmVar.getClass();
        final int i2 = 0;
        this.d = aypn.C(aypn.e(d, b, new ayro() { // from class: nxi
            @Override // defpackage.ayro
            public final Object a(Object obj, Object obj2) {
                if (i2 == 0) {
                    return nxmVar.d(((Boolean) obj).booleanValue(), (amsx) obj2);
                }
                nxm nxmVar2 = nxmVar;
                nxu nxuVar = (nxu) obj;
                int i22 = nxl.f;
                return new nxk(nxuVar, nxmVar2.a(nxuVar, ((Integer) obj2).intValue()));
            }
        }).S(av2, nxd.e).s(niy.r).A(nxb.g), h);
    }

    public final void a(nxh nxhVar) {
        this.g.c(nxj.a(nxhVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(nxh nxhVar, aypn aypnVar) {
        this.g.c(nxj.b(nxhVar, aypnVar));
    }
}
