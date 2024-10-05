package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ava implements pss {
    public final /* synthetic */ avl a;
    public final /* synthetic */ Exception b;
    private final /* synthetic */ int c;

    public /* synthetic */ ava(avl avlVar, Exception exc, int i) {
        this.c = i;
        this.a = avlVar;
        this.b = exc;
    }

    @Override // defpackage.pss
    public final void a(Object obj) {
        if (this.c == 0) {
            ((avm) obj).u(this.a, this.b);
        } else {
            ((avm) obj).h(this.a, this.b);
        }
    }
}
