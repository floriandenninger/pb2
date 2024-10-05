package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ilo implements amml {
    public final /* synthetic */ ilp a;
    private final /* synthetic */ int b;

    public /* synthetic */ ilo(ilp ilpVar, int i) {
        this.b = i;
        this.a = ilpVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b == 0) {
            ilp ilpVar = this.a;
            aone builder = ((iop) obj).toBuilder();
            int i = ilpVar.f;
            builder.copyOnWrite();
            ((iop) builder.instance).c = i;
            String str = ilpVar.b;
            builder.copyOnWrite();
            iop iopVar = (iop) builder.instance;
            str.getClass();
            iopVar.e = str;
            if (ilpVar.d) {
                builder.copyOnWrite();
                ((iop) builder.instance).b = true;
            }
            return (iop) builder.build();
        }
        ilp ilpVar2 = this.a;
        aone builder2 = ((iop) obj).toBuilder();
        int i2 = ilpVar2.e;
        builder2.copyOnWrite();
        ((iop) builder2.instance).d = i2;
        String str2 = ilpVar2.b;
        builder2.copyOnWrite();
        iop iopVar2 = (iop) builder2.instance;
        str2.getClass();
        iopVar2.e = str2;
        return (iop) builder2.build();
    }
}
