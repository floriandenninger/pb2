package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agdz implements agtq {
    public static final long a = TimeUnit.HOURS.toSeconds(4);
    private final agsg b;
    private final ylf c;

    public agdz(ylf ylfVar, agsg agsgVar) {
        agsgVar.getClass();
        this.b = agsgVar;
        ylfVar.getClass();
        this.c = ylfVar;
    }

    @Override // defpackage.agtq
    public final void a(String str) {
        d();
        this.b.F(str, 0L);
    }

    @Override // defpackage.agtq
    public final void b(String str) {
        long q = this.b.q(str);
        if (q > 0) {
            ylf ylfVar = this.c;
            long j = a;
            ylfVar.d("offline_pas", q + j, j, false, 1, true, ageb.a(str), ageb.b);
        }
    }

    @Override // defpackage.agtq
    public final void c(String str, long j) {
        ylf ylfVar = this.c;
        long j2 = a;
        ylfVar.d("offline_pas", j + j2, j2, true, 1, true, ageb.a(str), ageb.b);
        this.b.F(str, j);
    }

    @Override // defpackage.agtq
    public final void d() {
        this.c.c("offline_pas");
    }

    @Override // defpackage.agtq
    public final void e(String str) {
        Bundle a2 = ageb.a(str);
        a2.putBoolean("forceSync", false);
        this.c.e("offline_pas", 0L, true, 1, a2, null, false);
    }
}
