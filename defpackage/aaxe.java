package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.FlagEndpointOuterClass$FlagEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaxe implements aaha {
    public final zaw a;
    public final Context b;
    public final aahd c;
    private final aaxn d;

    public aaxe(Context context, aaxn aaxnVar, zaw zawVar, aahd aahdVar, byte[] bArr, byte[] bArr2) {
        aaxnVar.getClass();
        this.d = aaxnVar;
        zawVar.getClass();
        this.a = zawVar;
        this.b = context;
        aahdVar.getClass();
        this.c = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aaxc d = this.d.d();
        d.l(whl.G(apxfVar));
        FlagEndpointOuterClass$FlagEndpoint flagEndpointOuterClass$FlagEndpoint = (FlagEndpointOuterClass$FlagEndpoint) apxfVar.pX(FlagEndpointOuterClass$FlagEndpoint.flagEndpoint);
        d.a = flagEndpointOuterClass$FlagEndpoint.b;
        int aV = aocz.aV(flagEndpointOuterClass$FlagEndpoint.c);
        if (aV == 0) {
            aV = 1;
        }
        d.t = aV;
        d.b = (String) yjj.u(map, "com.google.android.libraries.youtube.innertube.services.flags.user_comments", String.class);
        d.c = ((Boolean) yjj.t(map, "com.google.android.libraries.youtube.innertube.services.flags.legal_checkbox_checked", false)).booleanValue();
        d.d = (arqi) yjj.u(map, "com.google.android.libraries.youtube.innertube.services.flags.legal_report_details", arqi.class);
        d.s = (arqm) yjj.u(map, "com.google.android.libraries.youtube.innertube.services.flags.video_report_details", arqm.class);
        afwx afwxVar = (afwx) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", afwx.class);
        if (afwxVar == null) {
            afwxVar = new aaxd(this, map);
        }
        this.d.e(d, afwxVar);
    }
}
