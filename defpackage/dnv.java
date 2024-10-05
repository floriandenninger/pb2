package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dnv implements Runnable {
    final /* synthetic */ dnw a;

    public dnv(dnw dnwVar) {
        this.a = dnwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(System.nanoTime());
    }
}
