package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aybc {
    private static final AtomicLong b = new AtomicLong();
    public final long a;
    private final String c;
    private final String d;

    public aybc(String str, String str2, long j) {
        str.getClass();
        amkq.F(!str.isEmpty(), "empty type");
        this.c = str;
        this.d = str2;
        this.a = j;
    }

    public static aybc a(Class cls, String str) {
        cls.getClass();
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return b(simpleName, str);
    }

    public static aybc b(String str, String str2) {
        return new aybc(str, str2, b.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.c;
        long j = this.a;
        StringBuilder sb2 = new StringBuilder(str.length() + 22);
        sb2.append(str);
        sb2.append("<");
        sb2.append(j);
        sb2.append(">");
        sb.append(sb2.toString());
        if (this.d != null) {
            sb.append(": (");
            sb.append(this.d);
            sb.append(')');
        }
        return sb.toString();
    }
}
