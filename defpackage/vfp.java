package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vfp implements vgn {
    public final vfo a;

    public vfp() {
    }

    public vfp(vfo vfoVar) {
        this.a = vfoVar;
    }

    @Override // defpackage.vgn
    public final String a() {
        return "signal";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vfp) {
            return this.a.equals(((vfp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("SignallingConfig{service=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
