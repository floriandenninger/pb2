package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rjp implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ rjw b;
    private final /* synthetic */ int c;

    public rjp(rjw rjwVar, long j, int i) {
        this.c = i;
        this.b = rjwVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            rjw rjwVar = this.b;
            long j = this.a;
            rjwVar.n();
            rjwVar.o();
            rjwVar.aF().k.b("Activity paused, time", Long.valueOf(j));
            rjs rjsVar = rjwVar.e;
            rjsVar.b.Q();
            rjsVar.a = new rjr(rjsVar, System.currentTimeMillis(), j);
            rjsVar.b.b.postDelayed(rjsVar.a, 2000L);
            if (rjwVar.J().r()) {
                rjwVar.d.c();
                return;
            }
            return;
        }
        rjw rjwVar2 = this.b;
        long j2 = this.a;
        rjwVar2.n();
        rjwVar2.o();
        rjwVar2.aF().k.b("Activity resumed, time", Long.valueOf(j2));
        if (rjwVar2.J().r() || rjwVar2.M().p.b()) {
            rju rjuVar = rjwVar2.d;
            rjuVar.d.n();
            rjuVar.c.a();
            rjuVar.a = j2;
            rjuVar.b = j2;
        }
        rjs rjsVar2 = rjwVar2.e;
        rjsVar2.b.n();
        rjr rjrVar = rjsVar2.a;
        if (rjrVar != null) {
            rjsVar2.b.b.removeCallbacks(rjrVar);
        }
        rjsVar2.b.M().p.a(false);
        rjv rjvVar = rjwVar2.c;
        rjvVar.a.n();
        if (rjvVar.a.w.v()) {
            rjvVar.a.Q();
            rjvVar.b(System.currentTimeMillis(), false);
        }
    }
}
