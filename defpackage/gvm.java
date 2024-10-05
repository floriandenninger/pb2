package defpackage;

import android.os.Bundle;
import com.google.protos.youtube.api.innertube.ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gvm implements aaha {
    private final ci a;
    private final ainy b;

    public gvm(ci ciVar, ainy ainyVar) {
        this.a = ciVar;
        ainyVar.getClass();
        this.b = ainyVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.showSponsorshipsDialogCommand)) {
            ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand = (ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand) apxfVar.pX(ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.showSponsorshipsDialogCommand);
            apxf apxfVar2 = showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.b;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            if (apxfVar2.pY(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
                if (this.b.d()) {
                    this.b.a();
                }
                apxf apxfVar3 = showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.b;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                yiz yizVar = new yiz();
                Bundle bundle = new Bundle();
                bundle.putByteArray("get_offers_command", apxfVar3.toByteArray());
                yizVar.af(bundle);
                yizVar.qh(this.a.getSupportFragmentManager(), "sponsorships_offer_dialog");
            }
        }
    }
}
