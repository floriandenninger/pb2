package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zxm {
    public final int a;
    public final amru b;

    public zxm() {
    }

    public zxm(int i, amru amruVar) {
        this.a = i;
        this.b = amruVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zxm) {
            zxm zxmVar = (zxm) obj;
            if (this.a == zxmVar.a && amkq.aV(this.b, zxmVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
        sb.append("MediaViewModelConfig{fileType=");
        sb.append(i);
        sb.append(", albumTypeList=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
