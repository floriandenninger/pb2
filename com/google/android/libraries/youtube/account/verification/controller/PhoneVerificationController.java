package com.google.android.libraries.youtube.account.verification.controller;

import com.google.android.libraries.youtube.account.verification.controller.PhoneVerificationController;
import com.google.protos.youtube.api.innertube.PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint;
import defpackage.aac;
import defpackage.aad;
import defpackage.aadw;
import defpackage.aae;
import defpackage.aahd;
import defpackage.any;
import defpackage.aok;
import defpackage.asvu;
import defpackage.wkl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PhoneVerificationController implements any {
    public final aahd a;
    public aae b;
    public PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint c;
    private final aad d;
    private final boolean e;

    public PhoneVerificationController(aad aadVar, aahd aahdVar, aadw aadwVar) {
        this.d = aadVar;
        this.a = aahdVar;
        asvu asvuVar = aadwVar.b().e;
        boolean z = (asvuVar == null ? asvu.a : asvuVar).cL;
        this.e = z;
        if (z) {
            g();
        }
    }

    private final void g() {
        this.b = this.d.registerForActivityResult(new wkl(), new aac() { // from class: wkm
            @Override // defpackage.aac
            public final void a(Object obj) {
                PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint;
                PhoneVerificationController phoneVerificationController = PhoneVerificationController.this;
                int intValue = ((Integer) obj).intValue();
                if (intValue == -2) {
                    zga.b("Could not determine phone verification result from the activity result.");
                    return;
                }
                if (intValue == -1) {
                    PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint2 = phoneVerificationController.c;
                    if (phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint2 == null || (phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint2.b & 16) == 0) {
                        return;
                    }
                    aahd aahdVar = phoneVerificationController.a;
                    apxf apxfVar = phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint2.e;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.a(apxfVar);
                    return;
                }
                if (intValue != 0) {
                    if (intValue != 1 || (phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint = phoneVerificationController.c) == null || (phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.b & 8) == 0) {
                        return;
                    }
                    aahd aahdVar2 = phoneVerificationController.a;
                    apxf apxfVar2 = phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.d;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar2.a(apxfVar2);
                    return;
                }
                PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint3 = phoneVerificationController.c;
                if (phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint3 == null || (phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint3.b & 32) == 0) {
                    return;
                }
                aahd aahdVar3 = phoneVerificationController.a;
                apxf apxfVar3 = phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint3.f;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                aahdVar3.a(apxfVar3);
            }
        });
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        if (this.e) {
            return;
        }
        g();
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
