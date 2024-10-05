package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afbt {
    public final afbu a;
    public final boolean b;

    public afbt(afbu afbuVar, boolean z) {
        if (afbuVar == null) {
            throw new NullPointerException("Null selectedPlayer");
        }
        this.a = afbuVar;
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static afbt a(afbu afbuVar, boolean z) {
        return new afbt(afbuVar, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afbt) {
            afbt afbtVar = (afbt) obj;
            if (this.a.equals(afbtVar.a) && this.b == afbtVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
        sb.append("PlayerSelectionResult{selectedPlayer=");
        sb.append(valueOf);
        sb.append(", defaultPlayerIndexUsed=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public afbt() {
    }
}
