package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rin implements Runnable {
    final /* synthetic */ rij a;
    final /* synthetic */ long b;
    final /* synthetic */ rip c;

    public rin(rip ripVar, rij rijVar, long j) {
        this.c = ripVar;
        this.a = rijVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.t(this.a, false, this.b);
        rip ripVar = this.c;
        ripVar.d = null;
        ripVar.l().x(null);
    }
}
