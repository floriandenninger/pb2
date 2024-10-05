package defpackage;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aixe {
    public final Runnable a;
    public final Handler b;
    public final shf c;
    public final aaea d;
    public long e;
    public long f;
    public boolean g;

    public aixe(shf shfVar, aaea aaeaVar, Handler handler, final azrw azrwVar) {
        this.c = shfVar;
        this.d = aaeaVar;
        this.b = handler;
        this.a = new Runnable() { // from class: aixd
            @Override // java.lang.Runnable
            public final void run() {
                aixe aixeVar = aixe.this;
                Object obj = azrwVar.get();
                if (aixeVar.g) {
                    return;
                }
                aixg aixgVar = (aixg) obj;
                ajbl ajblVar = aixgVar.a;
                int i = 2;
                if (aixeVar.c.d() >= aixeVar.f && ahbj.u(ajblVar) == 2) {
                    i = 4;
                } else if (!aifk.e(aixeVar.d).h) {
                    i = 1;
                }
                aixgVar.D(i);
                if (i == 4) {
                    long d = aixeVar.c.d();
                    long j = aixeVar.f;
                    if (d - j > 1000) {
                        aixeVar.f = aixeVar.c.d() + 1000;
                    } else {
                        aixeVar.f = j + 1000;
                    }
                }
                Handler handler2 = aixeVar.b;
                Runnable runnable = aixeVar.a;
                long j2 = aixeVar.e;
                if (j2 <= 0 || j2 > 100) {
                    j2 = 100;
                }
                handler2.postDelayed(runnable, j2);
                aixeVar.e = Long.MAX_VALUE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b.removeCallbacks(this.a);
        this.f = 0L;
        this.b.post(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b.removeCallbacks(this.a);
    }
}
