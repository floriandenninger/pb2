package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aerp implements Runnable {
    public final /* synthetic */ aers a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ aerp(aers aersVar, int i, int i2) {
        this.c = i2;
        this.a = aersVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            aers aersVar = this.a;
            aersVar.a.c(this.b);
        } else if (i != 1) {
            aers aersVar2 = this.a;
            aersVar2.a.x(this.b);
        } else {
            aers aersVar3 = this.a;
            aersVar3.a.b(this.b);
        }
    }
}
