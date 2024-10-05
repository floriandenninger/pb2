package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.FancyDismissibleDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.MultiMessageConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.NotificationReminderDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.OpenDialogCommandOuterClass$OpenDialogCommand;
import com.google.protos.youtube.api.innertube.UpsellDialogRendererOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gsf implements aaha {
    private final Context a;
    private final aahd b;
    private final dd c;
    private final agxh d;
    private final acqz e;
    private final azrw f;
    private final ezn g;

    public gsf(Context context, aahd aahdVar, ezn eznVar, dd ddVar, agxh agxhVar, acqz acqzVar, azrw azrwVar, byte[] bArr) {
        this.a = context;
        this.b = aahdVar;
        this.g = eznVar;
        this.c = ddVar;
        this.d = agxhVar;
        this.e = acqzVar;
        this.f = azrwVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if ((((OpenDialogCommandOuterClass$OpenDialogCommand) apxfVar.pX(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)).b & 1) != 0) {
            aulq aulqVar = ((OpenDialogCommandOuterClass$OpenDialogCommand) apxfVar.pX(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)).c;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(NotificationReminderDialogRendererOuterClass.notificationReminderDialogRenderer)) {
                this.g.kE(apxfVar, map);
                return;
            }
            if (aulqVar.pY(FancyDismissibleDialogRendererOuterClass.fancyDismissibleDialogRenderer)) {
                ajdj.g(this.a, (aqvu) aulqVar.pX(FancyDismissibleDialogRendererOuterClass.fancyDismissibleDialogRenderer), this.b, (ajdh) this.f.get(), null);
                return;
            }
            if (aulqVar.pY(MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer)) {
                abxj abxjVar = (abxj) this.c.f("MultiMessageConfirmDialogFragment");
                if (abxjVar == null) {
                    abxjVar = new abxj();
                }
                dd ddVar = this.c;
                athg athgVar = (athg) aulqVar.pX(MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer);
                if (abxjVar.ar()) {
                    abxjVar.dismiss();
                }
                abxjVar.ah = athgVar;
                abxjVar.ai = map;
                abxjVar.qh(ddVar, "MultiMessageConfirmDialogFragment");
                return;
            }
            if (aulqVar.pY(UpsellDialogRendererOuterClass.upsellDialogRenderer)) {
                this.d.a(aulqVar.pX(UpsellDialogRendererOuterClass.upsellDialogRenderer), this.e.mM(), null, null);
            }
        }
    }
}
