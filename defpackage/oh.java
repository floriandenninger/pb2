package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class oh implements Runnable {
    final /* synthetic */ ok a;

    public oh(ok okVar) {
        this.a = okVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g(true);
        this.a.invalidateSelf();
    }
}
