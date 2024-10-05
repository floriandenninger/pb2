package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yqg implements aok {
    public final aom a;

    public yqg(yqe yqeVar) {
        aoe aoeVar;
        aom aomVar = new aom(this);
        this.a = aomVar;
        yqeVar.a.c(new yqf(this));
        Boolean bool = yqeVar.a.b.b;
        if (bool == null || !bool.booleanValue()) {
            aoeVar = aoe.CREATED;
        } else {
            aoeVar = aoe.RESUMED;
        }
        aomVar.f(aoeVar);
    }

    @Override // defpackage.aok
    public final aof getLifecycle() {
        return this.a;
    }
}
