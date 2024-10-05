package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aerq implements Runnable {
    public final /* synthetic */ aers a;
    public final /* synthetic */ long b;
    private final /* synthetic */ int c;

    public /* synthetic */ aerq(aers aersVar, long j, int i) {
        this.c = i;
        this.a = aersVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            aers aersVar = this.a;
            aersVar.a.s(this.b);
            return;
        }
        if (i == 1) {
            aers aersVar2 = this.a;
            aersVar2.a.o(this.b);
        } else if (i == 2) {
            aers aersVar3 = this.a;
            aersVar3.a.t(this.b);
        } else if (i != 3) {
            aers aersVar4 = this.a;
            aersVar4.a.y(this.b);
        } else {
            aers aersVar5 = this.a;
            aersVar5.a.u(this.b);
        }
    }
}
