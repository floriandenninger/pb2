package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ayi implements Runnable {
    public final /* synthetic */ aym a;
    public final /* synthetic */ bbx b;
    private final /* synthetic */ int c;

    public /* synthetic */ ayi(bbx bbxVar, aym aymVar, int i, byte[] bArr) {
        this.c = i;
        this.b = bbxVar;
        this.a = aymVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            bbx bbxVar = this.b;
            this.a.L(bbxVar.a, bbxVar.c);
        } else if (i == 1) {
            bbx bbxVar2 = this.b;
            this.a.K(bbxVar2.a, bbxVar2.c);
        } else if (i != 2) {
            bbx bbxVar3 = this.b;
            this.a.P(bbxVar3.a, bbxVar3.c);
        } else {
            bbx bbxVar4 = this.b;
            this.a.M(bbxVar4.a, bbxVar4.c);
        }
    }
}
