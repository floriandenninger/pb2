package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abud implements Runnable {
    public final /* synthetic */ abvu a;
    private final /* synthetic */ int b;

    public /* synthetic */ abud(abvu abvuVar, int i) {
        this.b = i;
        this.a = abvuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            abvu abvuVar = this.a;
            int[] iArr = abui.a;
            abvuVar.a();
        } else {
            if (i != 1) {
                this.a.a();
                return;
            }
            abvu abvuVar2 = this.a;
            int i2 = abtr.c;
            abvuVar2.a();
        }
    }
}
