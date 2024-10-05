package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aehw {
    public aevb a;
    private Long b;
    private Long c;
    private Long d;
    private Long e;
    private Boolean f;

    public aehw() {
    }

    public aehw(aehx aehxVar) {
        this.b = aehxVar.a;
        this.c = aehxVar.b;
        this.d = aehxVar.c;
        this.e = aehxVar.d;
        this.a = aehxVar.f;
        this.f = Boolean.valueOf(aehxVar.e);
    }

    public final aehx a() {
        Boolean bool = this.f;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: forceRequestIdempotent");
        }
        return new aehx(this.b, this.c, this.d, this.e, this.a, bool.booleanValue());
    }

    public final void b(long j) {
        if (j != -9223372036854775807L) {
            f(TimeUnit.MICROSECONDS.toMillis(j));
        }
    }

    public final void c(long j) {
        if (j != -9223372036854775807L) {
            g(TimeUnit.MICROSECONDS.toMillis(j));
        }
    }

    public final void d(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void e(long j) {
        this.d = Long.valueOf(j);
    }

    public final void f(long j) {
        this.c = Long.valueOf(j);
    }

    public final void g(long j) {
        this.b = Long.valueOf(j);
    }

    public final void h(long j) {
        this.e = Long.valueOf(j);
    }

    public final void i(aevc... aevcVarArr) {
        int length = aevcVarArr.length;
        for (int i = 0; i <= 0; i++) {
            this.a = new aevb(aevcVarArr[i]);
        }
    }
}
