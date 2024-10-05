package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fju implements amml {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ fju(String str, boolean z, int i) {
        this.c = i;
        this.a = str;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amml
    public final Object apply(Object obj) {
        int i = this.c;
        if (i == 0) {
            String str = this.a;
            boolean z = this.b;
            fkg fkgVar = (fkg) obj;
            fkb fkbVar = fkb.a;
            aoot aootVar = fkgVar.j;
            if (aootVar.containsKey(str)) {
                fkbVar = (fkb) aootVar.get(str);
            }
            aone builder = fkbVar.toBuilder();
            aone builder2 = fkgVar.toBuilder();
            builder.copyOnWrite();
            fkb fkbVar2 = (fkb) builder.instance;
            fkbVar2.b |= 4;
            fkbVar2.e = z;
            builder2.i(str, (fkb) builder.build());
            return (fkg) builder2.build();
        }
        if (i != 1) {
            if (i != 2) {
                String str2 = this.a;
                boolean z2 = this.b;
                aone builder3 = ((awwp) obj).toBuilder();
                builder3.bz(str2, z2);
                return (awwp) builder3.build();
            }
            String str3 = this.a;
            boolean z3 = this.b;
            aone builder4 = ((awvr) obj).toBuilder();
            builder4.bn(str3, z3);
            return (awvr) builder4.build();
        }
        String str4 = this.a;
        boolean z4 = this.b;
        fkg fkgVar2 = (fkg) obj;
        fkb fkbVar3 = fkb.a;
        aoot aootVar2 = fkgVar2.j;
        if (aootVar2.containsKey(str4)) {
            fkbVar3 = (fkb) aootVar2.get(str4);
        }
        aone builder5 = fkbVar3.toBuilder();
        aone builder6 = fkgVar2.toBuilder();
        builder5.copyOnWrite();
        fkb fkbVar4 = (fkb) builder5.instance;
        fkbVar4.b |= 8;
        fkbVar4.f = z4;
        builder6.i(str4, (fkb) builder5.build());
        return (fkg) builder6.build();
    }
}
