package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afeq implements amnv {
    private final amnv a;
    private final axpg b;

    public afeq(amnv amnvVar, axpg axpgVar) {
        this.a = amnvVar;
        this.b = axpgVar;
    }

    @Override // defpackage.amnv
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ovv get() {
        aone createBuilder = ovv.a.createBuilder();
        Object obj = this.a.get();
        createBuilder.copyOnWrite();
        ovv ovvVar = (ovv) createBuilder.instance;
        obj.getClass();
        ovvVar.c = (armz) obj;
        ovvVar.b |= 1;
        afft a = ((afgb) this.b.get()).a();
        if (a != null) {
            aomf x = aomf.x(a.b);
            createBuilder.copyOnWrite();
            ovv ovvVar2 = (ovv) createBuilder.instance;
            ovvVar2.b |= 2;
            ovvVar2.d = x;
        }
        return (ovv) createBuilder.build();
    }
}
