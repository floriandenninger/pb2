package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gre implements aaha {
    public final Context a;
    public final aahd b;
    public final ajjz c;
    public final acqz d;
    private final Executor e;
    private final aaxn f;

    public gre(Context context, aaxn aaxnVar, aahd aahdVar, Executor executor, ajjz ajjzVar, acqz acqzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = context;
        this.f = aaxnVar;
        this.e = executor;
        aahdVar.getClass();
        this.b = aahdVar;
        this.c = ajjzVar;
        this.d = acqzVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand = (GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand) apxfVar.pX(GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.getPdgBuyFlowCommand);
        aaxn aaxnVar = this.f;
        aban abanVar = new aban(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        abanVar.a = getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.b;
        ynm.l(this.f.b.b(abanVar, angq.a), this.e, new ynk() { // from class: grc
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                Toast.makeText(gre.this.a, R.string.error_generic, 0).show();
            }
        }, new ynl() { // from class: grd
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                gre greVar = gre.this;
                arrx arrxVar = (arrx) obj;
                greVar.d.mM().D(new acqx(arrxVar.d));
                greVar.d.mM().u(new acqx(arrxVar.d), null);
                apxf apxfVar2 = arrxVar.c;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                if (apxfVar2.pY(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
                    apxf apxfVar3 = arrxVar.c;
                    if (apxfVar3 == null) {
                        apxfVar3 = apxf.a;
                    }
                    greVar.b.a(apxfVar3);
                }
                for (int i = 0; i < arrxVar.e.size(); i++) {
                    greVar.c.n((avgg) arrxVar.e.get(i), 1920, 1080);
                }
            }
        }, anij.a);
    }
}
