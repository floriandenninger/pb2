package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sez {
    public final ansu a;
    public final int b;

    public sez(ansu ansuVar, int i) {
        if (ansuVar == null) {
            throw new NullPointerException("Null experienceRequestProto");
        }
        this.a = ansuVar;
        this.b = i;
    }

    public final boolean a() {
        ansu ansuVar = this.a;
        aweh awehVar = (ansuVar.e == 5 ? (anst) ansuVar.f : anst.a).d;
        if (awehVar == null) {
            awehVar = aweh.a;
        }
        aweu aweuVar = awehVar.d;
        if (aweuVar == null) {
            aweuVar = aweu.a;
        }
        return aweuVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sez) {
            sez sezVar = (sez) obj;
            if (this.a.equals(sezVar.a) && this.b == sezVar.b) {
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
        String str = this.b != 1 ? "DARK" : "LIGHT";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + str.length());
        sb.append("FaceViewerModel{experienceRequestProto=");
        sb.append(valueOf);
        sb.append(", theme=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public sez() {
    }
}
