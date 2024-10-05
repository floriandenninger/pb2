package defpackage;

import com.google.protos.youtube.api.innertube.YpcUpdateFopEndpoint$YPCUpdateFopEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yej implements aaha, afwx {
    private final aahd a;
    private final zaw b;
    private final aaxn c;

    public yej(aahd aahdVar, aaxn aaxnVar, zaw zawVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = aaxnVar;
        this.a = aahdVar;
        this.b = zawVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        YpcUpdateFopEndpoint$YPCUpdateFopEndpoint ypcUpdateFopEndpoint$YPCUpdateFopEndpoint = (YpcUpdateFopEndpoint$YPCUpdateFopEndpoint) apxfVar.pX(YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.ypcUpdateFopEndpoint);
        aaxn aaxnVar = this.c;
        abdy abdyVar = new abdy(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        abdyVar.a = ypcUpdateFopEndpoint$YPCUpdateFopEndpoint.b;
        abdyVar.l(apxfVar.c);
        this.c.b.e(abdyVar, this);
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zaw zawVar = this.b;
        zawVar.d(zawVar.b(cnqVar));
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        apxf apxfVar;
        arrp arrpVar = (arrp) obj;
        int i = arrpVar.b;
        if (i == 3) {
            apxfVar = (apxf) arrpVar.c;
        } else {
            apxfVar = i == 4 ? (apxf) arrpVar.c : null;
        }
        if (apxfVar != null) {
            this.a.c(apxfVar, null);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
