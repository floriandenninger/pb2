package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ize implements Runnable {
    final /* synthetic */ izf a;

    public ize(izf izfVar) {
        this.a = izfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        izf izfVar = this.a;
        if (izfVar.c.compareAndSet(0, 1)) {
            izfVar.a.addAll(izfVar.b.a());
            izfVar.c.compareAndSet(1, 2);
        }
    }
}
