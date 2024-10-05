package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class alcp implements akwp {
    private final /* synthetic */ int c;
    public static final /* synthetic */ alcp b = new alcp(1);
    public static final /* synthetic */ alcp a = new alcp(0);

    private /* synthetic */ alcp(int i) {
        this.c = i;
    }

    @Override // defpackage.akwp
    public final akzs a(akzs akzsVar) {
        if (this.c != 0) {
            akzsVar.getClass();
            if (akzsVar.u) {
                return akzsVar;
            }
            aone builder = akzsVar.toBuilder();
            alep.n(builder);
            builder.copyOnWrite();
            akzs akzsVar2 = (akzs) builder.instance;
            akzsVar2.c = (-67108865) & akzsVar2.c;
            akzsVar2.af = false;
            return (akzs) builder.build();
        }
        akzsVar.getClass();
        if (akzsVar.u) {
            return akzsVar;
        }
        aone builder2 = akzsVar.toBuilder();
        alep.n(builder2);
        builder2.copyOnWrite();
        akzs akzsVar3 = (akzs) builder2.instance;
        akzsVar3.c = (-67108865) & akzsVar3.c;
        akzsVar3.af = false;
        return (akzs) builder2.build();
    }
}
