package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahjg implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ahjo b;

    public ahjg(ahjo ahjoVar, String str) {
        this.b = ahjoVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.j.setText(this.a);
    }
}
