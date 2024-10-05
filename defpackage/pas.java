package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pas {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public pas(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final Uri a(String str) {
        return Uri.parse(muf.M(str, this.c));
    }

    public final String b(String str) {
        return muf.M(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pas pasVar = (pas) obj;
            if (this.a == pasVar.a && this.b == pasVar.b && this.c.equals(pasVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((int) this.a) + 527) * 31) + ((int) this.b)) * 31) + this.c.hashCode();
        this.d = hashCode;
        return hashCode;
    }
}
