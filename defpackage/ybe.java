package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ybe implements aaha {
    public final acqz a;
    public final zaw b;
    public final aahd c;
    public final ycs d = new ycs();
    private final Activity e;
    private final aaxn f;

    public ybe(Activity activity, aaxn aaxnVar, acqz acqzVar, zaw zawVar, aahd aahdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e = activity;
        this.f = aaxnVar;
        this.a = acqzVar;
        this.b = zawVar;
        this.c = aahdVar;
    }

    protected void b(apxf apxfVar) {
    }

    @Override // defpackage.aaha
    public void kE(apxf apxfVar, Map map) {
        YpcOffersEndpoint$YPCOffersEndpoint ypcOffersEndpoint$YPCOffersEndpoint = (YpcOffersEndpoint$YPCOffersEndpoint) apxfVar.pX(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint);
        if (!ypcOffersEndpoint$YPCOffersEndpoint.c) {
            b(apxfVar);
            return;
        }
        abdz s = this.f.s();
        s.d(ypcOffersEndpoint$YPCOffersEndpoint);
        s.l(apxfVar.c);
        boolean z = !ypcOffersEndpoint$YPCOffersEndpoint.d;
        if (z) {
            this.d.show(this.e.getFragmentManager(), ycs.a);
        }
        this.f.t(s, new ybd(this, z));
    }
}
