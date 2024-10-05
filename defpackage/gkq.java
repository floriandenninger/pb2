package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gkq implements Runnable {
    public final /* synthetic */ ahez a;
    private final /* synthetic */ int b;

    public /* synthetic */ gkq(ahez ahezVar, int i) {
        this.b = i;
        this.a = ahezVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.q(false);
        } else if (i != 1) {
            this.a.h.start();
        } else {
            this.a.p();
        }
    }
}
