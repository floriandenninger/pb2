package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahlw implements Runnable {
    public final /* synthetic */ ahmc a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahlw(ahmc ahmcVar, int i) {
        this.b = i;
        this.a = ahmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            ahvb ahvbVar = this.a.g;
            if (ahvbVar != null) {
                ahvbVar.e();
                return;
            }
            return;
        }
        if (i == 1) {
            ahmc ahmcVar = this.a;
            ahxd ahxdVar = ahmcVar.i;
            if (ahxdVar == null || ahmcVar.g == null) {
                return;
            }
            ahxdVar.a();
            ahmcVar.g.f();
            return;
        }
        if (i == 2) {
            ahvb ahvbVar2 = this.a.g;
            if (ahvbVar2 != null) {
                ahvbVar2.f();
                return;
            }
            return;
        }
        ahmc ahmcVar2 = this.a;
        ahxd ahxdVar2 = ahmcVar2.i;
        if (ahxdVar2 == null || ahmcVar2.g == null) {
            return;
        }
        ahxdVar2.b();
        ahmcVar2.g.f();
    }
}
