package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class twt {
    public Long a;
    private Long b;
    private String c;
    private Long d;
    private int e;
    private int f;
    private int g;
    private int h;

    public twt() {
    }

    public twt(txc txcVar) {
        this.b = Long.valueOf(txcVar.a);
        this.c = txcVar.b;
        this.a = Long.valueOf(txcVar.c);
        this.e = txcVar.e;
        this.f = txcVar.f;
        this.g = txcVar.g;
        this.h = txcVar.h;
        this.d = Long.valueOf(txcVar.d);
    }

    public final txc a() {
        Long l = this.b;
        if (l == null || this.c == null || this.a == null || this.e == 0 || this.f == 0 || this.g == 0 || this.h == 0 || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" id");
            }
            if (this.c == null) {
                sb.append(" threadId");
            }
            if (this.a == null) {
                sb.append(" lastUpdatedVersion");
            }
            if (this.e == 0) {
                sb.append(" readState");
            }
            if (this.f == 0) {
                sb.append(" deletionStatus");
            }
            if (this.g == 0) {
                sb.append(" countBehavior");
            }
            if (this.h == 0) {
                sb.append(" systemTrayBehavior");
            }
            if (this.d == null) {
                sb.append(" modifiedTimestamp");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new txc(l.longValue(), this.c, this.a.longValue(), this.e, this.f, this.g, this.h, this.d.longValue());
    }

    public final void b(long j) {
        this.b = Long.valueOf(j);
    }

    public final void c(long j) {
        this.d = Long.valueOf(j);
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null threadId");
        }
        this.c = str;
    }

    public final void e(int i) {
        if (i == 0) {
            throw new NullPointerException("Null countBehavior");
        }
        this.g = i;
    }

    public final void f(int i) {
        if (i == 0) {
            throw new NullPointerException("Null deletionStatus");
        }
        this.f = i;
    }

    public final void g(int i) {
        if (i == 0) {
            throw new NullPointerException("Null readState");
        }
        this.e = i;
    }

    public final void h(int i) {
        if (i == 0) {
            throw new NullPointerException("Null systemTrayBehavior");
        }
        this.h = i;
    }
}
