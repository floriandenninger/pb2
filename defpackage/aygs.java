package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aygs implements Runnable {
    final /* synthetic */ aycd a;
    final /* synthetic */ ayhg b;
    final /* synthetic */ ayaw c;

    public aygs(ayhg ayhgVar, ayaw ayawVar, aycd aycdVar, byte[] bArr, byte[] bArr2) {
        this.b = ayhgVar;
        this.c = ayawVar;
        this.a = aycdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.k(this.c, this.a);
    }
}
