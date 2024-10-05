package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import com.google.protos.youtube.api.innertube.AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint;
import defpackage.aahc;
import defpackage.aahd;
import defpackage.aowf;
import defpackage.apxf;
import defpackage.aqvu;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements aahd {
    private final a a;

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.aahd
    public final void a(apxf apxfVar) {
        if (apxfVar == null || !apxfVar.pY(AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)) {
            return;
        }
        aowf aowfVar = ((AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint) apxfVar.pX(AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)).b;
        if (aowfVar == null) {
            aowfVar = aowf.a;
        }
        if ((aowfVar.b & 1) != 0) {
            a aVar = this.a;
            aowf aowfVar2 = ((AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint) apxfVar.pX(AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)).b;
            if (aowfVar2 == null) {
                aowfVar2 = aowf.a;
            }
            aqvu aqvuVar = aowfVar2.c;
            if (aqvuVar == null) {
                aqvuVar = aqvu.a;
            }
            aVar.a(aqvuVar);
        }
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void b(List list) {
        aahc.b(this, list);
    }

    @Override // defpackage.aahd
    public final void c(apxf apxfVar, Map map) {
        a(apxfVar);
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
