package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anfs implements Runnable {
    final /* synthetic */ amrl a;
    final /* synthetic */ anft b;

    public anfs(anft anftVar, amrl amrlVar) {
        this.b = anftVar;
        this.a = amrlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.i(this.a);
    }
}
