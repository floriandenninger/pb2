package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqw {
    public final acsa a;
    public final boolean b;

    public acqw() {
    }

    public acqw(acsa acsaVar, boolean z) {
        this.a = acsaVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acqw) {
            acqw acqwVar = (acqw) obj;
            if (this.a.equals(acqwVar.a) && this.b == acqwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * (-721379959)) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 97 + "null".length());
        sb.append("VisualElementContainerViewBinding{veContainer=");
        sb.append(valueOf);
        sb.append(", clientData=");
        sb.append("null");
        sb.append(", enableRecursiveViewMonitoring=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
