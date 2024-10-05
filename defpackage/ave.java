package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ave implements pss {
    public final /* synthetic */ avl a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ ave(avl avlVar, boolean z, int i) {
        this.c = i;
        this.a = avlVar;
        this.b = z;
    }

    @Override // defpackage.pss
    public final void a(Object obj) {
        if (this.c == 0) {
            ((avm) obj).s(this.a, this.b);
        } else {
            avm avmVar = (avm) obj;
            avmVar.k(this.a, this.b);
            avmVar.P();
        }
    }
}
