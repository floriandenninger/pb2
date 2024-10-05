package defpackage;

import com.google.protos.youtube.api.innertube.UpdateKidsAllowlistCommandOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abfz implements aaha {
    public final aahd a;
    private final Executor b;
    private final aaxn c;

    public abfz(aaxn aaxnVar, Executor executor, aahd aahdVar, byte[] bArr, byte[] bArr2) {
        aaxnVar.getClass();
        this.c = aaxnVar;
        executor.getClass();
        this.b = executor;
        aahdVar.getClass();
        this.a = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar != null && apxfVar.pY(UpdateKidsAllowlistCommandOuterClass.updateKidsAllowlistCommand)) {
            final avsg avsgVar = (avsg) apxfVar.pX(UpdateKidsAllowlistCommandOuterClass.updateKidsAllowlistCommand);
            if ((avsgVar.b & 1) != 0) {
                if (avsgVar.d.size() == 0 && avsgVar.e.size() == 0) {
                    return;
                }
                aaxn aaxnVar = this.c;
                aomf aomfVar = apxfVar.c;
                aaxz aaxzVar = new aaxz(aaxnVar.f, aaxnVar.a.c(), null, null, null);
                aaxzVar.l(aomfVar);
                aaxzVar.a = avsgVar.c;
                aaxzVar.b = avsgVar.d;
                aaxzVar.c = avsgVar.e;
                ynm.k(aaxnVar.b.b(aaxzVar, angq.a), this.b, new ynk() { // from class: abfx
                    @Override // defpackage.zfi
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        abfz abfzVar = abfz.this;
                        avsg avsgVar2 = avsgVar;
                        if ((avsgVar2.b & 4) != 0) {
                            aahd aahdVar = abfzVar.a;
                            apxf apxfVar2 = avsgVar2.f;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            aahdVar.a(apxfVar2);
                        }
                    }
                }, new ynl() { // from class: abfy
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        abfz abfzVar = abfz.this;
                        avsf avsfVar = (avsf) obj;
                        if ((avsfVar.b & 2) != 0) {
                            aahd aahdVar = abfzVar.a;
                            apxf apxfVar2 = avsfVar.d;
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
