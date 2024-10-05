package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dnd extends dha {
    dha a;

    private dnd() {
        super("Wrapper");
    }

    public static dnc a(dhe dheVar) {
        dnc dncVar = new dnc();
        dnc.d(dncVar, dheVar, new dnd());
        return dncVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dhi c(dhe dheVar) {
        dha dhaVar = this.a;
        return dhaVar == null ? dhe.a : djt.b(dheVar, dhaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dha
    /* renamed from: e */
    public final boolean f(dha dhaVar) {
        if (this == dhaVar) {
            return true;
        }
        if (dhaVar == null || getClass() != dhaVar.getClass()) {
            return false;
        }
        dnd dndVar = (dnd) dhaVar;
        if (this.k == dndVar.k) {
            return true;
        }
        dha dhaVar2 = this.a;
        return dhaVar2 == null ? dndVar.a == null : dhaVar2.equals(dndVar.a);
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    protected final dha i() {
        return this.a;
    }
}
