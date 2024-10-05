package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jtg extends jsn {
    private final Context a;
    private final aaea b;
    private final azrw c;
    private final axzg d;

    public jtg(Context context, aaea aaeaVar, azrw azrwVar, axzg axzgVar, byte[] bArr) {
        super(agni.class, aubg.class);
        this.a = context;
        this.b = aaeaVar;
        this.c = azrwVar;
        this.d = axzgVar;
    }

    private static apxf a(String str) {
        aone createBuilder = aplt.a.createBuilder();
        createBuilder.copyOnWrite();
        aplt apltVar = (aplt) createBuilder.instance;
        str.getClass();
        apltVar.b |= 1;
        apltVar.c = str;
        aplt apltVar2 = (aplt) createBuilder.build();
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(BrowseEndpointOuterClass.browseEndpoint, apltVar2);
        return (apxf) aongVar.build();
    }

    private static apxf f(String str) {
        aone createBuilder = atrr.a.createBuilder();
        createBuilder.copyOnWrite();
        atrr atrrVar = (atrr) createBuilder.instance;
        atrrVar.b |= 2;
        atrrVar.d = str;
        atrr atrrVar2 = (atrr) createBuilder.build();
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(atrs.a, atrrVar2);
        return (apxf) aongVar.build();
    }

    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        String quantityString;
        agng agngVar = ((agni) obj).a;
        aone createBuilder = aubg.a.createBuilder();
        String str = agngVar.a;
        createBuilder.copyOnWrite();
        aubg aubgVar = (aubg) createBuilder.instance;
        aubgVar.b |= 1;
        aubgVar.h = str;
        aqyg g = ajcq.g(agngVar.b);
        createBuilder.copyOnWrite();
        aubg aubgVar2 = (aubg) createBuilder.instance;
        g.getClass();
        aubgVar2.n = g;
        aubgVar2.b |= 2048;
        avgg e = agngVar.e.e();
        createBuilder.copyOnWrite();
        aubg aubgVar3 = (aubg) createBuilder.instance;
        e.getClass();
        aubgVar3.r = e;
        aubgVar3.b |= 65536;
        if (!evr.V(this.b) || agngVar.g == 0) {
            Resources resources = this.a.getResources();
            int i = agngVar.f;
            quantityString = resources.getQuantityString(R.plurals.video_count, i, Integer.valueOf(i));
        } else {
            quantityString = mcy.ab(this.a.getResources(), agngVar.g, (int) Collection.EL.stream(((agof) this.c.get()).a().i().l(agngVar.a)).filter(ghv.r).count());
        }
        aqyg g2 = ajcq.g(quantityString);
        createBuilder.copyOnWrite();
        aubg aubgVar4 = (aubg) createBuilder.instance;
        g2.getClass();
        aubgVar4.s = g2;
        aubgVar4.b |= 262144;
        if (this.d.m().booleanValue()) {
            aong aongVar = (aong) apmg.a.createBuilder();
            aong aongVar2 = (aong) arfs.a.createBuilder();
            arfr arfrVar = arfr.PLAY_ARROW;
            aongVar2.copyOnWrite();
            arfs arfsVar = (arfs) aongVar2.instance;
            arfsVar.c = arfrVar.pV;
            arfsVar.b |= 1;
            aongVar.copyOnWrite();
            apmg apmgVar = (apmg) aongVar.instance;
            arfs arfsVar2 = (arfs) aongVar2.build();
            arfsVar2.getClass();
            apmgVar.g = arfsVar2;
            apmgVar.b |= 32;
            aongVar.copyOnWrite();
            apmg apmgVar2 = (apmg) aongVar.instance;
            apmgVar2.d = 35;
            apmgVar2.c = 1;
            aqyg g3 = ajcq.g("PLAY");
            aongVar.copyOnWrite();
            apmg apmgVar3 = (apmg) aongVar.instance;
            g3.getClass();
            apmgVar3.i = g3;
            apmgVar3.b |= 256;
            apxf f = f(agngVar.a);
            aongVar.copyOnWrite();
            apmg apmgVar4 = (apmg) aongVar.instance;
            f.getClass();
            apmgVar4.o = f;
            apmgVar4.b |= 16384;
            apmg apmgVar5 = (apmg) aongVar.build();
            aong aongVar3 = (aong) aulq.a.createBuilder();
            aongVar3.e(ButtonRendererOuterClass.buttonRenderer, apmgVar5);
            aulq aulqVar = (aulq) aongVar3.build();
            createBuilder.copyOnWrite();
            aubg aubgVar5 = (aubg) createBuilder.instance;
            aulqVar.getClass();
            aubgVar5.e = aulqVar;
            aubgVar5.d = 63;
        } else {
            aone createBuilder2 = aubc.a.createBuilder();
            aone createBuilder3 = ardu.a.createBuilder();
            aong aongVar4 = (aong) arfs.a.createBuilder();
            arfr arfrVar2 = arfr.PLAY_ARROW;
            aongVar4.copyOnWrite();
            arfs arfsVar3 = (arfs) aongVar4.instance;
            arfsVar3.c = arfrVar2.pV;
            arfsVar3.b |= 1;
            createBuilder3.copyOnWrite();
            ardu arduVar = (ardu) createBuilder3.instance;
            arfs arfsVar4 = (arfs) aongVar4.build();
            arfsVar4.getClass();
            arduVar.e = arfsVar4;
            arduVar.b |= 1;
            apxf f2 = f(agngVar.a);
            createBuilder3.copyOnWrite();
            ardu arduVar2 = (ardu) createBuilder3.instance;
            f2.getClass();
            arduVar2.d = f2;
            arduVar2.c = 3;
            createBuilder2.copyOnWrite();
            aubc aubcVar = (aubc) createBuilder2.instance;
            ardu arduVar3 = (ardu) createBuilder3.build();
            arduVar3.getClass();
            aubcVar.c = arduVar3;
            aubcVar.b |= 1;
            createBuilder.copyOnWrite();
            aubg aubgVar6 = (aubg) createBuilder.instance;
            aubc aubcVar2 = (aubc) createBuilder2.build();
            aubcVar2.getClass();
            aubgVar6.K = aubcVar2;
            aubgVar6.c |= 524288;
        }
        agnb agnbVar = agngVar.c;
        if (agnbVar != null) {
            aong aongVar5 = (aong) aqyg.a.createBuilder();
            aong aongVar6 = (aong) aqyi.a.createBuilder();
            String str2 = agnbVar.b;
            aongVar6.copyOnWrite();
            aqyi aqyiVar = (aqyi) aongVar6.instance;
            str2.getClass();
            aqyiVar.b = 1 | aqyiVar.b;
            aqyiVar.c = str2;
            apxf a = a(evr.c(agnbVar.a));
            aongVar6.copyOnWrite();
            aqyi aqyiVar2 = (aqyi) aongVar6.instance;
            a.getClass();
            aqyiVar2.m = a;
            aqyiVar2.b |= 512;
            aongVar5.cw(aongVar6);
            createBuilder.copyOnWrite();
            aubg aubgVar7 = (aubg) createBuilder.instance;
            aqyg aqygVar = (aqyg) aongVar5.build();
            aqygVar.getClass();
            aubgVar7.u = aqygVar;
            aubgVar7.b |= 1048576;
            apxf a2 = a(evr.c(agnbVar.a));
            createBuilder.copyOnWrite();
            aubg aubgVar8 = (aubg) createBuilder.instance;
            a2.getClass();
            aubgVar8.v = a2;
            aubgVar8.b |= 2097152;
        }
        return (aubg) createBuilder.build();
    }
}
