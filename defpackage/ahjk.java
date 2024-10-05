package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahjk implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ ahjo b;

    public ahjk(ahjo ahjoVar, boolean z) {
        this.b = ahjoVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.j.setVisibility(true != this.a ? 0 : 8);
    }
}
