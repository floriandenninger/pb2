package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jtn extends jsn {
    private final Context a;
    private final azrw b;

    public jtn(Context context, azrw azrwVar) {
        super(agnv.class, audj.class);
        this.a = context;
        this.b = azrwVar;
    }

    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        atsb atsbVar;
        agnv agnvVar = (agnv) obj;
        Integer num = (Integer) e(amrzVar, "downloaded_video_list_index");
        String str = (String) e(amrzVar, "downloaded_video_playlist_id");
        String m = agnvVar.m();
        long f = agnvVar.f();
        long j = agnvVar.h;
        float U = mcy.U(f, j);
        avgg k = agnvVar.k();
        aong aongVar = (aong) audj.a.createBuilder();
        aongVar.copyOnWrite();
        audj audjVar = (audj) aongVar.instance;
        m.getClass();
        audjVar.b |= 1;
        audjVar.c = m;
        if (k == null) {
            k = avgg.a;
        }
        aongVar.copyOnWrite();
        audj audjVar2 = (audj) aongVar.instance;
        k.getClass();
        audjVar2.d = k;
        audjVar2.b |= 2;
        aqyg g = ajcq.g(agnvVar.o(this.a));
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
        aqyg g2 = ajcq.g(agnvVar.n());
        aongVar.copyOnWrite();
        audj audjVar5 = (audj) aongVar.instance;
        g2.getClass();
        audjVar5.h = g2;
        audjVar5.b |= 32;
        aone createBuilder = atdf.a.createBuilder();
        aone createBuilder2 = atdc.a.createBuilder();
        aone createBuilder3 = atda.a.createBuilder();
        atde e = ((jti) this.b.get()).e(agnvVar, str);
        e.getClass();
        createBuilder3.copyOnWrite();
        atda atdaVar = (atda) createBuilder3.instance;
        atdaVar.d = e;
        atdaVar.b |= 2;
        createBuilder2.aE(createBuilder3);
        createBuilder.copyOnWrite();
        atdf atdfVar = (atdf) createBuilder.instance;
        atdc atdcVar = (atdc) createBuilder2.build();
        atdcVar.getClass();
        atdfVar.c = atdcVar;
        atdfVar.b |= 1;
        aongVar.copyOnWrite();
        audj audjVar6 = (audj) aongVar.instance;
        atdf atdfVar2 = (atdf) createBuilder.build();
        atdfVar2.getClass();
        audjVar6.p = atdfVar2;
        audjVar6.b |= 65536;
        aone createBuilder4 = audh.a.createBuilder();
        aone createBuilder5 = avwi.a.createBuilder();
        createBuilder5.copyOnWrite();
        avwi avwiVar = (avwi) createBuilder5.instance;
        m.getClass();
        avwiVar.b |= 1;
        avwiVar.c = m;
        createBuilder4.copyOnWrite();
        audh audhVar = (audh) createBuilder4.instance;
        avwi avwiVar2 = (avwi) createBuilder5.build();
        avwiVar2.getClass();
        audhVar.c = avwiVar2;
        audhVar.b = 135739233;
        aongVar.copyOnWrite();
        audj audjVar7 = (audj) aongVar.instance;
        audh audhVar2 = (audh) createBuilder4.build();
        audhVar2.getClass();
        audjVar7.x = audhVar2;
        audjVar7.b |= 67108864;
        aone createBuilder6 = avfv.a.createBuilder();
        avfs avfsVar = avfs.a;
        createBuilder6.copyOnWrite();
        avfv avfvVar = (avfv) createBuilder6.instance;
        avfsVar.getClass();
        avfvVar.l = avfsVar;
        avfvVar.b |= 32768;
        aongVar.cA(createBuilder6);
        aone createBuilder7 = avfv.a.createBuilder();
        aone createBuilder8 = avft.a.createBuilder();
        createBuilder8.copyOnWrite();
        avft avftVar = (avft) createBuilder8.instance;
        avftVar.b |= 1;
        avftVar.c = mcy.V(f, j);
        createBuilder7.copyOnWrite();
        avfv avfvVar2 = (avfv) createBuilder7.instance;
        avft avftVar2 = (avft) createBuilder8.build();
        avftVar2.getClass();
        avfvVar2.f = avftVar2;
        avfvVar2.b |= 128;
        aongVar.cA(createBuilder7);
        apxf f3 = aigp.f(m, str, num.intValue(), U);
        aongVar.copyOnWrite();
        audj audjVar8 = (audj) aongVar.instance;
        f3.getClass();
        audjVar8.i = f3;
        audjVar8.b |= 64;
        aryi aryiVar = agnvVar.k;
        if (aryiVar != null) {
            aryd arydVar = aryiVar.l;
            if (arydVar == null) {
                arydVar = aryd.a;
            }
            if (arydVar.b == 60572968) {
                aone createBuilder9 = audi.a.createBuilder();
                aryd arydVar2 = aryiVar.l;
                if (arydVar2 == null) {
                    arydVar2 = aryd.a;
                }
                if (arydVar2.b == 60572968) {
                    atsbVar = (atsb) arydVar2.c;
                } else {
                    atsbVar = atsb.a;
                }
                createBuilder9.copyOnWrite();
                audi audiVar = (audi) createBuilder9.instance;
                atsbVar.getClass();
                audiVar.c = atsbVar;
                audiVar.b |= 1;
                aongVar.copyOnWrite();
                audj audjVar9 = (audj) aongVar.instance;
                audi audiVar2 = (audi) createBuilder9.build();
                audiVar2.getClass();
                audjVar9.q = audiVar2;
                audjVar9.b |= 131072;
            }
        }
        agnb h = agnvVar.h();
        if (h != null) {
            aong aongVar2 = (aong) aqyg.a.createBuilder();
            aong aongVar3 = (aong) aqyi.a.createBuilder();
            String str2 = h.b;
            aongVar3.copyOnWrite();
            aqyi aqyiVar = (aqyi) aongVar3.instance;
            str2.getClass();
            aqyiVar.b |= 1;
            aqyiVar.c = str2;
            aong aongVar4 = (aong) apxf.a.createBuilder();
            aonk aonkVar = BrowseEndpointOuterClass.browseEndpoint;
            aone createBuilder10 = aplt.a.createBuilder();
            String c = evr.c(h.a);
            createBuilder10.copyOnWrite();
            aplt apltVar = (aplt) createBuilder10.instance;
            c.getClass();
            apltVar.b |= 1;
            apltVar.c = c;
            aongVar4.e(aonkVar, (aplt) createBuilder10.build());
            aongVar3.copyOnWrite();
            aqyi aqyiVar2 = (aqyi) aongVar3.instance;
            apxf apxfVar = (apxf) aongVar4.build();
            apxfVar.getClass();
            aqyiVar2.m = apxfVar;
            aqyiVar2.b |= 512;
            aongVar2.cw(aongVar3);
            aongVar.copyOnWrite();
            audj audjVar10 = (audj) aongVar.instance;
            aqyg aqygVar = (aqyg) aongVar2.build();
            aqygVar.getClass();
            audjVar10.g = aqygVar;
            audjVar10.b |= 16;
        }
        return (audj) aongVar.build();
    }
}
