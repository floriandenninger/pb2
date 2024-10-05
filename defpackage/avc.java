package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class avc implements pss {
    public final /* synthetic */ avl a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    private final /* synthetic */ int e;

    public /* synthetic */ avc(avl avlVar, String str, long j, long j2, int i) {
        this.e = i;
        this.a = avlVar;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.pss
    public final void a(Object obj) {
        if (this.e == 0) {
            avl avlVar = this.a;
            String str = this.b;
            long j = this.c;
            long j2 = this.d;
            avm avmVar = (avm) obj;
            avmVar.ag();
            avmVar.v(avlVar, str, j2, j);
            avmVar.H();
            return;
        }
        avl avlVar2 = this.a;
        String str2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        avm avmVar2 = (avm) obj;
        avmVar2.y();
        avmVar2.a(avlVar2, str2, j4, j3);
        avmVar2.H();
    }
}
