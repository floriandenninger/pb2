package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import defpackage.aahc;
import defpackage.aahd;
import defpackage.aifz;
import defpackage.apxf;
import defpackage.otl;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class i implements aahd {
    private final otl a;

    public i(otl otlVar) {
        this.a = otlVar;
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
        if (apxfVar == null || !apxfVar.pY(WatchEndpointOuterClass.watchEndpoint)) {
            return;
        }
        aifz d = PlaybackStartDescriptor.d();
        d.a = apxfVar;
        this.a.a(d.a());
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
