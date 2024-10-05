package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import android.content.Intent;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import defpackage.aahc;
import defpackage.aahd;
import defpackage.apde;
import defpackage.apxf;
import defpackage.askp;
import defpackage.otf;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements aahd {
    private final otf a;

    public d(otf otfVar) {
        this.a = otfVar;
    }

    @Override // defpackage.aahd
    public final void a(apxf apxfVar) {
        c(apxfVar, null);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void b(List list) {
        aahc.b(this, list);
    }

    @Override // defpackage.aahd
    public final void c(apxf apxfVar, Map map) {
        otf otfVar = this.a;
        apde apdeVar = (apde) apxfVar.pX(AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint);
        Intent intent = new Intent(apdeVar.d);
        intent.setPackage(apdeVar.c);
        if ((apdeVar.b & 4) != 0) {
            intent.setData(Uri.parse(apdeVar.e));
        }
        for (askp askpVar : apdeVar.f) {
            intent.putExtra(askpVar.e, askpVar.c == 2 ? (String) askpVar.d : "");
        }
        otfVar.a.t(intent);
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
