package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ayem implements Runnable {
    public final /* synthetic */ ayen a;
    public final /* synthetic */ Status b;
    private final /* synthetic */ int c;

    public /* synthetic */ ayem(ayen ayenVar, Status status, int i) {
        this.c = i;
        this.a = ayenVar;
        this.b = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            this.a.b(this.b);
        } else {
            this.a.b(this.b);
        }
    }
}
