package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccl {
    public final String a;
    public final Long b;

    public ccl(String str, long j) {
        this.a = str;
        this.b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccl)) {
            return false;
        }
        ccl cclVar = (ccl) obj;
        if (this.a.equals(cclVar.a)) {
            return this.b.equals(cclVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
