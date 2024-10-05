package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aidh extends aixi {
    final /* synthetic */ aidi a;
    private final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aidh(aidi aidiVar, String str, long j, long j2) {
        super(j, j2, 1, 2, str);
        this.a = aidiVar;
        this.b = str;
    }

    @Override // defpackage.aixi
    protected final void a() {
        if (this.b.equals(this.a.a)) {
            this.a.e.i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aixi
    public final void rK(long j) {
        if (this.l && s(j)) {
            rL(false, false, false, j);
        }
    }

    @Override // defpackage.aixi
    public final void rL(boolean z, boolean z2, boolean z3, long j) {
        String str;
        long j2;
        aidi aidiVar = this.a;
        aigl aiglVar = aidiVar.j;
        if (aiglVar == null || (aiglVar.a.equals(aidiVar.a) && !z2)) {
            str = this.a.a;
            j2 = j;
        } else {
            aigl aiglVar2 = this.a.j;
            long j3 = aiglVar2.c;
            str = aiglVar2.a;
            j2 = j3;
        }
        this.a.c(str, this.b, j2, false, z2);
        this.a.c(this.b, str, j, true, z2);
        this.a.j = new aigl(this.b, j, p());
    }
}
