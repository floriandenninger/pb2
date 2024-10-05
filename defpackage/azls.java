package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azls extends aypy {
    final ayqb[] a;
    final ayrv b;
    final int c;

    public azls(ayqb[] ayqbVarArr, ayrv ayrvVar, int i) {
        this.a = ayqbVarArr;
        this.b = ayrvVar;
        this.c = i;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        ayqb[] ayqbVarArr = this.a;
        azlq azlqVar = new azlq(ayqdVar, this.b);
        int i = this.c;
        azlr[] azlrVarArr = azlqVar.c;
        int length = azlrVarArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            azlrVarArr[i2] = new azlr(azlqVar, i);
        }
        azlqVar.lazySet(0);
        azlqVar.a.se(azlqVar);
        for (int i3 = 0; i3 < 2 && !azlqVar.e; i3++) {
            ayqbVarArr[i3].aE(azlrVarArr[i3]);
        }
    }
}
