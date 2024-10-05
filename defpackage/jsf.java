package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jsf implements View.OnClickListener, ajom, ypd {
    private final OfflineArrowView A;
    private String B;
    private int C;
    private acra D;
    private fjl E;
    private final ohg F;
    private final axzg G;
    private final axzf H;
    public final Context a;
    public final azrw b;
    public final ajjz c;
    public final TextView d;
    public final View e;
    public final View f;
    public final ImageView g;
    public agnp h;
    public final jru i;
    public gnz j;
    public View k;
    public final fiu l;
    private final ajop m;
    private final ypa n;
    private final azrw o;
    private final jry p;
    private final aahd q;
    private final fjm r;
    private final ajuw s;
    private final jti t;
    private final shf u;
    private final TextView v;
    private final TextView w;
    private final TextView x;
    private final View y;
    private final View z;

    public jsf(Context context, gma gmaVar, ypa ypaVar, azrw azrwVar, azrw azrwVar2, ajjz ajjzVar, ohg ohgVar, jry jryVar, aahd aahdVar, fjm fjmVar, ajuw ajuwVar, jti jtiVar, shf shfVar, axzf axzfVar, axzg axzgVar, fiu fiuVar, ViewGroup viewGroup, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = context;
        this.m = gmaVar;
        this.n = ypaVar;
        this.b = azrwVar;
        this.o = azrwVar2;
        this.c = ajjzVar;
        this.F = ohgVar;
        this.p = jryVar;
        this.q = aahdVar;
        this.r = fjmVar;
        this.s = ajuwVar;
        this.t = jtiVar;
        this.u = shfVar;
        this.H = axzfVar;
        this.G = axzgVar;
        this.l = fiuVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.offline_video_item, viewGroup, false);
        this.y = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.d = textView;
        textView.setMaxLines(2);
        this.v = (TextView) inflate.findViewById(R.id.duration);
        this.w = (TextView) inflate.findViewById(R.id.author);
        TextView textView2 = (TextView) inflate.findViewById(R.id.details);
        this.x = textView2;
        textView2.setMaxLines(2);
        View findViewById = inflate.findViewById(R.id.thumbnail_layout);
        this.e = findViewById;
        this.g = (ImageView) findViewById.findViewById(R.id.thumbnail);
        this.A = (OfflineArrowView) inflate.findViewById(R.id.offline_arrow);
        this.f = findViewById.findViewById(R.id.resume_playback_overlay);
        this.z = inflate.findViewById(R.id.contextual_menu_anchor);
        gmaVar.c(inflate);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.offline_badge);
        this.i = viewStub != null ? ohgVar.b(viewStub, null) : null;
    }

    private final asuh h() {
        aong aongVar = (aong) asuh.b.createBuilder();
        aone createBuilder = apvd.a.createBuilder();
        int i = this.C;
        createBuilder.copyOnWrite();
        apvd apvdVar = (apvd) createBuilder.instance;
        apvdVar.b |= 4;
        apvdVar.e = i;
        int i2 = acrb.OFFLINE_COMPACT_VIDEO.Jk;
        createBuilder.copyOnWrite();
        apvd apvdVar2 = (apvd) createBuilder.instance;
        apvdVar2.b |= 1;
        apvdVar2.c = i2;
        aone createBuilder2 = apve.a.createBuilder();
        aone createBuilder3 = apvj.a.createBuilder();
        agnp agnpVar = this.h;
        agnpVar.getClass();
        aomf z = aomf.z(agnpVar.f());
        createBuilder3.copyOnWrite();
        apvj apvjVar = (apvj) createBuilder3.instance;
        apvjVar.b |= 1;
        apvjVar.c = z;
        createBuilder2.copyOnWrite();
        apve apveVar = (apve) createBuilder2.instance;
        apvj apvjVar2 = (apvj) createBuilder3.build();
        apvjVar2.getClass();
        apveVar.d = apvjVar2;
        apveVar.b |= 2;
        apve apveVar2 = (apve) createBuilder2.build();
        createBuilder.copyOnWrite();
        apvd apvdVar3 = (apvd) createBuilder.instance;
        apveVar2.getClass();
        apvdVar3.f = apveVar2;
        apvdVar3.b |= 8;
        aongVar.copyOnWrite();
        asuh asuhVar = (asuh) aongVar.instance;
        apvd apvdVar4 = (apvd) createBuilder.build();
        apvdVar4.getClass();
        asuhVar.h = apvdVar4;
        asuhVar.c |= 8;
        int[] iArr = {1, 4};
        aone createBuilder4 = awau.a.createBuilder();
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = iArr[i3];
            long j = ((awau) createBuilder4.instance).c;
            if (i4 != 0) {
                createBuilder4.copyOnWrite();
                awau awauVar = (awau) createBuilder4.instance;
                awauVar.b |= 1;
                awauVar.c = j | i4;
            } else {
                throw null;
            }
        }
        awau awauVar2 = (awau) createBuilder4.build();
        aongVar.copyOnWrite();
        asuh asuhVar2 = (asuh) aongVar.instance;
        awauVar2.getClass();
        asuhVar2.e = awauVar2;
        asuhVar2.c |= 2;
        return (asuh) aongVar.build();
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.m).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.n.m(this);
        fjl fjlVar = this.E;
        if (fjlVar != null) {
            this.r.b(fjlVar);
        }
        this.B = null;
    }

    public final void d(agnv agnvVar) {
        jql c = this.p.c(1, agnvVar);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            String[] strArr = c.c;
            if (i >= strArr.length) {
                break;
            }
            sb.append(strArr[i]);
            if (i < c.c.length - 1) {
                sb.append('\n');
                i = 0;
            }
            i++;
        }
        this.x.setText(sb.toString());
        this.x.setTextColor(wbs.W(this.a, c.a).orElse(0));
        TextView textView = this.x;
        textView.setTypeface(textView.getTypeface(), 0);
        agnq i2 = agnvVar == null ? agnq.DELETED : agnvVar.i();
        if (i2 == agnq.PLAYABLE) {
            this.g.setAlpha(1.0f);
            this.d.setTextColor(wbs.W(this.a, R.attr.ytTextPrimary).orElse(0));
            this.v.setVisibility(0);
            this.A.setVisibility(8);
        } else if (i2.x || i2 == agnq.TRANSFER_PENDING_USER_APPROVAL) {
            boolean z = agnvVar == null || agnvVar.y();
            if (i2 == agnq.DELETED) {
                this.g.setAlpha(0.0f);
            } else {
                this.g.setAlpha(0.2f);
            }
            this.d.setTextColor(wbs.W(this.a, R.attr.ytTextSecondary).orElse(0));
            this.v.setVisibility(8);
            this.A.setVisibility(0);
            this.A.k();
            int ordinal = i2.ordinal();
            if (ordinal == 0) {
                this.A.b(R.drawable.ic_offline_refresh);
            } else if (ordinal == 5) {
                this.A.c(R.drawable.ic_offline_sync_playlist);
            } else if (z) {
                this.A.b(R.drawable.ic_offline_refresh);
            } else {
                this.A.b(R.drawable.ic_offline_error);
            }
        } else if (agnvVar != null) {
            this.v.setVisibility(8);
            this.A.setVisibility(0);
            OfflineArrowView offlineArrowView = this.A;
            offlineArrowView.d = 2;
            offlineArrowView.i(agnvVar.c());
            if (agnvVar.v()) {
                this.A.f();
                this.g.setAlpha(1.0f);
                this.d.setTextColor(wbs.W(this.a, R.attr.ytTextPrimary).orElse(0));
                this.v.setVisibility(0);
            } else {
                this.g.setAlpha(0.2f);
                this.d.setTextColor(wbs.W(this.a, R.attr.ytTextSecondary).orElse(0));
                int ordinal2 = agnvVar.i().ordinal();
                if (ordinal2 == 3) {
                    this.A.g();
                } else if (ordinal2 == 4 || ordinal2 == 8) {
                    this.A.h();
                } else if (ordinal2 == 10) {
                    this.A.b(R.drawable.ic_offline_paused);
                    this.A.k();
                } else {
                    this.A.e();
                }
            }
        } else {
            zga.b("video snapshot is null.");
        }
        if (this.k != null) {
            whu.I(this.k, i2 == agnq.PLAYABLE || (agnvVar != null && agnvVar.v() && agnvVar.q((adxr) this.o.get())));
        }
        TextView textView2 = this.w;
        whu.I(textView2, c.c.length <= 1 && !ammx.e(textView2.getText().toString()));
    }

    public final void e(agnv agnvVar) {
        this.v.setText(agnvVar.n());
        if (this.w != null) {
            agnb h = agnvVar.h();
            if (h == null) {
                whu.G(this.w, null);
            } else {
                whu.G(this.w, h.b);
            }
        }
        this.c.h(this.g, agnvVar.k());
    }

    public final void g() {
        agsw m = ((agof) this.b.get()).a().m();
        agnp agnpVar = this.h;
        agnpVar.getClass();
        d(m.e(agnpVar.f()));
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(final ajok ajokVar, Object obj) {
        acra acraVar;
        final agnp agnpVar = (agnp) obj;
        agnpVar.getClass();
        this.h = agnpVar;
        this.n.g(this);
        this.m.d(this);
        this.D = ajokVar.a;
        ((RelativeLayout.LayoutParams) this.e.getLayoutParams()).width = this.a.getResources().getDimensionPixelSize(R.dimen.offline_video_item_thumbnail_width);
        agsn a = ((agof) this.b.get()).a();
        this.B = ajokVar.k("OfflineVideoPresenter.playlistId");
        final agnv e = a.m().e(agnpVar.f());
        aone createBuilder = atdc.a.createBuilder();
        atde d = this.t.d(agnpVar, this.B);
        if (d != null) {
            aone createBuilder2 = atda.a.createBuilder();
            createBuilder2.copyOnWrite();
            atda atdaVar = (atda) createBuilder2.instance;
            atdaVar.d = d;
            atdaVar.b |= 2;
            createBuilder.aE(createBuilder2);
        }
        this.s.e(this.y, this.z, (atdc) createBuilder.build(), agnpVar, ajokVar.a);
        this.C = ajokVar.b("position", 0);
        ajokVar.f("VideoPresenterConstants.VIDEO_ID", agnpVar.f());
        if (this.G.y() && (acraVar = this.D) != null) {
            acraVar.n(new acqx(h()));
        }
        this.l.b().G(new ayrv() { // from class: jse
            @Override // defpackage.ayrv
            public final Object a(Object obj2) {
                return Boolean.valueOf(((amsx) obj2).contains(agnp.this.f()));
            }
        }).V(new ayrs() { // from class: jsc
            @Override // defpackage.ayrs
            public final void a(Object obj2) {
                jsf jsfVar = jsf.this;
                agnv agnvVar = e;
                ajok ajokVar2 = ajokVar;
                if (!((Boolean) obj2).booleanValue()) {
                    if (agnvVar != null) {
                        TextView textView = jsfVar.d;
                        if (textView != null) {
                            textView.setText(agnvVar.o(jsfVar.a));
                        }
                        jsfVar.e(agnvVar);
                    } else {
                        TextView textView2 = jsfVar.d;
                        agnp agnpVar2 = jsfVar.h;
                        agnpVar2.getClass();
                        textView2.setText(agnpVar2.j());
                    }
                    jru jruVar = jsfVar.i;
                    if (jruVar != null) {
                        jruVar.b(ajokVar2);
                    }
                    if (jsfVar.f != null) {
                        int V = agnvVar != null ? mcy.V(agnvVar.f(), agnvVar.h) : 0;
                        aone createBuilder3 = avft.a.createBuilder();
                        createBuilder3.copyOnWrite();
                        avft avftVar = (avft) createBuilder3.instance;
                        avftVar.b |= 1;
                        avftVar.c = V;
                        avft avftVar2 = (avft) createBuilder3.build();
                        if (jsfVar.j == null) {
                            jsfVar.j = new gnz((ViewStub) jsfVar.f);
                        }
                        jsfVar.j.a(avftVar2);
                        jsfVar.k = jsfVar.e.findViewById(R.id.resume_playback_inflated_overlay);
                    }
                    jsfVar.d(agnvVar);
                    return;
                }
                TextView textView3 = jsfVar.d;
                if (textView3 != null && agnvVar != null) {
                    textView3.setText(agnvVar.o(jsfVar.a));
                }
                jsfVar.d(null);
            }
        });
        if (this.E == null) {
            this.E = new fjl() { // from class: jsa
                @Override // defpackage.fjl
                public final void a() {
                    jsf.this.g();
                }
            };
        }
        this.r.a(this.E);
        this.m.e(ajokVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        apxf g;
        int i2;
        acra acraVar;
        this.h.getClass();
        if (this.G.y() && (acraVar = this.D) != null) {
            acraVar.I(3, new acqx(h()), null);
        }
        agsn a = ((agof) this.b.get()).a();
        String f = this.h.f();
        agnv e = a.m().e(f);
        String str = "PPSV";
        if (e != null && (e.i() == agnq.PLAYABLE || e.v())) {
            String str2 = this.B;
            if (str2 == null) {
                if (!e.e) {
                    Set n = a.i().n(f);
                    str = n.isEmpty() ? null : (String) n.iterator().next();
                }
                i2 = -1;
            } else {
                i2 = this.C;
                str = str2;
            }
            if (str != null) {
                float U = mcy.U(e.f(), e.h);
                if (this.H.l()) {
                    ammv ai = mcy.ai(e, false, this.u, U, i2, str);
                    if (ai.h()) {
                        this.q.a((apxf) ai.c());
                        return;
                    } else {
                        this.q.a(aify.g(f, str, i2, U));
                        return;
                    }
                }
                this.q.a(aify.g(f, str, i2, U));
                return;
            }
            String valueOf = String.valueOf(f);
            zga.b(valueOf.length() != 0 ? "Trying to play video that is not single nor in a list: ".concat(valueOf) : new String("Trying to play video that is not single nor in a list: "));
            return;
        }
        if (!this.H.l() || e == null || e.i() != agnq.ERROR_POLICY) {
            this.q.a(aify.f(f, this.B, this.C));
            return;
        }
        String str3 = this.B;
        if (str3 == null) {
            if (!e.e) {
                Set n2 = a.i().n(f);
                str = n2.isEmpty() ? null : (String) n2.iterator().next();
            }
            i = -1;
        } else {
            i = this.C;
            str = str3;
        }
        if (str != null) {
            float U2 = mcy.U(e.f(), e.h);
            aahd aahdVar = this.q;
            ammv ai2 = mcy.ai(e, false, this.u, U2, i, str);
            if (ai2.h()) {
                g = (apxf) ai2.c();
            } else {
                g = aify.g(f, str, i, U2);
            }
            aahdVar.a(g);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        agnv e;
        switch (i) {
            case -1:
                return new Class[]{jqc.class, jqd.class, yro.class, agkk.class, agla.class, agli.class};
            case 0:
                agnp agnpVar = this.h;
                agnpVar.getClass();
                if (!agnpVar.f().equals(((jqc) obj).a)) {
                    return null;
                }
                d(null);
                return null;
            case 1:
                jqd jqdVar = (jqd) obj;
                agnp agnpVar2 = this.h;
                agnpVar2.getClass();
                if (!agnpVar2.f().equals(jqdVar.a) || (e = ((agof) this.b.get()).a().m().e(jqdVar.a)) == null) {
                    return null;
                }
                e(e);
                d(e);
                return null;
            case 2:
                g();
                return null;
            case 3:
                g();
                return null;
            case 4:
                agla aglaVar = (agla) obj;
                agnp agnpVar3 = this.h;
                agnpVar3.getClass();
                if (!agnpVar3.f().equals(aglaVar.a.m())) {
                    return null;
                }
                e(aglaVar.a);
                d(aglaVar.a);
                return null;
            case 5:
                final agli agliVar = (agli) obj;
                agnp agnpVar4 = this.h;
                agnpVar4.getClass();
                if (!agnpVar4.f().equals(agliVar.a.m())) {
                    return null;
                }
                if (this.g.getDrawable() == null) {
                    this.c.h(this.g, agliVar.a.k());
                }
                this.l.b().G(new ayrv() { // from class: jsd
                    @Override // defpackage.ayrv
                    public final Object a(Object obj2) {
                        return Boolean.valueOf(((amsx) obj2).contains(agli.this.a.m()));
                    }
                }).V(new ayrs() { // from class: jsb
                    @Override // defpackage.ayrs
                    public final void a(Object obj2) {
                        jsf jsfVar = jsf.this;
                        agli agliVar2 = agliVar;
                        if (((Boolean) obj2).booleanValue()) {
                            return;
                        }
                        jsfVar.d(agliVar2.a);
                    }
                });
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
