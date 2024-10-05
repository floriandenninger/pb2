package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aemh implements Runnable {
    public final /* synthetic */ aemv a;
    public final /* synthetic */ float b;
    private final /* synthetic */ int c;

    public /* synthetic */ aemh(aemv aemvVar, float f, int i) {
        this.c = i;
        this.a = aemvVar;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            this.a.B(this.b);
        } else {
            this.a.E(this.b);
        }
    }
}
