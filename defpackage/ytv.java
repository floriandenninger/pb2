package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ytv implements Runnable {
    public final /* synthetic */ azrw a;
    private final /* synthetic */ int b;

    public /* synthetic */ ytv(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.get();
        } else {
            this.a.get();
        }
    }
}
