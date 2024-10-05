package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayhb implements Runnable {
    final /* synthetic */ aycd a;
    final /* synthetic */ ayhf b;

    public ayhb(ayhf ayhfVar, aycd aycdVar) {
        this.b = ayhfVar;
        this.a = aycdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.d(this.a);
    }
}
