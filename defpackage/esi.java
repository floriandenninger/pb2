package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class esi extends ajpc {
    private final ajjv A;
    private final LinearLayout B;
    private final hbb C;
    private final hak D;
    private esg E;
    private esg F;
    private esg G;
    private esg H;
    private esg I;

    /* renamed from: J, reason: collision with root package name */
    private final TextView f214J;
    private ajyf K;
    private zes L;
    private final TextView M;
    private ajyf N;
    private zes O;
    private View P;
    private final unx Q;
    public final Activity a;
    public final aahd b;
    public final Resources c;
    public final View d;
    public final TextView e;
    public final ImageView f;
    public final View g;
    public final fwi h;
    public final akbu i;
    public final ftn j;
    public final View k;
    public eqf l;
    public boolean m = false;
    public final ajyg n;
    public View o;
    public final fvf p;
    public final fvf q;
    public final ajyw r;
    private final ajjz s;
    private final View t;
    private final View u;
    private final ImageView v;
    private final View x;
    private final xhr y;
    private final ajjv z;

    public esi(Activity activity, ajjz ajjzVar, aahd aahdVar, xhr xhrVar, fwi fwiVar, ftn ftnVar, fvf fvfVar, fvf fvfVar2, ajyw ajywVar, unx unxVar, hbb hbbVar, hak hakVar, akbu akbuVar, ajyg ajygVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.a = activity;
        this.c = activity.getResources();
        ajjzVar.getClass();
        this.s = ajjzVar;
        this.b = aahdVar;
        xhrVar.getClass();
        this.y = xhrVar;
        fwiVar.getClass();
        this.h = fwiVar;
        this.C = hbbVar;
        this.D = hakVar;
        this.i = akbuVar;
        this.r = ajywVar;
        this.j = ftnVar;
        this.p = fvfVar2;
        this.q = fvfVar;
        this.Q = unxVar;
        this.n = ajygVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.channel_header, (ViewGroup) null);
        this.d = inflate;
        this.k = inflate.findViewById(R.id.channel_header_extra_info_layout);
        this.x = inflate.findViewById(R.id.channel_avatar_layout);
        this.v = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.u = inflate.findViewById(R.id.channel_banner_container);
        this.f = (ImageView) inflate.findViewById(R.id.channel_banner);
        TextView textView = (TextView) inflate.findViewById(R.id.channel_description);
        this.e = textView;
        textView.setOnClickListener(new esd(this));
        this.t = inflate.findViewById(R.id.description_separator);
        this.g = inflate.findViewById(R.id.separator);
        ajju b = ajjzVar.c().b();
        b.c = new esh(this);
        this.z = b.a();
        ajju b2 = ajjzVar.c().b();
        b2.b(R.drawable.missing_avatar);
        this.A = b2.a();
        this.B = (LinearLayout) inflate.findViewById(R.id.links);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.channel_page_navigation_view);
        this.f214J = (TextView) constraintLayout.findViewById(R.id.edit_channel_button);
        this.M = (TextView) constraintLayout.findViewById(R.id.manage_videos_button);
    }

    private final int j(TextView textView) {
        DisplayMetrics displayMetrics = this.c.getDisplayMetrics();
        int minHeight = textView.getMinHeight();
        int K = yjk.K(displayMetrics, 48);
        if (minHeight >= K) {
            return 0;
        }
        double d = K - minHeight;
        Double.isNaN(d);
        return (int) Math.ceil(d * 0.5d);
    }

    private final esg k() {
        if (this.E == null) {
            ViewStub viewStub = (ViewStub) this.d.findViewById(R.id.channel_info_stub);
            if (viewStub == null) {
                esg esgVar = new esg(this, this.d);
                this.E = esgVar;
                this.G = esgVar;
            } else {
                viewStub.setLayoutResource(R.layout.channel_header_info);
                this.E = new esg(this, viewStub.inflate());
            }
        }
        return this.E;
    }

    private final esg m() {
        if (this.G == null) {
            ViewStub viewStub = (ViewStub) this.d.findViewById(R.id.channel_info_stub_with_sponsorship);
            if (viewStub == null) {
                esg esgVar = new esg(this, this.d);
                this.G = esgVar;
                this.E = esgVar;
            } else {
                viewStub.setLayoutResource(R.layout.channel_header_info_with_sponsorship);
                this.G = new esg(this, viewStub.inflate());
            }
        }
        return this.G;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        esg esgVar = this.I;
        if (esgVar != null) {
            esgVar.f.d();
        }
        View view = this.o;
        if (view != null) {
            view.setOnClickListener(null);
            this.o.setClickable(false);
            this.o.setContentDescription(null);
        }
        this.C.d(this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x01a8, code lost:
    
        if (r6 != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x029e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x036a  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajok r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esi.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apna) obj).s.I();
    }

    public final fvd f() {
        esg esgVar = this.I;
        if (esgVar != null) {
            return esgVar.g;
        }
        return null;
    }

    public final void g() {
        this.f.setBackgroundResource(R.drawable.ic_default_channel_placeholder);
        this.f.setImageDrawable(null);
    }

    public final void h(final ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer, final acra acraVar) {
        final View findViewById = this.d.findViewById(R.id.channel_avatar_ring);
        if (findViewById == null) {
            return;
        }
        int bl = anaf.bl(channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.e);
        if (bl == 0) {
            bl = 1;
        }
        if (bl == 3 || (channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.b & 2) == 0) {
            whu.I(findViewById, false);
        } else {
            if (bl != 2) {
                hbb hbbVar = this.C;
                apxf apxfVar = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.d;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                if (!hbbVar.f(apxfVar)) {
                    whu.I(findViewById, true);
                    findViewById.setEnabled(true);
                }
            }
            whu.I(findViewById, true);
            findViewById.setEnabled(false);
        }
        apxf apxfVar2 = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.d;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        if (apxfVar2.pY(ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.showPendingReelUploadsCommand)) {
            ynm.i(this.D.a(), new ynl() { // from class: esb
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    esi esiVar = esi.this;
                    View view = findViewById;
                    ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer2 = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
                    acra acraVar2 = acraVar;
                    boolean z = !((amru) obj).isEmpty();
                    if (z) {
                        whu.I(view, true);
                        view.setEnabled(true);
                    }
                    if ((channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer2.b & 32) != 0) {
                        aulq aulqVar = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer2.g;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        arej arejVar = (arej) ahbj.n(aulqVar, HintRendererOuterClass.hintRenderer);
                        if (arejVar == null) {
                            return;
                        }
                        int bl2 = anaf.bl(channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer2.e);
                        if (bl2 == 0 || bl2 != 3 || z) {
                            esiVar.i.b(arejVar, esiVar.o, channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer2, acraVar2);
                        }
                    }
                }
            });
        }
    }
}
