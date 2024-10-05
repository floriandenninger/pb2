package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tmu implements Runnable {
    final /* synthetic */ tmv a;
    private final Runnable b;

    public tmu(tmv tmvVar, Runnable runnable) {
        this.a = tmvVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } finally {
            this.a.a();
        }
    }
}
