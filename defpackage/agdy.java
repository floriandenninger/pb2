package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agdy implements agro {
    public static final long a = TimeUnit.MINUTES.toSeconds(5);
    public static final long b = TimeUnit.HOURS.toSeconds(4);
    public final azrw c;
    public final azrw d;
    private final ScheduledExecutorService e;
    private final agsg f;
    private final ypa g;
    private final ylf h;

    public agdy(azrw azrwVar, ScheduledExecutorService scheduledExecutorService, azrw azrwVar2, ylf ylfVar, agsg agsgVar, ypa ypaVar) {
        this.c = azrwVar;
        this.e = scheduledExecutorService;
        this.d = azrwVar2;
        this.f = agsgVar;
        this.h = ylfVar;
        this.g = ypaVar;
    }

    private final void i(String str, long j, boolean z) {
        long j2 = j + j;
        ylf ylfVar = this.h;
        long j3 = b;
        ylfVar.d("offline_r_charging", j2 + j3, j + j3, z, 1, true, ageb.a(str), ageb.b);
        this.h.d("offline_r", j2 + j3, j3, z, 1, false, ageb.a(str), ageb.b);
    }

    @Override // defpackage.agro
    public final void a(String str) {
        g();
        this.f.G(str, 0L);
    }

    @Override // defpackage.agro
    public final void b(String str) {
        long r = this.f.r(str);
        if (r > 0) {
            i(str, r, false);
        }
    }

    @Override // defpackage.agro
    public final void c(String str) {
        this.h.c("offline_r_charging");
        this.h.e("offline_r", a, true, 1, ageb.a(str), ageb.b, false);
        this.e.execute(new agdx(this, str, 1));
        this.g.d(new aglm());
    }

    @Override // defpackage.agro
    public final void d(String str) {
        this.h.e("offline_r_inc", a, true, 1, ageb.a(str), ageb.b, false);
        this.e.execute(new agdx(this, str, 0));
    }

    @Override // defpackage.agro
    public final void e(String str, long j) {
        this.h.e("offline_r_inc", j, true, 1, ageb.a(str), ageb.b, false);
    }

    @Override // defpackage.agro
    public final void f(String str, long j) {
        if (j > 0) {
            i(str, j, true);
            this.f.G(str, j);
        }
    }

    @Override // defpackage.agro
    public final void g() {
        this.h.c("offline_r");
        this.h.c("offline_r_charging");
        this.h.c("offline_r_inc");
    }

    @Override // defpackage.agro
    public final void h() {
        this.h.c("offline_r_inc");
    }
}
