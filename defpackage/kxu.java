package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
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
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kxu implements ajom, ypd {
    final FrameLayout A;
    final ViewStub B;
    final TextView C;
    public aubg D;
    public apxf E;
    public Boolean F;
    private final Activity G;
    private final ypa H;
    private final ajjz I;

    /* renamed from: J, reason: collision with root package name */
    private final ggy f231J;
    private final fte K;
    private final fjs L;
    private final jvl M;
    private final azrw N;
    private final acsf O;
    private final int P;
    private final ajyf Q;
    private final ftw R;
    private final List S;
    private final ftw T;
    private final TextView U;
    private final FrameLayout V;
    private final PlaylistHeaderActionBarView W;
    private final gaf X;
    private final ImageView Y;
    private ftd Z;
    public final aahd a;
    private jsh aa;
    private ghf ab;
    private final ogx ac;
    private final ajyw ad;
    final ajyf b;
    final ajyf c;
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
    final OfflineArrowView t;
    final ViewGroup u;
    final View.OnLayoutChangeListener v;
    final TextView w;
    final TextView x;
    final TextView y;
    final FrameLayout z;

    public kxu(Activity activity, ypa ypaVar, ajjz ajjzVar, final aahd aahdVar, final kyo kyoVar, ggy ggyVar, fte fteVar, fvf fvfVar, ajyg ajygVar, fjs fjsVar, jvl jvlVar, final agyr agyrVar, azrw azrwVar, acsf acsfVar, ogx ogxVar, ajyw ajywVar, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.G = activity;
        this.H = ypaVar;
        this.I = ajjzVar;
        this.a = aahdVar;
        this.f231J = ggyVar;
        this.K = fteVar;
        this.L = fjsVar;
        this.M = jvlVar;
        this.N = azrwVar;
        this.O = acsfVar;
        this.ac = ogxVar;
        this.ad = ajywVar;
        ViewGroup viewGroup = (ViewGroup) View.inflate(activity, R.layout.playlist_header_v2, null);
        this.e = viewGroup;
        this.u = (ViewGroup) viewGroup.findViewById(R.id.sort_playlist_container);
        this.f = (LinearLayout) viewGroup.findViewById(R.id.playlist_data);
        TextView textView = (TextView) viewGroup.findViewById(R.id.playlist_title);
        this.g = textView;
        this.h = (TextView) viewGroup.findViewById(R.id.playlist_subtitle);
        this.i = (TextView) viewGroup.findViewById(R.id.seasons);
        this.k = (TextView) viewGroup.findViewById(R.id.playlist_tvshow_metadata);
        this.j = (TextView) viewGroup.findViewById(R.id.playlist_channel);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.playlist_description);
        this.w = textView2;
        this.l = (LinearLayout) viewGroup.findViewById(R.id.sub_header_row);
        this.m = (TextView) viewGroup.findViewById(R.id.playlist_size);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.share_button);
        this.n = imageView;
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.edit_button);
        this.o = imageView2;
        this.p = (ImageView) viewGroup.findViewById(R.id.private_playlist_indicator);
        this.t = (OfflineArrowView) viewGroup.findViewById(R.id.offline_button);
        this.q = (ImageView) viewGroup.findViewById(R.id.hero_image);
        this.r = (ImageView) viewGroup.findViewById(R.id.channel_avatar);
        this.s = (ImageView) viewGroup.findViewById(R.id.expand_button);
        PlaylistHeaderActionBarView playlistHeaderActionBarView = (PlaylistHeaderActionBarView) viewGroup.findViewById(R.id.actions_bar);
        this.W = playlistHeaderActionBarView;
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.action_button);
        this.U = textView3;
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.offline_sync_button);
        this.C = textView4;
        this.V = (FrameLayout) viewGroup.findViewById(R.id.footer);
        TextView textView5 = (TextView) viewGroup.findViewById(R.id.play_button_label);
        this.x = textView5;
        this.z = (FrameLayout) viewGroup.findViewById(R.id.play_button_container);
        this.A = (FrameLayout) viewGroup.findViewById(R.id.shuffle_button_container);
        TextView textView6 = (TextView) viewGroup.findViewById(R.id.shuffle_button_label);
        this.y = textView6;
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.metadata_badge);
        this.B = viewStub;
        ImageView imageView3 = (ImageView) viewGroup.findViewById(R.id.save_button);
        this.Y = imageView3;
        this.X = ajoyVar.J(activity, viewStub);
        ggyVar.b(viewGroup.findViewById(R.id.like_button));
        this.Q = ajygVar.a(textView3);
        this.b = ajygVar.a(textView5);
        this.c = ajygVar.a(textView6);
        ftw c = fvfVar.c(imageView3);
        this.T = c;
        c.b = imageView3;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: kxm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                kxu kxuVar = kxu.this;
                aahd aahdVar2 = aahdVar;
                kyo kyoVar2 = kyoVar;
                if (kxu.k(kxuVar.D)) {
                    aubh aubhVar = kxuVar.D.I;
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
                if (kxu.l(kxuVar.D)) {
                    aubg aubgVar = kxuVar.D;
                    String str2 = aubgVar.h;
                    if ((aubgVar.b & 2048) != 0) {
                        aqyg aqygVar = aubgVar.n;
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
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: kxl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kxu kxuVar = kxu.this;
                aahd aahdVar2 = aahdVar;
                apxf apxfVar = kxuVar.E;
                if (apxfVar != null) {
                    aahdVar2.a(apxfVar);
                }
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: kxn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kxu kxuVar = kxu.this;
                agyr agyrVar2 = agyrVar;
                aubg aubgVar = kxuVar.D;
                if (aubgVar != null) {
                    agyrVar2.f(aubgVar.h, agyg.a(false));
                }
            }
        });
        Resources resources = activity.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.P = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
        this.R = fvfVar.c(playlistHeaderActionBarView.findViewById(R.id.toggle_button_icon));
        this.d = new fyp(textView2, resources.getInteger(R.integer.playlist_header_description_lines_collapsed), resources.getInteger(R.integer.playlist_header_description_lines_expanded));
        final kxk kxkVar = new kxk(this, 2);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: kxo
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                kxu kxuVar = kxu.this;
                View.OnClickListener onClickListener = kxkVar;
                if (kxuVar.d.d()) {
                    if (kxuVar.f.hasOnClickListeners()) {
                        return;
                    }
                    kxuVar.f.setOnClickListener(onClickListener);
                    whu.E(kxuVar.f, null);
                    kxuVar.f.setClickable(true);
                    return;
                }
                if (kxuVar.f.hasOnClickListeners()) {
                    kxuVar.f.setOnClickListener(null);
                    kxuVar.f.setBackground(null);
                    kxuVar.f.setClickable(false);
                }
            }
        };
        this.v = onLayoutChangeListener;
        textView2.addOnLayoutChangeListener(onLayoutChangeListener);
        textView.addOnLayoutChangeListener(onLayoutChangeListener);
        this.S = new ArrayList();
    }

    public static boolean k(aubg aubgVar) {
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

    public static boolean l(aubg aubgVar) {
        aubi aubiVar = aubgVar.x;
        if (aubiVar == null) {
            aubiVar = aubi.a;
        }
        return aubiVar.b;
    }

    private final void m(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int marginStart = marginLayoutParams.getMarginStart();
            marginLayoutParams.setMarginStart(this.G.getResources().getDimensionPixelSize(i));
            this.S.add(new kxs(view, ammv.j(Integer.valueOf(marginStart)), amlr.a));
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.H.m(this);
        for (kxs kxsVar : this.S) {
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
        this.S.clear();
        this.aa = null;
        this.F = null;
    }

    public final int d() {
        if (this.L.i(this.D.h)) {
            return ((agof) this.N.get()).a().i().a(this.D.h);
        }
        return 0;
    }

    public final void e() {
        int d = d();
        whu.G(this.C, d > 0 ? this.G.getResources().getQuantityString(R.plurals.download_new_videos_button_text, d, Integer.valueOf(d)) : null);
        this.aa.a();
    }

    public final void g() {
        whu.I(this.s, this.d.d());
        this.s.setRotation(true != this.d.d ? 360.0f : 180.0f);
    }

    public final void h(aubg aubgVar) {
        apmh apmhVar = aubgVar.E;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 2) == 0) {
            this.R.b(null);
            return;
        }
        ftw ftwVar = this.R;
        apmp apmpVar = apmhVar.d;
        if (apmpVar == null) {
            apmpVar = apmp.a;
        }
        ftwVar.b(apmpVar);
    }

    public final void i(ghf ghfVar) {
        aubg aubgVar = this.D;
        if (aubgVar == null || ghfVar == null || !TextUtils.equals(aubgVar.h, ghfVar.b())) {
            this.ab = null;
            return;
        }
        this.f231J.f(ghfVar.a());
        if (!this.T.e()) {
            boolean z = ghfVar.a() == asno.LIKE;
            ftw ftwVar = this.T;
            apmp apmpVar = ftwVar.d;
            apmpVar.getClass();
            if (apmpVar.e != z) {
                ftwVar.c();
            }
        }
        this.ab = ghfVar;
    }

    public final void j(aubg aubgVar) {
        CharSequence charSequence;
        if (aubgVar.w.size() == 0) {
            aqyg aqygVar = aubgVar.s;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            charSequence = ajcq.b(aqygVar);
        } else {
            aony aonyVar = aubgVar.w;
            if (aonyVar.isEmpty()) {
                charSequence = "";
            } else {
                Iterator it = aonyVar.iterator();
                CharSequence charSequence2 = null;
                while (it.hasNext()) {
                    Spanned b = ajcq.b((aqyg) it.next());
                    if (charSequence2 == null) {
                        charSequence2 = TextUtils.concat(b);
                    } else {
                        charSequence2 = TextUtils.concat(charSequence2, " · ", b);
                    }
                }
                charSequence = charSequence2;
            }
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
        atsb atsbVar3;
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
            this.S.add(new kxs(linearLayout, amlr.a, ammv.j(Integer.valueOf(paddingStart))));
            m(this.W, R.dimen.playlist_header_action_bar_start_padding_compact);
            m(this.k, R.dimen.start_end_padding);
            m(this.w, R.dimen.start_end_padding);
            m(this.U, R.dimen.start_end_padding);
            m(this.V, R.dimen.start_end_padding);
            m(this.z, R.dimen.start_end_padding);
        }
        ViewGroup.LayoutParams layoutParams = this.q.getLayoutParams();
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
            this.q.setVisibility(8);
        } else {
            this.q.setVisibility(0);
            yny.z(this.q, yny.n((int) (this.P * aucxVar.d)), ViewGroup.LayoutParams.class);
            ajjz ajjzVar = this.I;
            ImageView imageView = this.q;
            avgg avggVar = aucxVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
        }
        whu.I(this.r, (this.D.b & 16384) != 0);
        ajjz ajjzVar2 = this.I;
        ImageView imageView2 = this.r;
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
        this.Q.b(apmgVar, acraVar);
        aubg aubgVar4 = this.D;
        this.b.b(aubgVar4.d == 63 ? (apmg) ((aulq) aubgVar4.e).pX(ButtonRendererOuterClass.buttonRenderer) : null, acraVar);
        Drawable background = this.x.getBackground();
        this.x.setBackground(null);
        this.z.setBackground(background);
        this.z.setOnClickListener(new kxk(this, 1));
        aubg aubgVar5 = this.D;
        if (aubgVar5.f != 64) {
            this.A.setVisibility(8);
            this.y.setVisibility(8);
            apmgVar2 = null;
        } else {
            apmgVar2 = (apmg) ((aulq) aubgVar5.g).pX(ButtonRendererOuterClass.buttonRenderer);
            this.A.setVisibility(0);
            this.y.setVisibility(0);
        }
        this.c.b(apmgVar2, acraVar);
        Drawable background2 = this.y.getBackground();
        this.y.setBackground(null);
        this.A.setBackground(background2);
        this.A.setOnClickListener(new kxk(this, 0));
        aubg aubgVar6 = this.D;
        String str = aubgVar6.h;
        ogx ogxVar = this.ac;
        OfflineArrowView offlineArrowView = this.t;
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
        ajyw ajywVar = this.ad;
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
                atsbVar3 = (atsb) aubfVar5.c;
            } else {
                atsbVar3 = atsb.a;
            }
            atsbVar2 = atsbVar3;
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
        this.aa = ogxVar.d(str, offlineArrowView, i, ajywVar.s(str, atsbVar2, apmgVar3, new azrw(this) { // from class: kxr
            public final /* synthetic */ kxu a;

            {
                this.a = this;
            }

            @Override // defpackage.azrw
            public final Object get() {
                if (i3 == 0) {
                    return Boolean.valueOf(this.a.d() > 0);
                }
                Boolean bool = this.a.F;
                return Boolean.valueOf((bool == null || bool.booleanValue()) ? false : true);
            }
        }, new azrw(this) { // from class: kxr
            public final /* synthetic */ kxu a;

            {
                this.a = this;
            }

            @Override // defpackage.azrw
            public final Object get() {
                if (i2 == 0) {
                    return Boolean.valueOf(this.a.d() > 0);
                }
                Boolean bool = this.a.F;
                return Boolean.valueOf((bool == null || bool.booleanValue()) ? false : true);
            }
        }, acraVar));
        if (this.L.i(str)) {
            this.M.c(str, yki.c(this.G, new kxt(this, str)));
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
            this.f231J.i(aongVar);
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
            aulq aulqVar = (aulq) it.next();
            if (aulqVar.pY(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
                this.X.f((atdu) aulqVar.pX(MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
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
        TextView textView2 = this.w;
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
                    frxVar.b(b.toString(), new frw() { // from class: kxp
                        @Override // defpackage.frw
                        public final void a(Object obj2) {
                            kxu kxuVar = kxu.this;
                            Spanned spanned = b;
                            aqpj aqpjVar2 = aqpjVar;
                            whu.G(kxuVar.i, spanned);
                            if (aqpjVar2.f || aqpjVar2.c != 5) {
                                return;
                            }
                            kxuVar.a.a((apxf) aqpjVar2.d);
                        }
                    });
                }
            }
            frz.a(frxVar, this.i, aubgVar9);
        }
        this.u.removeAllViews();
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
        this.u.setVisibility(8);
        if (auwhVar != null) {
            if (this.Z == null) {
                this.Z = this.K.d(this.e, R.layout.playlist_sort_menu_header, R.layout.playlist_sort_menu_spinner_contents);
            }
            this.Z.oB(ajokVar, auwhVar);
            this.u.addView(this.Z.c, -2, -2);
            this.u.setVisibility(0);
        }
        this.n.setVisibility(true != (k(this.D) || l(this.D)) ? 8 : 0);
        int bu = anaf.bu(this.D.C);
        if (bu == 0) {
            bu = 1;
        }
        int i5 = bu - 1;
        if (i5 == 1) {
            this.p.setImageResource(R.drawable.yt_outline_earth_black_18);
            this.p.setVisibility(0);
            this.p.setContentDescription(this.G.getString(R.string.accessibility_playlist_public));
        } else if (i5 != 2) {
            this.p.setImageResource(R.drawable.yt_outline_lock_black_18);
            this.p.setVisibility(0);
            this.p.setContentDescription(this.G.getString(R.string.accessibility_playlist_private));
        } else {
            this.p.setImageResource(R.drawable.yt_outline_link_black_18);
            this.p.setVisibility(0);
            this.p.setContentDescription(this.G.getString(R.string.accessibility_playlist_unlisted));
        }
        h(this.D);
        j(this.D);
        apxf apxfVar = this.D.i;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        this.E = apxfVar;
        this.o.setVisibility((apxfVar == null || !apxfVar.pY(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint)) ? 8 : 0);
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
        aubg aubgVar10 = this.D;
        apmk apmkVar = aubgVar10.H;
        if (apmkVar == null) {
            apmkVar = apmk.a;
        }
        if ((apmkVar.b & 1) == 0) {
            this.T.b(null);
        } else {
            ftw ftwVar = this.T;
            apmk apmkVar2 = aubgVar10.H;
            if (apmkVar2 == null) {
                apmkVar2 = apmk.a;
            }
            apmp apmpVar = apmkVar2.c;
            if (apmpVar == null) {
                apmpVar = apmp.a;
            }
            ftwVar.b(apmpVar);
        }
        i(this.ab);
        this.w.post(new Runnable() { // from class: kxq
            @Override // java.lang.Runnable
            public final void run() {
                kxu.this.g();
            }
        });
        if (this.O.b(this.D)) {
            this.O.d(acraVar, this.D);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        aubg aubgVar;
        switch (i) {
            case -1:
                return new Class[]{ghf.class, abbc.class, agkm.class, agkn.class, agko.class, agkq.class, agkr.class, agks.class, agkt.class};
            case 0:
                i((ghf) obj);
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
                h(aubgVar);
                j(aubgVar);
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
