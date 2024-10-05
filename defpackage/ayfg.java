package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayfg implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ayfh b;

    public ayfg(ayfh ayfhVar, int i) {
        this.b = ayfhVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = aypd.a;
        try {
            aygr aygrVar = this.b.a;
            int i2 = this.a;
            amkq.F(true, "numMessages must be > 0");
            if (((aylm) aygrVar).b()) {
                return;
            }
            ((aylm) aygrVar).e += i2;
            ((aylm) aygrVar).a();
        } catch (Throwable th) {
            this.b.k(th);
        }
    }
}
