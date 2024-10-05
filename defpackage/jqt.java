package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jqt implements jqu {
    private final Context a;
    private final jti b;
    private final agpl c;
    private final String d;
    private final boolean e;

    public jqt(Context context, jti jtiVar, agpl agplVar, aadw aadwVar) {
        this.a = context;
        this.b = jtiVar;
        this.c = agplVar;
        asvu asvuVar = aadwVar.b().e;
        this.d = (asvuVar == null ? asvu.a : asvuVar).aD;
        asvu asvuVar2 = aadwVar.b().e;
        this.e = (asvuVar2 == null ? asvu.a : asvuVar2).bb;
    }

    @Override // defpackage.jqu
    public final WatchNextResponseModel a(final PlaybackStartDescriptor playbackStartDescriptor, amru amruVar) {
        final jhv a = jhv.a(this.a, this.e, amruVar);
        if (a.e.isEmpty()) {
            return new WatchNextResponseModel(asfc.a);
        }
        return new WatchNextResponseModel((asfc) this.b.f((jht) a.e.get(playbackStartDescriptor.a()), playbackStartDescriptor.k(), playbackStartDescriptor.a(), playbackStartDescriptor.i(), aomf.x(playbackStartDescriptor.y())).map(new Function() { // from class: jqs
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return jqt.this.d((asfc) obj, a, playbackStartDescriptor);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).orElseGet(ghx.m));
    }

    @Override // defpackage.jqu
    public final WatchNextResponseModel b(WatchNextResponseModel watchNextResponseModel, PlaybackStartDescriptor playbackStartDescriptor, amru amruVar) {
        aong aongVar;
        jhv a = jhv.a(this.a, this.e, amruVar);
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
            aongVar = (aong) asfcVar.toBuilder();
            String str = (awdpVar.b & 2) != 0 ? awdpVar.e : null;
            String str2 = awdpVar.d;
            int i = awdpVar.f;
            String str3 = awdpVar.g;
            apxf apxfVar3 = asfcVar.n;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            apxf A = aedn.A(str, str2, i, str3, apxfVar3.c);
            aongVar.copyOnWrite();
            asfc asfcVar2 = (asfc) aongVar.instance;
            A.getClass();
            asfcVar2.n = A;
            asfcVar2.b |= 4096;
        } else {
            aongVar = (aong) asfcVar.toBuilder();
        }
        if (!TextUtils.isEmpty(this.d)) {
            String str4 = this.d;
            apxf apxfVar4 = ((asfc) aongVar.instance).v;
            if (apxfVar4 == null) {
                apxfVar4 = apxf.a;
            }
            if (str4.equals(oba.j((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apxfVar4.pX(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)))) {
                aongVar.copyOnWrite();
                asfc asfcVar3 = (asfc) aongVar.instance;
                asfcVar3.v = null;
                asfcVar3.b &= -262145;
            }
        }
        return new WatchNextResponseModel(d((asfc) aongVar.build(), a, playbackStartDescriptor));
    }

    @Override // defpackage.jqu
    public final WatchNextResponseModel c(PlaybackStartDescriptor playbackStartDescriptor, aakt aaktVar) {
        Optional a = jht.a(aaktVar);
        if (a.isPresent()) {
            Optional f = this.b.f((jht) a.get(), playbackStartDescriptor.k(), -1, playbackStartDescriptor.i(), aomf.x(playbackStartDescriptor.y()));
            if (f.isPresent()) {
                return new WatchNextResponseModel((asfc) f.get());
            }
        }
        return new WatchNextResponseModel(asfc.a);
    }

    public final asfc d(asfc asfcVar, jhv jhvVar, PlaybackStartDescriptor playbackStartDescriptor) {
        aseu aseuVar;
        asfd asfdVar = asfcVar.d;
        if (asfdVar == null) {
            asfdVar = asfd.a;
        }
        if (asfdVar.b != 51779735) {
            return asfcVar;
        }
        asfd asfdVar2 = asfcVar.d;
        if (asfdVar2 == null) {
            asfdVar2 = asfd.a;
        }
        if (asfdVar2.b == 51779735) {
            aseuVar = (aseu) asfdVar2.c;
        } else {
            aseuVar = aseu.a;
        }
        aone builder = aseuVar.toBuilder();
        Optional map = Optional.ofNullable((aubs) this.b.g(jhv.class, aubs.class, jhvVar, amrz.m("downloaded_playlist_selected_video_index", Integer.valueOf(playbackStartDescriptor.a()), "watch_command_params", playbackStartDescriptor.i(), "watch_command_click_tracking_params", aomf.x(playbackStartDescriptor.y())))).map(iur.q);
        builder.getClass();
        map.ifPresent(new wkx(builder, 1));
        aone createBuilder = aseq.a.createBuilder();
        aphg a = this.c.a(playbackStartDescriptor, (List) Collection.EL.stream(jhvVar.e).map(iur.p).collect(Collectors.toList()));
        createBuilder.copyOnWrite();
        aseq aseqVar = (aseq) createBuilder.instance;
        a.getClass();
        aseqVar.c = a;
        aseqVar.b = 46659098;
        aseq aseqVar2 = (aseq) createBuilder.build();
        builder.copyOnWrite();
        aseu aseuVar2 = (aseu) builder.instance;
        aseqVar2.getClass();
        aseuVar2.e = aseqVar2;
        aseuVar2.b |= 4;
        aong aongVar = (aong) asfcVar.toBuilder();
        asfd asfdVar3 = asfcVar.d;
        if (asfdVar3 == null) {
            asfdVar3 = asfd.a;
        }
        aone builder2 = asfdVar3.toBuilder();
        builder2.copyOnWrite();
        asfd asfdVar4 = (asfd) builder2.instance;
        aseu aseuVar3 = (aseu) builder.build();
        aseuVar3.getClass();
        asfdVar4.c = aseuVar3;
        asfdVar4.b = 51779735;
        aongVar.copyOnWrite();
        asfc asfcVar2 = (asfc) aongVar.instance;
        asfd asfdVar5 = (asfd) builder2.build();
        asfdVar5.getClass();
        asfcVar2.d = asfdVar5;
        asfcVar2.b |= 2;
        return (asfc) aongVar.build();
    }

    @Override // defpackage.jqu
    public final WatchNextResponseModel e() {
        return new WatchNextResponseModel(asfc.a);
    }
}
