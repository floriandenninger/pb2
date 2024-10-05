package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bahn implements Runnable {
    final /* synthetic */ bahy a;
    final /* synthetic */ bahx b;
    private final /* synthetic */ int c;

    public bahn(bahx bahxVar, bahy bahyVar, int i) {
        this.c = i;
        this.b = bahxVar;
        this.a = bahyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            try {
                this.a.a();
                return;
            } catch (Throwable th) {
                this.b.e(new bagf("System error", th));
                return;
            }
        }
        if (i == 1) {
            try {
                this.a.a();
                return;
            } catch (Throwable th2) {
                this.b.f(th2);
                return;
            }
        }
        try {
            this.a.a();
        } catch (Throwable th3) {
            this.b.e(new bafu("Exception received from UrlRequest.Callback", th3));
        }
    }
}
