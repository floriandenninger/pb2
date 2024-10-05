package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sa implements rd {
    final /* synthetic */ sb a;

    public sa(sb sbVar) {
        this.a = sbVar;
    }

    @Override // defpackage.rd
    public final void a(qq qqVar, boolean z) {
        if (qqVar instanceof rm) {
            qqVar.a().i(false);
        }
        rd rdVar = this.a.e;
        if (rdVar != null) {
            rdVar.a(qqVar, z);
        }
    }

    @Override // defpackage.rd
    public final boolean b(qq qqVar) {
        sb sbVar = this.a;
        if (qqVar == sbVar.c) {
            return false;
        }
        qt qtVar = ((rm) qqVar).k;
        rd rdVar = sbVar.e;
        if (rdVar != null) {
            return rdVar.b(qqVar);
        }
        return false;
    }
}
