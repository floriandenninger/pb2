package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afkq implements Runnable {
    public final /* synthetic */ afkr a;
    private final /* synthetic */ int b;

    public /* synthetic */ afkq(afkr afkrVar, int i) {
        this.b = i;
        this.a = afkrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            afkr afkrVar = this.a;
            afkrVar.J(afkrVar.getLeft(), afkrVar.getTop(), afkrVar.getRight(), afkrVar.getBottom());
        } else if (i != 1) {
            this.a.I();
        } else {
            this.a.H();
        }
    }
}
