package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abes implements anfy {
    public final /* synthetic */ anhy a;
    public final /* synthetic */ anhy b;
    private final /* synthetic */ int c;

    public /* synthetic */ abes(anhy anhyVar, anhy anhyVar2, int i) {
        this.c = i;
        this.a = anhyVar;
        this.b = anhyVar2;
    }

    @Override // defpackage.anfy
    public final anhy a() {
        if (this.c == 0) {
            anhy anhyVar = this.a;
            anhy anhyVar2 = this.b;
            anaf.W(anhyVar);
            anaf.W(anhyVar2);
            return anaf.O(null);
        }
        return anaf.O(new liw((String) anaf.W(this.a), (auqe) anaf.W(this.b)));
    }
}
