package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class khg {
    public final khi a;
    public final int b;

    public khg(khi khiVar, int i) {
        if (khiVar == null) {
            throw new NullPointerException("Null videoStageEventContext");
        }
        this.a = khiVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof khg) {
            khg khgVar = (khg) obj;
            if (this.a.equals(khgVar.a) && this.b == khgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69);
        sb.append("InterruptionContext{videoStageEventContext=");
        sb.append(valueOf);
        sb.append(", playerState=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public khg() {
    }
}
