package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abft implements aaha {
    public final aahd a;
    public Map b;
    private final Executor c;
    private final aaxn d;

    public abft(aaxn aaxnVar, Executor executor, aahd aahdVar, byte[] bArr) {
        executor.getClass();
        this.c = executor;
        aahdVar.getClass();
        this.a = aahdVar;
        aaxnVar.getClass();
        this.d = aaxnVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        this.b = map;
        if (apxfVar == null || !apxfVar.pY(arbk.a)) {
            return;
        }
        final arbj arbjVar = (arbj) apxfVar.pX(arbk.a);
        aaxn aaxnVar = this.d;
        aomf aomfVar = apxfVar.c;
        aaxx aaxxVar = new aaxx(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        aaxxVar.l(aomfVar);
        artp artpVar = arbjVar.c;
        if (artpVar == null) {
            artpVar = artp.a;
        }
        aaxxVar.a = artpVar;
        aaxxVar.b = arbjVar.d;
        ynm.k(aaxnVar.b.b(aaxxVar, angq.a), this.c, new ynk() { // from class: abfr
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                abft abftVar = abft.this;
                arbj arbjVar2 = arbjVar;
                if ((arbjVar2.b & 4) != 0) {
                    aahd aahdVar = abftVar.a;
                    apxf apxfVar2 = arbjVar2.e;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar.a(apxfVar2);
                }
            }
        }, new ynl() { // from class: abfs
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                acra acraVar;
                abft abftVar = abft.this;
                arbm arbmVar = (arbm) obj;
                Map map2 = abftVar.b;
                if (map2 != null && (arbmVar.b & 8) != 0 && (acraVar = (acra) yjj.u(map2, "com.google.android.libraries.youtube.logging.interaction_logger", acra.class)) != null) {
                    acraVar.n(new acqx(arbmVar.e));
                }
                if ((arbmVar.b & 2) != 0) {
                    aahd aahdVar = abftVar.a;
                    apxf apxfVar2 = arbmVar.d;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar.a(apxfVar2);
                }
            }
        });
    }
}
