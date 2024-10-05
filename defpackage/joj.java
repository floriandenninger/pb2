package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class joj {
    public final String a;
    public final jpi b;
    public final ayrs c;

    public joj(String str, jpi jpiVar, ayrs ayrsVar) {
        if (str == null) {
            throw new NullPointerException("Null outputEntityKey");
        }
        this.a = str;
        this.b = jpiVar;
        this.c = ayrsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof joj) {
            joj jojVar = (joj) obj;
            if (this.a.equals(jojVar.a) && this.b.equals(jojVar.b) && this.c.equals(jojVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 78 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("TransformationWrapper{outputEntityKey=");
        sb.append(str);
        sb.append(", transformer=");
        sb.append(valueOf);
        sb.append(", transformationFunction=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public joj() {
    }
}
