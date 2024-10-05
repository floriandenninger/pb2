package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lgt {
    private final ypa a;
    private final aarr b;
    private final acsy c;
    private final aaea d;
    private final aahd e;
    private final String f;
    private final String g;

    public lgt(ypa ypaVar, aarr aarrVar, acsy acsyVar, aaea aaeaVar, aahd aahdVar, String str, String str2) {
        this.a = ypaVar;
        this.b = aarrVar;
        this.c = acsyVar;
        this.d = aaeaVar;
        this.e = aahdVar;
        this.f = str;
        this.g = str2;
    }

    public final void a(String str, byte[] bArr, String str2, int i) {
        if (!evr.I(this.d) || !this.c.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.c.u("sr_pa", asmn.LATENCY_ACTION_SEARCH_UI);
        } else {
            this.c.u("sr_pa", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        aong aongVar = (aong) aahg.e(str).toBuilder();
        aone createBuilder = atmc.a.createBuilder();
        if (str2 == null) {
            str2 = "";
        }
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        atmcVar.b |= 1;
        atmcVar.c = str2;
        createBuilder.copyOnWrite();
        atmc atmcVar2 = (atmc) createBuilder.instance;
        atmcVar2.b |= 2;
        atmcVar2.d = i;
        aongVar.e(atmb.b, (atmc) createBuilder.build());
        aong aongVar2 = (aong) ((aunn) aongVar.pX(SearchEndpointOuterClass.searchEndpoint)).toBuilder();
        if (!TextUtils.isEmpty(this.f)) {
            String str3 = this.f;
            aongVar2.copyOnWrite();
            aunn aunnVar = (aunn) aongVar2.instance;
            str3.getClass();
            aunnVar.b |= 2;
            aunnVar.d = str3;
        }
        if (!TextUtils.isEmpty(this.g)) {
            String str4 = this.g;
            aongVar2.copyOnWrite();
            aunn aunnVar2 = (aunn) aongVar2.instance;
            str4.getClass();
            aunnVar2.b |= 8;
            aunnVar2.f = str4;
        }
        aongVar.e(SearchEndpointOuterClass.searchEndpoint, (aunn) aongVar2.build());
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", bArr);
        this.e.c((apxf) aongVar.build(), hashMap);
    }

    public final void b(byte[] bArr, String str, byte[] bArr2) {
        aomf aomfVar;
        apxf apxfVar;
        try {
            awzg awzgVar = (awzg) aonm.parseFrom(awzg.a, bArr);
            aarr aarrVar = this.b;
            if (awzgVar.b == 1) {
                aomfVar = (aomf) awzgVar.c;
            } else {
                aomfVar = aomf.b;
            }
            arjb arjbVar = (arjb) aarrVar.a(aomfVar.I(), arjb.a);
            if (arjbVar != null) {
                int i = arjbVar.b;
                if ((32768 & i) != 0) {
                    aong aongVar = (aong) atnz.a.createBuilder();
                    ariy ariyVar = arjbVar.e;
                    if (ariyVar == null) {
                        ariyVar = ariy.a;
                    }
                    aqyg aqygVar = ariyVar.b;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    aongVar.copyOnWrite();
                    atnz atnzVar = (atnz) aongVar.instance;
                    aqygVar.getClass();
                    atnzVar.c = aqygVar;
                    atnzVar.b |= 1;
                    atnz atnzVar2 = (atnz) aongVar.build();
                    this.c.m(asmn.LATENCY_ACTION_VOICE_ASSISTANT);
                    this.a.d(aaci.b(atnzVar2));
                    return;
                }
                if ((i & 128) != 0) {
                    apxfVar = arjbVar.d;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                } else {
                    apxfVar = null;
                }
                HashMap hashMap = new HashMap();
                if (apxfVar != null && apxfVar.pY(SearchEndpointOuterClass.searchEndpoint)) {
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", bArr2);
                } else {
                    this.c.m(asmn.LATENCY_ACTION_VOICE_ASSISTANT);
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new Bundle());
                }
                if (apxfVar != null && !apxfVar.pY(atmb.b) && str != null) {
                    aone createBuilder = atmc.a.createBuilder();
                    createBuilder.copyOnWrite();
                    atmc atmcVar = (atmc) createBuilder.instance;
                    atmcVar.b = 1 | atmcVar.b;
                    atmcVar.c = str;
                    atmc atmcVar2 = (atmc) createBuilder.build();
                    aong aongVar2 = (aong) apxfVar.toBuilder();
                    aongVar2.e(atmb.b, atmcVar2);
                    apxfVar = (apxf) aongVar2.build();
                }
                this.e.c(apxfVar, hashMap);
            }
        } catch (aoob unused) {
        }
    }
}
