package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vmj {
    public final long a;
    public final ammv b;

    public vmj() {
    }

    public vmj(long j, ammv ammvVar) {
        this.a = j;
        this.b = ammvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmj) {
            vmj vmjVar = (vmj) obj;
            if (this.a == vmjVar.a && this.b.equals(vmjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("DevicePhoto{id=");
        sb.append(j);
        sb.append(", timestamp=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
