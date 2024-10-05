package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wkt implements aatm {
    private final wks a;
    private final aahd b;
    private arzs c = arzs.CODE_DELIVERY_METHOD_UNKNOWN;
    private String d;
    private String e;
    private apxf f;
    private boolean g;

    public wkt(wks wksVar, aahd aahdVar) {
        aahdVar.getClass();
        this.b = aahdVar;
        this.a = wksVar;
        this.g = false;
    }

    @Override // defpackage.aatm
    public final void a(cnq cnqVar) {
        zga.d("Request verification code failed.", cnqVar);
        this.g = false;
        wks wksVar = this.a;
        if (wksVar != null) {
            wksVar.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if ((((com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint) r1.pX(com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.phoneVerificationCodeInputScreenEndpoint)).b & 1) != 0) goto L26;
     */
    @Override // defpackage.aatm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.arzv r6) {
        /*
            r5 = this;
            r0 = 0
            r5.g = r0
            wks r1 = r5.a
            if (r1 == 0) goto L90
            int r1 = r6.b
            r2 = r1 & 2
            java.lang.String r3 = "RequestVerificationCodeResponse contains an unexpected null value."
            if (r2 == 0) goto L10
            goto L1d
        L10:
            r2 = r1 & 4
            if (r2 != 0) goto L1d
            defpackage.zga.b(r3)
            wks r6 = r5.a
            r6.a()
            return
        L1d:
            r1 = r1 & 4
            r2 = 1
            if (r1 == 0) goto L4d
            apxf r1 = r6.e
            if (r1 != 0) goto L28
            apxf r1 = defpackage.apxf.a
        L28:
            aonk r4 = com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.phoneVerificationCodeInputScreenEndpoint
            boolean r1 = r1.pY(r4)
            if (r1 == 0) goto L44
            apxf r1 = r6.e
            if (r1 != 0) goto L36
            apxf r1 = defpackage.apxf.a
        L36:
            aonk r4 = com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.phoneVerificationCodeInputScreenEndpoint
            java.lang.Object r1 = r1.pX(r4)
            com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint r1 = (com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint) r1
            int r1 = r1.b
            r1 = r1 & r2
            if (r1 == 0) goto L44
            goto L4d
        L44:
            defpackage.zga.b(r3)
            wks r6 = r5.a
            r6.a()
            return
        L4d:
            int r1 = r6.b
            r3 = r1 & 4
            if (r3 == 0) goto L77
            wks r0 = r5.a
            apxf r1 = r6.e
            if (r1 != 0) goto L5b
            apxf r1 = defpackage.apxf.a
        L5b:
            aonk r2 = com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.phoneVerificationCodeInputScreenEndpoint
            java.lang.Object r1 = r1.pX(r2)
            com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint r1 = (com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint) r1
            atun r1 = r1.c
            if (r1 != 0) goto L69
            atun r1 = defpackage.atun.a
        L69:
            atuo r1 = r1.b
            if (r1 != 0) goto L6f
            atuo r1 = defpackage.atuo.a
        L6f:
            long r2 = r6.f
            java.lang.String r6 = r6.g
            r0.c(r1, r2, r6)
            return
        L77:
            r1 = r1 & 2
            if (r1 == 0) goto L7c
            r0 = 1
        L7c:
            defpackage.amkq.N(r0)
            wks r0 = r5.a
            arzt r6 = r6.d
            if (r6 != 0) goto L87
            arzt r6 = defpackage.arzt.a
        L87:
            atut r6 = r6.b
            if (r6 != 0) goto L8d
            atut r6 = defpackage.atut.a
        L8d:
            r0.b(r6)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkt.b(arzv):void");
    }

    public final void c(arzs arzsVar, String str, String str2, apxf apxfVar) {
        if (this.g) {
            return;
        }
        apxfVar.getClass();
        this.f = apxfVar;
        this.c = arzsVar;
        this.d = str;
        this.e = str2;
        this.g = true;
        HashMap hashMap = new HashMap();
        hashMap.put("KEY_CODE_DELIVERY_METHOD", arzsVar);
        hashMap.put("KEY_COUNTRY_CODE", str);
        hashMap.put("KEY_PHONE_NUMBER", str2);
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        this.b.c(this.f, hashMap);
    }
}
