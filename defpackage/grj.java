package defpackage;

import android.os.Bundle;
import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class grj implements exa {
    private final /* synthetic */ int f;
    public static final /* synthetic */ grj e = new grj(6);
    public static final /* synthetic */ grj d = new grj(5);
    public static final /* synthetic */ grj c = new grj(4);
    public static final /* synthetic */ grj b = new grj(3);
    public static final /* synthetic */ grj a = new grj(2);

    public /* synthetic */ grj(int i) {
        this.f = i;
    }

    @Override // defpackage.exa
    public final bv a(apxf apxfVar) {
        avmw avmwVar;
        avmv avmvVar;
        int i = this.f;
        if (i == 0) {
            avmu avmuVar = ((UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint) apxfVar.pX(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint)).b;
            if (avmuVar == null) {
                avmuVar = avmu.a;
            }
            if (avmuVar.b == 127046814) {
                avmwVar = (avmw) avmuVar.c;
            } else {
                avmwVar = avmw.a;
            }
            avmwVar.getClass();
            ygo ygoVar = new ygo();
            Bundle bundle = new Bundle();
            bundle.putByteArray("UnlimitedFamilyProfileInterstitialRenderer", avmwVar.toByteArray());
            ygoVar.af(bundle);
            return ygoVar;
        }
        if (i == 1) {
            avmu avmuVar2 = ((UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint) apxfVar.pX(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint)).b;
            if (avmuVar2 == null) {
                avmuVar2 = avmu.a;
            }
            if (avmuVar2.b == 127387931) {
                avmvVar = (avmv) avmuVar2.c;
            } else {
                avmvVar = avmv.a;
            }
            return yjj.i(avmvVar);
        }
        if (i == 2) {
            int i2 = lrg.a;
            return new lrk();
        }
        if (i == 3) {
            return new lrn();
        }
        if (i == 4) {
            return new yjp();
        }
        if (i == 5) {
            return akjs.aF(apxfVar);
        }
        akkd akkdVar = new akkd();
        Bundle bundle2 = new Bundle();
        amkq.cn(bundle2, "scan_code_endpoint", apxfVar);
        akkdVar.af(bundle2);
        return akkdVar;
    }
}
