package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fsp implements View.OnClickListener {
    final /* synthetic */ araz a;
    final /* synthetic */ fsq b;
    private final /* synthetic */ int c;

    public fsp(fsq fsqVar, araz arazVar, int i) {
        this.c = i;
        this.b = fsqVar;
        this.a = arazVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c != 0) {
            aahd aahdVar = this.b.h.b;
            apxf apxfVar = this.a.i;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
            this.b.h.a.f(new ajvf(this.a));
            return;
        }
        apmh apmhVar = this.a.e;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) != 0) {
            apmh apmhVar2 = this.a.e;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            int i = apmgVar.b;
            if ((i & 16384) != 0) {
                aahd aahdVar2 = this.b.h.b;
                apxf apxfVar2 = apmgVar.o;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar2.c(apxfVar2, null);
                return;
            }
            if ((i & 8192) != 0) {
                apxf apxfVar3 = apmgVar.n;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                this.b.h.b.c(apxfVar3, null);
                if (apxfVar3.pY(FeedbackEndpointOuterClass.feedbackEndpoint)) {
                    aqwm aqwmVar = ((aqwl) apxfVar3.pX(FeedbackEndpointOuterClass.feedbackEndpoint)).i;
                    if (aqwmVar == null) {
                        aqwmVar = aqwm.a;
                    }
                    if (aqwmVar.b) {
                        this.b.h.a.f(new ajvf(this.a));
                    }
                }
            }
        }
    }
}
