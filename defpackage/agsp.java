package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agsp implements Runnable {
    final /* synthetic */ Class a;
    final /* synthetic */ agsq b;

    public agsp(agsq agsqVar, Class cls) {
        this.b = agsqVar;
        this.a = cls;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.a);
    }
}
