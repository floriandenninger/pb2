package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uey {
    public final String a;
    private final uev b;

    public uey() {
    }

    public uey(uev uevVar, String str) {
        this.b = uevVar;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uey) {
            uey ueyVar = (uey) obj;
            if (this.b.equals(ueyVar.b)) {
                String str = this.a;
                String str2 = ueyVar.a;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * (-721379959);
        String str = this.a;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.a;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 84 + "null".length() + String.valueOf(str).length());
        sb.append("RingContent{scalableRingDrawableFactory=");
        sb.append(valueOf);
        sb.append(", ringDrawableFactory=");
        sb.append("null");
        sb.append(", contentDescription=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
