package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajpz {
    public ajom a;
    public Long b;
    public Runnable c;
    public Runnable d;

    public final ajqa a() {
        Long l;
        ajom ajomVar = this.a;
        if (ajomVar == null || (l = this.b) == null || this.c == null || this.d == null) {
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
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ajqa(ajomVar, l.longValue(), this.c, this.d);
    }

    public final void b(long j) {
        this.b = Long.valueOf(j);
    }

    public final void c(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("Null onEnd");
        }
        this.d = runnable;
    }

    public final void d(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("Null onStart");
        }
        this.c = runnable;
    }

    public final void e(ajom ajomVar) {
        if (ajomVar == null) {
            throw new NullPointerException("Null presenter");
        }
        this.a = ajomVar;
    }
}
