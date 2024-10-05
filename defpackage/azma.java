package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azma extends aypn {
    final azqt b;
    final int c;

    public azma(azqt azqtVar, int i) {
        this.b = azqtVar;
        this.c = i;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        azlz azlzVar = new azlz(banwVar, this.b.a(), this.c);
        banwVar.f(azlzVar);
        azqt azqtVar = this.b;
        azlx[] azlxVarArr = azlzVar.b;
        if (azqtVar.c(azlxVarArr)) {
            int length = azlxVarArr.length;
            banw[] banwVarArr = new banw[length];
            for (int i = 0; i < length; i++) {
                azlt azltVar = (azlt) azqtVar;
                banwVarArr[i] = ayxn.a(azlxVarArr[i], azltVar.b, Integer.MAX_VALUE, azltVar.c);
            }
            azqt azqtVar2 = ((azlt) azqtVar).a;
            if (azqtVar2.c(banwVarArr)) {
                banw[] banwVarArr2 = new banw[length];
                azmf azmfVar = (azmf) azqtVar2;
                Object obj = azmfVar.b;
                if (obj instanceof azpf) {
                    ((azpf) obj).b(length, new azmc(azmfVar, banwVarArr, banwVarArr2));
                } else {
                    for (int i2 = 0; i2 < length; i2++) {
                        azmfVar.b(i2, banwVarArr, banwVarArr2, azmfVar.b.a());
                    }
                }
                azqt azqtVar3 = azmfVar.a;
                if (azqtVar3.c(banwVarArr2)) {
                    azlw azlwVar = (azlw) azqtVar3;
                    azlwVar.a.ab(new azlv(banwVarArr2, azlwVar.c));
                }
            }
        }
    }
}
