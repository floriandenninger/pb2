package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aahd;
import defpackage.ahus;
import defpackage.ahux;
import defpackage.ahyq;
import defpackage.ajdj;
import defpackage.ajm;
import defpackage.alta;
import defpackage.amkq;
import defpackage.aqvu;
import defpackage.ayqj;
import defpackage.ayqr;
import defpackage.ayqx;
import defpackage.ayrz;
import defpackage.azre;
import defpackage.fk;
import defpackage.jm;
import defpackage.oqu;
import defpackage.xla;
import defpackage.zhq;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class n extends ahus implements com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g {
    private static final String e = ajm.a().b(" · ");
    public aahd a;
    public xla b;
    public Context c;
    public boolean d;
    private FrameLayout f;
    private TextView g;
    private FrameLayout h;
    private View i;
    private TextView j;
    private ahyq k;
    private ImageView l;
    private m m;
    private boolean n;
    private boolean o;
    private final ayqx p;

    public n(Context context) {
        super(context);
        this.c = context;
        l lVar = new l();
        lVar.a = null;
        lVar.e(false);
        lVar.d(false);
        lVar.g(false);
        lVar.f(false);
        lVar.b = null;
        lVar.c(0);
        lVar.h(0);
        lVar.i(0);
        lVar.b(0);
        lVar.j(0);
        this.m = lVar.a();
        this.p = com.google.android.apps.youtube.embeddedplayer.service.jar.c.a.b.ai(azre.c()).ab(ayqr.a()).ax(new k(this, 0));
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ View a(Context context) {
        this.f = new FrameLayout(context);
        LayoutInflater from = LayoutInflater.from(context);
        if (this.d) {
            try {
                from.inflate(R.layout.embedded_ad_overlay, this.f);
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                sb.append("Unable to inflate LazyEmbeddedAdOverlay: ");
                sb.append(valueOf);
                alta.B(sb.toString(), new Object[0]);
                return this.f;
            }
        } else {
            from.inflate(R.layout.embedded_ad_overlay, this.f);
        }
        if (!this.p.e()) {
            ayrz.c((AtomicReference) this.p);
        }
        this.o = true;
        this.g = (TextView) this.f.findViewById(R.id.ad_text);
        this.h = (FrameLayout) this.f.findViewById(R.id.ad_text_and_ad_choices_button);
        View findViewById = this.f.findViewById(R.id.skip_ad_button);
        this.i = findViewById;
        this.j = (TextView) findViewById.findViewById(R.id.skip_ad_text);
        this.l = (ImageView) this.i.findViewById(R.id.skip_ad_icon);
        this.h.setOnClickListener(new i(this, 1));
        this.i.setOnClickListener(new i(this, 0));
        this.i.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                n nVar = n.this;
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                nVar.b.e((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                return false;
            }
        });
        return this.f;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        if (np()) {
            if (ab(2) && np()) {
                if (this.m.c) {
                    this.j.setText(this.f.getResources().getString(R.string.skip_ad));
                    this.l.setVisibility(0);
                } else {
                    this.l.setVisibility(8);
                }
                this.i.setEnabled(this.m.c);
                m mVar = this.m;
                if (mVar.b || !mVar.a) {
                    this.i.setVisibility(8);
                } else {
                    this.i.setVisibility(0);
                }
            }
            if (ab(4) && np()) {
                boolean z = this.m.d;
                this.h.setEnabled(z);
                jm.u(this.g, null, null, z ? fk.f(this.f.getResources(), R.drawable.ad_choices_instream_icon, null) : null);
                if (z) {
                    this.g.setCompoundDrawablePadding(10);
                }
            }
            if (ab(1)) {
                ((RelativeLayout.LayoutParams) this.i.getLayoutParams()).bottomMargin += this.m.e;
            }
            if (ab(64)) {
                m mVar2 = this.m;
                m(mVar2.g, mVar2.h, mVar2.i);
            }
            if (ab(32)) {
                n(this.m.f);
            }
        }
    }

    public final void k(ayqj ayqjVar) {
        ayqjVar.W(new k(this, 1), oqu.n);
    }

    @Override // defpackage.ahus
    public final ahux kU(Context context) {
        ahux kU = super.kU(context);
        kU.e = false;
        kU.b();
        kU.a();
        return kU;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void m(int i, int i2, int i3) {
        if (!np()) {
            l clone = this.m.clone();
            clone.i(i);
            clone.b(i2);
            clone.j(i3);
            this.m = clone.a();
            Z(64);
            return;
        }
        if (i == -1) {
            this.g.setText(this.f.getResources().getString(R.string.ad_badge));
            return;
        }
        String i4 = zhq.i(i / 1000);
        if (i3 >= 2) {
            this.g.setText(this.f.getResources().getString(R.string.ad_pod, e, Integer.valueOf(i2), Integer.valueOf(i3), i4));
        } else {
            this.g.setText(this.f.getResources().getString(R.string.ad_normal, e, i4));
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void n(int i) {
        if (!np()) {
            l clone = this.m.clone();
            clone.h(i);
            this.m = clone.a();
            Z(32);
            return;
        }
        int i2 = (i + 999) / 1000;
        TextView textView = this.j;
        Resources resources = this.f.getResources();
        Integer valueOf = Integer.valueOf(i2);
        textView.setText(resources.getString(R.string.skip_ad_in, valueOf));
        this.j.setContentDescription(this.f.getResources().getQuantityString(R.plurals.accessibility_skip_ad_in, i2, valueOf));
    }

    @Override // defpackage.ahus, defpackage.ahuu
    public final boolean np() {
        return this.o && super.np();
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.n;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void o(CharSequence charSequence) {
        l clone = this.m.clone();
        clone.a = charSequence;
        this.m = clone.a();
        Z(8);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void p(Bitmap bitmap) {
        l clone = this.m.clone();
        clone.b = bitmap;
        this.m = clone.a();
        Z(16);
    }

    public final void q(int i) {
        l clone = this.m.clone();
        clone.c(i);
        this.m = clone.a();
        Z(1);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void r(boolean z) {
        l clone = this.m.clone();
        clone.d(z);
        this.m = clone.a();
        Z(2);
    }

    public final void s(ahyq ahyqVar) {
        ahyqVar.getClass();
        amkq.N(this.k == null);
        this.k = ahyqVar;
        ahyqVar.a(new i(this, 2));
        this.k.c(8);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void t(xla xlaVar) {
        this.b = xlaVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void u(boolean z) {
        l clone = this.m.clone();
        clone.f(z);
        this.m = clone.a();
        Z(4);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void v(boolean z) {
        l clone = this.m.clone();
        clone.g(z);
        this.m = clone.a();
        Z(2);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void w(boolean z) {
        l clone = this.m.clone();
        clone.e(z);
        this.m = clone.a();
        Z(2);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void x(boolean z) {
        this.n = z;
        if (z) {
            aa();
            return;
        }
        X();
        ahyq ahyqVar = this.k;
        if (ahyqVar != null) {
            ahyqVar.c(8);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void y(aqvu aqvuVar) {
        Context context = this.c;
        if (context instanceof com.google.android.apps.youtube.embeddedplayer.service.context.b) {
            context = ((com.google.android.apps.youtube.embeddedplayer.service.context.b) context).getBaseContext();
        }
        aahd aahdVar = this.a;
        if (aahdVar != null) {
            ajdj.c(context, aqvuVar, aahdVar, null);
        } else {
            alta.B("Unable to show dismissible ads dialog: command router not present.", new Object[0]);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void z(CharSequence charSequence) {
        if (this.k == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f.getResources().getString(R.string.ad_learn_more);
        }
        this.k.b(charSequence);
        this.k.c(0);
    }
}
