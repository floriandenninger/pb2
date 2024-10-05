package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gza implements Runnable {
    public final /* synthetic */ gzb a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ gza(gzb gzbVar, int i, int i2) {
        this.c = i2;
        this.a = gzbVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            this.a.oc(this.b);
        } else {
            this.a.oc(this.b);
        }
    }
}
