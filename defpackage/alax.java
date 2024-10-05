package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alax implements akwp {
    private final long a;

    public alax(long j) {
        this.a = j;
    }

    @Override // defpackage.akwp
    public final akzs a(akzs akzsVar) {
        if (akzsVar == null) {
            return null;
        }
        aone builder = akzsVar.toBuilder();
        long j = this.a;
        builder.copyOnWrite();
        akzs akzsVar2 = (akzs) builder.instance;
        akzsVar2.c |= 1;
        akzsVar2.E = j;
        return (akzs) builder.build();
    }
}
