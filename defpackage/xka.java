package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xka {
    public final boolean a;
    public final boolean b;
    public final CharSequence c;

    public xka() {
    }

    public xka(boolean z, boolean z2, CharSequence charSequence) {
        this.a = z;
        this.b = z2;
        this.c = charSequence;
    }

    public static xjz a() {
        xjz xjzVar = new xjz();
        xjzVar.c(false);
        xjzVar.b(false);
        xjzVar.d("<NONE>");
        return xjzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xka) {
            xka xkaVar = (xka) obj;
            if (this.a == xkaVar.a && this.b == xkaVar.b && this.c.equals(xkaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 90);
        sb.append("LearnMoreOverlayState{learnMoreCtaHidden=");
        sb.append(z);
        sb.append(", learnMoreCtaEnabled=");
        sb.append(z2);
        sb.append(", learnMoreText=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
