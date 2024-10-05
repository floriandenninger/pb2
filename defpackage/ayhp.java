package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayhp implements Runnable {
    final /* synthetic */ ayhx a;
    private final /* synthetic */ int b;

    public ayhp(ayhx ayhxVar, int i) {
        this.b = i;
        this.a = ayhxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.r();
            return;
        }
        if (i == 1) {
            this.a.e.f();
        } else if (i != 2) {
            this.a.e.e();
        } else {
            this.a.e.d();
        }
    }
}
