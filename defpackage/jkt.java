package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jkt implements agzm {
    final /* synthetic */ jkv a;
    private final /* synthetic */ int b;

    public jkt(jkv jkvVar, int i) {
        this.b = i;
        this.a = jkvVar;
    }

    @Override // defpackage.agzm
    public final void a() {
    }

    @Override // defpackage.agzm
    public final void b() {
        int i = this.b;
        if (i == 0) {
            agzm agzmVar = this.a.m;
            if (agzmVar != null) {
                agzmVar.b();
                return;
            }
            return;
        }
        if (i == 1) {
            this.a.q.b();
            return;
        }
        if (i == 2) {
            agzm agzmVar2 = this.a.l;
            if (agzmVar2 != null) {
                agzmVar2.b();
                return;
            }
            return;
        }
        this.a.n.b();
    }
}
