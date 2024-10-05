package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axfi implements Runnable {
    final /* synthetic */ ozg a;
    final /* synthetic */ axfl b;

    public axfi(axfl axflVar, ozg ozgVar) {
        this.b = axflVar;
        this.a = ozgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.d(this.a);
    }
}
