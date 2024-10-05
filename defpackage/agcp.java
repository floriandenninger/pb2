package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agcp implements Runnable {
    public final /* synthetic */ agcs a;
    private final /* synthetic */ int b;

    public /* synthetic */ agcp(agcs agcsVar, int i) {
        this.b = i;
        this.a = agcsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.c();
        } else {
            this.a.c();
        }
    }
}
