package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqi implements Runnable {
    final /* synthetic */ acql a;
    private final /* synthetic */ int b;

    public acqi(acql acqlVar, int i) {
        this.b = i;
        this.a = acqlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            synchronized (this.a.h) {
                acql acqlVar = this.a;
                if (acqlVar.l != 3) {
                    acqlVar.l = 3;
                    acqlVar.j(4, null, null);
                    this.a.i();
                }
            }
            return;
        }
        if (i == 1) {
            this.a.j(2, null, null);
            return;
        }
        synchronized (this.a.h) {
            acql acqlVar2 = this.a;
            if (acqlVar2.l != 2) {
                acqlVar2.l = 2;
                acqlVar2.j(3, null, null);
                this.a.h();
            }
        }
    }
}
