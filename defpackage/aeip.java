package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeip {
    public final aomf a;
    public final aomf b;
    public final aomf c;
    public final int d;

    public aeip(aomf aomfVar, aomf aomfVar2, aomf aomfVar3, int i) {
        if (aomfVar == null) {
            throw new NullPointerException("Null encryptedContent");
        }
        this.a = aomfVar;
        if (aomfVar2 != null) {
            this.b = aomfVar2;
            if (aomfVar3 != null) {
                this.c = aomfVar3;
                this.d = i;
                return;
            }
            throw new NullPointerException("Null iv");
        }
        throw new NullPointerException("Null hmac");
    }

    public static aeip a(aomf aomfVar, aomf aomfVar2, aomf aomfVar3, int i) {
        return new aeip(aomfVar, aomfVar2, aomfVar3, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeip) {
            aeip aeipVar = (aeip) obj;
            if (this.a.equals(aeipVar.a) && this.b.equals(aeipVar.b) && this.c.equals(aeipVar.c) && this.d == aeipVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String num = Integer.toString(this.d - 1);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 81 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + num.length());
        sb.append("EncryptedOnesieInnerTubeResponse{encryptedContent=");
        sb.append(valueOf);
        sb.append(", hmac=");
        sb.append(valueOf2);
        sb.append(", iv=");
        sb.append(valueOf3);
        sb.append(", compressionType=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }

    public aeip() {
    }
}
