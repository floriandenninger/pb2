package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alx implements Runnable {
    final /* synthetic */ alq a;
    final /* synthetic */ ama b;

    public alx(ama amaVar, alq alqVar) {
        this.b = amaVar;
        this.a = alqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ama amaVar = this.b;
        amaVar.e = this.a;
        amaVar.a();
    }
}
