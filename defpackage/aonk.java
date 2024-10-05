package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aonk extends aomu {
    final aooy a;
    final Object b;
    public final aooy c;
    public final aonj d;

    public aonk(aooy aooyVar, Object obj, aooy aooyVar2, aonj aonjVar) {
        if (aooyVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (aonjVar.c == aoqn.MESSAGE && aooyVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = aooyVar;
        this.b = obj;
        this.c = aooyVar2;
        this.d = aonjVar;
    }

    @Override // defpackage.aomu
    public final int a() {
        return this.d.b;
    }

    public final aoqn b() {
        return this.d.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object c(Object obj) {
        return this.d.a() == aoqo.ENUM ? this.d.a.findValueByNumber(((Integer) obj).intValue()) : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object d(Object obj) {
        return this.d.a() == aoqo.ENUM ? Integer.valueOf(((aonq) obj).getNumber()) : obj;
    }

    public final boolean e() {
        return this.d.d;
    }
}
