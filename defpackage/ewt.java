package defpackage;

import android.os.Bundle;
import com.google.protos.youtube.api.innertube.ContactMenuEndpointOuterClass$ContactMenuEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ewt implements aaha {
    public final zaw a;
    private final ci b;
    private final aavj c;

    public ewt(ci ciVar, aavj aavjVar, zaw zawVar) {
        this.b = ciVar;
        this.c = aavjVar;
        this.a = zawVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        String str;
        Object s = yjj.s(map, "contact_menu_source_model");
        ContactMenuEndpointOuterClass$ContactMenuEndpoint contactMenuEndpointOuterClass$ContactMenuEndpoint = (ContactMenuEndpointOuterClass$ContactMenuEndpoint) apxfVar.pX(ContactMenuEndpointOuterClass$ContactMenuEndpoint.contactMenuEndpoint);
        if ((contactMenuEndpointOuterClass$ContactMenuEndpoint.b & 2) != 0) {
            aqil aqilVar = contactMenuEndpointOuterClass$ContactMenuEndpoint.d;
            if (aqilVar == null) {
                aqilVar = aqil.a;
            }
            str = aqilVar.b;
        } else {
            str = null;
        }
        akjv akjvVar = new akjv();
        Bundle bundle = new Bundle();
        bundle.putString("CONTACT_PATH_KEY", str);
        akjvVar.af(bundle);
        akjvVar.ak = s;
        akjvVar.aG(this.b);
        if (contactMenuEndpointOuterClass$ContactMenuEndpoint.c.isEmpty()) {
            return;
        }
        String str2 = contactMenuEndpointOuterClass$ContactMenuEndpoint.c;
        aavj aavjVar = this.c;
        ews ewsVar = new ews(this, akjvVar);
        aavl aavlVar = new aavl(aavjVar.f, aavjVar.a.c(), null, null, null);
        aavlVar.a = aavl.i(str2);
        aavjVar.c(armr.a, aavjVar.b, aatt.q, aavd.g).e(aavlVar, ewsVar);
    }
}
