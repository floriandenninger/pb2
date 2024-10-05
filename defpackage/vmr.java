package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vmr {
    public final amru a;
    public final ammv b;
    public final boolean c;
    public final amru d;

    public vmr(amru amruVar, ammv ammvVar, boolean z, amru amruVar2) {
        if (amruVar == null) {
            throw new NullPointerException("Null clusters");
        }
        this.a = amruVar;
        this.b = ammvVar;
        this.c = z;
        if (amruVar2 != null) {
            this.d = amruVar2;
            return;
        }
        throw new NullPointerException("Null eventLogs");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmr) {
            vmr vmrVar = (vmr) obj;
            if (amkq.aV(this.a, vmrVar.a) && this.b.equals(vmrVar.b) && this.c == vmrVar.c && amkq.aV(this.d, vmrVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 80 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ClustersResource{clusters=");
        sb.append(valueOf);
        sb.append(", errorState=");
        sb.append(valueOf2);
        sb.append(", hasAdditionalResults=");
        sb.append(z);
        sb.append(", eventLogs=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public vmr() {
    }
}
