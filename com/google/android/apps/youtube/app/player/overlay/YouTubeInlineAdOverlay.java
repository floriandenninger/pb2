package com.google.android.apps.youtube.app.player.overlay;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownView;
import com.google.android.libraries.youtube.ads.player.ui.AdProgressTextView;
import com.google.android.libraries.youtube.ads.player.ui.BrandInteractionView;
import com.google.android.libraries.youtube.ads.player.ui.SkipAdButton;
import com.google.android.youtube.R;
import defpackage.aaea;
import defpackage.aahd;
import defpackage.acqx;
import defpackage.acra;
import defpackage.ahee;
import defpackage.ahus;
import defpackage.ahyr;
import defpackage.aih;
import defpackage.aivb;
import defpackage.ajjz;
import defpackage.ajyg;
import defpackage.amkq;
import defpackage.any;
import defpackage.aok;
import defpackage.apbs;
import defpackage.fgq;
import defpackage.fhg;
import defpackage.fkc;
import defpackage.fnp;
import defpackage.gop;
import defpackage.kks;
import defpackage.kku;
import defpackage.kkv;
import defpackage.klj;
import defpackage.klk;
import defpackage.kpk;
import defpackage.kpl;
import defpackage.wbs;
import defpackage.xcl;
import defpackage.xht;
import defpackage.xhx;
import defpackage.xif;
import defpackage.xjq;
import defpackage.xka;
import defpackage.xkd;
import defpackage.xkh;
import defpackage.xkl;
import defpackage.xks;
import defpackage.xku;
import defpackage.xkv;
import defpackage.xkx;
import defpackage.xky;
import defpackage.xkz;
import defpackage.xla;
import defpackage.xlb;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.yzr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class YouTubeInlineAdOverlay extends ahus implements xhx, fnp, any, ypd {
    public final gop a;
    public final kkv b;
    public final kpl c;
    public final aivb d;
    private final xkx e;
    private final ajjz f;
    private final acra g;
    private final fgq h;
    private final ajyg i;
    private final ypa j;
    private final aaea k;
    private klk l;

    public YouTubeInlineAdOverlay(Activity activity, gop gopVar, acra acraVar, ajjz ajjzVar, fgq fgqVar, aahd aahdVar, xcl xclVar, aivb aivbVar, ajyg ajygVar, klk klkVar, ImageView imageView, ahyr ahyrVar, ypa ypaVar, aaea aaeaVar) {
        super(activity);
        this.a = gopVar;
        fgqVar.getClass();
        this.h = fgqVar;
        aivbVar.getClass();
        this.d = aivbVar;
        ajjzVar.getClass();
        this.f = ajjzVar;
        this.g = acraVar;
        this.i = ajygVar;
        this.c = new kpl();
        this.l = klkVar;
        this.j = ypaVar;
        this.k = aaeaVar;
        this.e = new xkx(activity, aahdVar, acraVar);
        kkv kkvVar = new kkv(new xkz(activity), acraVar, xclVar);
        this.b = kkvVar;
        xks xksVar = kkvVar.g;
        imageView.getClass();
        amkq.N(xksVar.a == null);
        xksVar.a = imageView;
        xksVar.a.setVisibility(8);
        imageView.setOnClickListener(new kks(kkvVar, 0));
        xkz xkzVar = kkvVar.a;
        ahyrVar.getClass();
        amkq.N(xkzVar.a == null);
        xkzVar.a = ahyrVar;
        xkzVar.a.a(new xky(xkzVar));
        xkzVar.a.c(8);
    }

    private final void k() {
        this.b.qH(this.c.a);
        kkv kkvVar = this.b;
        boolean nt = nt();
        if (kkvVar.m) {
            if (nt) {
                kkvVar.f.b(null, null, null);
            } else {
                kkvVar.f.b(null, null, null);
            }
        }
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ View a(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        LayoutInflater.from(context).inflate(R.layout.inline_ad_overlay, relativeLayout);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.ad_reengagement_view);
        xkv xkvVar = new xkv(this.i.a(textView), this.g);
        xkvVar.c(textView);
        this.e.c((BrandInteractionView) relativeLayout.findViewById(R.id.brand_interaction_view));
        apbs k = wbs.k(this.k);
        boolean z = false;
        boolean z2 = k != null && k.r;
        apbs k2 = wbs.k(this.k);
        if (k2 != null && k2.s) {
            z = true;
        }
        final xku xkuVar = new xku(z2, z);
        xkuVar.c((AdProgressTextView) relativeLayout.findViewById(R.id.ad_progress_text));
        SkipAdButton skipAdButton = (SkipAdButton) relativeLayout.findViewById(R.id.skip_ad_button);
        skipAdButton.b(true);
        AdCountdownView adCountdownView = (AdCountdownView) relativeLayout.findViewById(R.id.ad_countdown);
        xkh xkhVar = adCountdownView.c;
        xkhVar.c.setTextColor(aih.d(xkhVar.a, R.color.skip_ad_button_high_contrast_foreground_color));
        xht xhtVar = new xht(adCountdownView, this.f);
        klk klkVar = this.l;
        View findViewById = relativeLayout.findViewById(R.id.video_metadata_container);
        klkVar.c = (TextView) findViewById.findViewById(R.id.title);
        klkVar.d = (TextView) findViewById.findViewById(R.id.author);
        klkVar.a = findViewById.findViewById(R.id.channel_thumbnail_container);
        klkVar.b = (ImageView) klkVar.a.findViewById(R.id.channel_thumbnail);
        klkVar.f = new yzr(findViewById, 200L, 8);
        this.l.a(this.h.g().b());
        final kkv kkvVar = this.b;
        xkx xkxVar = this.e;
        klk klkVar2 = this.l;
        amkq.O(!kkvVar.m, "Can only be initialized once");
        kkvVar.i = xkvVar;
        kkvVar.j = xkxVar;
        xkxVar.a = kkvVar.k;
        klkVar2.getClass();
        kkvVar.f = klkVar2;
        kkvVar.e = new klj(klkVar2);
        kkvVar.d = xkuVar;
        skipAdButton.setOnTouchListener(new kku(kkvVar));
        skipAdButton.setOnClickListener(new kks(kkvVar, 1));
        ((AdProgressTextView) xkuVar.c).setOnClickListener(new View.OnClickListener() { // from class: kkt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kkv kkvVar2 = kkv.this;
                xku xkuVar2 = xkuVar;
                kkvVar2.k.getClass();
                if (xkuVar2.e && ((AdProgressTextView) xkuVar2.c).a.a) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("menu_as_bottom_sheet", true);
                    kkvVar2.k.a(bundle);
                }
            }
        });
        xif xifVar = new xif(xhtVar, skipAdButton);
        kkvVar.h = new xlb(kkvVar.b, kkvVar.c);
        kkvVar.h.c(xifVar);
        kkvVar.m = true;
        relativeLayout.addOnLayoutChangeListener(new kpk(this));
        return relativeLayout;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        if (ab(2)) {
            kkv kkvVar = this.b;
            boolean z = this.c.c;
            if (kkvVar.l != z) {
                kkvVar.l = z;
                xkz xkzVar = kkvVar.a;
                if (xkzVar.g != z) {
                    xkzVar.g = z;
                    int i = true != xkz.a(xkzVar.h, xkzVar.i, z) ? 8 : 0;
                    ahyr ahyrVar = xkzVar.a;
                    if (ahyrVar != null && ((xka) xkzVar.b).b) {
                        ahyrVar.c(i);
                    }
                }
                if (kkvVar.m) {
                    xlb xlbVar = kkvVar.h;
                    if (xlbVar.e && xlbVar.a != z) {
                        xlbVar.a = z;
                        xkl xklVar = (xkl) xlbVar.c;
                        xkd xkdVar = (xkd) xlbVar.b;
                        xklVar.j(xkdVar.d, z || xkdVar.e);
                    }
                    kkvVar.g.a(z);
                    kkvVar.i.a = z;
                    xkx xkxVar = kkvVar.j;
                    xkxVar.g = z;
                    if (xkxVar.e) {
                        ((BrandInteractionView) xkxVar.c).setVisibility(true == xkx.g(xkxVar.f, z) ? 0 : 8);
                    }
                }
            }
            this.l.a(this.c.d);
        }
        if (ab(1)) {
            k();
        }
        if (ab(4)) {
            klk klkVar = this.l;
            boolean z2 = this.c.b;
            if (klkVar.e == z2) {
                return;
            }
            klkVar.e = z2;
            klkVar.f.a(z2, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahus
    public final void kW(int i) {
        acra acraVar;
        if (i == 0) {
            acra acraVar2 = this.g;
            if (acraVar2 != null) {
                acraVar2.q(new acqx(this.c.a.j), this.c.a.k);
            }
            k();
            return;
        }
        if (i != 2 || (acraVar = this.g) == null) {
            return;
        }
        acraVar.u(new acqx(this.c.a.j), this.c.a.k);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahee.class};
        }
        if (i == 0) {
            kpl kplVar = this.c;
            boolean z = kplVar.b;
            boolean z2 = ((ahee) obj).a;
            if (z == z2) {
                return null;
            }
            kplVar.b = z2;
            Z(4);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
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

    @Override // defpackage.fnp
    public final boolean mY(fhg fhgVar) {
        return fkc.d(fhgVar);
    }

    @Override // defpackage.fnp
    public final void nH(fhg fhgVar) {
        boolean z = true;
        if (!fhgVar.l() && !fhgVar.e()) {
            z = false;
        }
        kpl kplVar = this.c;
        if (kplVar.c == z && kplVar.d == fhgVar.b()) {
            return;
        }
        kpl kplVar2 = this.c;
        kplVar2.c = z;
        kplVar2.d = fhgVar.b();
        Z(2);
    }

    @Override // defpackage.xhx
    public final void nM(xla xlaVar) {
        this.b.nM(xlaVar);
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.c.a();
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.j.m(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.j.g(this);
    }

    @Override // defpackage.xhx
    public final void qH(xjq xjqVar) {
        kpl kplVar = this.c;
        kplVar.a = xjqVar;
        kkv kkvVar = this.b;
        xka xkaVar = xjqVar.f;
        boolean a = kplVar.a();
        if (kkvVar.m) {
            xkz xkzVar = kkvVar.a;
            xkzVar.h = a;
            xkzVar.e(xkaVar, a);
        }
        if (nt()) {
            kX();
        } else {
            kkv kkvVar2 = this.b;
            if (kkvVar2.m) {
                kkvVar2.g.e(false, false);
            }
            super.kV();
        }
        Z(1);
    }
}
