package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahqt {
    public final String a;
    public final acsc b;

    public ahqt() {
    }

    public ahqt(String str, acsc acscVar) {
        this.a = str;
        this.b = acscVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahqt) {
            ahqt ahqtVar = (ahqt) obj;
            String str = this.a;
            if (str != null ? str.equals(ahqtVar.a) : ahqtVar.a == null) {
                if (this.b.equals(ahqtVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.a;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48 + String.valueOf(valueOf).length());
        sb.append("WatchScreenParentInfo{parentCsn=");
        sb.append(str);
        sb.append(", parentVeType=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
