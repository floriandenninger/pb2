package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.InlineUnmuteEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import defpackage.aahc;
import defpackage.aahd;
import defpackage.aifz;
import defpackage.aone;
import defpackage.aong;
import defpackage.apxf;
import defpackage.arij;
import defpackage.awdp;
import defpackage.otl;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class g implements aahd {
    private final com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.f a;
    private final otl b;

    public g(otl otlVar, com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.f fVar) {
        this.b = otlVar;
        this.a = fVar;
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void a(apxf apxfVar) {
        aahc.a(this, apxfVar);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void b(List list) {
        aahc.b(this, list);
    }

    @Override // defpackage.aahd
    public final void c(apxf apxfVar, Map map) {
        if (apxfVar == null || !apxfVar.pY(InlineUnmuteEndpointOuterClass.inlineUnmuteEndpoint)) {
            return;
        }
        apxf apxfVar2 = ((arij) apxfVar.pX(InlineUnmuteEndpointOuterClass.inlineUnmuteEndpoint)).b;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        long j = 0;
        if (map != null) {
            Object obj = map.get("com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.starttime");
            if (obj instanceof Long) {
                j = ((Long) obj).longValue();
            }
        }
        if (apxfVar2 == null || !apxfVar2.pY(WatchEndpointOuterClass.watchEndpoint)) {
            return;
        }
        aone builder = ((awdp) apxfVar2.pX(WatchEndpointOuterClass.watchEndpoint)).toBuilder();
        builder.copyOnWrite();
        awdp awdpVar = (awdp) builder.instance;
        awdpVar.b |= 128;
        awdpVar.j = (float) j;
        awdp awdpVar2 = (awdp) builder.build();
        aong aongVar = (aong) apxfVar2.toBuilder();
        aongVar.e(WatchEndpointOuterClass.watchEndpoint, awdpVar2);
        apxf apxfVar3 = (apxf) aongVar.build();
        this.a.b(4);
        otl otlVar = this.b;
        aifz d = PlaybackStartDescriptor.d();
        d.a = apxfVar3;
        otlVar.a(d.a());
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void d(List list, Map map) {
        aahc.c(this, list, map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void e(List list, Object obj) {
        aahc.d(this, list, obj);
    }
}
