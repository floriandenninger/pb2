package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aesq implements aeti {
    Runnable a;
    private final Handler c;
    private final aeru d;
    private final amnv e;
    private long f = -1;

    public aesq(Handler handler, aeru aeruVar, amnv amnvVar) {
        this.c = handler;
        this.d = aeruVar;
        this.e = amnvVar;
    }

    @Override // defpackage.aeti
    public final void a() {
        Runnable runnable = this.a;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
        this.f = -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        long longValue = ((Long) this.e.get()).longValue();
        long j = this.f;
        if (j != -1 && longValue - j < 10) {
            this.d.w("mtnp", String.valueOf(longValue));
        }
        this.f = longValue;
        aesp aespVar = new aesp(this, 1);
        this.a = aespVar;
        this.c.postDelayed(aespVar, 5000L);
    }

    @Override // defpackage.aeti
    public final void c() {
        this.a = new aesp(this, 0);
        this.f = ((Long) this.e.get()).longValue();
        this.c.postDelayed(this.a, 5000L);
    }

    @Override // defpackage.aeti
    public final void d() {
        this.c.removeCallbacks(this.a);
        this.f = -1L;
    }
}
