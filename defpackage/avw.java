package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class avw implements Runnable {
    public final /* synthetic */ awa a;
    public final /* synthetic */ Exception b;
    private final /* synthetic */ int c;

    public /* synthetic */ avw(awa awaVar, Exception exc, int i) {
        this.c = i;
        this.a = awaVar;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            awa awaVar = this.a;
            Exception exc = this.b;
            awb awbVar = awaVar.a;
            int i = pts.a;
            awbVar.c(exc);
            return;
        }
        awa awaVar2 = this.a;
        Exception exc2 = this.b;
        awb awbVar2 = awaVar2.a;
        int i2 = pts.a;
        awbVar2.j(exc2);
    }
}
