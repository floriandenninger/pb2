package defpackage;

import java.security.interfaces.ECPublicKey;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anpb extends anjt {
    public anpb(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        annp annpVar = (annp) obj;
        annn annnVar = annpVar.c;
        if (annnVar == null) {
            annnVar = annn.a;
        }
        int X = aobq.X(annnVar.c);
        if (X == 0) {
            X = 1;
        }
        ECPublicKey aq = aocz.aq(aocz.aD(X), annpVar.d.I(), annpVar.e.I());
        annn annnVar2 = annpVar.c;
        if (annnVar2 == null) {
            annnVar2 = annn.a;
        }
        int V = aobq.V(annnVar2.b);
        if (V == 0) {
            V = 1;
        }
        int aF = aocz.aF(V);
        annn annnVar3 = annpVar.c;
        if (annnVar3 == null) {
            annnVar3 = annn.a;
        }
        int Y = aobq.Y(annnVar3.d);
        return new anqk(aq, aF, aocz.aE(Y != 0 ? Y : 1));
    }
}
