package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aekz {
    public final aomf a;
    public final aomf b;
    public final aomf c;
    public final aomf d;

    public aekz() {
    }

    public aekz(aomf aomfVar, aomf aomfVar2, aomf aomfVar3, aomf aomfVar4) {
        this.a = aomfVar;
        this.b = aomfVar2;
        this.c = aomfVar3;
        this.d = aomfVar4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aekz) {
            aekz aekzVar = (aekz) obj;
            if (this.a.equals(aekzVar.a) && this.b.equals(aekzVar.b) && this.c.equals(aekzVar.c) && this.d.equals(aekzVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1231;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("OnesieEncryptionData{content=");
        sb.append(valueOf);
        sb.append(", hmac=");
        sb.append(valueOf2);
        sb.append(", iv=");
        sb.append(valueOf3);
        sb.append(", encryptedKey=");
        sb.append(valueOf4);
        sb.append(", useCompression=true}");
        return sb.toString();
    }
}
