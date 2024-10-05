package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class admm implements Runnable {
    public final /* synthetic */ adms a;
    private final /* synthetic */ int b;

    public /* synthetic */ admm(adms admsVar, int i) {
        this.b = i;
        this.a = admsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            adms.aq(this.a);
        } else {
            adms.ar(this.a);
        }
    }
}
