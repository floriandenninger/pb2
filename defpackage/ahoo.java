package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahoo implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ ahos b;

    public ahoo(ahos ahosVar, boolean z) {
        this.b = ahosVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.i(this.a);
    }
}
