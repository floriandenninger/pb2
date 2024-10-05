package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class admp implements qon {
    private final Runnable a;

    public admp(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.qon
    public final /* bridge */ /* synthetic */ void a(qom qomVar) {
        if (((qjh) qomVar).a().c()) {
            return;
        }
        zga.h(adms.a, "Command fallback to using cloud channel.");
        this.a.run();
    }
}
