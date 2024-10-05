package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zph extends zqm {
    private final ammv a;
    private final ammv b;

    public zph(ammv ammvVar, ammv ammvVar2) {
        this.a = ammvVar;
        this.b = ammvVar2;
    }

    @Override // defpackage.zqm
    public ammv a() {
        return this.a;
    }

    @Override // defpackage.zqm
    public ammv b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zqm) {
            zqm zqmVar = (zqm) obj;
            if (this.a.equals(zqmVar.a()) && this.b.equals(zqmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("SavedStateEvent{stateEvent=");
        sb.append(valueOf);
        sb.append(", stateEventFile=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
