package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azfh extends aypy {
    final ayqb[] a;

    public azfh(ayqb[] ayqbVarArr) {
        this.a = ayqbVarArr;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        ayqb[] ayqbVarArr = this.a;
        azff azffVar = new azff(ayqdVar);
        azfg[] azfgVarArr = azffVar.b;
        int i = 0;
        while (i < 2) {
            int i2 = i + 1;
            azfgVarArr[i] = new azfg(azffVar, i2, azffVar.a);
            i = i2;
        }
        azffVar.c.lazySet(0);
        azffVar.a.se(azffVar);
        for (int i3 = 0; i3 < 2 && azffVar.c.get() == 0; i3++) {
            ayqbVarArr[i3].aE(azfgVarArr[i3]);
        }
    }
}
