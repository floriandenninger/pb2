package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aajx {
    public final String a;
    private final String b;

    public aajx() {
    }

    public aajx(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aajx) {
            aajx aajxVar = (aajx) obj;
            if (this.a.equals(aajxVar.a) && this.b.equals(aajxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 49 + str2.length());
        sb.append("IndexFingerprint{indexName=");
        sb.append(str);
        sb.append(", rawCreateStatement=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
