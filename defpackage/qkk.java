package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qkk implements Runnable {
    final /* synthetic */ qkm a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public qkk(qkm qkmVar, String str, String str2) {
        this.a = qkmVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qen qenVar;
        synchronized (this.a.d) {
            qenVar = (qen) this.a.d.get(this.b);
        }
        if (qenVar != null) {
            qenVar.a(this.b, this.c);
        }
    }
}
