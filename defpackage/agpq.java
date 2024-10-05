package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agpq implements agri {
    private final aaea a;

    public agpq(aaea aaeaVar) {
        this.a = aaeaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aqyg j(String str) {
        if (TextUtils.isEmpty(str)) {
            return ajcq.g(new String[0]);
        }
        return ajcq.g(str);
    }

    private final asfc o(Context context, apxf apxfVar, agnp agnpVar) {
        aone createBuilder = auov.a.createBuilder();
        createBuilder.aL(e(context, agnpVar));
        auov auovVar = (auov) createBuilder.build();
        aone createBuilder2 = aseu.a.createBuilder();
        aone createBuilder3 = aset.a.createBuilder();
        createBuilder3.copyOnWrite();
        aset asetVar = (aset) createBuilder3.instance;
        auovVar.getClass();
        asetVar.c = auovVar;
        asetVar.b = 49399797;
        createBuilder2.copyOnWrite();
        aseu aseuVar = (aseu) createBuilder2.instance;
        aset asetVar2 = (aset) createBuilder3.build();
        asetVar2.getClass();
        aseuVar.c = asetVar2;
        aseuVar.b |= 1;
        aseu aseuVar2 = (aseu) createBuilder2.build();
        aong aongVar = (aong) asfc.a.createBuilder();
        aongVar.copyOnWrite();
        asfc asfcVar = (asfc) aongVar.instance;
        apxfVar.getClass();
        asfcVar.n = apxfVar;
        asfcVar.b |= 4096;
        aone createBuilder4 = asfd.a.createBuilder();
        createBuilder4.copyOnWrite();
        asfd asfdVar = (asfd) createBuilder4.instance;
        aseuVar2.getClass();
        asfdVar.c = aseuVar2;
        asfdVar.b = 51779735;
        aongVar.copyOnWrite();
        asfc asfcVar2 = (asfc) aongVar.instance;
        asfd asfdVar2 = (asfd) createBuilder4.build();
        asfdVar2.getClass();
        asfcVar2.d = asfdVar2;
        asfcVar2.b |= 2;
        return (asfc) aongVar.build();
    }

    private static asnj p(asnp asnpVar) {
        aong aongVar = (aong) asni.a.createBuilder();
        aongVar.copyOnWrite();
        asni asniVar = (asni) aongVar.instance;
        asnpVar.getClass();
        asniVar.c = asnpVar;
        asniVar.b |= 1;
        aomf aomfVar = aomf.b;
        aongVar.copyOnWrite();
        asni asniVar2 = (asni) aongVar.instance;
        aomfVar.getClass();
        asniVar2.b |= 4096;
        asniVar2.n = aomfVar;
        aongVar.copyOnWrite();
        asni asniVar3 = (asni) aongVar.instance;
        asniVar3.b |= 8192;
        asniVar3.o = true;
        asno asnoVar = asno.INDIFFERENT;
        aongVar.copyOnWrite();
        asni asniVar4 = (asni) aongVar.instance;
        asniVar4.d = asnoVar.e;
        asniVar4.b |= 2;
        asni asniVar5 = (asni) aongVar.build();
        aone createBuilder = asnj.a.createBuilder();
        createBuilder.copyOnWrite();
        asnj asnjVar = (asnj) createBuilder.instance;
        asniVar5.getClass();
        asnjVar.c = asniVar5;
        asnjVar.b |= 1;
        return (asnj) createBuilder.build();
    }

    @Override // defpackage.agri
    public WatchNextResponseModel a(WatchNextResponseModel watchNextResponseModel, Context context, agng agngVar, List list, int i, String str, byte[] bArr, aphg aphgVar) {
        watchNextResponseModel.getClass();
        if (agngVar == null) {
            return watchNextResponseModel;
        }
        asfc asfcVar = watchNextResponseModel.a;
        apxf apxfVar = asfcVar.n;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if (apxfVar.pY(WatchEndpointOuterClass.watchEndpoint)) {
            apxf apxfVar2 = asfcVar.n;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            awdp awdpVar = (awdp) apxfVar2.pX(WatchEndpointOuterClass.watchEndpoint);
            aong aongVar = (aong) asfcVar.toBuilder();
            String str2 = (awdpVar.b & 2) != 0 ? awdpVar.e : null;
            String str3 = awdpVar.d;
            int i2 = awdpVar.f;
            String str4 = awdpVar.g;
            apxf apxfVar3 = asfcVar.n;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            apxf A = aedn.A(str2, str3, i2, str4, apxfVar3.c);
            aongVar.copyOnWrite();
            asfc asfcVar2 = (asfc) aongVar.instance;
            A.getClass();
            asfcVar2.n = A;
            asfcVar2.b |= 4096;
            asfcVar = (asfc) aongVar.build();
        }
        return new WatchNextResponseModel(k(context, asfcVar, agngVar, list, i, str, bArr, aphgVar));
    }

    @Override // defpackage.agri
    public WatchNextResponseModel b(Context context, agnp agnpVar, String str, byte[] bArr) {
        return new WatchNextResponseModel(l(context, agnpVar, str, bArr));
    }

    @Override // defpackage.agri
    public WatchNextResponseModel c(Context context, agng agngVar, List list, int i, String str, byte[] bArr, aphg aphgVar) {
        return new WatchNextResponseModel(m(context, agngVar, list, i, str, bArr, aphgVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Collection d() {
        return amsx.r("PPSV");
    }

    protected List e(Context context, agnp agnpVar) {
        aone createBuilder = auoy.a.createBuilder();
        aong aongVar = (aong) askd.a.createBuilder();
        aone createBuilder2 = avza.a.createBuilder();
        agnb agnbVar = agnpVar.a;
        if (agnbVar != null) {
            aqyg j = j(agnbVar.b);
            createBuilder2.copyOnWrite();
            avza avzaVar = (avza) createBuilder2.instance;
            j.getClass();
            avzaVar.d = j;
            avzaVar.b |= 2;
            avgg e = agnbVar.c.e();
            createBuilder2.copyOnWrite();
            avza avzaVar2 = (avza) createBuilder2.instance;
            e.getClass();
            avzaVar2.c = e;
            avzaVar2.b |= 1;
        }
        aone createBuilder3 = askg.a.createBuilder();
        createBuilder3.copyOnWrite();
        askg askgVar = (askg) createBuilder3.instance;
        avza avzaVar3 = (avza) createBuilder2.build();
        avzaVar3.getClass();
        askgVar.U = avzaVar3;
        askgVar.c |= 512;
        askg askgVar2 = (askg) createBuilder3.build();
        aqyg j2 = j(agnpVar.j());
        aqyg j3 = j(context.getString(R.string.video_views, Long.valueOf(agnpVar.b())));
        aqyg j4 = j(agnpVar.h());
        aqyg j5 = j(agnpVar.e());
        aqyg j6 = j(agnpVar.h());
        aqyg j7 = j(agnpVar.e());
        aong aongVar2 = (aong) aqyg.a.createBuilder();
        Date date = agnpVar.d;
        aong aongVar3 = (aong) aqyi.a.createBuilder();
        aongVar3.copyOnWrite();
        aqyi.a((aqyi) aongVar3.instance);
        String format = DateFormat.getLongDateFormat(context).format(agnpVar.d);
        aongVar3.copyOnWrite();
        aqyi aqyiVar = (aqyi) aongVar3.instance;
        format.getClass();
        aqyiVar.b |= 1;
        aqyiVar.c = format;
        aongVar2.ck((aqyi) aongVar3.build());
        aqyg aqygVar = (aqyg) aongVar2.build();
        aong aongVar4 = (aong) avyw.a.createBuilder();
        aongVar4.copyOnWrite();
        avyw avywVar = (avyw) aongVar4.instance;
        avywVar.b |= 16777216;
        avywVar.g = false;
        aongVar4.copyOnWrite();
        avyw avywVar2 = (avyw) aongVar4.instance;
        avywVar2.b |= 8388608;
        avywVar2.f = false;
        aqyg aqygVar2 = agnpVar.e.k;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        aongVar4.copyOnWrite();
        avyw avywVar3 = (avyw) aongVar4.instance;
        aqygVar2.getClass();
        avywVar3.e = aqygVar2;
        avywVar3.b |= 8192;
        aongVar4.copyOnWrite();
        avyw avywVar4 = (avyw) aongVar4.instance;
        aqygVar.getClass();
        avywVar4.h = aqygVar;
        avywVar4.b |= 33554432;
        aongVar4.copyOnWrite();
        avyw avywVar5 = (avyw) aongVar4.instance;
        j3.getClass();
        avywVar5.d = j3;
        avywVar5.b |= 16;
        aongVar4.copyOnWrite();
        avyw avywVar6 = (avyw) aongVar4.instance;
        j2.getClass();
        avywVar6.c = j2;
        avywVar6.b |= 4;
        aone createBuilder4 = asnp.a.createBuilder();
        String f = agnpVar.f();
        createBuilder4.copyOnWrite();
        asnp asnpVar = (asnp) createBuilder4.instance;
        f.getClass();
        asnpVar.b |= 1;
        asnpVar.c = f;
        aone builder = p((asnp) createBuilder4.build()).toBuilder();
        asni asniVar = ((asnj) builder.instance).c;
        if (asniVar == null) {
            asniVar = asni.a;
        }
        aong aongVar5 = (aong) asniVar.toBuilder();
        aongVar5.copyOnWrite();
        asni asniVar2 = (asni) aongVar5.instance;
        j5.getClass();
        asniVar2.j = j5;
        asniVar2.b |= 256;
        aongVar5.copyOnWrite();
        asni asniVar3 = (asni) aongVar5.instance;
        j7.getClass();
        asniVar3.k = j7;
        asniVar3.b |= 512;
        aongVar5.copyOnWrite();
        asni asniVar4 = (asni) aongVar5.instance;
        j4.getClass();
        asniVar4.f = j4;
        asniVar4.b |= 8;
        aongVar5.copyOnWrite();
        asni asniVar5 = (asni) aongVar5.instance;
        j6.getClass();
        asniVar5.g = j6;
        asniVar5.b |= 16;
        builder.copyOnWrite();
        asnj asnjVar = (asnj) builder.instance;
        asni asniVar6 = (asni) aongVar5.build();
        asniVar6.getClass();
        asnjVar.c = asniVar6;
        asnjVar.b |= 1;
        aongVar4.copyOnWrite();
        avyw avywVar7 = (avyw) aongVar4.instance;
        asnj asnjVar2 = (asnj) builder.build();
        asnjVar2.getClass();
        avywVar7.i = asnjVar2;
        avywVar7.b |= 536870912;
        aone createBuilder5 = askg.a.createBuilder();
        createBuilder5.copyOnWrite();
        askg askgVar3 = (askg) createBuilder5.instance;
        avyw avywVar8 = (avyw) aongVar4.build();
        avywVar8.getClass();
        askgVar3.T = avywVar8;
        askgVar3.c |= 256;
        aongVar.cm(amru.s(askgVar2, (askg) createBuilder5.build()));
        askd askdVar = (askd) aongVar.build();
        createBuilder.copyOnWrite();
        auoy auoyVar = (auoy) createBuilder.instance;
        askdVar.getClass();
        auoyVar.j = askdVar;
        auoyVar.b |= 16;
        return amru.r((auoy) createBuilder.build());
    }

    protected void f(agnp agnpVar, aong aongVar) {
    }

    @Override // defpackage.agri
    public final /* synthetic */ WatchNextResponseModel g(WatchNextResponseModel watchNextResponseModel, Context context, agng agngVar, List list, int i, PlaybackStartDescriptor playbackStartDescriptor, aphg aphgVar) {
        return a(watchNextResponseModel, context, agngVar, list, i, playbackStartDescriptor.i(), playbackStartDescriptor.y(), aphgVar);
    }

    @Override // defpackage.agri
    public final /* synthetic */ WatchNextResponseModel h(Context context, agnp agnpVar, PlaybackStartDescriptor playbackStartDescriptor) {
        return b(context, agnpVar, playbackStartDescriptor.i(), playbackStartDescriptor.y());
    }

    @Override // defpackage.agri
    public final /* synthetic */ WatchNextResponseModel i(Context context, agng agngVar, List list, int i, PlaybackStartDescriptor playbackStartDescriptor, aphg aphgVar) {
        return c(context, agngVar, list, i, playbackStartDescriptor.i(), playbackStartDescriptor.y(), aphgVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.asfc k(android.content.Context r18, defpackage.asfc r19, defpackage.agng r20, java.util.List r21, int r22, java.lang.String r23, byte[] r24, defpackage.aphg r25) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agpq.k(android.content.Context, asfc, agng, java.util.List, int, java.lang.String, byte[], aphg):asfc");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final asfc l(Context context, agnp agnpVar, String str, byte[] bArr) {
        agnpVar.getClass();
        return o(context, aedn.z(null, agnpVar, -1, str, bArr), agnpVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final asfc m(Context context, agng agngVar, List list, int i, String str, byte[] bArr, aphg aphgVar) {
        int max = Math.max(0, Math.min(list.size() - 1, i));
        agnp agnpVar = (agnp) list.get(max);
        return k(context, (asfc) ((aong) o(context, aedn.z(agngVar.a, agnpVar, max, str, bArr), agnpVar).toBuilder()).build(), agngVar, list, max, str, bArr, aphgVar);
    }

    @Override // defpackage.agri
    public final void n() {
    }
}
