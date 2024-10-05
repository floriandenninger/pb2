package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fwm implements Runnable {
    final /* synthetic */ fwo a;
    private final /* synthetic */ int b;

    public fwm(fwo fwoVar, int i) {
        this.b = i;
        this.a = fwoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.e();
        } else {
            this.a.a();
        }
    }
}
