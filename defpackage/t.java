package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class t extends o {
    private static final long serialVersionUID = 1405488568664762222L;

    public t(p pVar, p pVar2) {
        super(pVar, pVar2);
    }

    @Override // defpackage.p
    public final boolean a(q qVar) {
        return this.a.a(qVar) || this.b.a(qVar);
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 4 + String.valueOf(obj2).length());
        sb.append(obj);
        sb.append(" or ");
        sb.append(obj2);
        return sb.toString();
    }
}
