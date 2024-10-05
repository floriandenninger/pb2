package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.player.overlay.DefaultInlineMutedControlsOverlay;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
import defpackage.ahux;
import defpackage.ahvb;
import defpackage.ahvo;
import defpackage.ahyf;
import defpackage.aok;
import defpackage.axzg;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.azrw;
import defpackage.bxj;
import defpackage.fhg;
import defpackage.gfq;
import defpackage.kkw;
import defpackage.kkx;
import defpackage.kky;
import defpackage.kla;
import defpackage.klf;
import defpackage.klg;
import defpackage.yzr;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultInlineMutedControlsOverlay extends InlineMutedControlsOverlay {
    public Runnable a;
    public bxj b;
    public boolean c;
    public FrameLayout d;
    ProgressBar e;
    ImageView f;
    TextView g;
    private final azrw h;
    private final ahyf i;
    private final ayqw j;
    private kla k;
    private boolean l;
    private kkx m;
    private kkw n;
    private final axzg o;

    public DefaultInlineMutedControlsOverlay(Context context, ahyf ahyfVar, azrw azrwVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, axzg axzgVar, byte[] bArr) {
        super(context);
        kkx a = kkx.a().a();
        this.m = a;
        this.n = a.b();
        this.h = azrwVar;
        this.i = ahyfVar;
        this.j = new ayqw();
        this.o = axzgVar;
        inlinePlaybackLifecycleController.l(this);
    }

    private final void A() {
        this.d.removeCallbacks(this.a);
        this.f.setVisibility(8);
        this.f.animate().cancel();
        this.f.setAlpha(0.0f);
        bxj bxjVar = this.b;
        if (bxjVar != null) {
            bxjVar.stop();
        }
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ View a(Context context) {
        this.d = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.inline_muted_controls_overlay, this.d);
        this.e = (ProgressBar) this.d.findViewById(R.id.player_loading_view);
        this.f = (ImageView) this.d.findViewById(R.id.audio_indicator);
        this.g = (TextView) this.d.findViewById(R.id.countdown_badge);
        ((ViewGroup) this.d.findViewById(R.id.subtitle)).addView((View) this.h.get());
        klg klgVar = new klg(new yzr(this.g, 0L, 8));
        kla klaVar = new kla(context, new klf(this.i, klgVar), klgVar, this.e, this.g);
        this.k = klaVar;
        klaVar.c(this.m);
        this.j.d(this.o.a().ax(new ayrs() { // from class: kij
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                DefaultInlineMutedControlsOverlay.this.c = ((Boolean) obj).booleanValue();
            }
        }));
        return this.d;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        kkx a = this.n.a();
        this.m = a;
        this.n = a.b();
        if (ab(1)) {
            this.k.c(this.m);
            B();
        }
        if (ab(2)) {
            kkx kkxVar = this.m;
            int i = kkxVar.a;
            if (i == 1) {
                this.k.d(kkxVar.c.d(), this.m.c.g());
            } else if (i == 0) {
                this.k.a();
                A();
            }
            this.k.c(this.m);
            B();
        }
        if (ab(4)) {
            kky kkyVar = this.m.e;
            this.k.f(kkyVar.a, kkyVar.b, kkyVar.c, kkyVar.d);
        }
        if (ab(8)) {
            this.k.e(this.m.f);
        }
    }

    @Override // defpackage.ahvc
    public final void h(ahvb ahvbVar) {
    }

    @Override // defpackage.ahvc
    public final void i(boolean z) {
    }

    @Override // defpackage.ahvc
    public final void k(ControlsOverlayStyle controlsOverlayStyle) {
        this.n.f = controlsOverlayStyle;
        Z(8);
    }

    @Override // defpackage.ahus
    public final ahux kU(Context context) {
        ahux kU = super.kU(context);
        kU.e = false;
        kU.b();
        return kU;
    }

    @Override // com.google.android.apps.youtube.app.player.overlay.InlineMutedControlsOverlay, defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.j.qc();
    }

    @Override // defpackage.gge
    public final void m(gfq gfqVar, int i, int i2) {
        kkw kkwVar = this.n;
        kkwVar.b = gfqVar.b;
        kkwVar.b(i2);
        Z(2);
    }

    @Override // defpackage.fnp
    public final boolean mY(fhg fhgVar) {
        return fhgVar.d();
    }

    @Override // defpackage.fnp
    public final void nH(fhg fhgVar) {
        if (this.n.a().d != fhgVar) {
            this.n.c = fhgVar;
            if (fhgVar.d()) {
                aa();
            } else {
                X();
            }
            Y();
        }
    }

    @Override // defpackage.ahvc
    public final void nI(ControlsState controlsState) {
        this.n.a = controlsState;
        Z(1);
    }

    @Override // defpackage.ahvc
    public final void nJ(CharSequence charSequence) {
    }

    @Override // defpackage.ahvc
    public final void nK(boolean z) {
    }

    @Override // defpackage.ahvc
    public final void nf() {
    }

    @Override // defpackage.ahvc
    public final void ng() {
    }

    @Override // defpackage.ahvc
    public final void nh(String str, boolean z) {
        ControlsState g = z ? ControlsState.g() : ControlsState.h();
        kkw kkwVar = this.n;
        kkwVar.d = str;
        kkwVar.a = g;
        Z(1);
    }

    @Override // defpackage.ahvc
    public final void ns() {
        if (np()) {
            this.k.b();
        }
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.n.a().d.d();
    }

    @Override // defpackage.ahvc
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.d.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.ahvc
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.d.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.ahvc
    public final void pA() {
    }

    @Override // defpackage.ahvc
    public final void pB() {
    }

    @Override // defpackage.ahvc
    public final void px(Map map) {
    }

    @Override // defpackage.ahvc
    public final void py(long j, long j2, long j3, long j4) {
        if (np() && this.m.b.a == ahvo.PLAYING && !this.m.b.b) {
            this.n.e = kky.a(j, j2, j3, j4);
            Z(4);
        }
    }

    @Override // defpackage.ahvc
    public final void r(boolean z) {
    }

    @Override // defpackage.ahvc
    public final void s(boolean z) {
    }

    private final void B() {
        kkx kkxVar = this.m;
        if (kkxVar.a != 3 || kkxVar.b.a != ahvo.PLAYING || this.m.b.b) {
            A();
            return;
        }
        if (this.c) {
            return;
        }
        this.f.setAlpha(0.0f);
        this.f.setVisibility(0);
        if (!this.l) {
            bxj a = bxj.a(this.d.getContext(), R.drawable.audio_indicator_24dp_animation);
            this.b = a;
            this.f.setImageDrawable(a);
            this.a = new Runnable() { // from class: kik
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultInlineMutedControlsOverlay defaultInlineMutedControlsOverlay = DefaultInlineMutedControlsOverlay.this;
                    defaultInlineMutedControlsOverlay.b.start();
                    defaultInlineMutedControlsOverlay.d.postDelayed(defaultInlineMutedControlsOverlay.a, 2140L);
                }
            };
            this.l = true;
        }
        this.b.start();
        this.d.postDelayed(this.a, 2140L);
        this.f.animate().alpha(0.8f).start();
    }
}
