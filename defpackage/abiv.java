package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import com.google.protos.youtube.api.innertube.UpsellDialogRendererOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abiv implements aaha {
    private final Activity a;
    private final ajjs b;
    private final aahd c;
    private final acra d;
    private final advq e;

    public abiv(Activity activity, advq advqVar, ajjs ajjsVar, aahd aahdVar, acra acraVar, byte[] bArr) {
        this.a = activity;
        this.e = advqVar;
        this.b = ajjsVar;
        this.c = aahdVar;
        this.d = acraVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        LiveChatAction.ShowLiveChatDialogAction showLiveChatDialogAction = (LiveChatAction.ShowLiveChatDialogAction) apxfVar.pX(LiveChatAction.ShowLiveChatDialogAction.showLiveChatDialogAction);
        if (apxfVar.pY(LiveChatAction.ShowLiveChatDialogAction.showLiveChatDialogAction) && (showLiveChatDialogAction.b & 1) != 0) {
            aulq aulqVar = showLiveChatDialogAction.c;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(UpsellDialogRendererOuterClass.upsellDialogRenderer)) {
                aulq aulqVar2 = showLiveChatDialogAction.c;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                new abne((avul) aulqVar2.pX(UpsellDialogRendererOuterClass.upsellDialogRenderer), this.a, this.e, this.b, this.c, this.d, null).a();
                return;
            }
        }
        throw new aahm();
    }
}
