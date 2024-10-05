package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zvg implements Runnable {
    public final /* synthetic */ zvk a;
    private final /* synthetic */ int b;

    public /* synthetic */ zvg(zvk zvkVar, int i) {
        this.b = i;
        this.a = zvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.p();
        } else if (i != 1) {
            this.a.p();
        } else {
            zvk zvkVar = this.a;
            zvkVar.h(zvkVar.c);
        }
    }
}
