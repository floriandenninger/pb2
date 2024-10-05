package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ukq implements Runnable {
    public final /* synthetic */ ukt a;
    public final /* synthetic */ ufi b;
    private final /* synthetic */ int c;

    public /* synthetic */ ukq(ukt uktVar, ufi ufiVar, int i) {
        this.c = i;
        this.a = uktVar;
        this.b = ufiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            ukt uktVar = this.a;
            ((ukk) uktVar.b.get()).c(this.b);
        } else {
            ukt uktVar2 = this.a;
            ((ukk) uktVar2.b.get()).d(this.b);
        }
    }
}
