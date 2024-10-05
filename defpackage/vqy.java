package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class vqy implements amml {
    public final /* synthetic */ Map a;
    private final /* synthetic */ int b;

    public /* synthetic */ vqy(Map map, int i) {
        this.b = i;
        this.a = map;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        int i = this.b;
        if (i == 0) {
            return (vqw) this.a.get((vqv) obj);
        }
        if (i == 1) {
            Map map = this.a;
            acsc acscVar = hda.a;
            aone builder = ((idr) obj).toBuilder();
            builder.copyOnWrite();
            idr idrVar = (idr) builder.instance;
            aoot aootVar = idrVar.p;
            if (!aootVar.b) {
                idrVar.p = aootVar.a();
            }
            idrVar.p.putAll(map);
            return (idr) builder.build();
        }
        Map map2 = this.a;
        aone builder2 = ((awuq) obj).toBuilder();
        builder2.copyOnWrite();
        ((awuq) builder2.instance).a().putAll(map2);
        return (awuq) builder2.build();
    }
}
