package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zfb {
    public final int a;
    public final long b;

    public zfb() {
    }

    public zfb(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zfb) {
            zfb zfbVar = (zfb) obj;
            if (this.a == zfbVar.a && this.b == zfbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        long j = this.b;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        StringBuilder sb = new StringBuilder(82);
        sb.append("BatteryCurrentSample{batteryCurrentMa=");
        sb.append(i);
        sb.append(", elapsedMs=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
