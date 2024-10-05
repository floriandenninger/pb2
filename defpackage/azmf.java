package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azmf extends azqt {
    final azqt a;
    final ayqi b;
    final int c;

    public azmf(azqt azqtVar, ayqi ayqiVar, int i) {
        this.a = azqtVar;
        this.b = ayqiVar;
        this.c = i;
    }

    @Override // defpackage.azqt
    public final int a() {
        return ((azlw) this.a).b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i, banw[] banwVarArr, banw[] banwVarArr2, ayqh ayqhVar) {
        banw banwVar = banwVarArr[i];
        azog azogVar = new azog(this.c);
        if (banwVar instanceof aysx) {
            banwVarArr2[i] = new azmd((aysx) banwVar, this.c, azogVar, ayqhVar);
        } else {
            banwVarArr2[i] = new azme(banwVar, this.c, azogVar, ayqhVar);
        }
    }
}
