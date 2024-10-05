package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aajz {
    public final String a;
    public final amsx b;
    private final String c;

    public aajz(String str, String str2, amsx amsxVar) {
        this.c = str;
        if (str2 == null) {
            throw new NullPointerException("Null rawCreateStatement");
        }
        this.a = str2;
        if (amsxVar != null) {
            this.b = amsxVar;
            return;
        }
        throw new NullPointerException("Null indexFingerprints");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aajz a(String str, String str2, amsx amsxVar) {
        return new aajz(str, str2, amsxVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aajz) {
            aajz aajzVar = (aajz) obj;
            if (this.c.equals(aajzVar.c) && this.a.equals(aajzVar.a) && this.b.equals(aajzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String valueOf = String.valueOf(this.b);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 69 + str2.length() + String.valueOf(valueOf).length());
        sb.append("TableFingerprint{tableName=");
        sb.append(str);
        sb.append(", rawCreateStatement=");
        sb.append(str2);
        sb.append(", indexFingerprints=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public aajz() {
    }
}
