package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gkr implements Runnable {
    public final /* synthetic */ ainy a;
    private final /* synthetic */ int b;

    public /* synthetic */ gkr(ainy ainyVar, int i) {
        this.b = i;
        this.a = ainyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a();
            return;
        }
        if (i == 1) {
            this.a.b();
            return;
        }
        if (i == 2) {
            this.a.b();
            return;
        }
        if (i == 3) {
            this.a.B();
            return;
        }
        if (i == 4) {
            this.a.aa();
        } else if (i != 5) {
            this.a.a();
        } else {
            this.a.a();
        }
    }
}
