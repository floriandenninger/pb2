package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aut implements pss {
    public final /* synthetic */ avl a;
    public final /* synthetic */ auj b;
    private final /* synthetic */ int c;

    public /* synthetic */ aut(avl avlVar, auj aujVar, int i) {
        this.c = i;
        this.a = avlVar;
        this.b = aujVar;
    }

    @Override // defpackage.pss
    public final void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            avl avlVar = this.a;
            auj aujVar = this.b;
            avm avmVar = (avm) obj;
            avmVar.B();
            avmVar.e(avlVar, 1, aujVar);
            return;
        }
        if (i == 1) {
            avl avlVar2 = this.a;
            auj aujVar2 = this.b;
            avm avmVar2 = (avm) obj;
            avmVar2.A();
            avmVar2.d(avlVar2, 1, aujVar2);
            return;
        }
        if (i == 2) {
            avl avlVar3 = this.a;
            auj aujVar3 = this.b;
            avm avmVar3 = (avm) obj;
            avmVar3.ai();
            avmVar3.d(avlVar3, 2, aujVar3);
            return;
        }
        avl avlVar4 = this.a;
        auj aujVar4 = this.b;
        avm avmVar4 = (avm) obj;
        avmVar4.aj();
        avmVar4.e(avlVar4, 2, aujVar4);
    }
}
