package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aygw implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ ayhg b;

    public aygw(ayhg ayhgVar, Object obj) {
        this.b = ayhgVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.e(this.a);
    }
}
