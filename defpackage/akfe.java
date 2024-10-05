package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akfe implements Runnable {
    public final /* synthetic */ akfo a;
    private final /* synthetic */ int b;

    public /* synthetic */ akfe(akfo akfoVar, int i) {
        this.b = i;
        this.a = akfoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.d.c();
            return;
        }
        if (i != 1) {
            akfo akfoVar = this.a;
            if (akfoVar.t != null) {
                akfoVar.t.a();
                akfoVar.t = null;
                return;
            }
            return;
        }
        akfo akfoVar2 = this.a;
        if (akfoVar2.t != null) {
            ((ayor) akfoVar2.t).d(Status.c.asException());
            akfoVar2.t = null;
        }
    }
}
