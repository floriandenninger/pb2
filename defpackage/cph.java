package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cph implements Runnable {
    final /* synthetic */ dbr a;

    public cph(dbr dbrVar) {
        this.a = dbrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.cancel(true);
    }
}
