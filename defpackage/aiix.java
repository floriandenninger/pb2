package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aiix implements Runnable {
    public final /* synthetic */ aiiz a;
    public final /* synthetic */ Exception b;
    private final /* synthetic */ int c;

    public /* synthetic */ aiix(aiiz aiizVar, Exception exc, int i) {
        this.c = i;
        this.a = aiizVar;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            aiiz aiizVar = this.a;
            Exception exc = this.b;
            if (aiizVar.e) {
                return;
            }
            aiizVar.c.b(new aigr(4, true, 1, aiizVar.d.b(exc), exc, aiizVar.a.l()));
            return;
        }
        aiiz aiizVar2 = this.a;
        Exception exc2 = this.b;
        if (aiizVar2.e) {
            return;
        }
        aiizVar2.c.f(new aigr(12, true, aiizVar2.d.b(exc2), exc2));
    }
}
