package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jxh {
    public final boolean a;
    public final boolean b;

    public jxh() {
    }

    public jxh(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jxh) {
            jxh jxhVar = (jxh) obj;
            if (this.a == jxhVar.a && this.b == jxhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        StringBuilder sb = new StringBuilder(57);
        sb.append("VideoErrorAndRetryableState{error=");
        sb.append(z);
        sb.append(", retryable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
