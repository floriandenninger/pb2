package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aekd {
    public final aelu a;
    public final int b;

    public aekd() {
    }

    public aekd(aelu aeluVar, int i) {
        this.a = aeluVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aekd) {
            aekd aekdVar = (aekd) obj;
            if (this.a.equals(aekdVar.a) && this.b == aekdVar.b) {
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
        String str = this.b != 1 ? "VIDEO" : "AUDIO";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44 + str.length());
        sb.append("InitSegmentData{onesieVideoData=");
        sb.append(valueOf);
        sb.append(", dataType=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
