package defpackage;

import com.google.android.apps.youtube.app.player.controls.ReportVideoController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FlagVideoEndpointOuterClass$FlagVideoEndpoint;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class exi implements aaha {
    private final azrw a;
    private final iip b;

    public exi(azrw azrwVar, iip iipVar) {
        this.a = azrwVar;
        this.b = iipVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Optional a = this.b.a();
        if (a.isPresent()) {
            ((iiq) a.get()).q(((FlagVideoEndpointOuterClass$FlagVideoEndpoint) apxfVar.pX(FlagVideoEndpointOuterClass$FlagVideoEndpoint.flagVideoEndpoint)).b);
            return;
        }
        ReportVideoController reportVideoController = (ReportVideoController) this.a.get();
        asew asewVar = reportVideoController.f;
        if (asewVar == null) {
            zga.b("Reporting options have never been set.");
            whu.K(reportVideoController.a, R.string.main_flagging_while_offline, 1);
            return;
        }
        reportVideoController.e.c();
        if (reportVideoController.b.t()) {
            reportVideoController.h(asewVar);
        } else {
            reportVideoController.d.c(reportVideoController.a, null, new kff(reportVideoController, asewVar));
        }
    }
}
