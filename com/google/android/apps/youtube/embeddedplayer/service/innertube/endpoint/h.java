package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import defpackage.aahc;
import defpackage.aahd;
import defpackage.aahe;
import defpackage.alta;
import defpackage.amsx;
import defpackage.aomf;
import defpackage.apde;
import defpackage.apxf;
import j$.util.Optional;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class h implements aahd {
    private static final amsx a = amsx.r(apde.class);
    private final aahd b;
    private final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f c;

    public h(aahd aahdVar, com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f fVar) {
        this.b = aahdVar;
        this.c = fVar;
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
    @Deprecated
    public final void c(apxf apxfVar, Map map) {
        Object a2 = aahe.a(apxfVar);
        if (a2 != null && a.contains(a2.getClass()) && (apxfVar.b & 1) != 0) {
            com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f fVar = this.c;
            aomf aomfVar = apxfVar.c;
            Optional b = fVar.b();
            if (!b.isPresent()) {
                com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f.g(fVar.b);
            } else {
                com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.c cVar = ((com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.d) b.get()).i;
                if (cVar != null) {
                    cVar.a(new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.CLICK, aomfVar.I()), null);
                } else {
                    alta.C("Unable to log click: no active logger", new Object[0]);
                }
            }
        }
        this.b.c(apxfVar, map);
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
