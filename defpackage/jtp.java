package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jtp extends jsn {
    private final azrw a;
    private final azrw b;

    public jtp(azrw azrwVar, azrw azrwVar2) {
        super(agnp.class, audj.class);
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        agnp agnpVar = (agnp) obj;
        Integer num = (Integer) e(amrzVar, "downloaded_video_list_index");
        String str = (String) e(amrzVar, "downloaded_video_playlist_id");
        String f = agnpVar.f();
        jti jtiVar = (jti) this.a.get();
        agnv e = ((agof) this.b.get()).a().m().e(f);
        if (e != null) {
            return (audj) jtiVar.g(agnv.class, audj.class, e, amrz.l("downloaded_video_playlist_id", str, "downloaded_video_list_index", Integer.valueOf(num.intValue())));
        }
        avgg d = agnpVar.d();
        aong aongVar = (aong) audj.a.createBuilder();
        aongVar.copyOnWrite();
        audj audjVar = (audj) aongVar.instance;
        f.getClass();
        audjVar.b |= 1;
        audjVar.c = f;
        if (d == null) {
            d = avgg.a;
        }
        aongVar.copyOnWrite();
        audj audjVar2 = (audj) aongVar.instance;
        d.getClass();
        audjVar2.d = d;
        audjVar2.b |= 2;
        aqyg g = ajcq.g(agnpVar.j());
        aongVar.copyOnWrite();
        audj audjVar3 = (audj) aongVar.instance;
        g.getClass();
        audjVar3.e = g;
        audjVar3.b |= 4;
        aqyg f2 = ajcq.f(num.intValue() + 1);
        aongVar.copyOnWrite();
        audj audjVar4 = (audj) aongVar.instance;
        f2.getClass();
        audjVar4.f = f2;
        audjVar4.b |= 8;
        aqyg g2 = ajcq.g(agnpVar.g());
        aongVar.copyOnWrite();
        audj audjVar5 = (audj) aongVar.instance;
        g2.getClass();
        audjVar5.h = g2;
        audjVar5.b |= 32;
        aone createBuilder = audh.a.createBuilder();
        aone createBuilder2 = avwi.a.createBuilder();
        createBuilder2.copyOnWrite();
        avwi avwiVar = (avwi) createBuilder2.instance;
        f.getClass();
        avwiVar.b |= 1;
        avwiVar.c = f;
        createBuilder.copyOnWrite();
        audh audhVar = (audh) createBuilder.instance;
        avwi avwiVar2 = (avwi) createBuilder2.build();
        avwiVar2.getClass();
        audhVar.c = avwiVar2;
        audhVar.b = 135739233;
        aongVar.copyOnWrite();
        audj audjVar6 = (audj) aongVar.instance;
        audh audhVar2 = (audh) createBuilder.build();
        audhVar2.getClass();
        audjVar6.x = audhVar2;
        audjVar6.b |= 67108864;
        apxf f3 = aigp.f(f, str, num.intValue(), 0.0f);
        aongVar.copyOnWrite();
        audj audjVar7 = (audj) aongVar.instance;
        f3.getClass();
        audjVar7.i = f3;
        audjVar7.b |= 64;
        aone createBuilder3 = atdf.a.createBuilder();
        aone createBuilder4 = atdc.a.createBuilder();
        aone createBuilder5 = atda.a.createBuilder();
        atde d2 = jtiVar.d(agnpVar, str);
        d2.getClass();
        createBuilder5.copyOnWrite();
        atda atdaVar = (atda) createBuilder5.instance;
        atdaVar.d = d2;
        atdaVar.b |= 2;
        createBuilder4.aE(createBuilder5);
        createBuilder3.copyOnWrite();
        atdf atdfVar = (atdf) createBuilder3.instance;
        atdc atdcVar = (atdc) createBuilder4.build();
        atdcVar.getClass();
        atdfVar.c = atdcVar;
        atdfVar.b |= 1;
        aongVar.copyOnWrite();
        audj audjVar8 = (audj) aongVar.instance;
        atdf atdfVar2 = (atdf) createBuilder3.build();
        atdfVar2.getClass();
        audjVar8.p = atdfVar2;
        audjVar8.b |= 65536;
        aone createBuilder6 = avfv.a.createBuilder();
        avfs avfsVar = avfs.a;
        createBuilder6.copyOnWrite();
        avfv avfvVar = (avfv) createBuilder6.instance;
        avfsVar.getClass();
        avfvVar.l = avfsVar;
        avfvVar.b |= 32768;
        aongVar.cA(createBuilder6);
        agnb agnbVar = agnpVar.a;
        if (agnbVar != null) {
            aong aongVar2 = (aong) aqyg.a.createBuilder();
            aong aongVar3 = (aong) aqyi.a.createBuilder();
            String str2 = agnbVar.b;
            aongVar3.copyOnWrite();
            aqyi aqyiVar = (aqyi) aongVar3.instance;
            str2.getClass();
            aqyiVar.b |= 1;
            aqyiVar.c = str2;
            aong aongVar4 = (aong) apxf.a.createBuilder();
            aonk aonkVar = BrowseEndpointOuterClass.browseEndpoint;
            aone createBuilder7 = aplt.a.createBuilder();
            String c = evr.c(agnbVar.a);
            createBuilder7.copyOnWrite();
            aplt apltVar = (aplt) createBuilder7.instance;
            c.getClass();
            apltVar.b |= 1;
            apltVar.c = c;
            aongVar4.e(aonkVar, (aplt) createBuilder7.build());
            aongVar3.copyOnWrite();
            aqyi aqyiVar2 = (aqyi) aongVar3.instance;
            apxf apxfVar = (apxf) aongVar4.build();
            apxfVar.getClass();
            aqyiVar2.m = apxfVar;
            aqyiVar2.b |= 512;
            aongVar2.cw(aongVar3);
            aongVar.copyOnWrite();
            audj audjVar9 = (audj) aongVar.instance;
            aqyg aqygVar = (aqyg) aongVar2.build();
            aqygVar.getClass();
            audjVar9.g = aqygVar;
            audjVar9.b |= 16;
        }
        return (audj) aongVar.build();
    }
}
