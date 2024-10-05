package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayho implements Runnable {
    final /* synthetic */ ayaj a;
    final /* synthetic */ ayhx b;

    public ayho(ayhx ayhxVar, ayaj ayajVar) {
        this.b = ayhxVar;
        this.a = ayajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.i(this.a);
    }
}
