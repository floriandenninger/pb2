package defpackage;

import com.google.protos.youtube.api.innertube.LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand;
import com.google.protos.youtube.api.innertube.LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class guw implements aaha {
    private final acqz a;
    private final /* synthetic */ int b;

    public guw(acqz acqzVar, int i) {
        this.b = i;
        this.a = acqzVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.b == 0) {
            if (apxfVar.pY(LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.logAdVisualElementNoOpClickCommand)) {
                acra mM = this.a.mM();
                if (mM != null) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    asht f = acrc.f(apxfVar, map);
                    if (f == null) {
                        f = asht.a;
                    }
                    aone builder = f.toBuilder();
                    ashd ashdVar = f.t;
                    if (ashdVar == null) {
                        ashdVar = ashd.a;
                    }
                    aone builder2 = ashdVar.toBuilder();
                    ashd ashdVar2 = f.t;
                    if (ashdVar2 == null) {
                        ashdVar2 = ashd.a;
                    }
                    asgy asgyVar = ashdVar2.g;
                    if (asgyVar == null) {
                        asgyVar = asgy.a;
                    }
                    aone builder3 = asgyVar.toBuilder();
                    builder3.copyOnWrite();
                    asgy asgyVar2 = (asgy) builder3.instance;
                    asgyVar2.b |= 1;
                    asgyVar2.c = true;
                    asgy asgyVar3 = (asgy) builder3.build();
                    builder2.copyOnWrite();
                    ashd ashdVar3 = (ashd) builder2.instance;
                    asgyVar3.getClass();
                    ashdVar3.g = asgyVar3;
                    ashdVar3.b |= 2048;
                    ashd ashdVar4 = (ashd) builder2.build();
                    builder.copyOnWrite();
                    asht ashtVar = (asht) builder.instance;
                    ashdVar4.getClass();
                    ashtVar.t = ashdVar4;
                    ashtVar.c |= 1024;
                    mM.I(3, new acqx(apxfVar.c), (asht) builder.build());
                    return;
                }
                afsi.b(2, 1, "The LogAdVisualElementNoOpClickCommandResolver does not get interactionLogger.");
                return;
            }
            return;
        }
        if (apxfVar.pY(LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.logAdClickTerminationCommand)) {
            if (map == null || !map.containsKey(eul.a)) {
                acra mM2 = this.a.mM();
                acqx acqxVar = new acqx(apxfVar.c);
                aone createBuilder = asht.a.createBuilder();
                aone createBuilder2 = ashd.a.createBuilder();
                aone createBuilder3 = asgw.a.createBuilder();
                createBuilder3.copyOnWrite();
                asgw.a((asgw) createBuilder3.instance);
                asgw asgwVar = (asgw) createBuilder3.build();
                createBuilder2.copyOnWrite();
                ashd ashdVar5 = (ashd) createBuilder2.instance;
                asgwVar.getClass();
                ashdVar5.d = asgwVar;
                ashdVar5.c = 10;
                createBuilder.copyOnWrite();
                asht ashtVar2 = (asht) createBuilder.instance;
                ashd ashdVar6 = (ashd) createBuilder2.build();
                ashdVar6.getClass();
                ashtVar2.t = ashdVar6;
                ashtVar2.c |= 1024;
                mM2.w(acqxVar, (asht) createBuilder.build());
                return;
            }
            acra mM3 = this.a.mM();
            String str = (String) map.get(eul.a);
            acqx acqxVar2 = new acqx(apxfVar.c);
            aone createBuilder4 = asht.a.createBuilder();
            aone createBuilder5 = ashd.a.createBuilder();
            aone createBuilder6 = asgw.a.createBuilder();
            createBuilder6.copyOnWrite();
            asgw.a((asgw) createBuilder6.instance);
            asgw asgwVar2 = (asgw) createBuilder6.build();
            createBuilder5.copyOnWrite();
            ashd ashdVar7 = (ashd) createBuilder5.instance;
            asgwVar2.getClass();
            ashdVar7.d = asgwVar2;
            ashdVar7.c = 10;
            createBuilder4.copyOnWrite();
            asht ashtVar3 = (asht) createBuilder4.instance;
            ashd ashdVar8 = (ashd) createBuilder5.build();
            ashdVar8.getClass();
            ashtVar3.t = ashdVar8;
            ashtVar3.c |= 1024;
            mM3.x(str, acqxVar2, (asht) createBuilder4.build());
        }
    }
}
