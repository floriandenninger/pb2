package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vqc {
    public final vqb a;
    public final boolean b;
    public final amru c;

    public vqc() {
    }

    public vqc(vqb vqbVar, boolean z, amru amruVar) {
        this.a = vqbVar;
        this.b = z;
        this.c = amruVar;
    }

    public static vqa a() {
        return new vqa();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vqc) {
            vqc vqcVar = (vqc) obj;
            if (this.a.equals(vqcVar.a) && this.b == vqcVar.b && amkq.aV(this.c, vqcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length());
        sb.append("GooglePhotosSection{content=");
        sb.append(valueOf);
        sb.append(", hasMore=");
        sb.append(z);
        sb.append(", eventLogs=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
