package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class twc {
    public static final twc a;
    public final Throwable b;
    public final int c;

    static {
        tvy b = b();
        b.b = 1;
        a = b.a();
    }

    public twc() {
    }

    public twc(int i, Throwable th) {
        this.c = i;
        this.b = th;
    }

    public static final twc a(Throwable th) {
        tvy b = b();
        b.b = 3;
        b.a = th;
        return b.a();
    }

    public static tvy b() {
        return new tvy();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof twc)) {
            return false;
        }
        twc twcVar = (twc) obj;
        int i = this.c;
        int i2 = twcVar.c;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            Throwable th = this.b;
            Throwable th2 = twcVar.b;
            if (th != null ? th.equals(th2) : th2 == null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "PERMANENT_FAILURE" : "TRANSIENT_FAILURE" : "SUCCESS";
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 21 + String.valueOf(valueOf).length());
        sb.append("Result{code=");
        sb.append(str);
        sb.append(", error=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            throw null;
        }
        int i2 = (i ^ 1000003) * 1000003;
        Throwable th = this.b;
        return i2 ^ (th == null ? 0 : th.hashCode());
    }
}
