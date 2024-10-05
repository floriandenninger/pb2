package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qyf {
    private final int a;

    public qyf() {
    }

    public qyf(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this.a == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qyf)) {
            return false;
        }
        int i = this.a;
        boolean z = i == ((qyf) obj).a;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i ^ 1000003;
        }
        throw null;
    }

    public final String toString() {
        int i = this.a;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "DO_NOT_ENFORCE" : "UNKNOWN" : "NOT_SET" : "ENFORCE";
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(str);
        return sb.toString();
    }
}
