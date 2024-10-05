package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lun implements afwx {
    final Object a;
    final String b;
    final /* synthetic */ luo c;

    public lun(luo luoVar, Object obj, String str) {
        this.c = luoVar;
        this.a = obj;
        this.b = str;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.c.b.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arzb arzbVar = (arzb) obj;
        if (arzbVar == null || arzbVar.f.size() == 0) {
            return;
        }
        this.c.c.e(arzbVar.f, this.a);
        this.c.d.d(new abbc(this.b, arzbVar));
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
