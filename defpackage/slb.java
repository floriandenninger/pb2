package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class slb {
    private final Long a;
    private final int b;

    public slb() {
    }

    public slb(Long l, int i) {
        this.a = l;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof slb) {
            slb slbVar = (slb) obj;
            if (this.a.equals(slbVar.a) && this.b == slbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String num = Integer.toString(amkq.cd(this.b));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + num.length());
        sb.append("VerificationFailureKey{protoId=");
        sb.append(valueOf);
        sb.append(", verificationFailure=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }
}
