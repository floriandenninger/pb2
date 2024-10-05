package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwg implements ajom {
    public final View a;
    public boolean b;
    private final Context c;
    private final View d;
    private final ajjz e;
    private final TextView f;
    private final ImageView g;
    private final TextView h;
    private final ImageView i;
    private final View j;
    private final ImageView k;
    private final ajuw l;
    private final ajoi m;
    private final ajjv n;
    private final gag o;
    private final glg p = new glg() { // from class: mwd
        @Override // defpackage.glg
        public final void a() {
            mwg mwgVar = mwg.this;
            boolean z = mwgVar.b;
            boolean e = mwgVar.e();
            mwgVar.b = e;
            if (z != e) {
                mwgVar.d();
            }
        }
    };
    private final akbd q;
    private TextView r;
    private ImageView s;
    private jru t;
    private glh u;
    private String v;
    private boolean w;
    private Drawable x;
    private Drawable y;
    private final ohg z;

    public mwg(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, ohg ohgVar, akbd akbdVar, ViewGroup viewGroup, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = context;
        this.e = ajjzVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.playlist_panel_video_item, viewGroup, false);
        this.d = inflate;
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.i = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.j = inflate.findViewById(R.id.thumbnail_border);
        this.g = (ImageView) inflate.findViewById(R.id.selected_position_indicator);
        this.h = (TextView) inflate.findViewById(R.id.duration);
        this.r = (TextView) inflate.findViewById(R.id.unplayable_reason);
        this.s = (ImageView) inflate.findViewById(R.id.unplayable_overlay);
        View findViewById = inflate.findViewById(R.id.thumbnail_layout);
        this.a = findViewById;
        this.k = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
        this.l = ajuwVar;
        this.z = ohgVar;
        this.q = akbdVar;
        ajju b = ajjzVar.c().b();
        b.c = new mwe(this);
        b.c(false);
        this.n = b.a();
        this.m = new ajoi(aahdVar, inflate);
        this.o = new gag((ViewStub) inflate.findViewById(R.id.standalone_ypc_badge), 0);
        if (ohgVar != null) {
            ViewStub viewStub = (ViewStub) findViewById.findViewById(R.id.offline_thumbnail_badge);
            this.t = viewStub != null ? ohgVar.b(viewStub, null) : null;
        }
    }

    private final void f() {
        ImageView imageView = this.s;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        glh glhVar = this.u;
        if (glhVar != null) {
            glhVar.oU(this.p);
        }
    }

    public final boolean e() {
        glh glhVar = this.u;
        return (glhVar == null || glhVar.b() == null || this.v == null) ? this.w : amkq.b(this.u.b(), this.v);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        apkh apkhVar;
        aqyg aqygVar4;
        aubw aubwVar = ((mwf) obj).a;
        acra acraVar = ajokVar.a;
        aahd aahdVar = (aahd) ajokVar.c("commandRouter");
        if (aahdVar != null) {
            this.m.a = aahdVar;
        }
        ajoi ajoiVar = this.m;
        atdc atdcVar = null;
        if ((aubwVar.b & 256) != 0) {
            apxfVar = aubwVar.m;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, null);
        acraVar.u(new acqx(aubwVar.r), null);
        TextView textView = this.f;
        if ((aubwVar.b & 1) != 0) {
            aqygVar = aubwVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.h;
        if ((aubwVar.b & 16) != 0) {
            aqygVar2 = aubwVar.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView2.setText(ajcq.b(aqygVar2));
        TextView textView3 = this.h;
        if ((aubwVar.b & 16) != 0) {
            aqygVar3 = aubwVar.g;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        textView3.setContentDescription(ajcq.i(aqygVar3));
        this.g.setVisibility(4);
        if ((aubwVar.b & 2048) != 0) {
            this.f.setMaxLines(1);
            this.h.setVisibility(8);
            this.o.a(null);
            avgg avggVar = aubwVar.f;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            if (ahbw.L(avggVar)) {
                f();
            } else {
                if (this.s == null) {
                    this.s = (ImageView) ((ViewStub) this.d.findViewById(R.id.unplayable_overlay_stub)).inflate();
                }
                this.s.setVisibility(0);
            }
            if ((aubwVar.b & 2048) != 0) {
                aqygVar4 = aubwVar.n;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
            } else {
                aqygVar4 = null;
            }
            Spanned b = ajcq.b(aqygVar4);
            if (this.r == null) {
                this.r = (TextView) ((ViewStub) this.d.findViewById(R.id.unplayable_reason_stub)).inflate();
            }
            this.r.setText(b);
            this.r.setVisibility(0);
        } else {
            this.f.setMaxLines(2);
            this.h.setVisibility(0);
            gag gagVar = this.o;
            apkd apkdVar = aubwVar.p;
            if (apkdVar == null) {
                apkdVar = apkd.a;
            }
            if ((apkdVar.b & 1) != 0) {
                apkd apkdVar2 = aubwVar.p;
                if (apkdVar2 == null) {
                    apkdVar2 = apkd.a;
                }
                apkhVar = apkdVar2.c;
                if (apkhVar == null) {
                    apkhVar = apkh.a;
                }
            } else {
                apkhVar = null;
            }
            gagVar.a(apkhVar);
            f();
            TextView textView4 = this.r;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        }
        this.u = (glh) ajokVar.c("PLAYLIST_CURRENT_VIDEO_MONITOR");
        this.v = aubwVar.o;
        this.w = aubwVar.k;
        this.b = e();
        d();
        glh glhVar = this.u;
        if (glhVar != null) {
            glhVar.c(this.p);
        }
        this.a.setBackgroundResource(R.drawable.bg_video_thumb);
        ajjz ajjzVar = this.e;
        ImageView imageView = this.i;
        avgg avggVar2 = aubwVar.f;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        ajjzVar.k(imageView, avggVar2, this.n);
        this.k.setVisibility(0);
        ajuw ajuwVar = this.l;
        ImageView imageView2 = this.k;
        atdf atdfVar = aubwVar.q;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) != 0) {
            atdf atdfVar2 = aubwVar.q;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdcVar = atdfVar2.c;
            if (atdcVar == null) {
                atdcVar = atdc.a;
            }
        }
        ajuwVar.d(imageView2, atdcVar, aubwVar, acraVar);
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
            jru jruVar = this.t;
            if (jruVar == null) {
                return;
            }
            jruVar.b(ajokVar);
        }
    }

    public final void d() {
        if (!this.b) {
            if (this.q.d()) {
                if (this.y == null) {
                    akba a = akba.a(this.c);
                    a.a = wbs.Q(this.c, R.attr.ytTouchResponse);
                    this.y = a.b();
                }
                this.d.setBackground(this.y);
            } else {
                this.d.setBackground(null);
            }
            this.f.setTextColor(wbs.Q(this.c, R.attr.ytTextSecondary));
            this.g.setVisibility(4);
            whu.P(this.i, (int) (this.c.getResources().getFraction(R.fraction.playlist_panel_video_item_thumb_alpha, 1, 1) * 255.0f));
            this.h.setTextColor(wbs.W(this.c, R.attr.ytOverlayTextSecondary).orElse(0));
            whu.I(this.j, false);
            return;
        }
        this.d.setBackgroundColor(wbs.Q(this.c, R.attr.ytBadgeChipBackground));
        if (this.q.d()) {
            if (this.x == null) {
                akba a2 = akba.a(this.c);
                a2.a = wbs.Q(this.c, R.attr.ytTouchResponse);
                a2.b = this.d.getBackground();
                this.x = a2.b();
            }
            this.d.setBackground(this.x);
        }
        this.f.setTextColor(wbs.Q(this.c, R.attr.ytTextPrimary));
        this.g.setVisibility(0);
        whu.P(this.i, (int) (this.c.getResources().getFraction(R.fraction.playlist_panel_video_item_thumb_selected_alpha, 1, 1) * 255.0f));
        this.h.setTextColor(wbs.W(this.c, R.attr.ytOverlayTextPrimary).orElse(0));
        whu.I(this.j, true);
    }
}
