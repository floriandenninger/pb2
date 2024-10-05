package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vpu {
    public final vnb a;
    public final vmr b;
    public final vnb c;

    public vpu() {
    }

    public vpu(vnb vnbVar, vmr vmrVar, vnb vnbVar2) {
        this.a = vnbVar;
        this.b = vmrVar;
        this.c = vnbVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vpu) {
            vpu vpuVar = (vpu) obj;
            if (this.a.equals(vpuVar.a) && this.b.equals(vpuVar.b) && this.c.equals(vpuVar.c)) {
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
        StringBuilder sb = new StringBuilder(length + 93 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("GooglePhotosResource{meSuggestedPhotosResource=");
        sb.append(valueOf);
        sb.append(", clustersResource=");
        sb.append(valueOf2);
        sb.append(", suggestedPhotosResource=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
