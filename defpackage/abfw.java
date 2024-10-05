package defpackage;

import com.google.protos.youtube.api.innertube.ShowShareWithKidsPanelCommandOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abfw implements aaha {
    public final aahd a;
    public Map b;
    private final Executor c;
    private final aaxn d;

    public abfw(aaxn aaxnVar, Executor executor, aahd aahdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        aaxnVar.getClass();
        this.d = aaxnVar;
        executor.getClass();
        this.c = executor;
        aahdVar.getClass();
        this.a = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        this.b = map;
        if (apxfVar != null && apxfVar.pY(ShowShareWithKidsPanelCommandOuterClass.showShareWithKidsPanelCommand)) {
            final auuh auuhVar = (auuh) apxfVar.pX(ShowShareWithKidsPanelCommandOuterClass.showShareWithKidsPanelCommand);
            if ((auuhVar.b & 1) != 0) {
                aaxn aaxnVar = this.d;
                aomf aomfVar = apxfVar.c;
                aaxy aaxyVar = new aaxy(aaxnVar.f, aaxnVar.a.c(), null, null, null);
                aaxyVar.l(aomfVar);
                aaxyVar.b = auuhVar.d;
                aaxyVar.a = auuhVar.c;
                ynm.k(aaxnVar.b.b(aaxyVar, angq.a), this.c, new ynk() { // from class: abfu
                    @Override // defpackage.zfi
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        abfw abfwVar = abfw.this;
                        auuh auuhVar2 = auuhVar;
                        if ((auuhVar2.b & 4) != 0) {
                            aahd aahdVar = abfwVar.a;
                            apxf apxfVar2 = auuhVar2.e;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            aahdVar.a(apxfVar2);
                        }
                    }
                }, new ynl() { // from class: abfv
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        acra acraVar;
                        abfw abfwVar = abfw.this;
                        arbq arbqVar = (arbq) obj;
                        Map map2 = abfwVar.b;
                        if (map2 != null && (arbqVar.b & 8) != 0 && (acraVar = (acra) yjj.u(map2, "com.google.android.libraries.youtube.logging.interaction_logger", acra.class)) != null) {
                            acraVar.n(new acqx(arbqVar.e));
                        }
                        if ((arbqVar.b & 2) != 0) {
                            aahd aahdVar = abfwVar.a;
                            apxf apxfVar2 = arbqVar.d;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            aahdVar.a(apxfVar2);
                        }
                    }
                });
            }
        }
    }
}
