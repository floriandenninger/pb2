package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mbd implements mcn {
    public final /* synthetic */ mbl a;
    private final /* synthetic */ int b;

    public /* synthetic */ mbd(mbl mblVar, int i) {
        this.b = i;
        this.a = mblVar;
    }

    @Override // defpackage.mcn
    public final void a() {
        if (this.b == 0) {
            mbl mblVar = this.a;
            if (mblVar.j == null) {
                return;
            }
            mblVar.j = null;
            mblVar.d = fzl.c;
            mblVar.p();
            return;
        }
        mbl mblVar2 = this.a;
        mblVar2.l();
        mblVar2.d = fzl.a;
    }
}
