package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zma implements Runnable {
    final /* synthetic */ zmb a;

    public zma(zmb zmbVar) {
        this.a = zmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.invalidateSelf();
    }
}
