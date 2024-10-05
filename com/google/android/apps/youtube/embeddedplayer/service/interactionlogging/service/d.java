package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import defpackage.acqr;
import defpackage.acsb;
import defpackage.acsc;
import defpackage.afsi;
import defpackage.amkq;
import defpackage.aone;
import defpackage.apxf;
import defpackage.asht;
import defpackage.ashz;
import defpackage.awdp;
import defpackage.azrw;
import defpackage.opn;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d {
    private static final acsc[] j = {acsb.c(28240), acsb.c(28239), acsb.c(28244), acsb.c(28664), acsb.c(16499), acsb.c(70346), acsb.c(70347), acsb.c(23851), acsb.c(28666)};
    final c a;
    final c b;
    final c c;
    final int d;
    final String e;
    public c i;
    public final Set f = new HashSet();
    private final Set k = new HashSet();
    public Optional g = Optional.empty();
    public Optional h = Optional.empty();

    public d(azrw azrwVar, int i, String str) {
        acqr acqrVar = (acqr) azrwVar;
        this.a = new c(this, acqrVar.get());
        this.b = new c(this, acqrVar.get());
        this.c = new c(this, acqrVar.get());
        this.d = i;
        this.e = str;
    }

    public static final boolean k(Optional optional) {
        return !optional.isPresent() || TextUtils.isEmpty((CharSequence) optional.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final asht a(String str) {
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = ashz.a.createBuilder();
        if (str != null) {
            createBuilder2.copyOnWrite();
            ashz ashzVar = (ashz) createBuilder2.instance;
            ashzVar.b |= 1;
            ashzVar.c = str;
        }
        String str2 = this.e;
        createBuilder2.copyOnWrite();
        ashz ashzVar2 = (ashz) createBuilder2.instance;
        str2.getClass();
        ashzVar2.b |= 2;
        ashzVar2.d = str2;
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        ashz ashzVar3 = (ashz) createBuilder2.build();
        ashzVar3.getClass();
        ashtVar.j = ashzVar3;
        ashtVar.b |= 64;
        return (asht) createBuilder.build();
    }

    public final void b() {
        this.f.clear();
    }

    public final void c() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            this.c.a((b) it.next(), (String) this.h.orElse(null));
        }
        this.k.clear();
    }

    public final void d(PlayerResponseModel playerResponseModel, Optional optional) {
        if (playerResponseModel == null) {
            afsi.b(2, 4, "handlePlayerResponse called on empty player response");
            return;
        }
        g(optional, playerResponseModel.y());
        b bVar = new b(a.ATTACH, playerResponseModel.G());
        if (j(bVar)) {
            return;
        }
        i(bVar);
        acsc[] acscVarArr = j;
        int length = acscVarArr.length;
        for (int i = 0; i < 9; i++) {
            b bVar2 = new b(a.ATTACH, acscVarArr[i]);
            if (!j(bVar2)) {
                i(bVar2);
            }
        }
    }

    public final void e(b bVar) {
        c cVar = this.b;
        if (cVar.a) {
            cVar.a(bVar, null);
        } else {
            afsi.b(2, 4, "logChildRequestForPreview called without logNewEmbedPreviewPage");
        }
    }

    public final void f(Optional optional) {
        c cVar;
        c();
        b();
        c cVar2 = this.c;
        if (cVar2.a) {
            cVar = cVar2;
        } else {
            cVar = this.b;
            if (!cVar.a) {
                cVar = this.a;
            }
        }
        this.i = cVar2;
        cVar.d(optional);
        this.c.b(acsb.b(27240), optional, a(null));
        this.g = optional;
        this.h = Optional.empty();
    }

    public final void g(Optional optional, String str) {
        boolean equals;
        if (this.g.isPresent()) {
            if (!optional.isPresent()) {
                equals = amkq.b(((awdp) ((apxf) this.g.get()).pX(WatchEndpointOuterClass.watchEndpoint)).d, str);
            } else {
                equals = ((awdp) ((apxf) this.g.get()).pX(WatchEndpointOuterClass.watchEndpoint)).equals(((apxf) optional.get()).pX(WatchEndpointOuterClass.watchEndpoint));
            }
            if (!(!equals)) {
                return;
            }
        }
        if (!optional.isPresent()) {
            optional = Optional.ofNullable(opn.d(str, 0L));
        }
        f(optional);
    }

    public final void h(acsc acscVar) {
        b bVar = new b(a.VISIBILITY_UPDATE, acscVar);
        if (j(bVar)) {
            return;
        }
        e(bVar);
    }

    public final void i(b bVar) {
        if (!this.c.a) {
            afsi.c(2, 4, "queueOrLogChildRequestForPlayback called before EmbedWatchPage is logged.", new Throwable());
            return;
        }
        this.f.add(bVar);
        if (k(this.h)) {
            this.k.add(bVar);
        } else {
            this.c.a(bVar, (String) this.h.get());
        }
    }

    public final boolean j(b bVar) {
        return this.f.contains(bVar);
    }
}
