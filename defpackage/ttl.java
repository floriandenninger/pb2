package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ttl implements vfl {
    public final /* synthetic */ tss a;
    private final /* synthetic */ int b;

    public /* synthetic */ ttl(tss tssVar, int i) {
        this.b = i;
        this.a = tssVar;
    }

    @Override // defpackage.vfl
    public final aooy a(vfm vfmVar, aooy aooyVar) {
        if (this.b == 0) {
            tss tssVar = this.a;
            aone createBuilder = tlj.a.createBuilder();
            amxd listIterator = vfmVar.c().entrySet().listIterator();
            while (listIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) listIterator.next();
                try {
                    String str = (String) entry.getValue();
                    str.getClass();
                    try {
                        createBuilder.z((String) entry.getKey(), (tlh) rwh.as(str, tlh.a.getParserForType()));
                    } catch (aoob e) {
                        tsx.c("SharedPreferences shared files metadata had unexpected format: %s", e);
                        tssVar.g(1084);
                    }
                } catch (ClassCastException | NullPointerException e2) {
                    tsx.c("SharedPreferences shared files metadata key wasn't a string: %s", e2);
                    tssVar.g(1083);
                }
            }
            return (tlj) createBuilder.build();
        }
        tss tssVar2 = this.a;
        aone createBuilder2 = tlb.a.createBuilder();
        amxd listIterator2 = vfmVar.c().entrySet().listIterator();
        while (listIterator2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) listIterator2.next();
            try {
                String str2 = (String) entry2.getValue();
                str2.getClass();
                try {
                    createBuilder2.x((String) entry2.getKey(), (tkv) rwh.as(str2, tkv.a.getParserForType()));
                } catch (aoob e3) {
                    tsx.c("SharedPreferences file groups metadata had unexpected format: %s", e3);
                    tssVar2.g(1084);
                }
            } catch (ClassCastException | NullPointerException e4) {
                tsx.c("SharedPreferences file groups metadata key wasn't a string: %s", e4);
                tssVar2.g(1083);
            }
        }
        return (tlb) createBuilder2.build();
    }
}
