package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jrd extends agpq {
    private final jti a;
    private final String b;

    public jrd(jti jtiVar, aaea aaeaVar, aadw aadwVar) {
        super(aaeaVar);
        this.a = jtiVar;
        asvu asvuVar = aadwVar.b().e;
        this.b = (asvuVar == null ? asvu.a : asvuVar).aD;
    }

    private static aseo o(Context context, agnp agnpVar) {
        aqyg aqygVar;
        aqyg j = j(agnpVar.j());
        String string = context.getString(R.string.video_views, Long.valueOf(agnpVar.b()));
        agnb agnbVar = agnpVar.a;
        String str = agnbVar != null ? agnbVar.b : "";
        aone createBuilder = atzv.a.createBuilder();
        createBuilder.copyOnWrite();
        atzv atzvVar = (atzv) createBuilder.instance;
        j.getClass();
        atzvVar.c = j;
        atzvVar.b |= 1;
        boolean z = !TextUtils.isEmpty(str);
        boolean z2 = !TextUtils.isEmpty(string);
        if (z && z2) {
            aqygVar = j(TextUtils.concat(str, " · ", string).toString());
        } else if (z) {
            aqygVar = j(str.toString());
        } else if (z2) {
            aqygVar = j(string.toString());
        } else {
            aqygVar = aqyg.a;
        }
        createBuilder.copyOnWrite();
        atzv atzvVar2 = (atzv) createBuilder.instance;
        aqygVar.getClass();
        atzvVar2.d = aqygVar;
        atzvVar2.b |= 2;
        atzv atzvVar3 = (atzv) createBuilder.build();
        aone createBuilder2 = atzr.a.createBuilder();
        aone createBuilder3 = atzw.a.createBuilder();
        createBuilder3.copyOnWrite();
        atzw atzwVar = (atzw) createBuilder3.instance;
        atzvVar3.getClass();
        atzwVar.c = atzvVar3;
        atzwVar.b = 128392103;
        createBuilder2.copyOnWrite();
        atzr atzrVar = (atzr) createBuilder2.instance;
        atzw atzwVar2 = (atzw) createBuilder3.build();
        atzwVar2.getClass();
        atzrVar.i = atzwVar2;
        atzrVar.b |= 4096;
        atzr atzrVar2 = (atzr) createBuilder2.build();
        aone createBuilder4 = aseo.a.createBuilder();
        createBuilder4.copyOnWrite();
        aseo aseoVar = (aseo) createBuilder4.instance;
        atzrVar2.getClass();
        aseoVar.c = atzrVar2;
        aseoVar.b = 78882851;
        return (aseo) createBuilder4.build();
    }

    @Override // defpackage.agpq, defpackage.agri
    public final WatchNextResponseModel a(WatchNextResponseModel watchNextResponseModel, Context context, agng agngVar, List list, int i, String str, byte[] bArr, aphg aphgVar) {
        watchNextResponseModel.getClass();
        if (agngVar == null) {
            return watchNextResponseModel;
        }
        aong aongVar = (aong) k(context, watchNextResponseModel.a, agngVar, list, i, str, bArr, aphgVar).toBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            apxf apxfVar = ((asfc) aongVar.instance).v;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (str2.equals(oba.j((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apxfVar.pX(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)))) {
                aongVar.copyOnWrite();
                asfc asfcVar = (asfc) aongVar.instance;
                asfcVar.v = null;
                asfcVar.b &= -262145;
            }
        }
        return new WatchNextResponseModel((asfc) aongVar.build());
    }

    @Override // defpackage.agpq, defpackage.agri
    public final WatchNextResponseModel b(Context context, agnp agnpVar, String str, byte[] bArr) {
        agnpVar.getClass();
        asfc l = l(context, agnpVar, str, bArr);
        if (l == null) {
            return new WatchNextResponseModel(asfc.a);
        }
        aong aongVar = (aong) l.toBuilder();
        aseo o = o(context, agnpVar);
        aongVar.copyOnWrite();
        asfc asfcVar = (asfc) aongVar.instance;
        o.getClass();
        asfcVar.f = o;
        asfcVar.b |= 32;
        return new WatchNextResponseModel((asfc) aongVar.build());
    }

    @Override // defpackage.agpq, defpackage.agri
    public final WatchNextResponseModel c(Context context, agng agngVar, List list, int i, String str, byte[] bArr, aphg aphgVar) {
        int max = Math.max(0, Math.min(list.size() - 1, i));
        asfc m = m(context, agngVar, list, max, str, bArr, aphgVar);
        if (m == null) {
            return new WatchNextResponseModel(asfc.a);
        }
        aong aongVar = (aong) m.toBuilder();
        aseo o = o(context, (agnp) list.get(max));
        aongVar.copyOnWrite();
        asfc asfcVar = (asfc) aongVar.instance;
        o.getClass();
        asfcVar.f = o;
        asfcVar.b |= 32;
        return new WatchNextResponseModel((asfc) aongVar.build());
    }

    @Override // defpackage.agpq
    protected final Collection d() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(super.d());
        return hashSet;
    }

    @Override // defpackage.agpq
    protected final List e(Context context, agnp agnpVar) {
        jti jtiVar = this.a;
        agnpVar.getClass();
        auwd auwdVar = (auwd) jtiVar.g(agnp.class, auwd.class, agnpVar, null);
        if (auwdVar == null) {
            return amru.q();
        }
        aone createBuilder = auoy.a.createBuilder();
        createBuilder.copyOnWrite();
        auoy auoyVar = (auoy) createBuilder.instance;
        auoyVar.bm = auwdVar;
        auoyVar.e |= 32768;
        return amru.r((auoy) createBuilder.build());
    }

    @Override // defpackage.agpq
    protected final void f(agnp agnpVar, aong aongVar) {
        aone createBuilder = asvx.a.createBuilder();
        createBuilder.copyOnWrite();
        asvx asvxVar = (asvx) createBuilder.instance;
        asvxVar.c = 2;
        asvxVar.b |= 1;
        aongVar.copyOnWrite();
        aubw aubwVar = (aubw) aongVar.instance;
        asvx asvxVar2 = (asvx) createBuilder.build();
        aubw aubwVar2 = aubw.a;
        asvxVar2.getClass();
        aubwVar.t = asvxVar2;
        aubwVar.b |= 2097152;
        if (((aubw) aongVar.instance).k) {
            aongVar.cr(aedn.B(agnpVar.f(), true));
            aongVar.cr(aedn.B(agnpVar.f(), false));
        }
    }
}
