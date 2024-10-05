package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acmb implements Runnable {
    public final /* synthetic */ acmc a;
    private final /* synthetic */ int b;

    public /* synthetic */ acmb(acmc acmcVar, int i) {
        this.b = i;
        this.a = acmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            return;
        }
        this.a.release();
    }
}
