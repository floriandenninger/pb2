package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.google.protos.youtube.api.innertube.ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abiw implements aaha {
    private final ci a;
    private final acqz b;

    public abiw(Activity activity, acqz acqzVar) {
        this.a = (ci) activity;
        this.b = acqzVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        apxf apxfVar2 = (apxf) yjj.u(map, "ticker_applied_action", apxf.class);
        ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint = (ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint) apxfVar.pX(ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.showLiveChatItemEndpoint);
        acra mM = this.b.mM();
        abkt abktVar = new abkt();
        Bundle bundle = new Bundle();
        bundle.putByteArray("endpoint", showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.toByteArray());
        if (apxfVar2 != null) {
            bundle.putByteArray("applied_action", apxfVar2.toByteArray());
        }
        abktVar.af(bundle);
        abktVar.n(true);
        abktVar.ae = mM;
        View view = (View) yjj.u(map, "live_chat_ticker_view", View.class);
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            abktVar.ak = Integer.valueOf(iArr[1] + view.getHeight());
            abktVar.al = Integer.valueOf(i);
        }
        abktVar.qh(this.a.getSupportFragmentManager(), "show_live_chat_item");
    }
}
