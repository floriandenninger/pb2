package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wma implements View.OnClickListener {
    final /* synthetic */ wmc a;
    private final /* synthetic */ int b;

    public wma(wmc wmcVar, int i) {
        this.b = i;
        this.a = wmcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            wmb wmbVar = this.a.b;
            if (wmbVar != null) {
                wmbVar.a();
                return;
            }
            return;
        }
        amkq.E(wmc.o(this.a.a));
        wmc wmcVar = this.a;
        wmb wmbVar2 = wmcVar.b;
        if (wmbVar2 != null) {
            atva atvaVar = wmcVar.a.e;
            if (atvaVar == null) {
                atvaVar = atva.a;
            }
            apmg apmgVar = atvaVar.b;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            apxf apxfVar = apmgVar.o;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            atur aturVar = ((PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint) apxfVar.pX(PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint.phoneVerificationContactNumberInputEndpoint)).b;
            if (aturVar == null) {
                aturVar = atur.a;
            }
            atut atutVar = aturVar.c;
            if (atutVar == null) {
                atutVar = atut.a;
            }
            wmbVar2.aK(atutVar);
        }
    }
}
