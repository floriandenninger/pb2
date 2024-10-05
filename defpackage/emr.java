package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class emr extends emt {
    private final yys b;
    private final Runnable c;

    public emr(azrw azrwVar, yys yysVar, Runnable runnable) {
        super((aadw) azrwVar.get());
        this.b = yysVar;
        this.c = runnable;
    }

    @Override // defpackage.emt
    public final void a() {
        this.b.e(8);
        this.c.run();
    }

    @Override // defpackage.emt
    public final boolean b() {
        return this.b.g(8);
    }
}
