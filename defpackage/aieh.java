package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aieh extends aieg {
    private final aiof j;

    public aieh(String str, aiof aiofVar) {
        super("$N", 0, str, 0L);
        this.j = aiofVar;
    }

    @Override // defpackage.aieg
    public final int a(long j) {
        aiwk aiwkVar = this.j.a.a;
        return (int) (aiwkVar != null ? aiwkVar.l(j) : -1L);
    }

    @Override // defpackage.aieg
    public final int b() {
        aiwk aiwkVar = this.j.a.a;
        return (int) (aiwkVar != null ? aiwkVar.l(aiwkVar.s().p().h) : -1L);
    }

    @Override // defpackage.aieg
    public final int d() {
        return Integer.MAX_VALUE;
    }
}
