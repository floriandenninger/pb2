package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abug implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ abuh b;

    public abug(abuh abuhVar, int i) {
        this.b = abuhVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a > 0) {
            abuh abuhVar = this.b;
            abuhVar.a.i(abuhVar.g);
            abuh abuhVar2 = this.b;
            abuhVar2.b.a(abuhVar2.f);
            return;
        }
        abuh abuhVar3 = this.b;
        abuhVar3.b.a(abuhVar3.f);
        abuh abuhVar4 = this.b;
        abuhVar4.a.i(abuhVar4.g);
    }
}
