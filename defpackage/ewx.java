package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ewx implements aaha {
    public final aahd a;
    private final aaux b;
    private final zaw c;
    private final Executor d;
    private final ci e;

    public ewx(aaux aauxVar, zaw zawVar, aahd aahdVar, Executor executor, ci ciVar) {
        aauxVar.getClass();
        this.b = aauxVar;
        zawVar.getClass();
        this.c = zawVar;
        aahdVar.getClass();
        this.a = aahdVar;
        this.d = executor;
        this.e = ciVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, final Map map) {
        aaux aauxVar = this.b;
        aaup aaupVar = new aaup(aauxVar.f, aauxVar.a.c(), null, null, null);
        final aqjo aqjoVar = (aqjo) apxfVar.pX(aqjo.b);
        aaupVar.a = aqjoVar.c;
        aaupVar.l(apxfVar.c);
        ci ciVar = this.e;
        aaux aauxVar2 = this.b;
        Executor executor = this.d;
        if (aauxVar2.c == null) {
            aauxVar2.c = new aauq(aauxVar2.b, aauxVar2.e);
        }
        ynm.n(ciVar, aauxVar2.c.g(aaupVar, executor), new eww(this.c, 0), new zfi() { // from class: ewv
            @Override // defpackage.zfi
            public final void a(Object obj) {
                ewx ewxVar = ewx.this;
                aqjo aqjoVar2 = aqjoVar;
                Map map2 = map;
                if (aqjoVar2.d.size() > 0) {
                    ewxVar.a.d(aqjoVar2.d, map2);
                }
            }
        });
    }
}
