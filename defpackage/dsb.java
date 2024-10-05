package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dsb implements Runnable {
    final /* synthetic */ dqx a;
    private final /* synthetic */ int b;

    public dsb(dqx dqxVar, int i) {
        this.b = i;
        this.a = dqxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.k();
        } else {
            dsx.x(this.a);
        }
    }
}
