package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zpr {
    public final zqs a;
    public final zpq b;

    public zpr(zqs zqsVar, zpq zpqVar) {
        if (zqsVar == null) {
            throw new NullPointerException("Null frameProcessor");
        }
        this.a = zqsVar;
        if (zpqVar != null) {
            this.b = zpqVar;
            return;
        }
        throw new NullPointerException("Null processorSetupCallback");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zpr) {
            zpr zprVar = (zpr) obj;
            if (this.a.equals(zprVar.a) && this.b.equals(zprVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61 + String.valueOf(valueOf2).length());
        sb.append("FrameProcessorSetup{frameProcessor=");
        sb.append(valueOf);
        sb.append(", processorSetupCallback=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public zpr() {
    }
}
