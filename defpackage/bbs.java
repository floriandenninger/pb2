package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bbs implements Runnable {
    public final /* synthetic */ bbx a;
    public final /* synthetic */ bby b;
    public final /* synthetic */ bbi c;
    public final /* synthetic */ bbn d;
    private final /* synthetic */ int e;

    public /* synthetic */ bbs(bbx bbxVar, bby bbyVar, bbi bbiVar, bbn bbnVar, int i) {
        this.e = i;
        this.a = bbxVar;
        this.b = bbyVar;
        this.c = bbiVar;
        this.d = bbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i == 0) {
            bbx bbxVar = this.a;
            this.b.R(bbxVar.a, bbxVar.c, this.c, this.d);
            return;
        }
        if (i != 1) {
            bbx bbxVar2 = this.a;
            this.b.T(bbxVar2.a, bbxVar2.c, this.c, this.d);
            return;
        }
        bbx bbxVar3 = this.a;
        this.b.Q(bbxVar3.a, bbxVar3.c, this.c, this.d);
    }
}
