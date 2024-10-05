package defpackage;

import com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wkv implements aatp {
    private final wku a;
    private final aahd b;
    private String c;
    private String d;
    private apxf e;
    private boolean f;

    public wkv(wku wkuVar, aahd aahdVar) {
        aahdVar.getClass();
        this.b = aahdVar;
        this.a = wkuVar;
        this.f = false;
    }

    @Override // defpackage.aatp
    public final void a(cnq cnqVar) {
        zga.d("Request verification code failed.", cnqVar);
        this.f = false;
        wku wkuVar = this.a;
        if (wkuVar != null) {
            wkuVar.e();
        }
    }

    @Override // defpackage.aatp
    public final void b(asei aseiVar) {
        this.f = false;
        if (this.a != null) {
            if (aseiVar.e.size() != 0 || (aseiVar.b & 2) != 0) {
                if (aseiVar.e.size() <= 0 || (((aseg) aseiVar.e.get(0)).b & 1) == 0) {
                    if (aseiVar.e.size() <= 0) {
                        apxf apxfVar = aseiVar.d;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        atuj atujVar = ((PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint) apxfVar.pX(PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint.phoneVerificationCodeInputResultEndpoint)).b;
                        if (atujVar == null) {
                            atujVar = atuj.a;
                        }
                        if ((atujVar.b & 1) == 0) {
                            zga.b("ValidateVerificationCodeResponse contains an unexpected null value.");
                            this.a.e();
                            return;
                        }
                        apxf apxfVar2 = aseiVar.d;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        atuj atujVar2 = ((PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint) apxfVar2.pX(PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint.phoneVerificationCodeInputResultEndpoint)).b;
                        if (atujVar2 == null) {
                            atujVar2 = atuj.a;
                        }
                        atul atulVar = atujVar2.c;
                        if (atulVar == null) {
                            atulVar = atul.a;
                        }
                        int i = atulVar.b;
                        if ((i & 1) != 0) {
                            wku wkuVar = this.a;
                            atum atumVar = atulVar.c;
                            if (atumVar == null) {
                                atumVar = atum.a;
                            }
                            atuq atuqVar = atumVar.b;
                            if (atuqVar == null) {
                                atuqVar = atuq.a;
                            }
                            wkuVar.d(atuqVar);
                            return;
                        }
                        if ((i & 2) == 0) {
                            zga.b("ValidateVerificationCodeResponse contains an unexpected null value.");
                            this.a.e();
                            return;
                        }
                        wku wkuVar2 = this.a;
                        atuk atukVar = atulVar.d;
                        if (atukVar == null) {
                            atukVar = atuk.a;
                        }
                        atuf atufVar = atukVar.b;
                        if (atufVar == null) {
                            atufVar = atuf.a;
                        }
                        wkuVar2.g(atufVar);
                        return;
                    }
                    atuz atuzVar = ((aseg) aseiVar.e.get(0)).c;
                    if (atuzVar == null) {
                        atuzVar = atuz.a;
                    }
                    String num = Integer.toString((anaf.bI(atuzVar.b) != 0 ? r5 : 1) - 1);
                    StringBuilder sb = new StringBuilder(num.length() + 65);
                    sb.append("ValidateVerificationCode failed with PhoneVerificationErrorType: ");
                    sb.append(num);
                    zga.b(sb.toString());
                    this.a.e();
                    return;
                }
                zga.b("ValidateVerificationCodeResponse contains an unexpected null value.");
                this.a.e();
                return;
            }
            zga.b("ValidateVerificationCodeResponse contains an unexpected null value.");
            this.a.e();
        }
    }

    public final void c(Long l, String str, String str2, apxf apxfVar) {
        if (this.f) {
            return;
        }
        long longValue = l.longValue();
        this.c = str;
        this.d = str2;
        apxfVar.getClass();
        this.e = apxfVar;
        this.f = true;
        Long valueOf = Long.valueOf(longValue);
        String str3 = this.c;
        String str4 = this.d;
        HashMap hashMap = new HashMap();
        hashMap.put("KEY_IDV_REQUEST_ID", valueOf);
        hashMap.put("KEY_VERIFICATION_CODE", str3);
        hashMap.put("KEY_PARAMS", str4);
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        this.b.c(this.e, hashMap);
    }
}
