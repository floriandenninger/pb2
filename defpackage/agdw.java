package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agdw implements agdu {
    private final shf a;
    private final agsg b;
    private final ylf c;

    static {
        TimeUnit.HOURS.toSeconds(4L);
    }

    public agdw(shf shfVar, ylf ylfVar, agsg agsgVar) {
        shfVar.getClass();
        this.a = shfVar;
        agsgVar.getClass();
        this.b = agsgVar;
        ylfVar.getClass();
        this.c = ylfVar;
    }

    @Override // defpackage.agdu
    public final void a(String str) {
        d();
        this.b.D(str, 0L);
    }

    @Override // defpackage.agdu
    public final void b(String str) {
        long p = this.b.p(str);
        if (p <= 0) {
            return;
        }
        this.c.e("offline_auto_offline", TimeUnit.MILLISECONDS.toSeconds(Math.max(0L, p - this.a.c())), false, 1, ageb.a(str), ageb.b, false);
    }

    @Override // defpackage.agdu
    public final void c(String str, long j, long j2) {
        this.c.e("offline_auto_offline", j, true, 1, ageb.a(str), ageb.b, false);
        this.b.D(str, this.a.c() + TimeUnit.SECONDS.toMillis(j));
        this.b.C(str, j2);
    }

    @Override // defpackage.agdu
    public final void d() {
        this.c.c("offline_auto_offline");
    }
}
