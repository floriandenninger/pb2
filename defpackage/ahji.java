package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahji implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ahjo b;
    private final /* synthetic */ int c;

    public ahji(ahjo ahjoVar, int i, int i2) {
        this.c = i2;
        this.b = ahjoVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            this.b.j.setTextColor(this.a);
        } else {
            this.b.j.setGravity(this.a);
        }
    }
}
