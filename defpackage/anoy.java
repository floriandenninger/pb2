package defpackage;

import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anoy extends anjt {
    public anoy(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anno annoVar = (anno) obj;
        annp annpVar = annoVar.c;
        if (annpVar == null) {
            annpVar = annp.a;
        }
        annn annnVar = annpVar.c;
        if (annnVar == null) {
            annnVar = annn.a;
        }
        int X = aobq.X(annnVar.c);
        if (X == 0) {
            X = 1;
        }
        ECPrivateKey ap = aocz.ap(aocz.aD(X), annoVar.d.I());
        annp annpVar2 = annoVar.c;
        if (annpVar2 == null) {
            annpVar2 = annp.a;
        }
        annn annnVar2 = annpVar2.c;
        if (annnVar2 == null) {
            annnVar2 = annn.a;
        }
        int X2 = aobq.X(annnVar2.c);
        if (X2 == 0) {
            X2 = 1;
        }
        int aD = aocz.aD(X2);
        annp annpVar3 = annoVar.c;
        if (annpVar3 == null) {
            annpVar3 = annp.a;
        }
        byte[] I = annpVar3.d.I();
        annp annpVar4 = annoVar.c;
        if (annpVar4 == null) {
            annpVar4 = annp.a;
        }
        ECPublicKey aq = aocz.aq(aD, I, annpVar4.e.I());
        annp annpVar5 = annoVar.c;
        if (annpVar5 == null) {
            annpVar5 = annp.a;
        }
        annn annnVar3 = annpVar5.c;
        if (annnVar3 == null) {
            annnVar3 = annn.a;
        }
        int V = aobq.V(annnVar3.b);
        if (V == 0) {
            V = 1;
        }
        int aF = aocz.aF(V);
        annp annpVar6 = annoVar.c;
        if (annpVar6 == null) {
            annpVar6 = annp.a;
        }
        annn annnVar4 = annpVar6.c;
        if (annnVar4 == null) {
            annnVar4 = annn.a;
        }
        int Y = aobq.Y(annnVar4.d);
        if (Y == 0) {
            Y = 1;
        }
        anro.a(ap, aq, aF, aocz.aE(Y));
        annp annpVar7 = annoVar.c;
        if (annpVar7 == null) {
            annpVar7 = annp.a;
        }
        annn annnVar5 = annpVar7.c;
        if (annnVar5 == null) {
            annnVar5 = annn.a;
        }
        int V2 = aobq.V(annnVar5.b);
        if (V2 == 0) {
            V2 = 1;
        }
        int aF2 = aocz.aF(V2);
        annp annpVar8 = annoVar.c;
        if (annpVar8 == null) {
            annpVar8 = annp.a;
        }
        annn annnVar6 = annpVar8.c;
        if (annnVar6 == null) {
            annnVar6 = annn.a;
        }
        int Y2 = aobq.Y(annnVar6.d);
        return new anqj(ap, aF2, aocz.aE(Y2 != 0 ? Y2 : 1));
    }
}
