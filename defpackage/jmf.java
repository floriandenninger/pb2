package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jmf implements Runnable {
    public final /* synthetic */ jmk a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ jmf(jmk jmkVar, boolean z, int i) {
        this.c = i;
        this.a = jmkVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            this.a.o(this.b);
        } else {
            this.a.n(true, this.b);
        }
    }
}
