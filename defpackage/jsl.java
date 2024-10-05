package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jsl implements Runnable {
    private final azrw a;
    private final azrw b;

    public jsl(azrw azrwVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((agro) this.a.get()).c(((agof) this.b.get()).d());
    }
}
