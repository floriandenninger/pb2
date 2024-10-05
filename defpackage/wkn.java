package defpackage;

import com.google.android.libraries.youtube.account.verification.controller.PhoneVerificationController;
import com.google.protos.youtube.api.innertube.PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wkn implements aaha {
    private final PhoneVerificationController a;

    public wkn(PhoneVerificationController phoneVerificationController) {
        this.a = phoneVerificationController;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        PhoneVerificationController phoneVerificationController = this.a;
        if (phoneVerificationController.b == null || !apxfVar.pY(PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.phoneVerificationEndpoint)) {
            return;
        }
        phoneVerificationController.c = (PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint) apxfVar.pX(PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.phoneVerificationEndpoint);
        phoneVerificationController.b.b(apxfVar);
    }
}
