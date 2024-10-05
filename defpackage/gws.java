package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gws implements amml {
    public final /* synthetic */ gwt a;
    private final /* synthetic */ int b;

    public /* synthetic */ gws(gwt gwtVar, int i) {
        this.b = i;
        this.a = gwtVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b == 0) {
            gwt gwtVar = this.a;
            aork aorkVar = (aork) obj;
            if (!aorkVar.c.isEmpty()) {
                gwtVar.b = aorkVar.c;
                gwtVar.f = aorkVar.d;
                apxf apxfVar = aorkVar.e;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                gwtVar.c = apxfVar;
                apxf apxfVar2 = aorkVar.f;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                gwtVar.d = apxfVar2;
                apxf apxfVar3 = aorkVar.g;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                gwtVar.e = apxfVar3;
                return true;
            }
            return false;
        }
        gwt gwtVar2 = this.a;
        aone builder = ((aork) obj).toBuilder();
        String str = gwtVar2.b;
        builder.copyOnWrite();
        aork aorkVar2 = (aork) builder.instance;
        str.getClass();
        aorkVar2.b = 1 | aorkVar2.b;
        aorkVar2.c = str;
        String str2 = gwtVar2.f;
        builder.copyOnWrite();
        aork aorkVar3 = (aork) builder.instance;
        str2.getClass();
        aorkVar3.b |= 2;
        aorkVar3.d = str2;
        apxf apxfVar4 = gwtVar2.c;
        builder.copyOnWrite();
        aork aorkVar4 = (aork) builder.instance;
        apxfVar4.getClass();
        aorkVar4.e = apxfVar4;
        aorkVar4.b |= 4;
        apxf apxfVar5 = gwtVar2.d;
        builder.copyOnWrite();
        aork aorkVar5 = (aork) builder.instance;
        apxfVar5.getClass();
        aorkVar5.f = apxfVar5;
        aorkVar5.b |= 8;
        apxf apxfVar6 = gwtVar2.e;
        builder.copyOnWrite();
        aork aorkVar6 = (aork) builder.instance;
        apxfVar6.getClass();
        aorkVar6.g = apxfVar6;
        aorkVar6.b |= 16;
        return (aork) builder.build();
    }
}
