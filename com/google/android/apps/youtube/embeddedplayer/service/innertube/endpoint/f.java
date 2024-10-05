package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import android.content.Context;
import com.google.protos.youtube.api.innertube.AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint;
import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.InlineUnmuteEndpointOuterClass;
import com.google.protos.youtube.api.innertube.MobileV2UserFeedEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import com.google.protos.youtube.api.innertube.PingingEndpointOuterClass$PingingEndpoint;
import com.google.protos.youtube.api.innertube.RunAttestationCommandOuterClass$RunAttestationCommand;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;
import defpackage.aact;
import defpackage.aahc;
import defpackage.aahd;
import defpackage.afsi;
import defpackage.apxf;
import defpackage.atrs;
import defpackage.avuo;
import defpackage.wbs;
import defpackage.ykp;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f implements aahd {
    private final Context a;
    private final aahd b;
    private final aahd c;
    private final c d;
    private final d e;
    private final b f;
    private final aact g;

    public f(Context context, aahd aahdVar, aahd aahdVar2, c cVar, d dVar, b bVar, aact aactVar) {
        this.a = context;
        this.b = aahdVar;
        this.c = aahdVar2;
        this.d = cVar;
        this.e = dVar;
        this.f = bVar;
        this.g = aactVar;
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
        if (apxfVar != null) {
            try {
                if (apxfVar.pY(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint)) {
                    throw new e("Settings not supported");
                }
                if (apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint)) {
                    throw new e("Browse not supported");
                }
                if (apxfVar.pY(InlineUnmuteEndpointOuterClass.inlineUnmuteEndpoint)) {
                    this.c.c(apxfVar, map);
                    return;
                }
                if (apxfVar.pY(MobileV2UserFeedEndpointOuterClass.mobileV2UserFeedEndpoint)) {
                    throw new e("Feed not supported");
                }
                if (apxfVar.pY(OfflineEndpointOuterClass.offlineEndpoint)) {
                    throw new e("Offline not supported");
                }
                if (apxfVar.pY(atrs.a)) {
                    throw new e("Offline Watch not supported");
                }
                if (apxfVar.pY(SearchEndpointOuterClass.searchEndpoint)) {
                    throw new e("Search not supported");
                }
                if (apxfVar.pY(SignInEndpointOuterClass.signInEndpoint)) {
                    throw new e("Sign in not supported");
                }
                if (apxfVar.pY(UrlEndpointOuterClass.urlEndpoint)) {
                    ykp.f(this.a, wbs.aj(((avuo) apxfVar.pX(UrlEndpointOuterClass.urlEndpoint)).c));
                    return;
                }
                if (apxfVar.pY(WatchEndpointOuterClass.watchEndpoint)) {
                    this.b.c(apxfVar, null);
                    return;
                }
                if (apxfVar.pY(WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint)) {
                    throw new e("Watch Playlist not supported");
                }
                if (apxfVar.pY(AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint)) {
                    this.e.a(apxfVar);
                    return;
                }
                if (apxfVar.pY(AddToToastActionOuterClass$AddToToastAction.addToToastAction)) {
                    this.d.kE(apxfVar, map);
                    return;
                }
                if (apxfVar.pY(AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)) {
                    this.f.a(apxfVar);
                    return;
                }
                if (apxfVar.pY(PingingEndpointOuterClass$PingingEndpoint.pingingEndpoint)) {
                    return;
                }
                if (!apxfVar.pY(RunAttestationCommandOuterClass$RunAttestationCommand.runAttestationCommand)) {
                    throw new e("Unknown Navigation");
                }
                aact aactVar = this.g;
                if (aactVar != null) {
                    aactVar.kE(apxfVar, map);
                    return;
                }
                throw new e("Attestation not supported for non-sign-in supported apps.");
            } catch (e e) {
                String valueOf = String.valueOf(e.getMessage());
                afsi.c(2, 4, valueOf.length() != 0 ? "Unsupported command: ".concat(valueOf) : new String("Unsupported command: "), e);
            }
        }
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
