package defpackage;

import com.google.protos.youtube.api.innertube.GetReportFormEndpointOuterClass$GetReportFormEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abbn implements aaha {
    public static final /* synthetic */ int a = 0;
    private final azrw b;
    private final Executor c;
    private final aaxn d;

    public abbn(aaxn aaxnVar, azrw azrwVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        aaxnVar.getClass();
        this.d = aaxnVar;
        this.b = azrwVar;
        this.c = executor;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        azrw azrwVar;
        afwx afwxVar = (afwx) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", afwx.class);
        if (afwxVar == null && (azrwVar = this.b) != null) {
            xpw xpwVar = (xpw) azrwVar.get();
            yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
            if (xpwVar != null) {
                afwxVar = xpwVar;
            }
        }
        if (afwxVar == null) {
            return;
        }
        aaxn aaxnVar = this.d;
        abbo abboVar = new abbo(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        abboVar.a = abbo.i(((GetReportFormEndpointOuterClass$GetReportFormEndpoint) apxfVar.pX(GetReportFormEndpointOuterClass$GetReportFormEndpoint.getReportFormEndpoint)).b);
        abboVar.l(whl.G(apxfVar));
        ynm.l(this.d.b.a(abboVar), this.c, new izp(afwxVar, 3), new izq(afwxVar, 3), anij.a);
    }
}
