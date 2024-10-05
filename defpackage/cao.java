package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cao implements Runnable {
    final /* synthetic */ cda a;
    final /* synthetic */ cap b;

    public cao(cap capVar, cda cdaVar) {
        this.b = capVar;
        this.a = cdaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ajbh X = ajbh.X();
        int i = cap.d;
        String.format("Scheduling work %s", this.a.c);
        X.T(new Throwable[0]);
        this.b.a.c(this.a);
    }
}
