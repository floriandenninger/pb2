package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jts extends jsm {
    private final Context a;

    public jts(Context context) {
        super(avnb.class);
        this.a = context;
    }

    private final aqyg f(int i) {
        return ajcq.h(this.a.getString(i));
    }

    @Override // defpackage.jsm
    public final /* bridge */ /* synthetic */ Object a(amrz amrzVar) {
        aong aongVar = (aong) apxf.a.createBuilder();
        aonk aonkVar = UrlEndpointOuterClass.urlEndpoint;
        aone createBuilder = avuo.a.createBuilder();
        createBuilder.copyOnWrite();
        avuo avuoVar = (avuo) createBuilder.instance;
        avuoVar.b |= 1;
        avuoVar.c = "https://support.google.com/youtube/answer/6307365";
        createBuilder.copyOnWrite();
        avuo avuoVar2 = (avuo) createBuilder.instance;
        avuoVar2.d = 1;
        avuoVar2.b |= 2;
        aongVar.e(aonkVar, (avuo) createBuilder.build());
        boolean z = amrzVar != null && ((Boolean) amrzVar.getOrDefault("is_travel_message", false)).booleanValue();
        boolean z2 = amrzVar != null && ((Boolean) amrzVar.getOrDefault("is_texit_message", false)).booleanValue();
        aone createBuilder2 = avnb.a.createBuilder();
        if (z) {
            createBuilder2.aW(f(R.string.travel_error_message));
        } else if (z2) {
            aonk aonkVar2 = UrlEndpointOuterClass.urlEndpoint;
            aone createBuilder3 = avuo.a.createBuilder();
            createBuilder3.copyOnWrite();
            avuo avuoVar3 = (avuo) createBuilder3.instance;
            avuoVar3.b |= 1;
            avuoVar3.c = "https://support.google.com/youtube/answer/6141269";
            createBuilder3.copyOnWrite();
            avuo avuoVar4 = (avuo) createBuilder3.instance;
            avuoVar4.d = 1;
            avuoVar4.b |= 2;
            aongVar.e(aonkVar2, (avuo) createBuilder3.build());
            createBuilder2.aW(ajcq.h(mcy.ae(this.a, ((Integer) e(amrzVar, "unplayable_in_secs")).intValue(), false)));
        }
        avez avezVar = avez.THEME_ATTRIBUTE_SUGGESTED_ACTION;
        createBuilder2.copyOnWrite();
        avnb avnbVar = (avnb) createBuilder2.instance;
        avnbVar.d = Integer.valueOf(avezVar.aj);
        avnbVar.c = 8;
        avez avezVar2 = avez.THEME_ATTRIBUTE_TEXT1;
        createBuilder2.copyOnWrite();
        avnb avnbVar2 = (avnb) createBuilder2.instance;
        avnbVar2.i = avezVar2.aj;
        avnbVar2.b |= 32;
        aone createBuilder4 = apmh.a.createBuilder();
        aong aongVar2 = (aong) apmg.a.createBuilder();
        aqyg f = f(R.string.learn_more);
        aongVar2.copyOnWrite();
        apmg apmgVar = (apmg) aongVar2.instance;
        f.getClass();
        apmgVar.i = f;
        apmgVar.b |= 256;
        aongVar2.copyOnWrite();
        apmg apmgVar2 = (apmg) aongVar2.instance;
        apmgVar2.d = 13;
        apmgVar2.c = 1;
        aongVar2.copyOnWrite();
        apmg apmgVar3 = (apmg) aongVar2.instance;
        apxf apxfVar = (apxf) aongVar.build();
        apxfVar.getClass();
        apmgVar3.p = apxfVar;
        apmgVar3.b |= 32768;
        createBuilder4.copyOnWrite();
        apmh apmhVar = (apmh) createBuilder4.instance;
        apmg apmgVar4 = (apmg) aongVar2.build();
        apmgVar4.getClass();
        apmhVar.c = apmgVar4;
        apmhVar.b |= 1;
        createBuilder2.copyOnWrite();
        avnb avnbVar3 = (avnb) createBuilder2.instance;
        apmh apmhVar2 = (apmh) createBuilder4.build();
        apmhVar2.getClass();
        avnbVar3.g = apmhVar2;
        avnbVar3.b |= 2;
        return (avnb) createBuilder2.build();
    }
}
