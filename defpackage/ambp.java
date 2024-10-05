package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ambp implements anfy {
    final /* synthetic */ anfy a;
    final /* synthetic */ anhy b;

    public ambp(anfy anfyVar, anhy anhyVar) {
        this.a = anfyVar;
        this.b = anhyVar;
    }

    @Override // defpackage.anfy
    public final anhy a() {
        return this.a.a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(", input=[");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
