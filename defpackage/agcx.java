package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agcx implements Runnable {
    public final /* synthetic */ agcz a;
    private final /* synthetic */ int b;

    public /* synthetic */ agcx(agcz agczVar, int i) {
        this.b = i;
        this.a = agczVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                this.a.f();
                return;
            } else {
                this.a.f();
                return;
            }
        }
        agcz agczVar = this.a;
        agczVar.a.d();
        agczVar.d = (String) ((amna) agczVar.a.a()).a;
        if (agczVar.g()) {
            agczVar.c.execute(new agcx(agczVar, i2));
        }
    }
}
