package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fie {
    public final int a;
    public final amru b;

    public fie(int i, amru amruVar) {
        this.a = i;
        if (amruVar == null) {
            throw new NullPointerException("Null downloadedEntities");
        }
        this.b = amruVar;
    }

    public static fie a(int i, amru amruVar) {
        return new fie(i, amruVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fie) {
            fie fieVar = (fie) obj;
            if (this.a == fieVar.a && amkq.aV(this.b, fieVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70);
        sb.append("DownloadsDataResponse{downloadsCount=");
        sb.append(i);
        sb.append(", downloadedEntities=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public fie() {
    }
}
