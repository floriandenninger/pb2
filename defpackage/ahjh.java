package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahjh implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ ahjo b;

    public ahjh(ahjo ahjoVar, float f) {
        this.b = ahjoVar;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.j.setTextSize(0, ahiy.s(this.a));
    }
}
