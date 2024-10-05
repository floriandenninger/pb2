package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.InlineMutedScrimOverlayRedirectController;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.youtube.R;
import defpackage.aheg;
import defpackage.ahyl;
import defpackage.aioa;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.axzg;
import defpackage.ayqi;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.fgq;
import defpackage.fhg;
import defpackage.kfe;
import defpackage.yzr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InlineMutedScrimOverlayRedirectController implements ahyl, aioa, any {
    public aheg a;
    public fhg b = fhg.NONE;
    public long c;
    public final ViewGroup d;
    public final View e;
    public final aioc f;
    public final InlinePlaybackController g;
    public final Context h;
    public final yzr i;
    public final axzg j;
    private final fgq k;
    private final ayqi l;
    private final ayqw m;

    public InlineMutedScrimOverlayRedirectController(Context context, ViewGroup viewGroup, aioc aiocVar, axzg axzgVar, InlinePlaybackController inlinePlaybackController, fgq fgqVar, ayqi ayqiVar, byte[] bArr) {
        this.h = context;
        this.d = viewGroup;
        viewGroup.getClass();
        this.i = new yzr(viewGroup);
        this.e = viewGroup.findViewById(R.id.continue_watching_text);
        this.f = aiocVar;
        this.j = axzgVar;
        this.g = inlinePlaybackController;
        this.k = fgqVar;
        ayqiVar.getClass();
        this.l = ayqiVar;
        this.m = new ayqw();
    }

    public final void g() {
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }

    @Override // defpackage.ahyl
    public final void h(int i, long j) {
        if (i == 1 || i == 2) {
            this.d.setVisibility(0);
            this.i.c(true);
        } else if (i == 3 || i == 4) {
            this.i.b(true);
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().d.E(this.l).G().Y(new ayrs() { // from class: klc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                Long l;
                Boolean bool;
                InlineMutedScrimOverlayRedirectController inlineMutedScrimOverlayRedirectController = InlineMutedScrimOverlayRedirectController.this;
                aheg ahegVar = (aheg) obj;
                Long l2 = 0L;
                if (inlineMutedScrimOverlayRedirectController.b == fhg.INLINE_MINIMAL && inlineMutedScrimOverlayRedirectController.a != null && !inlineMutedScrimOverlayRedirectController.g.u() && ahegVar.f() > 60000 && TextUtils.equals(inlineMutedScrimOverlayRedirectController.a.i(), ahegVar.i())) {
                    long g = ahegVar.g() - inlineMutedScrimOverlayRedirectController.a.g();
                    if (g > 0 && g < 5000) {
                        inlineMutedScrimOverlayRedirectController.c += g;
                    }
                } else {
                    aheg ahegVar2 = inlineMutedScrimOverlayRedirectController.a;
                    if (ahegVar2 != null && !TextUtils.equals(ahegVar2.i(), ahegVar.i())) {
                        inlineMutedScrimOverlayRedirectController.c = 0L;
                        inlineMutedScrimOverlayRedirectController.g();
                    }
                }
                inlineMutedScrimOverlayRedirectController.a = ahegVar;
                aqvj aqvjVar = inlineMutedScrimOverlayRedirectController.j.b.b().C;
                if (aqvjVar == null) {
                    aqvjVar = aqvj.a;
                }
                if (aqvjVar.a(45353146L)) {
                    aoot aootVar = aqvjVar.b;
                    if (!aootVar.containsKey(45353146L)) {
                        throw new IllegalArgumentException();
                    }
                    aqvk aqvkVar = (aqvk) aootVar.get(45353146L);
                    l = Long.valueOf(aqvkVar.b == 2 ? ((Long) aqvkVar.c).longValue() : 0L);
                } else {
                    l = l2;
                }
                long longValue = l.longValue();
                mhv mhvVar = inlineMutedScrimOverlayRedirectController.g.f;
                if (mhvVar == null || mhvVar.a.a().a != arhn.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_PAUSE_AFTER_DURATION || longValue <= 0 || inlineMutedScrimOverlayRedirectController.c / 1000 <= longValue) {
                    aqvj aqvjVar2 = inlineMutedScrimOverlayRedirectController.j.b.b().C;
                    if (aqvjVar2 == null) {
                        aqvjVar2 = aqvj.a;
                    }
                    if (aqvjVar2.a(45354250L)) {
                        aoot aootVar2 = aqvjVar2.b;
                        if (!aootVar2.containsKey(45354250L)) {
                            throw new IllegalArgumentException();
                        }
                        aqvk aqvkVar2 = (aqvk) aootVar2.get(45354250L);
                        l2 = Long.valueOf(aqvkVar2.b == 2 ? ((Long) aqvkVar2.c).longValue() : 0L);
                    }
                    long longValue2 = l2.longValue();
                    mhv mhvVar2 = inlineMutedScrimOverlayRedirectController.g.f;
                    if (mhvVar2 == null || mhvVar2.a.a().a != arhn.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_REDIRECT_AFTER_DURATION || longValue2 <= 0 || inlineMutedScrimOverlayRedirectController.c / 1000 <= longValue2) {
                        return;
                    }
                    inlineMutedScrimOverlayRedirectController.g.q(amvo.b);
                    return;
                }
                inlineMutedScrimOverlayRedirectController.f.E().a();
                inlineMutedScrimOverlayRedirectController.e.setVisibility(0);
                inlineMutedScrimOverlayRedirectController.d.setVisibility(0);
                inlineMutedScrimOverlayRedirectController.i.c(true);
                aqvj aqvjVar3 = inlineMutedScrimOverlayRedirectController.j.b.b().C;
                if (aqvjVar3 == null) {
                    aqvjVar3 = aqvj.a;
                }
                if (aqvjVar3.a(45354077L)) {
                    aoot aootVar3 = aqvjVar3.b;
                    if (!aootVar3.containsKey(45354077L)) {
                        throw new IllegalArgumentException();
                    }
                    aqvk aqvkVar3 = (aqvk) aootVar3.get(45354077L);
                    bool = Boolean.valueOf(aqvkVar3.b == 1 ? ((Boolean) aqvkVar3.c).booleanValue() : false);
                } else {
                    bool = false;
                }
                if (bool.booleanValue()) {
                    inlineMutedScrimOverlayRedirectController.e.setBackground(new ColorDrawable(wbs.W(inlineMutedScrimOverlayRedirectController.h, R.attr.ytOverlayButtonPrimary).orElse(0)));
                }
            }
        }, kfe.h), this.k.h().B().ay(new ayrs() { // from class: klb
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                InlineMutedScrimOverlayRedirectController.this.b = (fhg) obj;
            }
        }, kfe.h)};
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.m.qc();
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.m.g(kI(this.f));
    }
}
