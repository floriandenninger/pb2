package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkk implements ajom {
    private final gni A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    private mvf H;
    private mvf I;

    /* renamed from: J, reason: collision with root package name */
    private List f236J;
    private glh K;
    private glt L;
    private String M;
    private boolean N;
    private Drawable O;
    private Drawable P;
    private boolean Q;
    private int R;
    private int S;
    private Drawable T;
    private mkh U;
    public final ci a;
    public final View b;
    public final ajut c;
    public final aalw d;
    public final TextView e;
    public boolean f;
    public Runnable g;
    public bxj h;
    public boolean i;
    public final lru j;
    private final ajjz k;
    private final TextView l;
    private final TextView m;
    private final ImageView n;
    private final TextView o;
    private final DurationBadgeView p;
    private final ImageView q;
    private final ImageView r;
    private final ImageView s;
    private final ViewGroup t;
    private final ajoi u;
    private final ajjv v;
    private final jru w;
    private final glg x = new glg() { // from class: mkg
        @Override // defpackage.glg
        public final void a() {
            mkk mkkVar = mkk.this;
            boolean z = mkkVar.f;
            boolean e = mkkVar.e();
            mkkVar.f = e;
            if (z != e) {
                mkkVar.d();
            }
        }
    };
    private final akbd y;
    private final mvg z;

    /* JADX INFO: Access modifiers changed from: protected */
    public mkk(final ci ciVar, ajjz ajjzVar, ajut ajutVar, aahd aahdVar, aalw aalwVar, lru lruVar, ohg ohgVar, akbd akbdVar, mvg mvgVar, gni gniVar, ViewGroup viewGroup, int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = ciVar;
        this.k = ajjzVar;
        this.c = ajutVar;
        this.d = aalwVar;
        this.j = lruVar;
        this.y = akbdVar;
        this.z = mvgVar;
        this.A = gniVar;
        View inflate = LayoutInflater.from(ciVar).inflate(i, viewGroup, false);
        this.b = inflate;
        this.l = (TextView) inflate.findViewById(R.id.title);
        this.m = (TextView) inflate.findViewById(R.id.channel);
        this.n = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.e = (TextView) inflate.findViewById(R.id.video_info);
        this.r = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.p = (DurationBadgeView) inflate.findViewById(R.id.duration);
        this.o = (TextView) inflate.findViewById(R.id.unplayable_reason);
        this.s = (ImageView) inflate.findViewById(R.id.three_dots_menu);
        this.t = (ViewGroup) inflate.findViewById(R.id.action_buttons);
        this.q = (ImageView) inflate.findViewById(R.id.equalizer);
        ajju b = ajjzVar.c().b();
        b.c(false);
        b.b(R.drawable.ic_unavailable_common);
        this.v = b.a();
        this.u = new ajoi(aahdVar, inflate);
        this.w = ohgVar.b((ViewStub) inflate.findViewById(R.id.offline_badge), null);
        this.G = i2;
        this.E = 1;
        this.F = 2;
        this.B = wbs.Q(ciVar, R.attr.ytTextPrimary);
        this.C = wbs.Q(ciVar, R.attr.ytTextSecondary);
        this.D = wbs.Q(ciVar, R.attr.ytBadgeChipBackground);
        inflate.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: mkf
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                mkk mkkVar = mkk.this;
                boolean z = yjk.P(ciVar.getResources().getDisplayMetrics(), Math.abs(i5 - i3)) >= 350;
                if (mkkVar.i == z) {
                    return;
                }
                mkkVar.i = z;
                TextView textView = mkkVar.e;
                whu.I(textView, z && !TextUtils.isEmpty(textView.getText()));
            }
        });
    }

    private final View f(boolean z) {
        View inflate = LayoutInflater.from(this.t.getContext()).inflate(this.G, this.t, false);
        inflate.setBackground(null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.button_icon);
        imageView.setImageResource(true != z ? R.drawable.yt_outline_thumb_down_black_24 : R.drawable.yt_outline_thumb_up_black_24);
        imageView.setImageTintList(wbs.S(this.t.getContext(), R.attr.ytIconDisabled));
        return inflate;
    }

    private final mvf g() {
        return this.z.b(this.t, this.G, null);
    }

    private final void h() {
        mvf mvfVar = this.H;
        if (mvfVar != null) {
            mvfVar.b();
        }
        mvf mvfVar2 = this.I;
        if (mvfVar2 != null) {
            mvfVar2.b();
        }
        this.t.removeAllViews();
    }

    private final void i() {
        boolean z = false;
        if (this.t.getChildCount() > 0 && this.f && this.o.getVisibility() == 8) {
            z = true;
        }
        this.l.setMaxLines(z ? this.E : this.F);
        whu.I(this.t, z);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        glh glhVar = this.K;
        if (glhVar != null) {
            glhVar.oU(this.x);
            this.K = null;
        }
        glt gltVar = this.L;
        if (gltVar != null) {
            gltVar.f(this.U);
            this.L = null;
        }
        this.U = null;
        this.O = null;
        h();
    }

    public final boolean e() {
        glh glhVar = this.K;
        return (glhVar == null || glhVar.b() == null || this.M == null) ? this.N : amkq.b(this.K.b(), this.M);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apxf apxfVar;
        asnf asnfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        aqyg aqygVar5;
        ammv ammvVar;
        mkh mkhVar;
        final aubw aubwVar = ((mkj) obj).a;
        final acra acraVar = ajokVar.a;
        final aahd aahdVar = (aahd) ajokVar.c("commandRouter");
        if (aahdVar != null) {
            this.u.a = aahdVar;
        }
        ajoi ajoiVar = this.u;
        aqyg aqygVar6 = null;
        if ((aubwVar.b & 256) != 0) {
            apxfVar = aubwVar.m;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, null);
        glt gltVar = this.L;
        if (gltVar != null && (mkhVar = this.U) != null) {
            gltVar.f(mkhVar);
        }
        mkh mkhVar2 = new mkh(acraVar, aubwVar);
        this.U = mkhVar2;
        mkhVar2.a();
        glt gltVar2 = (glt) ajokVar.c("PLAYLIST_VIDEO_INTERACTION_LOGGING_TRIGGER");
        this.L = gltVar2;
        if (gltVar2 != null) {
            gltVar2.oV(this.U);
        }
        this.O = null;
        this.P = null;
        if (this.A.a() == gng.LIGHT) {
            avgg avggVar = aubwVar.f;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            if ((avggVar.b & 512) != 0) {
                avgg avggVar2 = aubwVar.f;
                if (avggVar2 == null) {
                    avggVar2 = avgg.a;
                }
                asnfVar = avggVar2.h;
                if (asnfVar == null) {
                    asnfVar = asnf.a;
                }
            } else {
                if ((aubwVar.b & 67108864) != 0) {
                    asnfVar = aubwVar.x;
                    if (asnfVar == null) {
                        asnfVar = asnf.a;
                    }
                }
                asnfVar = null;
            }
        } else {
            if (this.A.a() == gng.DARK) {
                avgg avggVar3 = aubwVar.f;
                if (avggVar3 == null) {
                    avggVar3 = avgg.a;
                }
                if ((avggVar3.b & 1024) != 0) {
                    avgg avggVar4 = aubwVar.f;
                    if (avggVar4 == null) {
                        avggVar4 = avgg.a;
                    }
                    asnfVar = avggVar4.i;
                    if (asnfVar == null) {
                        asnfVar = asnf.a;
                    }
                } else if ((aubwVar.b & 134217728) != 0) {
                    asnfVar = aubwVar.y;
                    if (asnfVar == null) {
                        asnfVar = asnf.a;
                    }
                }
            }
            asnfVar = null;
        }
        if (asnfVar != null) {
            this.R = (asnfVar.e & 16777215) | (-16777216);
            this.S = (asnfVar.f & 16777215) | (-16777216);
            this.T = new ColorDrawable((asnfVar.d & 16777215) | (-234881024));
        } else {
            this.R = this.B;
            this.S = this.C;
            this.T = new ColorDrawable(this.D);
        }
        TextView textView = this.l;
        if ((aubwVar.b & 1) != 0) {
            aqygVar = aubwVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.m;
        int i = aubwVar.b;
        if ((i & 4) != 0) {
            aqygVar2 = aubwVar.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else if ((i & 2) != 0) {
            aqygVar2 = aubwVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        if ((aubwVar.b & 33554432) != 0) {
            aqygVar3 = aubwVar.v;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        Spanned b = ajcq.b(aqygVar3);
        this.e.setText(b);
        whu.I(this.e, this.i && !TextUtils.isEmpty(b));
        DurationBadgeView durationBadgeView = this.p;
        if ((aubwVar.b & 16) != 0) {
            aqygVar4 = aubwVar.g;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
        } else {
            aqygVar4 = null;
        }
        Spanned b2 = ajcq.b(aqygVar4);
        if ((aubwVar.b & 16) != 0) {
            aqygVar5 = aubwVar.g;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
        } else {
            aqygVar5 = null;
        }
        fkc.m(durationBadgeView, b2, ajcq.i(aqygVar5), aubwVar.h, null);
        TextView textView3 = this.o;
        if ((aubwVar.b & 2048) != 0 && (aqygVar6 = aubwVar.n) == null) {
            aqygVar6 = aqyg.a;
        }
        whu.G(textView3, ajcq.b(aqygVar6));
        ajjz ajjzVar = this.k;
        ImageView imageView = this.r;
        avgg avggVar5 = aubwVar.f;
        if (avggVar5 == null) {
            avggVar5 = avgg.a;
        }
        ajjzVar.k(imageView, avggVar5, this.v);
        atdf atdfVar = aubwVar.q;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) == 0) {
            whu.I(this.s, false);
            yny.z(this.l, yny.q(this.a.getResources().getDimensionPixelSize(R.dimen.compact_playlist_panel_video_title_margin_end_when_no_three_dots)), ViewGroup.MarginLayoutParams.class);
        } else {
            whu.I(this.s, true);
            this.s.setOnClickListener(new View.OnClickListener() { // from class: mke
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mkk mkkVar = mkk.this;
                    aubw aubwVar2 = aubwVar;
                    aahd aahdVar2 = aahdVar;
                    acra acraVar2 = acraVar;
                    ci ciVar = mkkVar.a;
                    atdf atdfVar2 = aubwVar2.q;
                    if (atdfVar2 == null) {
                        atdfVar2 = atdf.a;
                    }
                    atdc atdcVar = atdfVar2.c;
                    if (atdcVar == null) {
                        atdcVar = atdc.a;
                    }
                    ajxw.b(ciVar, atdcVar, aahdVar2, mkkVar.c, amrz.l("com.google.android.libraries.youtube.innertube.endpoint.tag", aubwVar2, "com.google.android.libraries.youtube.logging.interaction_logger", acraVar2), new knb(acraVar2, 3), mkkVar.d, mkkVar.j);
                }
            });
            yny.z(this.l, yny.q(0), ViewGroup.MarginLayoutParams.class);
        }
        avwi avwiVar = aubwVar.u;
        if (avwiVar == null) {
            avwiVar = avwi.a;
        }
        if ((avwiVar.b & 1) != 0) {
            avwi avwiVar2 = aubwVar.u;
            if (avwiVar2 == null) {
                avwiVar2 = avwi.a;
            }
            ajokVar.f("VideoPresenterConstants.VIDEO_ID", avwiVar2.c);
        }
        this.w.b(ajokVar);
        h();
        Iterator it = aubwVar.w.iterator();
        while (it.hasNext()) {
            auvr auvrVar = (auvr) ((aulq) it.next()).pX(SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer);
            if (auvrVar.c) {
                if (this.H == null) {
                    this.H = g();
                }
                ammvVar = ammv.j(this.H);
            } else if (auvrVar.d) {
                if (this.I == null) {
                    this.I = g();
                }
                ammvVar = ammv.j(this.I);
            } else {
                ammvVar = amlr.a;
            }
            if (ammvVar.h()) {
                ((mvf) ammvVar.c()).h = ColorStateList.valueOf(this.R);
                ((mvf) ammvVar.c()).k(auvrVar);
                this.t.addView(((mvf) ammvVar.c()).c);
            }
        }
        i();
        this.K = (glh) ajokVar.c("PLAYLIST_CURRENT_VIDEO_MONITOR");
        this.M = aubwVar.o;
        this.N = aubwVar.k;
        this.f = e();
        d();
        glh glhVar = this.K;
        if (glhVar != null) {
            glhVar.c(this.x);
        }
        if ((aubwVar.b & 32) != 0) {
            ajjz ajjzVar2 = this.k;
            ImageView imageView2 = this.n;
            avgg avggVar6 = aubwVar.i;
            if (avggVar6 == null) {
                avggVar6 = avgg.a;
            }
            ajjzVar2.k(imageView2, avggVar6, this.v);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        Drawable drawable;
        View view = this.b;
        if (this.f) {
            if (this.y.d()) {
                if (this.O == null) {
                    akba a = akba.a(this.a);
                    a.a = wbs.Q(this.a, R.attr.ytTouchResponse);
                    a.b = this.T;
                    this.O = a.b();
                }
                drawable = this.O;
            } else {
                drawable = this.T;
            }
        } else if (this.y.d()) {
            if (this.P == null) {
                akba a2 = akba.a(this.a);
                a2.a = wbs.Q(this.a, R.attr.ytTouchResponse);
                this.P = a2.b();
            }
            drawable = this.P;
        } else {
            drawable = null;
        }
        view.setBackground(drawable);
        this.l.setTextColor(this.f ? this.R : this.B);
        this.m.setTextColor(this.f ? this.S : this.C);
        this.e.setTextColor(this.f ? this.S : this.C);
        this.o.setTextColor(this.f ? this.S : this.C);
        this.s.setImageTintList(ColorStateList.valueOf(this.f ? this.R : this.B));
        if (this.f && this.t.getChildCount() == 0) {
            if (this.f236J == null) {
                this.f236J = amru.s(f(true), f(false));
            }
            amxe it = ((amru) this.f236J).iterator();
            while (it.hasNext()) {
                this.t.addView((View) it.next());
            }
        }
        i();
        if (this.f) {
            this.q.setVisibility(0);
            if (!this.Q) {
                bxj a3 = bxj.a(this.b.getContext(), R.drawable.audio_indicator_24dp_animation);
                this.h = a3;
                this.q.setImageDrawable(a3);
                this.g = new Runnable() { // from class: mki
                    @Override // java.lang.Runnable
                    public final void run() {
                        mkk mkkVar = mkk.this;
                        mkkVar.h.start();
                        mkkVar.b.postDelayed(mkkVar.g, 2140L);
                    }
                };
                this.Q = true;
            }
            this.h.start();
            this.b.postDelayed(this.g, 2140L);
        } else {
            this.b.removeCallbacks(this.g);
            this.q.setVisibility(8);
            bxj bxjVar = this.h;
            if (bxjVar != null) {
                bxjVar.stop();
            }
        }
        whu.I(this.p, !this.f);
    }
}
