package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoqt extends aoqu {
    public final long a;
    public final aopf b;

    public aoqt(long j, aopf aopfVar) {
        this.a = j;
        if (aopfVar == null) {
            throw new NullPointerException("Null parser");
        }
        this.b = aopfVar;
    }

    @Override // defpackage.aoqu
    public final long a() {
        return this.a;
    }

    @Override // defpackage.aoqu
    public final aopf b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoqu) {
            aoqu aoquVar = (aoqu) obj;
            if (this.a == aoquVar.a() && this.b.equals(aoquVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("GeneratedAnyExtractor{typeHash=");
        sb.append(j);
        sb.append(", parser=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
