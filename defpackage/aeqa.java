package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeqa extends afvw {
    private final afwx a;

    public aeqa(String str, afwx afwxVar) {
        super(2, str, afwxVar);
        this.a = afwxVar;
    }

    @Override // defpackage.yvo
    public final boolean h() {
        return true;
    }

    @Override // defpackage.yvo
    public final yvn i() {
        return yvn.IMMEDIATE;
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        try {
            return cnm.b(cnhVar.b, null);
        } catch (Exception e) {
            return cnm.a(new cnj(e));
        }
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
        ((anfm) this.a).o((byte[]) obj);
    }
}
