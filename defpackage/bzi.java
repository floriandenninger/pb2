package defpackage;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bzi {
    public cda c;
    public boolean a = false;
    final Set d = new HashSet();
    UUID b = UUID.randomUUID();

    public bzi(Class cls) {
        this.c = new cda(this.b.toString(), cls.getName());
        c(cls.getName());
    }

    public abstract bzj a();

    public final bzj b() {
        bzj a = a();
        byo byoVar = this.c.k;
        boolean z = false;
        if ((Build.VERSION.SDK_INT >= 24 && byoVar.a()) || byoVar.d || byoVar.b || (Build.VERSION.SDK_INT >= 23 && byoVar.c)) {
            z = true;
        }
        if (!this.c.q || !z) {
            this.b = UUID.randomUUID();
            cda cdaVar = new cda(this.c);
            this.c = cdaVar;
            cdaVar.c = this.b.toString();
            return a;
        }
        throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
    }

    public final void c(String str) {
        this.d.add(str);
    }

    public final void d(byo byoVar) {
        this.c.k = byoVar;
    }

    public final void e(long j, TimeUnit timeUnit) {
        this.c.h = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.c.h) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void f(byr byrVar) {
        this.c.f = byrVar;
    }
}
