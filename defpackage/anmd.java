package defpackage;

import java.security.interfaces.ECPublicKey;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anmd extends anjt {
    public anmd(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        annu annuVar = (annu) obj;
        anns annsVar = annuVar.c;
        if (annsVar == null) {
            annsVar = anns.a;
        }
        annv annvVar = annsVar.b;
        if (annvVar == null) {
            annvVar = annv.a;
        }
        int X = aobq.X(annvVar.b);
        if (X == 0) {
            X = 1;
        }
        ECPublicKey aq = aocz.aq(aobq.ad(X), annuVar.d.I(), annuVar.e.I());
        annq annqVar = annsVar.c;
        if (annqVar == null) {
            annqVar = annq.a;
        }
        anod anodVar = annqVar.b;
        if (anodVar == null) {
            anodVar = anod.a;
        }
        anmi anmiVar = new anmi(anodVar);
        byte[] I = annvVar.d.I();
        int V = aobq.V(annvVar.c);
        if (V == 0) {
            V = 1;
        }
        String ac = aobq.ac(V);
        int aa = aobq.aa(annsVar.d);
        return new anqn(aq, I, ac, aobq.ae(aa != 0 ? aa : 1), anmiVar);
    }
}
