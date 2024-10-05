package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayji extends ayin {
    public final ayft a;
    private final aygo b;

    public ayji(aygo aygoVar, ayft ayftVar) {
        this.b = aygoVar;
        this.a = ayftVar;
    }

    @Override // defpackage.ayin
    protected final aygo a() {
        return this.b;
    }

    @Override // defpackage.ayin, defpackage.aygg
    public final aygd l(aych aychVar, aycd aycdVar, axzo axzoVar, ayep[] ayepVarArr) {
        return new ayjh(this, this.b.l(aychVar, aycdVar, axzoVar, ayepVarArr));
    }
}
