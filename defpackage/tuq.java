package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tuq implements Runnable {
    public final /* synthetic */ tue a;
    private final /* synthetic */ int b;

    public /* synthetic */ tuq(tue tueVar, int i) {
        this.b = i;
        this.a = tueVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.a();
        } else {
            this.a.b();
        }
    }
}
