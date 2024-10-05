package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nbx implements Runnable {
    public final /* synthetic */ nby a;
    public final /* synthetic */ aowm b;
    private final /* synthetic */ int c;

    public /* synthetic */ nbx(nby nbyVar, aowm aowmVar, int i) {
        this.c = i;
        this.a = nbyVar;
        this.b = aowmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            nby nbyVar = this.a;
            nbyVar.v.c(this.b);
            nbyVar.w = false;
            return;
        }
        nby nbyVar2 = this.a;
        nbyVar2.v.c(this.b);
        nbyVar2.w = false;
    }
}
