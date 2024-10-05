package defpackage;

import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gvn implements aaha {
    private final oja a;

    public gvn(oja ojaVar) {
        this.a = ojaVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        ojb ojbVar = this.a.a;
        if (ojbVar == null) {
            return;
        }
        nqp nqpVar = ((DefaultWatchPanelViewController) ojbVar).e;
        String str = (String) yjj.u(map, "engagement_panel_id_key", String.class);
        if (str == null || !str.equals(nqpVar.i())) {
            nqpVar.B(apxfVar);
        } else {
            nqpVar.A(apxfVar);
        }
    }
}
