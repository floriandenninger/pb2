package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dil extends diy {
    private final diy d;
    private final diy e;

    /* JADX INFO: Access modifiers changed from: protected */
    public dil(diy diyVar, diy diyVar2) {
        super(null);
        this.d = diyVar;
        this.e = diyVar2;
    }

    @Override // defpackage.diy
    public final void a(Object obj) {
        this.d.a(obj);
        this.e.a(obj);
    }

    @Override // defpackage.diy
    public final boolean b(diy diyVar) {
        if (this == diyVar) {
            return true;
        }
        if (diyVar == null || diyVar.getClass() != getClass()) {
            return false;
        }
        dil dilVar = (dil) diyVar;
        return this.d.b(dilVar.d) && this.e.b(dilVar.e);
    }
}
