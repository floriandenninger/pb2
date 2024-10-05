package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uav {
    public final aokw a;
    public final String b;
    public final int c;

    public uav(aokw aokwVar, String str, int i) {
        if (aokwVar == null) {
            throw new NullPointerException("Null threadStateUpdate");
        }
        this.a = aokwVar;
        if (str != null) {
            this.b = str;
            this.c = i;
            return;
        }
        throw new NullPointerException("Null actionId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uav) {
            uav uavVar = (uav) obj;
            if (this.a.equals(uavVar.a) && this.b.equals(uavVar.b) && this.c == uavVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String num = Integer.toString(this.c - 1);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62 + str.length() + num.length());
        sb.append("SdkBatchUpdateKey{threadStateUpdate=");
        sb.append(valueOf);
        sb.append(", actionId=");
        sb.append(str);
        sb.append(", eventSource=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }

    public uav() {
    }
}
