package com.google.android.apps.youtube.app.watch.engagementpanel;

import android.text.TextUtils;
import com.google.android.apps.youtube.app.watch.engagementpanel.ShowPlaylistEngagementPanelOnUiReadyHandler;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import defpackage.aadw;
import defpackage.aahd;
import defpackage.ahqo;
import defpackage.ahqp;
import defpackage.ahqr;
import defpackage.any;
import defpackage.aok;
import defpackage.apxf;
import defpackage.asvu;
import defpackage.gpf;
import defpackage.oba;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShowPlaylistEngagementPanelOnUiReadyHandler implements gpf, any {
    public final aahd a;
    public ahqp b;
    public ahqo c = ahqo.NEW;
    private final String d;
    private final ahqr e;
    private Runnable f;

    public ShowPlaylistEngagementPanelOnUiReadyHandler(aadw aadwVar, ahqr ahqrVar, aahd aahdVar) {
        this.a = aahdVar;
        this.e = ahqrVar;
        asvu asvuVar = aadwVar.b().e;
        this.d = (asvuVar == null ? asvu.a : asvuVar).aD;
    }

    @Override // defpackage.gpf
    public final boolean g(final apxf apxfVar, final Map map) {
        this.f = null;
        if (TextUtils.isEmpty(this.d) || !this.d.equals(oba.j((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apxfVar.pX(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)))) {
            return false;
        }
        this.f = new Runnable() { // from class: nud
            @Override // java.lang.Runnable
            public final void run() {
                ShowPlaylistEngagementPanelOnUiReadyHandler showPlaylistEngagementPanelOnUiReadyHandler = ShowPlaylistEngagementPanelOnUiReadyHandler.this;
                showPlaylistEngagementPanelOnUiReadyHandler.a.c(apxfVar, map);
            }
        };
        h();
        return true;
    }

    public final void h() {
        if (this.f == null || !this.c.a(ahqo.LOGGED_ATTACH_WATCH_NEXT)) {
            return;
        }
        Runnable runnable = this.f;
        runnable.getClass();
        runnable.run();
        this.f = null;
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.e.h(this.b);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.e.o(this.b);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
