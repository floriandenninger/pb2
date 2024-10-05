package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajpw {
    private ajom a;
    private Long b;
    private Runnable c;
    private Runnable d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;

    public final ajpx a() {
        Long l;
        ajom ajomVar = this.a;
        if (ajomVar == null || (l = this.b) == null || this.c == null || this.d == null || this.e == null || this.f == null || this.g == null || this.h == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" presenter");
            }
            if (this.b == null) {
                sb.append(" duration");
            }
            if (this.c == null) {
                sb.append(" onStart");
            }
            if (this.d == null) {
                sb.append(" onEnd");
            }
            if (this.e == null) {
                sb.append(" fromX");
            }
            if (this.f == null) {
                sb.append(" fromY");
            }
            if (this.g == null) {
                sb.append(" toX");
            }
            if (this.h == null) {
                sb.append(" toY");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ajpx(ajomVar, l.longValue(), this.c, this.d, this.e.intValue(), this.f.intValue(), this.g.intValue(), this.h.intValue());
    }

    public final void b(long j) {
        this.b = Long.valueOf(j);
    }

    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void d(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void e(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("Null onEnd");
        }
        this.d = runnable;
    }

    public final void f(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("Null onStart");
        }
        this.c = runnable;
    }

    public final void g(ajom ajomVar) {
        if (ajomVar == null) {
            throw new NullPointerException("Null presenter");
        }
        this.a = ajomVar;
    }

    public final void h(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void i(int i) {
        this.h = Integer.valueOf(i);
    }
}
