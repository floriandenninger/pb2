package com.google.android.apps.youtube.app.common.playervideoviewlayoutdelegate;

import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayoutDelegate;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import defpackage.any;
import defpackage.aok;
import defpackage.fav;
import defpackage.fgp;
import defpackage.fgq;
import defpackage.fhg;
import defpackage.kch;
import defpackage.kcz;
import defpackage.ojs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayerVideoViewLayoutDelegateController implements any, fgp {
    private final fgq a;
    private final InlinePlayerLayoutDelegate b;
    private final ojs c;
    private final kch d;

    public PlayerVideoViewLayoutDelegateController(kch kchVar, fgq fgqVar, InlinePlayerLayoutDelegate inlinePlayerLayoutDelegate, ojs ojsVar) {
        this.d = kchVar;
        this.a = fgqVar;
        this.b = inlinePlayerLayoutDelegate;
        this.c = ojsVar;
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
        this.a.j(this);
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((kcz) this.d.get()).aT;
        if (youTubePlayerViewNotForReflection == null) {
            return;
        }
        if (fhgVar.h()) {
            youTubePlayerViewNotForReflection.kF(this.c);
        } else if (fhgVar.d()) {
            youTubePlayerViewNotForReflection.kF(this.b);
        } else {
            youTubePlayerViewNotForReflection.kF(null);
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.a.i(this);
    }
}
