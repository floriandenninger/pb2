package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccn {
    public final String a;
    public final int b;

    public ccn(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccn)) {
            return false;
        }
        ccn ccnVar = (ccn) obj;
        if (this.b != ccnVar.b) {
            return false;
        }
        return this.a.equals(ccnVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
