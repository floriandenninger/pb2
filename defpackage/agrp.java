package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agrp {
    public final String a;
    public final long b;
    public final String[] c;
    public final long d;
    public final long e;

    public agrp(String str, long j, String[] strArr, long j2) {
        str.getClass();
        this.a = str;
        this.b = j;
        strArr.getClass();
        this.c = strArr;
        this.d = j2;
        this.e = 0L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agrp)) {
            return false;
        }
        agrp agrpVar = (agrp) obj;
        if (!amkq.b(this.a, agrpVar.a) || this.b != agrpVar.b || this.d != agrpVar.d || !Arrays.equals(this.c, agrpVar.c)) {
            return false;
        }
        long j = agrpVar.e;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Long.valueOf(this.d), 0L});
    }
}
