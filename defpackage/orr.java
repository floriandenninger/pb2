package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class orr {
    public final aahd a;

    public orr(aahd aahdVar) {
        this.a = aahdVar;
    }

    public final void a(acra acraVar, int i) {
        aong aongVar = (aong) apxf.a.createBuilder();
        aonk aonkVar = BrowseEndpointOuterClass.browseEndpoint;
        aone createBuilder = aplt.a.createBuilder();
        createBuilder.copyOnWrite();
        aplt apltVar = (aplt) createBuilder.instance;
        apltVar.b |= 1;
        apltVar.c = "FEsfv_audio_picker";
        createBuilder.copyOnWrite();
        aplt apltVar2 = (aplt) createBuilder.instance;
        apltVar2.b |= 4;
        apltVar2.d = "";
        aongVar.e(aonkVar, (aplt) createBuilder.build());
        aomf aomfVar = aomf.b;
        aongVar.copyOnWrite();
        apxf apxfVar = (apxf) aongVar.instance;
        aomfVar.getClass();
        apxfVar.b |= 1;
        apxfVar.c = aomfVar;
        this.a.a(jqr.c(acraVar, (apxf) aongVar.build(), i));
    }
}
