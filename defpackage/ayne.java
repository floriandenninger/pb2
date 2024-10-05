package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayne implements Runnable {
    final /* synthetic */ aynj a;
    final /* synthetic */ ayni b;

    public ayne(ayni ayniVar, aynj aynjVar) {
        this.b = ayniVar;
        this.a = aynjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.t(this.a);
    }
}
