package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class shv implements Runnable {
    public final /* synthetic */ sid a;
    public final /* synthetic */ anhz b;
    private final /* synthetic */ int c;

    public /* synthetic */ shv(sid sidVar, anhz anhzVar, int i) {
        this.c = i;
        this.a = sidVar;
        this.b = anhzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            this.a.execute(this.b);
        } else {
            this.a.execute(this.b);
        }
    }
}
