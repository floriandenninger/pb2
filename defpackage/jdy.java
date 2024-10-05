package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jdy implements Runnable {
    public final /* synthetic */ jdz a;
    private final /* synthetic */ int b;

    public /* synthetic */ jdy(jdz jdzVar, int i) {
        this.b = i;
        this.a = jdzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.a.dismiss();
            return;
        }
        jdz jdzVar = this.a;
        jdzVar.a.dismiss();
        jdzVar.a.ai.a();
    }
}
