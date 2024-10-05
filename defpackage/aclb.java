package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aclb implements Runnable {
    final /* synthetic */ acle a;
    private final /* synthetic */ int b;

    public aclb(acle acleVar, int i) {
        this.b = i;
        this.a = acleVar;
    }

    public /* synthetic */ aclb(acle acleVar, int i, byte[] bArr) {
        this.b = i;
        this.a = acleVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            acle acleVar = this.a;
            synchronized (acleVar.q) {
                if (acleVar.p) {
                    return;
                }
                acleVar.m.g(acleVar.n.c);
                return;
            }
        }
        acle acleVar2 = this.a;
        abrv abrvVar = acleVar2.e;
        abqu a = acleVar2.d.a();
        synchronized (abrvVar.b) {
            abrvVar.a(a);
        }
    }
}
