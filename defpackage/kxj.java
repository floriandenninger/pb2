package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.playlist.PlaylistHeaderActionBarView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kxj implements ajom, ypd {
    final LinearLayout A;
    final ViewStub B;
    final TextView C;
    public aubg D;
    public apxf E;
    public Boolean F;
    private final Activity G;
    private final ypa H;
    private final ajjz I;

    /* renamed from: J, reason: collision with root package name */
    private final ggy f230J;
    private final ajyd K;
    private final fte L;
    private final ajut M;
    private final fjs N;
    private final jvl O;
    private final azrw P;
    private final acsf Q;
    private final int R;
    private final ajyf S;
    private final ftw T;
    private final List U;
    private final gls V;
    private final ftw W;
    private final TextView X;
    private final FrameLayout Y;
    private final PlaylistHeaderActionBarView Z;
    public final aahd a;
    private final gaf aa;
    private ftd ab;
    private jsh ac;
    private ghf ad;
    private final ogx ae;
    private final ajyw af;
    final ajyf b;
    final ftw c;
    public final fyp d;
    final ViewGroup e;
    final LinearLayout f;
    final TextView g;
    final TextView h;
    final TextView i;
    final TextView j;
    final TextView k;
    final LinearLayout l;
    final TextView m;
    final ImageView n;
    final ImageView o;
    final ImageView p;
    final ImageView q;
    final ImageView r;
    final ImageView s;
    final ImageView t;
    final OfflineArrowView u;
    final ViewGroup v;
    final View.OnLayoutChangeListener w;
    final TextView x;
    final TextView y;
    final FrameLayout z;

    public kxj(Activity activity, ypa ypaVar, ajjz ajjzVar, final aahd aahdVar, final kyo kyoVar, ggy ggyVar, fte fteVar, fvf fvfVar, ajyg ajygVar, akpq akpqVar, ajut ajutVar, fjs fjsVar, jvl jvlVar, final agyr agyrVar, azrw azrwVar, jgp jgpVar, acsf acsfVar, ogx ogxVar, ajyw ajywVar, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.G = activity;
        this.H = ypaVar;
        this.I = ajjzVar;
        this.a = aahdVar;
        this.f230J = ggyVar;
        this.L = fteVar;
        this.M = ajutVar;
        this.N = fjsVar;
        this.O = jvlVar;
        this.P = azrwVar;
        this.Q = acsfVar;
        this.ae = ogxVar;
        this.af = ajywVar;
        ViewGroup viewGroup = (ViewGroup) View.inflate(activity, R.layout.playlist_header, null);
        this.e = viewGroup;
        this.v = (ViewGroup) viewGroup.findViewById(R.id.sort_playlist_container);
        this.f = (LinearLayout) viewGroup.findViewById(R.id.playlist_data);
        TextView textView = (TextView) viewGroup.findViewById(R.id.playlist_title);
        this.g = textView;
        this.h = (TextView) viewGroup.findViewById(R.id.playlist_subtitle);
        this.i = (TextView) viewGroup.findViewById(R.id.seasons);
        this.k = (TextView) viewGroup.findViewById(R.id.playlist_tvshow_metadata);
        this.j = (TextView) viewGroup.findViewById(R.id.playlist_channel);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.playlist_description);
        this.x = textView2;
        this.l = (LinearLayout) viewGroup.findViewById(R.id.sub_header_row);
        this.m = (TextView) viewGroup.findViewById(R.id.playlist_size);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.share_button);
        this.n = imageView;
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.edit_button);
        this.o = imageView2;
        ImageView imageView3 = (ImageView) viewGroup.findViewById(R.id.shuffle_button);
        this.p = imageView3;
        this.q = (ImageView) viewGroup.findViewById(R.id.private_playlist_indicator);
        this.u = (OfflineArrowView) viewGroup.findViewById(R.id.offline_button);
        this.r = (ImageView) viewGroup.findViewById(R.id.hero_image);
        this.s = (ImageView) viewGroup.findViewById(R.id.channel_avatar);
        this.t = (ImageView) viewGroup.findViewById(R.id.expand_button);
        PlaylistHeaderActionBarView playlistHeaderActionBarView = (PlaylistHeaderActionBarView) viewGroup.findViewById(R.id.actions_bar);
        this.Z = playlistHeaderActionBarView;
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.action_button);
        this.X = textView3;
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.offline_sync_button);
        this.C = textView4;
        this.Y = (FrameLayout) viewGroup.findViewById(R.id.footer);
        TextView textView5 = (TextView) viewGroup.findViewById(R.id.primary_button_label);
        this.y = textView5;
        this.z = (FrameLayout) viewGroup.findViewById(R.id.primary_button_container);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.secondary_button_container);
        this.A = linearLayout;
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.metadata_badge);
        this.B = viewStub;
        ImageView imageView4 = (ImageView) viewGroup.findViewById(R.id.save_button);
        this.aa = ajoyVar.J(activity, viewStub);
        ggyVar.b(viewGroup.findViewById(R.id.like_button));
        this.S = ajygVar.a(textView3);
        this.b = ajygVar.a(textView5);
        ftw c = fvfVar.c(linearLayout);
        this.c = c;
        c.c = (TextView) linearLayout.findViewById(R.id.secondary_toggle_button_text);
        c.b = (ImageView) linearLayout.findViewById(R.id.secondary_toggle_button_icon);
        ftw c2 = fvfVar.c(imageView4);
        this.W = c2;
        c2.b = imageView4;
        this.V = jgpVar.c((FloatingActionButton) viewGroup.findViewById(R.id.playlist_fab));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: kxb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                kxj kxjVar = kxj.this;
                aahd aahdVar2 = aahdVar;
                kyo kyoVar2 = kyoVar;
                aubg aubgVar = kxjVar.D;
                if (aubgVar == null) {
                    return;
                }
                if (kxj.l(aubgVar)) {
                    aubh aubhVar = kxjVar.D.I;
                    if (aubhVar == null) {
                        aubhVar = aubh.a;
                    }
                    apmg apmgVar = aubhVar.b;
                    if (apmgVar == null) {
                        apmgVar = apmg.a;
                    }
                    apxf apxfVar = apmgVar.o;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar2.a(apxfVar);
                    return;
                }
                if (kxj.m(kxjVar.D)) {
                    aubg aubgVar2 = kxjVar.D;
                    String str2 = aubgVar2.h;
                    if ((aubgVar2.b & 2048) != 0) {
                        aqyg aqygVar = aubgVar2.n;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                        str = ajcq.b(aqygVar).toString();
                    } else {
                        str = null;
                    }
                    kyoVar2.d(str2, str);
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: kxa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kxj kxjVar = kxj.this;
                aahd aahdVar2 = aahdVar;
                apxf apxfVar = kxjVar.E;
                if (apxfVar != null) {
                    aahdVar2.c(apxfVar, null);
                }
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: kxc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kxj kxjVar = kxj.this;
                agyr agyrVar2 = agyrVar;
                aubg aubgVar = kxjVar.D;
                if (aubgVar != null) {
                    agyrVar2.f(aubgVar.h, agyg.a(false));
                }
            }
        });
        this.K = akpqVar.c(imageView3);
        Resources resources = activity.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.R = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
        this.T = fvfVar.c(playlistHeaderActionBarView.findViewById(R.id.toggle_button_icon));
        this.d = new fyp(textView2, resources.getInteger(R.integer.playlist_header_description_lines_collapsed), resources.getInteger(R.integer.playlist_header_description_lines_expanded));
        final kwz kwzVar = new kwz(this, 1);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: kxd
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                kxj kxjVar = kxj.this;
                View.OnClickListener onClickListener = kwzVar;
                if (kxjVar.d.d()) {
                    if (kxjVar.f.hasOnClickListeners()) {
                        return;
                    }
                    kxjVar.f.setOnClickListener(onClickListener);
                    whu.E(kxjVar.f, null);
                    kxjVar.f.setClickable(true);
                    return;
                }
                if (kxjVar.f.hasOnClickListeners()) {
                    kxjVar.f.setOnClickListener(null);
                    kxjVar.f.setBackground(null);
                    kxjVar.f.setClickable(false);
                }
            }
        };
        this.w = onLayoutChangeListener;
        textView2.addOnLayoutChangeListener(onLayoutChangeListener);
        textView.addOnLayoutChangeListener(onLayoutChangeListener);
        this.U = new ArrayList();
    }

    public static boolean l(aubg aubgVar) {
        aubh aubhVar = aubgVar.I;
        if (aubhVar == null) {
            aubhVar = aubh.a;
        }
        apmg apmgVar = aubhVar.b;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        return (apmgVar.b & 16384) != 0;
    }

    public static boolean m(aubg aubgVar) {
        aubi aubiVar = aubgVar.x;
        if (aubiVar == null) {
            aubiVar = aubi.a;
        }
        return aubiVar.b;
    }

    private final void n(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int marginStart = marginLayoutParams.getMarginStart();
            marginLayoutParams.setMarginStart(this.G.getResources().getDimensionPixelSize(i));
            this.U.add(new kxs(view, ammv.j(Integer.valueOf(marginStart)), amlr.a));
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.H.m(this);
        for (kxs kxsVar : this.U) {
            if (kxsVar.b.h()) {
                ViewGroup.LayoutParams layoutParams = kxsVar.a.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(((Integer) kxsVar.b.c()).intValue());
                }
            }
            if (kxsVar.c.h()) {
                kxsVar.a.setPaddingRelative(((Integer) kxsVar.c.c()).intValue(), kxsVar.a.getPaddingTop(), kxsVar.a.getPaddingEnd(), kxsVar.a.getPaddingBottom());
            }
        }
        this.U.clear();
        this.ac = null;
        this.F = null;
    }

    public final int d() {
        if (this.N.i(this.D.h)) {
            return ((agof) this.P.get()).a().i().a(this.D.h);
        }
        return 0;
    }

    public final void e() {
        int d = d();
        whu.G(this.C, d > 0 ? this.G.getResources().getQuantityString(R.plurals.download_new_videos_button_text, d, Integer.valueOf(d)) : null);
        jsh jshVar = this.ac;
        if (jshVar != null) {
            jshVar.a();
        }
    }

    public final void g() {
        whu.I(this.t, this.d.d());
        this.t.setRotation(true != this.d.d ? 360.0f : 180.0f);
    }

    public final void h(aubg aubgVar) {
        apmh apmhVar = aubgVar.E;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 2) == 0) {
            this.T.a();
            return;
        }
        ftw ftwVar = this.T;
        apmp apmpVar = apmhVar.d;
        if (apmpVar == null) {
            apmpVar = apmp.a;
        }
        ftwVar.b(apmpVar);
    }

    public final void i(aubg aubgVar) {
        gfa gfaVar;
        if ((aubgVar.c & 524288) != 0) {
            aubc aubcVar = aubgVar.K;
            if (aubcVar == null) {
                aubcVar = aubc.a;
            }
            ardu arduVar = aubcVar.c;
            if (arduVar == null) {
                arduVar = ardu.a;
            }
            gfaVar = new gfa(arduVar);
        } else {
            gfaVar = null;
        }
        this.V.a(gfaVar);
    }

    public final void j(ghf ghfVar) {
        aubg aubgVar = this.D;
        if (aubgVar == null || ghfVar == null || !TextUtils.equals(aubgVar.h, ghfVar.b())) {
            this.ad = null;
            return;
        }
        this.f230J.f(ghfVar.a());
        if (!this.W.e()) {
            boolean z = ghfVar.a() == asno.LIKE;
            ftw ftwVar = this.W;
            apmp apmpVar = ftwVar.d;
            apmpVar.getClass();
            if (apmpVar.e != z) {
                ftwVar.c();
            }
        }
        this.ad = ghfVar;
    }

    public final void k(aubg aubgVar) {
        CharSequence charSequence;
        if (aubgVar.w.size() == 0) {
            aqyg aqygVar = aubgVar.s;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            charSequence = ajcq.b(aqygVar);
        } else {
            aony aonyVar = aubgVar.w;
            CharSequence spannedString = new SpannedString("");
            Iterator it = aonyVar.iterator();
            while (it.hasNext()) {
                Spanned b = ajcq.b((aqyg) it.next());
                if (spannedString.length() == 0) {
                    spannedString = TextUtils.concat(b);
                } else {
                    spannedString = TextUtils.concat(spannedString, " · ", b);
                }
            }
            charSequence = spannedString;
        }
        whu.G(this.m, charSequence);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aucx aucxVar;
        apmg apmgVar;
        apmg apmgVar2;
        int i;
        atsb atsbVar;
        atsb atsbVar2;
        apmg apmgVar3;
        aqyg aqygVar;
        auwh auwhVar;
        aong aongVar;
        apmg apmgVar4;
        aubg aubgVar = (aubg) obj;
        this.H.g(this);
        aubg aubgVar2 = this.D;
        this.D = aubgVar;
        acra acraVar = ajokVar.a;
        this.d.b();
        final int i2 = 0;
        if (ajokVar.j("nested_fragment_key", false)) {
            LinearLayout linearLayout = this.f;
            int paddingStart = linearLayout.getPaddingStart();
            linearLayout.setPaddingRelative(this.G.getResources().getDimensionPixelSize(R.dimen.start_end_padding), linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
            this.U.add(new kxs(linearLayout, amlr.a, ammv.j(Integer.valueOf(paddingStart))));
            n(this.Z, R.dimen.playlist_header_action_bar_start_padding_compact);
            n(this.k, R.dimen.start_end_padding);
            n(this.x, R.dimen.start_end_padding);
            n(this.X, R.dimen.start_end_padding);
            n(this.Y, R.dimen.start_end_padding);
            n(this.z, R.dimen.start_end_padding);
        }
        ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
        aubg aubgVar3 = this.D;
        if ((aubgVar3.b & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
            auba aubaVar = aubgVar3.z;
            if (aubaVar == null) {
                aubaVar = auba.a;
            }
            aucxVar = aubaVar.b;
            if (aucxVar == null) {
                aucxVar = aucx.a;
            }
        } else {
            aucxVar = null;
        }
        final int i3 = 1;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || aucxVar == null || (aucxVar.b & 1) == 0) {
            this.r.setVisibility(8);
        } else {
            this.r.setVisibility(0);
            yny.z(this.r, yny.n((int) (this.R * aucxVar.d)), ViewGroup.LayoutParams.class);
            ajjz ajjzVar = this.I;
            ImageView imageView = this.r;
            avgg avggVar = aucxVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
        }
        whu.I(this.s, (this.D.b & 16384) != 0);
        ajjz ajjzVar2 = this.I;
        ImageView imageView2 = this.s;
        avgg avggVar2 = this.D.q;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        ajjzVar2.h(imageView2, avggVar2);
        apmh apmhVar = this.D.B;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) != 0) {
            apmh apmhVar2 = this.D.B;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
        } else {
            apmgVar = null;
        }
        this.S.b(apmgVar, acraVar);
        aubg aubgVar4 = this.D;
        if ((aubgVar4.b & 64) != 0) {
            aulq aulqVar = aubgVar4.j;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            apmgVar2 = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar2 = null;
        }
        this.b.b(apmgVar2, acraVar);
        this.z.setVisibility(this.y.getVisibility());
        this.z.setFocusable(this.y.isFocusable());
        this.z.setClickable(this.y.isClickable());
        this.z.setEnabled(this.y.isEnabled());
        this.z.setContentDescription(this.y.getContentDescription());
        this.y.setClickable(false);
        this.y.setFocusable(false);
        this.y.setContentDescription(null);
        Drawable background = this.y.getBackground();
        this.y.setBackground(null);
        this.z.setBackground(background);
        this.z.setOnClickListener(new kwz(this, 0));
        aubg aubgVar5 = this.D;
        if ((aubgVar5.b & 128) == 0) {
            this.c.a();
        } else {
            aulq aulqVar2 = aubgVar5.k;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            this.c.b((apmp) aulqVar2.pX(ButtonRendererOuterClass.toggleButtonRenderer));
        }
        aubg aubgVar6 = this.D;
        String str = aubgVar6.h;
        ogx ogxVar = this.ae;
        OfflineArrowView offlineArrowView = this.u;
        aubf aubfVar = aubgVar6.D;
        if (aubfVar == null) {
            aubfVar = aubf.a;
        }
        if (aubfVar.b == 65153809) {
            i = 2;
        } else {
            aubf aubfVar2 = this.D.D;
            if (aubfVar2 == null) {
                aubfVar2 = aubf.a;
            }
            if (aubfVar2.b == 60572968) {
                aubf aubfVar3 = this.D.D;
                if (aubfVar3 == null) {
                    aubfVar3 = aubf.a;
                }
                if (aubfVar3.b == 60572968) {
                    atsbVar = (atsb) aubfVar3.c;
                } else {
                    atsbVar = atsb.a;
                }
                if (atsbVar.c) {
                    i = 1;
                }
            }
            i = 3;
        }
        ajyw ajywVar = this.af;
        aubf aubfVar4 = this.D.D;
        if (aubfVar4 == null) {
            aubfVar4 = aubf.a;
        }
        if (aubfVar4.b == 60572968) {
            aubf aubfVar5 = this.D.D;
            if (aubfVar5 == null) {
                aubfVar5 = aubf.a;
            }
            if (aubfVar5.b == 60572968) {
                atsbVar2 = (atsb) aubfVar5.c;
            } else {
                atsbVar2 = atsb.a;
            }
        } else {
            atsbVar2 = null;
        }
        aubf aubfVar6 = this.D.D;
        if (aubfVar6 == null) {
            aubfVar6 = aubf.a;
        }
        if (aubfVar6.b == 65153809) {
            aubf aubfVar7 = this.D.D;
            if (aubfVar7 == null) {
                aubfVar7 = aubf.a;
            }
            if (aubfVar7.b == 65153809) {
                apmgVar4 = (apmg) aubfVar7.c;
            } else {
                apmgVar4 = apmg.a;
            }
            apmgVar3 = apmgVar4;
        } else {
            apmgVar3 = null;
        }
        this.ac = ogxVar.d(str, offlineArrowView, i, ajywVar.s(str, atsbVar2, apmgVar3, new azrw(this) { // from class: kxg
            public final /* synthetic */ kxj a;

            {
                this.a = this;
            }

            @Override // defpackage.azrw
            public final Object get() {
                if (i2 == 0) {
                    Boolean bool = this.a.F;
                    return Boolean.valueOf((bool == null || bool.booleanValue()) ? false : true);
                }
                return Boolean.valueOf(this.a.d() > 0);
            }
        }, new azrw(this) { // from class: kxg
            public final /* synthetic */ kxj a;

            {
                this.a = this;
            }

            @Override // defpackage.azrw
            public final Object get() {
                if (i3 == 0) {
                    Boolean bool = this.a.F;
                    return Boolean.valueOf((bool == null || bool.booleanValue()) ? false : true);
                }
                return Boolean.valueOf(this.a.d() > 0);
            }
        }, acraVar));
        if (this.N.i(str)) {
            this.O.c(str, yki.c(this.G, new kxi(this, str)));
        }
        aubg aubgVar7 = this.D;
        if (aubgVar7 != aubgVar2) {
            asnj asnjVar = aubgVar7.A;
            if (asnjVar == null) {
                asnjVar = asnj.a;
            }
            if ((asnjVar.b & 1) != 0) {
                asnj asnjVar2 = this.D.A;
                if (asnjVar2 == null) {
                    asnjVar2 = asnj.a;
                }
                asni asniVar = asnjVar2.c;
                if (asniVar == null) {
                    asniVar = asni.a;
                }
                aongVar = (aong) asniVar.toBuilder();
            } else {
                aongVar = null;
            }
            this.f230J.i(aongVar);
            if (aongVar != null) {
                aone builder = this.D.toBuilder();
                asnj asnjVar3 = this.D.A;
                if (asnjVar3 == null) {
                    asnjVar3 = asnj.a;
                }
                aone builder2 = asnjVar3.toBuilder();
                builder2.copyOnWrite();
                asnj asnjVar4 = (asnj) builder2.instance;
                asni asniVar2 = (asni) aongVar.build();
                asniVar2.getClass();
                asnjVar4.c = asniVar2;
                asnjVar4.b |= 1;
                builder.copyOnWrite();
                aubg aubgVar8 = (aubg) builder.instance;
                asnj asnjVar5 = (asnj) builder2.build();
                asnjVar5.getClass();
                aubgVar8.A = asnjVar5;
                aubgVar8.c |= 4;
                this.D = (aubg) builder.build();
            }
        }
        this.B.setVisibility(8);
        Iterator it = this.D.N.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            aulq aulqVar3 = (aulq) it.next();
            if (aulqVar3.pY(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
                this.aa.f((atdu) aulqVar3.pX(MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
                this.B.setVisibility(0);
                break;
            }
        }
        TextView textView = this.g;
        aqyg aqygVar2 = this.D.n;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar2));
        TextView textView2 = this.x;
        aqyg aqygVar3 = this.D.t;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(textView2, ajcq.r(aqygVar3));
        TextView textView3 = this.h;
        aqyg aqygVar4 = this.D.o;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        whu.G(textView3, ajcq.b(aqygVar4));
        TextView textView4 = this.k;
        aqyg aqygVar5 = this.D.p;
        if (aqygVar5 == null) {
            aqygVar5 = aqyg.a;
        }
        whu.G(textView4, ajcq.b(aqygVar5));
        TextView textView5 = this.j;
        aqyg aqygVar6 = this.D.u;
        if (aqygVar6 == null) {
            aqygVar6 = aqyg.a;
        }
        whu.G(textView5, ajcq.b(aqygVar6));
        aubg aubgVar9 = this.D;
        auaz auazVar = aubgVar9.f122J;
        if (auazVar == null) {
            auazVar = auaz.a;
        }
        aqph aqphVar = auazVar.b;
        if (aqphVar == null) {
            aqphVar = aqph.a;
        }
        if (aqphVar.c.size() == 0) {
            whu.I(this.i, false);
        } else {
            auaz auazVar2 = aubgVar9.f122J;
            if (auazVar2 == null) {
                auazVar2 = auaz.a;
            }
            aqph aqphVar2 = auazVar2.b;
            if (aqphVar2 == null) {
                aqphVar2 = aqph.a;
            }
            aony aonyVar = aqphVar2.c;
            frx frxVar = new frx(this.G);
            for (int i4 = 0; i4 < aonyVar.size(); i4++) {
                final aqpj aqpjVar = ((aqpe) aonyVar.get(i4)).e;
                if (aqpjVar == null) {
                    aqpjVar = aqpj.a;
                }
                if ((aqpjVar.b & 1) != 0) {
                    aqygVar = aqpjVar.e;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                final Spanned b = ajcq.b(aqygVar);
                if (aqpjVar.f) {
                    whu.G(this.i, b);
                }
                if (b != null) {
                    frxVar.b(b.toString(), new frw() { // from class: kxe
                        @Override // defpackage.frw
                        public final void a(Object obj2) {
                            kxj kxjVar = kxj.this;
                            Spanned spanned = b;
                            aqpj aqpjVar2 = aqpjVar;
                            whu.G(kxjVar.i, spanned);
                            if (aqpjVar2.f || aqpjVar2.c != 5) {
                                return;
                            }
                            kxjVar.a.c((apxf) aqpjVar2.d, null);
                        }
                    });
                }
            }
            frz.a(frxVar, this.i, aubgVar9);
        }
        this.v.removeAllViews();
        aubd aubdVar = aubgVar.L;
        if (aubdVar == null) {
            aubdVar = aubd.a;
        }
        if (aubdVar.b == 76818770) {
            aubd aubdVar2 = aubgVar.L;
            if (aubdVar2 == null) {
                aubdVar2 = aubd.a;
            }
            if (aubdVar2.b == 76818770) {
                auwhVar = (auwh) aubdVar2.c;
            } else {
                auwhVar = auwh.a;
            }
        } else {
            auwhVar = null;
        }
        this.v.setVisibility(8);
        if (auwhVar != null) {
            if (this.ab == null) {
                this.ab = this.L.d(this.e, R.layout.playlist_sort_menu_header, R.layout.playlist_sort_menu_spinner_contents);
            }
            this.ab.oB(ajokVar, auwhVar);
            this.v.addView(this.ab.c, -2, -2);
            this.v.setVisibility(0);
        }
        this.n.setVisibility(true != (l(this.D) || m(this.D)) ? 8 : 0);
        int bu = anaf.bu(this.D.C);
        if (bu == 0) {
            bu = 1;
        }
        int i5 = bu - 1;
        if (i5 == 1) {
            this.q.setImageResource(R.drawable.yt_outline_earth_black_18);
            this.q.setVisibility(0);
            this.q.setContentDescription(this.G.getString(R.string.accessibility_playlist_public));
        } else if (i5 != 2) {
            this.q.setImageResource(R.drawable.yt_outline_lock_black_18);
            this.q.setVisibility(0);
            this.q.setContentDescription(this.G.getString(R.string.accessibility_playlist_private));
        } else {
            this.q.setImageResource(R.drawable.yt_outline_link_black_18);
            this.q.setVisibility(0);
            this.q.setContentDescription(this.G.getString(R.string.accessibility_playlist_unlisted));
        }
        h(this.D);
        i(this.D);
        k(this.D);
        apxf apxfVar = this.D.i;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        this.E = apxfVar;
        this.o.setVisibility((apxfVar == null || !apxfVar.pY(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint)) ? 8 : 0);
        aubg aubgVar10 = this.D;
        if (aubgVar10.f != 64) {
            this.p.setVisibility(8);
        } else {
            apmg apmgVar5 = (apmg) ((aulq) aubgVar10.g).pX(ButtonRendererOuterClass.buttonRenderer);
            if ((apmgVar5.b & 32) != 0) {
                ajut ajutVar = this.M;
                arfs arfsVar = apmgVar5.g;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b2 = arfr.b(arfsVar.c);
                if (b2 == null) {
                    b2 = arfr.UNKNOWN;
                }
                if (ajutVar.a(b2) != 0) {
                    ImageView imageView3 = this.p;
                    ajut ajutVar2 = this.M;
                    arfs arfsVar2 = apmgVar5.g;
                    if (arfsVar2 == null) {
                        arfsVar2 = arfs.a;
                    }
                    arfr b3 = arfr.b(arfsVar2.c);
                    if (b3 == null) {
                        b3 = arfr.UNKNOWN;
                    }
                    imageView3.setImageResource(ajutVar2.a(b3));
                    HashMap hashMap = new HashMap();
                    hashMap.put("START_SHUFFLED", true);
                    this.K.a(apmgVar5, ajokVar.a, hashMap);
                    this.p.setVisibility(0);
                }
            }
            this.p.setVisibility(8);
        }
        View view = null;
        View view2 = null;
        for (int i6 = 0; i6 < this.l.getChildCount(); i6++) {
            View childAt = this.l.getChildAt(i6);
            if (childAt.getId() == R.id.divider) {
                if (view2 == null || i6 == this.l.getChildCount() - 1) {
                    childAt.setVisibility(8);
                } else {
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    view = childAt;
                }
            } else if (childAt.getVisibility() == 0) {
                if (view != null) {
                    view.setVisibility(0);
                }
                view2 = childAt;
                view = null;
            }
        }
        if (view != null) {
            view.setVisibility(8);
        }
        e();
        aubg aubgVar11 = this.D;
        apmk apmkVar = aubgVar11.H;
        if (apmkVar == null) {
            apmkVar = apmk.a;
        }
        if ((apmkVar.b & 1) == 0) {
            this.W.a();
        } else {
            ftw ftwVar = this.W;
            apmk apmkVar2 = aubgVar11.H;
            if (apmkVar2 == null) {
                apmkVar2 = apmk.a;
            }
            apmp apmpVar = apmkVar2.c;
            if (apmpVar == null) {
                apmpVar = apmp.a;
            }
            ftwVar.b(apmpVar);
        }
        j(this.ad);
        this.x.post(new Runnable() { // from class: kxf
            @Override // java.lang.Runnable
            public final void run() {
                kxj.this.g();
            }
        });
        if (this.Q.b(this.D)) {
            this.Q.d(acraVar, this.D);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        aubg aubgVar;
        switch (i) {
            case -1:
                return new Class[]{ghf.class, abbc.class, agkm.class, agkn.class, agko.class, agkq.class, agkr.class, agks.class, agkt.class};
            case 0:
                j((ghf) obj);
                return null;
            case 1:
                abbc abbcVar = (abbc) obj;
                arzb arzbVar = abbcVar.b;
                if ((4 & arzbVar.b) == 0) {
                    return null;
                }
                arzc arzcVar = arzbVar.d;
                if (arzcVar == null) {
                    arzcVar = arzc.a;
                }
                if (arzcVar.b == 53272665) {
                    arzc arzcVar2 = abbcVar.b.d;
                    if (arzcVar2 == null) {
                        arzcVar2 = arzc.a;
                    }
                    if (arzcVar2.b == 53272665) {
                        aubgVar = (aubg) arzcVar2.c;
                    } else {
                        aubgVar = aubg.a;
                    }
                } else {
                    aubgVar = null;
                }
                if (aubgVar == null) {
                    return null;
                }
                h(aubgVar);
                i(aubgVar);
                k(aubgVar);
                return null;
            case 2:
                if (!((agkm) obj).a.equals(this.D.h)) {
                    return null;
                }
                e();
                return null;
            case 3:
                if (!((agkn) obj).a.equals(this.D.h)) {
                    return null;
                }
                e();
                return null;
            case 4:
                if (!((agko) obj).a.equals(this.D.h)) {
                    return null;
                }
                e();
                return null;
            case 5:
                if (!((agkq) obj).a.d().equals(this.D.h)) {
                    return null;
                }
                e();
                return null;
            case 6:
                if (!((agkr) obj).a.equals(this.D.h)) {
                    return null;
                }
                e();
                return null;
            case 7:
                if (!((agks) obj).a.d().equals(this.D.h)) {
                    return null;
                }
                e();
                return null;
            case 8:
                if (!((agkt) obj).a.equals(this.D.h)) {
                    return null;
                }
                e();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
