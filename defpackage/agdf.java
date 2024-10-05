package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agdf implements Runnable {
    public final /* synthetic */ hw a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ agdf(hw hwVar, int i, int i2) {
        this.c = i2;
        this.a = hwVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            this.a.accept(Integer.valueOf(this.b));
        } else {
            this.a.accept(Integer.valueOf(this.b));
        }
    }
}
