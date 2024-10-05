package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uio {
    public final amru a;
    public final Runnable b;

    protected uio() {
    }

    public uio(amru amruVar, Runnable runnable) {
        this.a = amruVar;
        this.b = runnable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uio) {
            uio uioVar = (uio) obj;
            if (amkq.aV(this.a, uioVar.a) && this.b.equals(uioVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65 + String.valueOf(valueOf2).length());
        sb.append("CustomCancelableFeatureImpl{possibleCancelStringList=");
        sb.append(valueOf);
        sb.append(", onCancel=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
