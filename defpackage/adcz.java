package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcz {
    public final boolean a;
    public final aibu b;

    public adcz() {
    }

    public adcz(boolean z, aibu aibuVar) {
        this.a = z;
        this.b = aibuVar;
    }

    public static adcy a() {
        adcy adcyVar = new adcy();
        adcyVar.b(false);
        adcyVar.c(aibu.DEFAULT);
        return adcyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adcz) {
            adcz adczVar = (adcz) obj;
            if (this.a == adczVar.a && this.b.equals(adczVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
        sb.append("UnselectedRouteProperties{isUnselectUserInitiated=");
        sb.append(z);
        sb.append(", queueTransferType=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
