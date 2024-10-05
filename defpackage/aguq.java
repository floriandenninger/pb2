package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aguq {
    public final ammv a;
    public final long b;
    public final long c;
    public final double d;
    public final boolean e;
    public final ammv f;
    public final ammv g;
    public final int h;
    public final ammv i;
    public final ammv j;
    public final agmx k;
    public final int l;
    private final ammv m;

    public aguq() {
    }

    public aguq(int i, ammv ammvVar, ammv ammvVar2, long j, long j2, double d, boolean z, ammv ammvVar3, ammv ammvVar4, int i2, ammv ammvVar5, ammv ammvVar6, agmx agmxVar) {
        this.l = i;
        this.m = ammvVar;
        this.a = ammvVar2;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = z;
        this.f = ammvVar3;
        this.g = ammvVar4;
        this.h = i2;
        this.i = ammvVar5;
        this.j = ammvVar6;
        this.k = agmxVar;
    }

    public static agup a(int i) {
        agup agupVar = new agup(null);
        agupVar.e = i;
        agupVar.g(0L);
        agupVar.b(0L);
        agupVar.h(0.0d);
        agupVar.i(false);
        agupVar.e(0);
        agupVar.d = null;
        return agupVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aguq)) {
            return false;
        }
        aguq aguqVar = (aguq) obj;
        int i = this.l;
        int i2 = aguqVar.l;
        if (i == 0) {
            throw null;
        }
        if (i == i2 && this.m.equals(aguqVar.m) && this.a.equals(aguqVar.a) && this.b == aguqVar.b && this.c == aguqVar.c && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(aguqVar.d) && this.e == aguqVar.e && this.f.equals(aguqVar.f) && this.g.equals(aguqVar.g) && this.h == aguqVar.h && this.i.equals(aguqVar.i) && this.j.equals(aguqVar.j)) {
            agmx agmxVar = this.k;
            agmx agmxVar2 = aguqVar.k;
            if (agmxVar != null ? agmxVar.equals(agmxVar2) : agmxVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.l;
        if (i != 0) {
            int hashCode = this.m.hashCode();
            int hashCode2 = this.a.hashCode();
            long j = this.b;
            long j2 = this.c;
            int doubleToLongBits = (((((((((((((((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d)))) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
            agmx agmxVar = this.k;
            return doubleToLongBits ^ (agmxVar == null ? 0 : agmxVar.hashCode());
        }
        throw null;
    }

    public final String toString() {
        String w = aedn.w(this.l);
        String valueOf = String.valueOf(this.m);
        String valueOf2 = String.valueOf(this.a);
        long j = this.b;
        long j2 = this.c;
        double d = this.d;
        boolean z = this.e;
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        int i = this.h;
        String valueOf5 = String.valueOf(this.i);
        String valueOf6 = String.valueOf(this.j);
        String valueOf7 = String.valueOf(this.k);
        int length = w.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 316 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("Action{type=");
        sb.append(w);
        sb.append(", offlineStoreTag=");
        sb.append(valueOf);
        sb.append(", transferId=");
        sb.append(valueOf2);
        sb.append(", transferSize=");
        sb.append(j);
        sb.append(", bytesTransferred=");
        sb.append(j2);
        sb.append(", transferSpeedBytesPerSecond=");
        sb.append(d);
        sb.append(", usingDataToDownloadStreams=");
        sb.append(z);
        sb.append(", mediaStatus=");
        sb.append(valueOf3);
        sb.append(", failureReason=");
        sb.append(valueOf4);
        sb.append(", statusReason=");
        sb.append(i);
        sb.append(", transfer=");
        sb.append(valueOf5);
        sb.append(", downloadNetworkPreference=");
        sb.append(valueOf6);
        sb.append(", outputExtras=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
