package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adah {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public adah() {
    }

    public adah(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public static adag a() {
        adag adagVar = new adag();
        adagVar.b(false);
        adagVar.g(false);
        adagVar.e(false);
        adagVar.d(false);
        adagVar.f(true);
        adagVar.c(false);
        return adagVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adah) {
            adah adahVar = (adah) obj;
            if (this.a == adahVar.a && this.b == adahVar.b && this.c == adahVar.c && this.d == adahVar.d && this.e == adahVar.e && this.f == adahVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.f ? 1231 : 1237);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        StringBuilder sb = new StringBuilder(197);
        sb.append("AutoconnectEnablement{isEnabled=");
        sb.append(z);
        sb.append(", shouldDisplayPrompt=");
        sb.append(z2);
        sb.append(", isRateLimited=");
        sb.append(z3);
        sb.append(", shouldTreatIgnoreLikeDismiss=");
        sb.append(z4);
        sb.append(", shouldUseNewDismissTextCopy=");
        sb.append(z5);
        sb.append(", shouldUseNewTitleDetailsTextCopy=");
        sb.append(z6);
        sb.append("}");
        return sb.toString();
    }
}
