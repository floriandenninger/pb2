package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akxz implements Runnable {
    public final /* synthetic */ akyb a;
    public final /* synthetic */ arpp b;
    private final /* synthetic */ int c;

    public /* synthetic */ akxz(akyb akybVar, arpp arppVar, int i) {
        this.c = i;
        this.a = akybVar;
        this.b = arppVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            akyb akybVar = this.a;
            akybVar.b.c(this.b);
        } else if (i != 1) {
            akyb akybVar2 = this.a;
            akybVar2.b.c(this.b);
        } else {
            akyb akybVar3 = this.a;
            akybVar3.b.c(this.b);
        }
    }
}
