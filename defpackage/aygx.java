package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aygx implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ayhg b;

    public aygx(ayhg ayhgVar, int i) {
        this.b = ayhgVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.d(this.a);
    }
}
