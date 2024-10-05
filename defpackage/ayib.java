package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayib implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ ayic b;

    public ayib(ayic ayicVar, boolean z) {
        this.b = ayicVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            ayif ayifVar = this.b.a;
            ayifVar.p = true;
            if (ayifVar.m > 0) {
                amnp amnpVar = ayifVar.o;
                amnpVar.e();
                amnpVar.f();
            }
        }
        this.b.a.r = false;
    }
}
