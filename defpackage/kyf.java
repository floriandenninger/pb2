package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kyf implements afwx {
    final /* synthetic */ kyh a;
    private final afwx b;

    public kyf(kyh kyhVar, afwx afwxVar) {
        this.a = kyhVar;
        this.b = afwxVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        kyh kyhVar = this.a;
        int i = kyhVar.d + 1;
        kyhVar.d = i;
        if (i > 3) {
            kyhVar.d = 0;
            this.b.kY(cnqVar);
            this.a.b();
        } else {
            kyh.e(kyhVar.c, kyhVar.b);
            kyh kyhVar2 = this.a;
            kyhVar2.c(kyhVar2.c);
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        this.a.d = 0;
        this.b.kZ((arzb) obj);
        this.a.b();
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
