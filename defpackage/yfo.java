package defpackage;

import android.content.Intent;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.protos.youtube.api.innertube.UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yfo extends yau {
    public final ygc b;
    public final aahd c;
    private final yay d;

    public yfo(yay yayVar, ygc ygcVar, aahd aahdVar) {
        super(yayVar);
        this.d = yayVar;
        this.b = ygcVar;
        this.c = aahdVar;
    }

    @Override // defpackage.yau, defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        this.d.a(new yfn(this, apxfVar));
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint = (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) apxfVar.pX(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint);
        aomf aomfVar = (unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.b & 128) != 0 ? unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.h : null;
        yay yayVar = this.a;
        String str = ((UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) apxfVar.pX(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint)).c;
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint2 = (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) apxfVar.pX(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint);
        String str2 = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint2.g.isEmpty() ? null : unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint2.g;
        yayVar.e = aomfVar;
        String a = ((AccountIdentity) yayVar.a.c()).a();
        if (str2 == null) {
            str2 = "ytr";
        }
        qvy qvyVar = new qvy(a, str2);
        if (str != null && !str.isEmpty()) {
            qip.ax(str);
            qvyVar.b.putString("referencePcid", str);
        }
        qip.ax("youtube");
        qvyVar.b.putString("predefinedTheme", "youtube");
        Intent a2 = qvz.a(qvyVar);
        if (aomfVar != null) {
            acpl acplVar = yayVar.d;
            yeo yeoVar = new yeo();
            yeoVar.a = aomfVar;
            arpn a3 = arpp.a();
            awfy b = yeoVar.b();
            a3.copyOnWrite();
            ((arpp) a3.instance).ev(b);
            acplVar.c((arpp) a3.build());
        }
        yayVar.g.a(a2, 2000, yayVar);
    }
}
