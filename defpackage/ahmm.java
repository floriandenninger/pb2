package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahmm implements Runnable {
    final /* synthetic */ ahmt a;
    private final /* synthetic */ int b;

    public ahmm(ahmt ahmtVar, int i) {
        this.b = i;
        this.a = ahmtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.k.f();
        } else if (i == 1) {
            this.a.k.a();
        } else {
            ahmt ahmtVar = this.a;
            ahmtVar.j.removeView(ahmtVar.k);
        }
    }
}
