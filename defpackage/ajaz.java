package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajaz implements Runnable {
    public final /* synthetic */ ajay a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajaz(ajay ajayVar, int i) {
        this.b = i;
        this.a = ajayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.a();
        } else {
            this.a.c();
        }
    }
}
