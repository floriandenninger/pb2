package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayks extends ayhg {
    final ayai c;
    final aych d;
    final axzo e;
    final /* synthetic */ aykt f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayks(aykt ayktVar, ayai ayaiVar, aych aychVar, axzo axzoVar) {
        super(ayktVar.c.d(axzoVar), ayktVar.c.k, axzoVar.b);
        this.f = ayktVar;
        this.c = ayaiVar;
        this.d = aychVar;
        this.e = axzoVar;
    }

    @Override // defpackage.ayhg
    protected final void f() {
        this.f.c.o.execute(new aykr(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        this.f.c.d(this.e).execute(new aykr(this, 1));
    }
}
