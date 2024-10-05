package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vmk {
    public final amru a;
    public final aoff b;
    public final ammv c;

    public vmk(amru amruVar, aoff aoffVar, ammv ammvVar) {
        if (amruVar == null) {
            throw new NullPointerException("Null photos");
        }
        this.a = amruVar;
        if (aoffVar != null) {
            this.b = aoffVar;
            this.c = ammvVar;
            return;
        }
        throw new NullPointerException("Null eventLog");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmk) {
            vmk vmkVar = (vmk) obj;
            if (amkq.aV(this.a, vmkVar.a) && this.b.equals(vmkVar.b) && this.c.equals(vmkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 52 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DevicePhotoResource{photos=");
        sb.append(valueOf);
        sb.append(", eventLog=");
        sb.append(valueOf2);
        sb.append(", errorState=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public vmk() {
    }
}
