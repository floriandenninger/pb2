package com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service;

import android.net.Uri;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import defpackage.aahd;
import defpackage.abaw;
import defpackage.abaz;
import defpackage.afsy;
import defpackage.ajcq;
import defpackage.aomf;
import defpackage.aone;
import defpackage.aong;
import defpackage.aonk;
import defpackage.apde;
import defpackage.apmg;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.auau;
import defpackage.yjk;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a {
    public final aahd a;
    private final afsy b;
    private final abaz c;
    private String f;
    private int h;
    private boolean i;
    private apmg d = apmg.a;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b e = com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b.U;
    private aomf g = aomf.b;

    public b(aahd aahdVar, afsy afsyVar, abaz abazVar) {
        this.a = aahdVar;
        this.b = afsyVar;
        this.c = abazVar;
    }

    private final void d(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.a e = WatchLaterButtonData.e();
        e.b(i);
        e.c(this.g);
        if (i == 0 || i == 1) {
            e.a = null;
            e.b = null;
        } else {
            String str = this.f;
            e.a = str;
            e.b = str;
        }
        this.e.E(e.a());
    }

    public final int a() {
        yjk.f();
        return this.h;
    }

    public final void b(apmg apmgVar, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b bVar) {
        yjk.f();
        apmgVar.getClass();
        this.d = apmgVar;
        bVar.getClass();
        this.e = bVar;
        int i = this.d.b;
        if ((i & 256) == 0 || (i & 64) == 0 || (i & 8192) == 0) {
            this.h = 0;
            d(a());
            return;
        }
        aqyg aqygVar = apmgVar.i;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        this.f = ajcq.b(aqygVar).toString();
        this.g = apmgVar.t;
        if (apmgVar.h) {
            this.h = 1;
        } else {
            this.h = 2;
        }
        d(a());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a
    public final void j() {
        Optional empty;
        Optional of;
        yjk.f();
        if (a() == 1 || a() == 0 || this.i) {
            return;
        }
        if (!this.b.t()) {
            apxf apxfVar = this.d.n;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            Iterator it = ((PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apxfVar.pX(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint)).c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    empty = Optional.empty();
                    break;
                }
                auau auauVar = (auau) it.next();
                if ((auauVar.b & 2) != 0) {
                    empty = Optional.of(auauVar.d);
                    break;
                }
            }
            if (!empty.isPresent()) {
                of = Optional.empty();
            } else {
                String builder = new Uri.Builder().scheme("https").authority("www.youtube.com").appendPath("watch").appendQueryParameter("v", (String) empty.get()).toString();
                aong aongVar = (aong) apxf.a.createBuilder();
                aonk aonkVar = AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint;
                aone createBuilder = apde.a.createBuilder();
                createBuilder.copyOnWrite();
                apde.b((apde) createBuilder.instance);
                createBuilder.copyOnWrite();
                apde apdeVar = (apde) createBuilder.instance;
                builder.getClass();
                apdeVar.b |= 4;
                apdeVar.e = builder;
                createBuilder.copyOnWrite();
                apde.a((apde) createBuilder.instance);
                aongVar.e(aonkVar, (apde) createBuilder.build());
                of = Optional.of((apxf) aongVar.build());
            }
            if (of.isPresent()) {
                this.a.a((apxf) of.get());
                return;
            }
            return;
        }
        apxf apxfVar2 = this.d.n;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apxfVar2.pX(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        abaw a = this.c.a();
        a.l(apxfVar2.c);
        a.a = playlistEditEndpointOuterClass$PlaylistEditEndpoint.b;
        a.d(playlistEditEndpointOuterClass$PlaylistEditEndpoint.c);
        a.c = playlistEditEndpointOuterClass$PlaylistEditEndpoint.e;
        this.i = true;
        this.c.b(a, new a(this));
    }
}
