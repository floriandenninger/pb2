package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akfi implements Runnable {
    public final /* synthetic */ akfl a;
    private final /* synthetic */ int b;

    public /* synthetic */ akfi(akfl akflVar, int i) {
        this.b = i;
        this.a = akflVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.a.e.b();
        } else {
            this.a.a.d.b();
        }
    }
}
