package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zye implements Runnable {
    public final /* synthetic */ zyj a;
    private final /* synthetic */ int b;

    public /* synthetic */ zye(zyj zyjVar, int i) {
        this.b = i;
        this.a = zyjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.h();
        } else {
            this.a.g();
        }
    }
}
