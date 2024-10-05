package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayde implements Runnable {
    final /* synthetic */ aydf a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ aydh c;

    public ayde(aydh aydhVar, aydf aydfVar, Runnable runnable) {
        this.c = aydhVar;
        this.a = aydfVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.execute(this.a);
    }

    public final String toString() {
        return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
