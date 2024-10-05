package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azfu extends aypy {
    final ayqb[] a;
    final Iterable b;
    final ayrv c;
    final int d;

    public azfu(ayqb[] ayqbVarArr, Iterable iterable, ayrv ayrvVar, int i) {
        this.a = ayqbVarArr;
        this.b = iterable;
        this.c = ayrvVar;
        this.d = i;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        int length;
        ayqb[] ayqbVarArr = this.a;
        if (ayqbVarArr == null) {
            ayqbVarArr = new aypy[8];
            length = 0;
            for (ayqb ayqbVar : this.b) {
                if (length == ayqbVarArr.length) {
                    ayqb[] ayqbVarArr2 = new ayqb[(length >> 2) + length];
                    System.arraycopy(ayqbVarArr, 0, ayqbVarArr2, 0, length);
                    ayqbVarArr = ayqbVarArr2;
                }
                ayqbVarArr[length] = ayqbVar;
                length++;
            }
        } else {
            length = ayqbVarArr.length;
        }
        if (length == 0) {
            aysa.f(ayqdVar);
            return;
        }
        azft azftVar = new azft(ayqdVar, this.c, length, this.d);
        azfs[] azfsVarArr = azftVar.c;
        int length2 = azfsVarArr.length;
        azftVar.a.se(azftVar);
        for (int i = 0; i < length2 && !azftVar.g && !azftVar.f; i++) {
            ayqbVarArr[i].aE(azfsVarArr[i]);
        }
    }
}
