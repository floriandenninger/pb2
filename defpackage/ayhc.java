package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayhc implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ ayhf b;

    public ayhc(ayhf ayhfVar, Object obj) {
        this.b = ayhfVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.e(this.a);
    }
}
