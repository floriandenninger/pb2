package defpackage;

import android.content.Intent;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.protos.youtube.api.innertube.UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yaz implements aaha, yaw {
    private final yay a;

    public yaz(yay yayVar) {
        this.a = yayVar;
        yayVar.c(this);
    }

    @Override // defpackage.yaw
    public final void d(boolean z) {
    }

    @Override // defpackage.yax
    public final boolean g() {
        return true;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint = (UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint) apxfVar.pX(UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.unlimitedManageFamilyEndpoint);
        aomf aomfVar = null;
        if (unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint != null && (unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.b & 4) != 0) {
            aomfVar = unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.d;
        }
        yay yayVar = this.a;
        UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint2 = (UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint) apxfVar.pX(UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.unlimitedManageFamilyEndpoint);
        String str = !unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint2.c.isEmpty() ? unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint2.c : (String) yjj.u(map, "accountName", String.class);
        yayVar.f = aomfVar;
        String a = ((AccountIdentity) yayVar.a.c()).a();
        if (str == null) {
            str = "ytr";
        }
        qwb qwbVar = new qwb(a, str);
        qip.ax("youtube");
        qwbVar.b.putString("predefinedTheme", "youtube");
        Intent b = qvz.b(qwbVar);
        if (yayVar.f != null) {
            acpl acplVar = yayVar.d;
            yeo yeoVar = new yeo();
            yeoVar.a = yayVar.f;
            arpn a2 = arpp.a();
            awfz a3 = yeoVar.a();
            a2.copyOnWrite();
            ((arpp) a2.instance).ex(a3);
            acplVar.c((arpp) a2.build());
        }
        yayVar.g.a(b, 2001, yayVar);
    }
}
