package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jaz implements aaha {
    public final Context a;
    public final jav b;
    public abmx c;
    private final Executor d;
    private final aaxn e;

    public jaz(Context context, aaxn aaxnVar, jav javVar, Executor executor, byte[] bArr, byte[] bArr2) {
        this.a = context;
        this.e = aaxnVar;
        this.b = javVar;
        this.d = executor;
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, Map map) {
        OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand = (OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand) apxfVar.pX(OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.openSuperStickerBuyFlowCommand);
        aaxn aaxnVar = this.e;
        abam abamVar = new abam(aaxnVar.f, aaxnVar.a.c(), apxfVar.c, null, null, null);
        abamVar.a = openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.b;
        abmx abmxVar = (abmx) yjj.u(map, "live_chat_product_picker_endpoint_key", abmx.class);
        this.c = abmxVar;
        if (abmxVar != null) {
            abmxVar.g(true);
        }
        ynm.l(this.e.b.a(abamVar), this.d, new ynk() { // from class: jax
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                jaz jazVar = jaz.this;
                abmx abmxVar2 = jazVar.c;
                if (abmxVar2 != null) {
                    abmxVar2.g(false);
                }
                Toast.makeText(jazVar.a, R.string.error_generic, 0).show();
            }
        }, new ynl() { // from class: jay
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                apxf apxfVar2;
                aqts aqtsVar;
                apxf apxfVar3;
                jaz jazVar = jaz.this;
                apxf apxfVar4 = apxfVar;
                arrr arrrVar = (arrr) obj;
                abmx abmxVar2 = jazVar.c;
                if (abmxVar2 != null) {
                    abmxVar2.e();
                }
                jav javVar = jazVar.b;
                byte[] I = apxfVar4.c.I();
                ojb ojbVar = javVar.a.a;
                acra mM = javVar.c.mM();
                if (arrrVar.b == 6 && ((apxf) arrrVar.c).pY(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint) && ojbVar != null) {
                    if (arrrVar.b == 6) {
                        apxfVar2 = (apxf) arrrVar.c;
                    } else {
                        apxfVar2 = apxf.a;
                    }
                    ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apxfVar2.pX(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
                    nqp nqpVar = ((DefaultWatchPanelViewController) ojbVar).e;
                    if (TextUtils.equals(nqpVar.i(), oba.j(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint))) {
                        nqpVar.l();
                    }
                    if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 8) != 0 || nqpVar.c() != null) {
                        mM = javVar.b;
                    }
                    mM.F(new acqx(arrrVar.e.I()), new acqx(I));
                    aqto aqtoVar = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.h;
                    if (aqtoVar == null) {
                        aqtoVar = aqto.a;
                    }
                    if (aqtoVar.b == 138681066) {
                        aqtsVar = (aqts) aqtoVar.c;
                    } else {
                        aqtsVar = aqts.b;
                    }
                    nqpVar.D(aqtsVar);
                    if (arrrVar.b == 6) {
                        apxfVar3 = (apxf) arrrVar.c;
                    } else {
                        apxfVar3 = apxf.a;
                    }
                    nqpVar.A(apxfVar3);
                    mM.u(new acqx(arrrVar.e.I()), null);
                }
            }
        }, anij.a);
    }
}
