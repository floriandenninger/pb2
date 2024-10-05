package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class xxt implements amml {
    public final /* synthetic */ xxz a;
    private final /* synthetic */ int b;

    public /* synthetic */ xxt(xxz xxzVar, int i) {
        this.b = i;
        this.a = xxzVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b == 0) {
            xxz xxzVar = this.a;
            awuo awuoVar = (awuo) obj;
            if (xxzVar.ai.c() == null) {
                return awuoVar;
            }
            xxzVar.ai.c().b();
            aone builder = awuoVar.toBuilder();
            builder.bd(xxzVar.ai.c().b());
            return (awuo) builder.build();
        }
        xxz xxzVar2 = this.a;
        Map unmodifiableMap = Collections.unmodifiableMap(((awuo) obj).d);
        if (xxzVar2.ai.c() == null) {
            return amlr.a;
        }
        xxzVar2.ai.c().b();
        String b = xxzVar2.ai.c().b();
        return !unmodifiableMap.containsKey(b) ? amlr.a : ammv.j((Boolean) unmodifiableMap.get(b));
    }
}
