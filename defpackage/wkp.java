package defpackage;

import com.google.protos.youtube.api.innertube.PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wkp implements aaha, wlx {
    public final dd a;
    public final int b;
    private final aahd c;
    private apxf d;
    private apxf e;
    private apxf f;
    private final aaxn g;

    public wkp(aaxn aaxnVar, dd ddVar, int i, aahd aahdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.g = aaxnVar;
        this.a = ddVar;
        this.b = i;
        this.c = aahdVar;
    }

    @Override // defpackage.wlx
    public final void h() {
        apxf apxfVar = this.f;
        if (apxfVar != null) {
            this.c.a(apxfVar);
        }
    }

    @Override // defpackage.wlx
    public final void i() {
        apxf apxfVar = this.e;
        if (apxfVar != null) {
            this.c.a(apxfVar);
        }
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        int i;
        PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint = (PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint) apxfVar.pX(PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.phoneVerificationEndpoint);
        apxf apxfVar2 = phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.e;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        this.e = apxfVar2;
        apxf apxfVar3 = phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.d;
        if (apxfVar3 == null) {
            apxfVar3 = apxf.a;
        }
        this.d = apxfVar3;
        apxf apxfVar4 = phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.f;
        if (apxfVar4 == null) {
            apxfVar4 = apxf.a;
        }
        this.f = apxfVar4;
        aaxn aaxnVar = this.g;
        wko wkoVar = new wko(this);
        if ((phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.b & 4) != 0) {
            i = amkq.dw(phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.c);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 3;
        }
        aaxnVar.b.e(aaxnVar.i(Optional.empty(), i), wkoVar);
    }

    @Override // defpackage.wlx
    public final void u() {
        apxf apxfVar = this.d;
        if (apxfVar != null) {
            this.c.a(apxfVar);
        }
    }
}
