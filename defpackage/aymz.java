package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aymz implements Runnable {
    final aymx a;
    final /* synthetic */ aynl b;

    public aymz(aynl aynlVar, aymx aymxVar) {
        this.b = aynlVar;
        this.a = aymxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.execute(new aymy(this));
    }
}
