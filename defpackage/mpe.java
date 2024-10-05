package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mpe implements Runnable {
    public final /* synthetic */ mpg a;
    private final /* synthetic */ int b;

    public /* synthetic */ mpe(mpg mpgVar, int i) {
        this.b = i;
        this.a = mpgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            mpg mpgVar = this.a;
            mpgVar.c.aE(mpgVar.b);
        } else {
            mpg mpgVar2 = this.a;
            mpgVar2.c.aB(mpgVar2.b);
        }
    }
}
