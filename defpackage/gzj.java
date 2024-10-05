package defpackage;

import com.google.android.apps.youtube.app.extensions.lens.LensController;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.protos.youtube.api.innertube.LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gzj implements aaha {
    public static final /* synthetic */ int a = 0;
    private final Executor b;
    private final azrw c;
    private final azrw d;
    private final azrw e;

    public gzj(Executor executor, azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.b = executor;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.e = azrwVar3;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Long l;
        if (!apxfVar.pY(LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.lensWatchNextRequestContinuationCommand)) {
            throw new aahm();
        }
        String str = ((LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand) apxfVar.pX(LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.lensWatchNextRequestContinuationCommand)).b;
        if (str.isEmpty()) {
            return;
        }
        String.format(Locale.US, "[LENS] Making GetWatchNext continuation request with token: %s", str);
        final LensController lensController = (LensController) this.e.get();
        abdu b = ((abdt) this.d.get()).b();
        str.getClass();
        b.d = str;
        b.m(lensController.f);
        if (map != null && (l = (Long) map.get("player_timestamp_ms")) != null) {
            b.v = l.longValue();
        }
        abds abdsVar = (abds) this.c.get();
        ynm.k(abdsVar.b.o(b, angq.a, abds.e(abdsVar.a, abdsVar.c)), this.b, new ynk() { // from class: gzh
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                LensController lensController2 = LensController.this;
                int i = gzj.a;
                if (lensController2.b) {
                    String.format(Locale.US, "[LENS] Received error response: %s", th.getMessage());
                }
            }
        }, new ynl() { // from class: gzi
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                ojb ojbVar;
                aqts aqtsVar;
                LensController lensController2 = LensController.this;
                int i = gzj.a;
                asfc asfcVar = ((WatchNextResponseModel) obj).a;
                if (lensController2.b) {
                    aulp aulpVar = asfcVar.e;
                    if (aulpVar == null) {
                        aulpVar = aulp.a;
                    }
                    asmx asmxVar = (asmx) aulpVar.pX(asmx.b);
                    int i2 = asmxVar.c;
                    if ((i2 & 8) != 0) {
                        aahd aahdVar = lensController2.c;
                        apxf apxfVar2 = asmxVar.g;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aahdVar.c(apxfVar2, null);
                        return;
                    }
                    if ((i2 & 1) != 0 && (ojbVar = ((oja) lensController2.d.get()).a) != null) {
                        nqp nqpVar = ((DefaultWatchPanelViewController) ojbVar).e;
                        aqto aqtoVar = asmxVar.d;
                        if (aqtoVar == null) {
                            aqtoVar = aqto.a;
                        }
                        if (aqtoVar.b == 138681066) {
                            aqtsVar = (aqts) aqtoVar.c;
                        } else {
                            aqtsVar = aqts.b;
                        }
                        nqpVar.p(aqtsVar);
                    }
                    int i3 = asmxVar.c;
                    if ((i3 & 2) == 0 || (i3 & 4) == 0) {
                        return;
                    }
                    LinkedHashMap linkedHashMap = lensController2.e;
                    String str2 = asmxVar.f;
                    apxf apxfVar3 = asmxVar.e;
                    if (apxfVar3 == null) {
                        apxfVar3 = apxf.a;
                    }
                    linkedHashMap.put(str2, apxfVar3);
                    if (((ainy) lensController2.a.get()).d()) {
                        lensController2.g();
                    }
                }
            }
        });
    }
}
