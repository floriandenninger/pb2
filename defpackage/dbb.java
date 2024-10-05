package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbb implements dax {
    final /* synthetic */ dbc a;

    public dbb(dbc dbcVar) {
        this.a = dbcVar;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 11 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("{fragment=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
