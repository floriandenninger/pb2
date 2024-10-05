package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akwo implements akwp {
    private final /* synthetic */ int a;

    public akwo(int i) {
        this.a = i;
    }

    @Override // defpackage.akwp
    public final akzs a(akzs akzsVar) {
        int i = this.a;
        if (i == 0) {
            return akzsVar;
        }
        if (i == 1 || akzsVar == null) {
            return null;
        }
        aone builder = akzsVar.toBuilder();
        builder.copyOnWrite();
        akzs akzsVar2 = (akzs) builder.instance;
        akzsVar2.c |= 2;
        akzsVar2.F = false;
        return (akzs) builder.build();
    }
}
