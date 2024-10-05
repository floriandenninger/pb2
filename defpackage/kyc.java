package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kyc extends kye {
    final String a;
    final String b;

    public kyc(kyh kyhVar, String str, String str2, afwx afwxVar) {
        super(kyhVar, null, aomf.b, afwxVar);
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.kye
    public final void a(abaw abawVar) {
        abawVar.e(this.a, this.b);
    }

    @Override // defpackage.kye
    public final boolean b(kye kyeVar) {
        if (kyeVar instanceof kyc) {
            return ((kyc) kyeVar).a.equals(this.a);
        }
        return false;
    }

    @Override // defpackage.kye
    public final boolean c() {
        return true;
    }
}
