package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jtr extends jsm {
    private final Context a;

    public jtr(Context context) {
        super(aqcm.class);
        this.a = context;
    }

    private final aqyg f(int i) {
        return ajcq.h(this.a.getString(i));
    }

    @Override // defpackage.jsm
    public final /* bridge */ /* synthetic */ Object a(amrz amrzVar) {
        aong aongVar = (aong) aqcm.a.createBuilder();
        aqyg f = f(R.string.habanero_entry_point_title);
        aongVar.copyOnWrite();
        aqcm aqcmVar = (aqcm) aongVar.instance;
        f.getClass();
        aqcmVar.e = f;
        aqcmVar.b |= 4;
        aqyg f2 = f(R.string.habanero_entry_point_subtitle);
        aongVar.copyOnWrite();
        aqcm aqcmVar2 = (aqcm) aongVar.instance;
        f2.getClass();
        aqcmVar2.f = f2;
        aqcmVar2.b |= 8;
        aong aongVar2 = (aong) arfs.a.createBuilder();
        arfr arfrVar = arfr.OFFLINE_COMMUTE;
        aongVar2.copyOnWrite();
        arfs arfsVar = (arfs) aongVar2.instance;
        arfsVar.c = arfrVar.pV;
        arfsVar.b |= 1;
        aongVar.copyOnWrite();
        aqcm aqcmVar3 = (aqcm) aongVar.instance;
        arfs arfsVar2 = (arfs) aongVar2.build();
        arfsVar2.getClass();
        aqcmVar3.d = arfsVar2;
        aqcmVar3.c = 13;
        aone createBuilder = apmh.a.createBuilder();
        aong aongVar3 = (aong) apmg.a.createBuilder();
        aqyg f3 = f(R.string.habanero_entry_point_cta_button);
        aongVar3.copyOnWrite();
        apmg apmgVar = (apmg) aongVar3.instance;
        f3.getClass();
        apmgVar.i = f3;
        apmgVar.b |= 256;
        aongVar3.copyOnWrite();
        apmg apmgVar2 = (apmg) aongVar3.instance;
        apmgVar2.d = 13;
        apmgVar2.c = 1;
        aong aongVar4 = (aong) apxf.a.createBuilder();
        aonk aonkVar = BrowseEndpointOuterClass.browseEndpoint;
        aone createBuilder2 = aplt.a.createBuilder();
        createBuilder2.copyOnWrite();
        aplt apltVar = (aplt) createBuilder2.instance;
        apltVar.b |= 1;
        apltVar.c = "FEcommute_onboarding_recs";
        aongVar4.e(aonkVar, (aplt) createBuilder2.build());
        aongVar3.copyOnWrite();
        apmg apmgVar3 = (apmg) aongVar3.instance;
        apxf apxfVar = (apxf) aongVar4.build();
        apxfVar.getClass();
        apmgVar3.p = apxfVar;
        apmgVar3.b |= 32768;
        createBuilder.copyOnWrite();
        apmh apmhVar = (apmh) createBuilder.instance;
        apmg apmgVar4 = (apmg) aongVar3.build();
        apmgVar4.getClass();
        apmhVar.c = apmgVar4;
        apmhVar.b |= 1;
        aongVar.copyOnWrite();
        aqcm aqcmVar4 = (aqcm) aongVar.instance;
        apmh apmhVar2 = (apmh) createBuilder.build();
        apmhVar2.getClass();
        aqcmVar4.i = apmhVar2;
        aqcmVar4.b |= 64;
        aongVar.copyOnWrite();
        aqcm aqcmVar5 = (aqcm) aongVar.instance;
        aqcmVar5.b |= 1024;
        aqcmVar5.m = true;
        return (aqcm) aongVar.build();
    }
}
