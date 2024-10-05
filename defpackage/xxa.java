package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class xxa implements amml {
    public final /* synthetic */ xxp a;
    private final /* synthetic */ int b;

    public /* synthetic */ xxa(xxp xxpVar, int i) {
        this.b = i;
        this.a = xxpVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b == 0) {
            xxp xxpVar = this.a;
            awuo awuoVar = (awuo) obj;
            if (xxpVar.ai.c() == null) {
                return awuoVar;
            }
            xxpVar.ai.c().b();
            aone builder = awuoVar.toBuilder();
            builder.bd(xxpVar.ai.c().b());
            return (awuo) builder.build();
        }
        xxp xxpVar2 = this.a;
        Map unmodifiableMap = Collections.unmodifiableMap(((awuo) obj).d);
        if (xxpVar2.ai.c() == null) {
            return amlr.a;
        }
        xxpVar2.ai.c().b();
        String b = xxpVar2.ai.c().b();
        return !unmodifiableMap.containsKey(b) ? amlr.a : ammv.j((Boolean) unmodifiableMap.get(b));
    }
}
