package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqg implements Runnable {
    final /* synthetic */ bqh a;
    private final /* synthetic */ int b;

    public bqg(bqh bqhVar, int i) {
        this.b = i;
        this.a = bqhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            bqh bqhVar = this.a;
            bqn bqnVar = bqhVar.h;
            if (bqnVar.d == bqhVar) {
                bqnVar.k();
                return;
            }
            return;
        }
        bqh bqhVar2 = this.a;
        int size = bqhVar2.g.size();
        for (int i = 0; i < size; i++) {
            ((jj) bqhVar2.g.valueAt(i)).i(null, null);
        }
        bqhVar2.g.clear();
    }
}
