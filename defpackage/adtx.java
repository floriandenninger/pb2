package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtx {
    public final CharSequence a;
    public final CharSequence b;
    public final int c;
    public final int d;
    public final avgg e;

    public adtx() {
    }

    public adtx(CharSequence charSequence, CharSequence charSequence2, int i, int i2, avgg avggVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = i;
        this.d = i2;
        this.e = avggVar;
    }

    public static adtw a() {
        adtw adtwVar = new adtw();
        adtwVar.c(2);
        adtwVar.b(0);
        return adtwVar;
    }

    public final adtw b() {
        return new adtw(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adtx) {
            adtx adtxVar = (adtx) obj;
            CharSequence charSequence = this.a;
            if (charSequence != null ? charSequence.equals(adtxVar.a) : adtxVar.a == null) {
                CharSequence charSequence2 = this.b;
                if (charSequence2 != null ? charSequence2.equals(adtxVar.b) : adtxVar.b == null) {
                    if (this.c == adtxVar.c && this.d == adtxVar.d) {
                        avgg avggVar = this.e;
                        avgg avggVar2 = adtxVar.e;
                        if (avggVar != null ? avggVar.equals(avggVar2) : avggVar2 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        int i2 = this.d;
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 122 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("MdxAdState{adVideoTitle=");
        sb.append(valueOf);
        sb.append(", adVideoSubtitle=");
        sb.append(valueOf2);
        sb.append(", adProgressMillis=");
        sb.append(i);
        sb.append(", skippableState=");
        sb.append(i2);
        sb.append(", adThumbnailDetails=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = ((charSequence == null ? 0 : charSequence.hashCode()) ^ 1000003) * 1000003;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (((((hashCode ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        avgg avggVar = this.e;
        return hashCode2 ^ (avggVar != null ? avggVar.hashCode() : 0);
    }
}
