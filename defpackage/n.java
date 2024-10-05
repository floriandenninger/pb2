package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class n extends o {
    private static final long serialVersionUID = 7766999779862263523L;

    public n(p pVar, p pVar2) {
        super(pVar, pVar2);
    }

    @Override // defpackage.p
    public final boolean a(q qVar) {
        return this.a.a(qVar) && this.b.a(qVar);
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 5 + String.valueOf(obj2).length());
        sb.append(obj);
        sb.append(" and ");
        sb.append(obj2);
        return sb.toString();
    }
}
