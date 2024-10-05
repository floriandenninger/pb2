package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ihi implements Runnable {
    public final /* synthetic */ ihj a;
    private final /* synthetic */ int b;

    public /* synthetic */ ihi(ihj ihjVar, int i) {
        this.b = i;
        this.a = ihjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            ihj ihjVar = this.a;
            int andSet = ihjVar.b.j.getAndSet(-1);
            if (andSet >= 0) {
                if (ihjVar.b.n.c(andSet) == 0) {
                    ihjVar.b.o.ak(andSet + 1);
                    return;
                } else {
                    ihjVar.b.o.ak(andSet);
                    return;
                }
            }
            return;
        }
        if (i == 1) {
            ihj ihjVar2 = this.a;
            int andSet2 = ihjVar2.b.k.getAndSet(-1);
            if (andSet2 >= 0) {
                if (ihjVar2.b.n.c(andSet2) != 1 || andSet2 <= 0) {
                    ihjVar2.b.o.ak(andSet2);
                } else {
                    ihjVar2.b.o.ak(andSet2 - 1);
                }
            }
            ihjVar2.b.b.b();
            return;
        }
        if (i != 2) {
            ihj ihjVar3 = this.a;
            int andSet3 = ihjVar3.b.j.getAndSet(-1);
            if (andSet3 >= 0) {
                ihjVar3.b.o.ak(andSet3);
                return;
            }
            return;
        }
        ihj ihjVar4 = this.a;
        int andSet4 = ihjVar4.b.k.getAndSet(-1);
        if (andSet4 >= 0) {
            ihjVar4.b.o.ak(andSet4);
        }
    }
}
