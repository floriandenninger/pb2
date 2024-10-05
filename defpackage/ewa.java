package defpackage;

import android.os.Bundle;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ewa implements aaha {
    public xci a;
    public ewd b;
    private final ypa c;
    private final Executor d;
    private final ci e;
    private final acra f;
    private final ainy g;

    public ewa(xjl xjlVar, ypa ypaVar, ci ciVar, acra acraVar, ainy ainyVar, Executor executor) {
        this.c = ypaVar;
        this.e = ciVar;
        this.f = acraVar;
        this.g = ainyVar;
        this.d = executor;
        xjlVar.b(new evz(this));
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        boolean z = true;
        if (apxfVar.pY(aotl.b)) {
            aulq aulqVar = ((aotl) apxfVar.pX(aotl.b)).d;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(aotn.a)) {
                aotl aotlVar = (aotl) apxfVar.pX(aotl.b);
                if (this.g.d()) {
                    this.g.a();
                    z = false;
                }
                this.b = new ewd(new ewb(aotlVar, z, Optional.ofNullable(s).map(evy.a)), this.a, this.c, this.d, this.g);
                aulq aulqVar2 = aotlVar.d;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                aotm aotmVar = (aotm) aulqVar2.pX(aotn.a);
                ewd ewdVar = this.b;
                acra acraVar = this.f;
                Bundle bundle = new Bundle();
                xmm xmmVar = new xmm();
                bundle.putByteArray("about_this_ad_renderer", aotmVar.toByteArray());
                xmmVar.af(bundle);
                xmmVar.ae = acraVar;
                xmmVar.aj = ewdVar;
                xmmVar.qh(this.e.getSupportFragmentManager(), "AboutThisAdWebViewDialogFragment");
                return;
            }
        }
        afsi.b(2, 1, "Rendering data missing for AboutThisAdCommand");
    }
}
