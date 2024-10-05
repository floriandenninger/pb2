package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayhv implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ ayge b;
    final /* synthetic */ aycd c;
    final /* synthetic */ ayhw d;

    public ayhv(ayhw ayhwVar, Status status, ayge aygeVar, aycd aycdVar) {
        this.d = ayhwVar;
        this.a = status;
        this.b = aygeVar;
        this.c = aycdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.a(this.a, this.b, this.c);
    }
}
