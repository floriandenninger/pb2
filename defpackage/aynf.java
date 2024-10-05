package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aynf implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ ayge b;
    final /* synthetic */ aycd c;
    final /* synthetic */ ayni d;
    private final /* synthetic */ int e;

    public aynf(ayni ayniVar, Status status, ayge aygeVar, aycd aycdVar, int i) {
        this.e = i;
        this.d = ayniVar;
        this.a = status;
        this.b = aygeVar;
        this.c = aycdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e == 0) {
            this.d.b.y = true;
            this.d.b.u.a(this.a, this.b, this.c);
        } else {
            this.d.b.y = true;
            this.d.b.u.a(this.a, this.b, this.c);
        }
    }
}
