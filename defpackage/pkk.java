package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class pkk implements Runnable {
    public final /* synthetic */ pkv a;
    private final /* synthetic */ int b;

    public /* synthetic */ pkk(pkv pkvVar, int i) {
        this.b = i;
        this.a = pkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.a();
        } else {
            this.a.c();
        }
    }
}
