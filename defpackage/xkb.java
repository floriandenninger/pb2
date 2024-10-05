package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xkb {
    public final boolean a;

    public xkb() {
    }

    public xkb(boolean z) {
        this.a = z;
    }

    public static ajhi a() {
        ajhi ajhiVar = new ajhi();
        ajhiVar.d(false);
        return ajhiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof xkb) && this.a == ((xkb) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(39);
        sb.append("MdxAdOverlayState{remotePlayback=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
