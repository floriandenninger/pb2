package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aynd implements Runnable {
    final /* synthetic */ aynh a;

    public aynd(aynh aynhVar, byte[] bArr) {
        this.a = aynhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ayni ayniVar = this.a.a;
        this.a.a.b.t(ayniVar.b.p(ayniVar.a.d + 1, false));
    }
}
