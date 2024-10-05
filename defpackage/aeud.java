package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aeud implements Runnable {
    public final /* synthetic */ aeut a;
    public final /* synthetic */ aezf b;
    private final /* synthetic */ int c;

    public /* synthetic */ aeud(aeut aeutVar, aezf aezfVar, int i) {
        this.c = i;
        this.a = aeutVar;
        this.b = aezfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            this.a.aj(this.b, true);
        } else {
            this.a.ad(this.b);
        }
    }
}
