package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jyb implements ypd {
    static final View.AccessibilityDelegate a = new jxz();
    private final azrw A;
    private final jry B;
    private final acqz C;
    private final shf D;
    private final ImageView E;
    private final OfflineArrowView F;
    private final View G;
    private final View H;
    private final axzf I;

    /* renamed from: J, reason: collision with root package name */
    private final ogx f226J;
    public final fjs b;
    public final ypa c;
    public final ajoi d;
    public final azrw e;
    public final fjm f;
    public final fjh g;
    public final jwb h;
    public final jya i = new jya(this);
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final ViewGroup m;
    public final OfflineArrowView n;
    public final View o;
    public fjl p;
    public fjg q;
    public ajok r;
    public ajop s;
    public aqdb t;
    public String u;
    public ajoi v;
    public jrl w;
    public final ajoy x;
    private final Context y;
    private final azrw z;

    public jyb(Context context, fjs fjsVar, azrw azrwVar, azrw azrwVar2, jry jryVar, ypa ypaVar, ajoy ajoyVar, ogx ogxVar, azrw azrwVar3, acqz acqzVar, fjm fjmVar, fjh fjhVar, jwb jwbVar, axzf axzfVar, shf shfVar, View view, ajoi ajoiVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.y = context;
        this.b = fjsVar;
        this.z = azrwVar;
        this.A = azrwVar2;
        this.B = jryVar;
        this.c = ypaVar;
        this.x = ajoyVar;
        this.d = ajoiVar;
        this.f226J = ogxVar;
        this.e = azrwVar3;
        this.C = acqzVar;
        this.f = fjmVar;
        this.g = fjhVar;
        this.h = jwbVar;
        this.I = axzfVar;
        this.D = shfVar;
        this.j = (TextView) view.findViewById(R.id.title);
        this.k = (TextView) view.findViewById(R.id.author);
        this.l = (TextView) view.findViewById(R.id.details);
        this.E = (ImageView) view.findViewById(R.id.thumbnail);
        this.F = (OfflineArrowView) view.findViewById(R.id.offline_arrow);
        this.o = view.findViewById(R.id.contextual_menu_anchor);
        this.m = (ViewGroup) view.findViewById(R.id.offline_candidate_layout);
        this.n = (OfflineArrowView) view.findViewById(R.id.offline_candidate_arrow);
        this.G = view.findViewById(R.id.duration);
        this.H = view.findViewById(R.id.resume_playback_inflated_overlay);
    }

    private final void d(boolean z) {
        aqdb aqdbVar;
        if (this.H == null || (aqdbVar = this.t) == null) {
            return;
        }
        avft O = mcy.O(aqdbVar.x);
        boolean z2 = false;
        if (z && O != null && O.c > 0) {
            z2 = true;
        }
        whu.I(this.H, z2);
    }

    private final boolean e() {
        ajok ajokVar = this.r;
        return ajokVar != null && TextUtils.equals("downloads_page_recommendations_item_section_identifier", ajokVar.k("downloads_page_section_key"));
    }

    private final void g(agnv agnvVar, int i) {
        String m = agnvVar.m();
        atsb j = agnvVar.j();
        aone createBuilder = OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.instance;
        m.getClass();
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c = 1;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d = m;
        createBuilder.copyOnWrite();
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint2 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.instance;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.f = i - 1;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.b |= 8;
        if (i == 2) {
            if (j != null) {
                aone builder = j.toBuilder();
                builder.copyOnWrite();
                atsb atsbVar = (atsb) builder.instance;
                atsbVar.b &= -129;
                atsbVar.i = atsb.a.i;
                atsb atsbVar2 = (atsb) builder.build();
                aong aongVar = (aong) aulq.a.createBuilder();
                aongVar.e(OfflineabilityRendererOuterClass.offlineabilityRenderer, atsbVar2);
                createBuilder.copyOnWrite();
                OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint3 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.instance;
                aulq aulqVar = (aulq) aongVar.build();
                aulqVar.getClass();
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint3.g = aulqVar;
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint3.b |= 32;
            }
            final aong aongVar2 = (aong) apxf.a.createBuilder();
            aongVar2.e(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.build());
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.C.mM());
            this.n.setOnClickListener(new View.OnClickListener() { // from class: jxw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jyb jybVar = jyb.this;
                    aong aongVar3 = aongVar2;
                    ((aahd) jybVar.e.get()).c((apxf) aongVar3.build(), hashMap);
                }
            });
            this.n.setContentDescription(this.y.getString(R.string.accessibility_offline_button_save));
            return;
        }
        this.n.setOnClickListener(new jxv(this, 0));
    }

    public final int a(int i) {
        TypedValue typedValue = new TypedValue();
        if (this.y.getTheme().resolveAttribute(i, typedValue, true)) {
            return this.y.getResources().getColor(typedValue.resourceId);
        }
        return -1;
    }

    public final void b() {
        aqyg aqygVar;
        String str = this.u;
        if (ammx.e(str)) {
            return;
        }
        agnv e = ((agof) this.z.get()).a().m().e(str);
        if (e == null || (e.i() != agnq.CANDIDATE && (e.i() != agnq.PLAYABLE || mcy.au(this.I, e.j)))) {
            if (!e() && (e == null || (!e.v() && (!mcy.au(this.I, e.j) || mcy.X(e.j, this.D) == 0)))) {
                this.j.setTextColor(wbs.W(this.y, R.attr.ytTextDisabled).orElse(0));
            } else {
                this.j.setTextColor(wbs.W(this.y, R.attr.ytTextPrimary).orElse(0));
            }
            jql c = this.B.c(!e() ? 1 : 0, e);
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
            whu.G(this.l, sb.toString());
            int length = c.c.length;
            this.l.setSingleLine(length <= 1);
            this.l.setMaxLines(length);
            this.l.setTextColor(wbs.W(this.y, c.a).orElse(0));
            TextView textView = this.l;
            textView.setTypeface(textView.getTypeface(), 0);
        } else {
            this.j.setTextColor(wbs.W(this.y, R.attr.ytTextPrimary).orElse(0));
            whu.I(this.l, false);
        }
        if (e == null || !e.v() || e()) {
            whu.I(this.k, true);
            aqdb aqdbVar = this.t;
            aqdbVar.getClass();
            TextView textView2 = this.k;
            if ((aqdbVar.b & 16) != 0) {
                aqygVar = aqdbVar.f;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView2.setText(ajcq.b(aqygVar));
        } else {
            whu.I(this.k, false);
        }
        agnq i2 = e == null ? agnq.DELETED : e.i();
        if (i2 == agnq.PLAYABLE || e()) {
            c();
        } else if (i2.x || i2 == agnq.TRANSFER_PENDING_USER_APPROVAL) {
            boolean z = e == null || e.y();
            this.E.setAlpha(0.2f);
            whu.I(this.F, true);
            whu.I(this.G, false);
            View view = this.H;
            if (view != null) {
                whu.I(view, false);
            }
            this.F.k();
            int ordinal = i2.ordinal();
            if (ordinal == 0) {
                this.F.b(R.drawable.ic_offline_refresh);
            } else if (ordinal == 5) {
                this.F.c(R.drawable.ic_offline_sync_playlist);
            } else if (z) {
                this.F.b(R.drawable.ic_offline_refresh);
            } else {
                this.F.b(R.drawable.ic_offline_error);
            }
        } else {
            e.getClass();
            this.E.setAlpha(0.2f);
            whu.I(this.F, true);
            whu.I(this.G, false);
            View view2 = this.H;
            if (view2 != null) {
                whu.I(view2, false);
            }
            OfflineArrowView offlineArrowView = this.F;
            offlineArrowView.d = 2;
            offlineArrowView.i(e.c());
            if (e.v()) {
                this.E.setAlpha(1.0f);
                this.F.f();
                whu.I(this.G, true);
                d(e.q((adxr) this.A.get()));
            } else {
                int ordinal2 = e.i().ordinal();
                if (ordinal2 == 3) {
                    this.F.g();
                } else if (ordinal2 == 4 || ordinal2 == 6 || ordinal2 == 8) {
                    this.F.h();
                } else if (ordinal2 == 10) {
                    this.F.b(R.drawable.ic_offline_paused);
                    this.F.k();
                } else {
                    this.F.e();
                }
            }
        }
        if (e == null || !e()) {
            whu.I(this.o, true);
            whu.I(this.n, false);
            return;
        }
        whu.I(this.o, false);
        whu.I(this.m, true);
        this.m.setImportantForAccessibility(2);
        this.n.setAccessibilityDelegate(null);
        if (this.w == null) {
            ogx ogxVar = this.f226J;
            String m = e.m();
            OfflineArrowView offlineArrowView2 = this.n;
            axzg axzgVar = (axzg) ogxVar.b.get();
            axzgVar.getClass();
            fjs fjsVar = (fjs) ogxVar.d.get();
            fjsVar.getClass();
            azrw azrwVar = ogxVar.a;
            offlineArrowView2.getClass();
            this.w = new jri(axzgVar, fjsVar, azrwVar, 0, m, offlineArrowView2, null, null, null);
        }
        this.w.b(jqm.b(e));
        agnq i3 = e.i();
        int ordinal3 = i3.ordinal();
        if (ordinal3 == 2) {
            g(e, 2);
        } else if (ordinal3 == 3) {
            g(e, 4);
        } else if (ordinal3 != 10) {
            if (!i3.x || !e.y()) {
                this.n.setAccessibilityDelegate(a);
            } else {
                g(e, 5);
            }
        } else {
            g(e, 6);
        }
        this.m.setOnClickListener(new jxv(this, 1));
    }

    public final void c() {
        this.E.setAlpha(1.0f);
        whu.I(this.F, false);
        whu.I(this.G, true);
        d(true);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yro.class, agkk.class, agla.class};
        }
        if (i == 0) {
            b();
            return null;
        }
        if (i == 1) {
            b();
            return null;
        }
        if (i == 2) {
            agla aglaVar = (agla) obj;
            if (ammx.e(this.u) || !this.u.equals(aglaVar.a.m())) {
                return null;
            }
            b();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
