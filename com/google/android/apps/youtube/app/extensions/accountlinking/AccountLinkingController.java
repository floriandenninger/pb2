package com.google.android.apps.youtube.app.extensions.accountlinking;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import defpackage.aahv;
import defpackage.aiqu;
import defpackage.aixh;
import defpackage.any;
import defpackage.aok;
import defpackage.aone;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aoui;
import defpackage.aouj;
import defpackage.aouk;
import defpackage.aoul;
import defpackage.ayqx;
import defpackage.ayrz;
import defpackage.azqb;
import defpackage.azrh;
import defpackage.ggk;
import defpackage.gvs;
import defpackage.kvl;
import defpackage.zga;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountLinkingController implements any {
    public final aahv a;
    public ayqx b;
    public WeakReference c = new WeakReference(null);
    public final azrh d = azrh.e();
    private final kvl e;
    private ayqx f;
    private ayqx g;

    public AccountLinkingController(aahv aahvVar, kvl kvlVar) {
        this.a = aahvVar;
        this.e = kvlVar;
    }

    public final aouj g() {
        aixh o = this.e.E().o();
        if (o == null) {
            zga.b("failed to get presence menu data: no current playback");
            return null;
        }
        PlayerResponseModel c = o.c();
        if (c == null) {
            zga.b("failed to get presence menu data: no player response in current playback");
            return null;
        }
        aoui k = c.k();
        if (k == null) {
            zga.b("failed to get presence menu data: no AL config in player response");
            return null;
        }
        aouj aoujVar = k.e;
        return aoujVar == null ? aouj.a : aoujVar;
    }

    public final void h() {
        aiqu aiquVar = (aiqu) this.c.get();
        if (aiquVar != null) {
            aiquVar.a(null);
        }
        Object obj = this.b;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.b = null;
        }
    }

    public final void i(boolean z) {
        aiqu aiquVar = (aiqu) this.c.get();
        if (aiquVar == null) {
            return;
        }
        this.d.c(Boolean.valueOf(z));
        aone createBuilder = aoul.a.createBuilder();
        aone createBuilder2 = aouk.a.createBuilder();
        createBuilder2.copyOnWrite();
        aouk aoukVar = (aouk) createBuilder2.instance;
        aoukVar.b |= 1;
        aoukVar.c = z;
        createBuilder.copyOnWrite();
        aoul aoulVar = (aoul) createBuilder.instance;
        aouk aoukVar2 = (aouk) createBuilder2.build();
        aoukVar2.getClass();
        aony aonyVar = aoulVar.b;
        if (!aonyVar.c()) {
            aoulVar.b = aonm.mutableCopy(aonyVar);
        }
        aoulVar.b.add(aoukVar2);
        aiquVar.a((aoul) createBuilder.build());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        azqb.f((AtomicReference) this.f);
        azqb.f((AtomicReference) this.g);
        h();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.f = this.e.V().Y(new gvs(this, 2), ggk.l);
        this.g = this.e.ad().Y(new gvs(this, 3), ggk.l);
    }
}
