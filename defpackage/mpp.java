package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EndorsementMetadataSwapRendererOuterClass;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpp extends mlc implements ajof, lsa {
    private static final asht G;
    private static final asht H;
    public String C;
    public gol D;
    public Bitmap E;
    public boolean F;
    private final ajuw I;

    /* renamed from: J, reason: collision with root package name */
    private final mhg f239J;
    private final ImageView K;
    private final View L;
    private final ajjv M;
    private final gfz N;
    private final TextView O;
    private final ajnv P;
    private final lsb Q;
    private final ViewGroup R;
    private final mqq S;
    private ajok T;
    private final boolean U;
    private final boolean V;
    private apju W;
    private final aadw X;
    private final ajyw Y;
    final ajoi a;
    final ajop b;
    public final aahd c;
    public final View d;
    public final mgu e;
    public final mqr f;

    static {
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = ashs.a.createBuilder();
        createBuilder2.copyOnWrite();
        ashs ashsVar = (ashs) createBuilder2.instance;
        ashsVar.b |= 1;
        ashsVar.c = true;
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        ashs ashsVar2 = (ashs) createBuilder2.build();
        ashsVar2.getClass();
        ashtVar.o = ashsVar2;
        ashtVar.b |= 67108864;
        G = (asht) createBuilder.build();
        aone createBuilder3 = asht.a.createBuilder();
        aone createBuilder4 = ashs.a.createBuilder();
        createBuilder4.copyOnWrite();
        ashs ashsVar3 = (ashs) createBuilder4.instance;
        ashsVar3.b = 1 | ashsVar3.b;
        ashsVar3.c = false;
        createBuilder3.copyOnWrite();
        asht ashtVar2 = (asht) createBuilder3.instance;
        ashs ashsVar4 = (ashs) createBuilder4.build();
        ashsVar4.getClass();
        ashtVar2.o = ashsVar4;
        ashtVar2.b |= 67108864;
        H = (asht) createBuilder3.build();
    }

    public mpp(Context context, ajjz ajjzVar, ajut ajutVar, aahd aahdVar, ajuw ajuwVar, mgu mguVar, gfz gfzVar, mhg mhgVar, ajyw ajywVar, ajnv ajnvVar, ohg ohgVar, aadw aadwVar, lsb lsbVar, c cVar, c cVar2, ajop ajopVar, View view, mqq mqqVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(context, ajjzVar, ajopVar, view, aahdVar, ajutVar, ohgVar, (ajoy) null, cVar2, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        ViewStub viewStub;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        boolean z2 = z && context.getResources().getConfiguration().orientation == 2;
        this.V = z2;
        this.b = ajopVar;
        this.I = ajuwVar;
        this.a = new ajoi(aahdVar, ajopVar, this);
        this.c = aahdVar;
        this.e = mguVar;
        this.N = gfzVar;
        this.f239J = mhgVar;
        this.Y = ajywVar;
        this.P = ajnvVar;
        this.X = aadwVar;
        this.S = mqqVar;
        this.Q = lsbVar;
        lsbVar.a(this);
        this.d = view.findViewById(R.id.thumbnail_layout);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.inline_muted_metadata);
        this.R = viewGroup;
        this.U = z;
        mqr mqrVar = null;
        if (z2) {
            this.O = (TextView) view.findViewById(R.id.channel_name);
            this.K = (ImageView) view.findViewById(R.id.channel_thumbnail);
        } else {
            this.O = null;
            this.K = (ImageView) view.findViewById(R.id.channel_avatar);
            if (z && (viewStub = (ViewStub) view.findViewById(R.id.ad_attribution)) != null) {
                viewStub.inflate();
            }
        }
        this.L = view.findViewById(R.id.contextual_menu_anchor);
        ajju a = ajjv.a();
        a.c = new mpo(this, mguVar);
        this.M = a.a();
        ViewSwitcher viewSwitcher = (ViewSwitcher) this.i.findViewById(R.id.avatar_switcher);
        ViewSwitcher viewSwitcher2 = (ViewSwitcher) this.i.findViewById(R.id.metadata_switcher);
        ImageView imageView = (ImageView) this.i.findViewById(R.id.channel_avatar_swap);
        TextView textView = (TextView) this.i.findViewById(R.id.metadata_text_swap);
        if (viewSwitcher != null && viewSwitcher2 != null && imageView != null && textView != null) {
            mqrVar = cVar.d(viewSwitcher, viewSwitcher2, imageView, textView, mqqVar);
        }
        this.f = mqrVar;
        TextView textView2 = this.l;
        if (textView2 != null) {
            textView2.setTypeface(ajct.ROBOTO_MEDIUM.a(this.g));
        }
        if (this.n != null) {
            if (z) {
                dimensionPixelSize3 = this.g.getResources().getDimensionPixelSize(R.dimen.video_metadata_ads_inline_details_padding_top);
            } else {
                dimensionPixelSize3 = this.g.getResources().getDimensionPixelSize(R.dimen.video_metadata_no_ads_inline_details_padding_top);
            }
            TextView textView3 = this.n;
            textView3.setPadding(textView3.getPaddingLeft(), dimensionPixelSize3, this.n.getPaddingRight(), this.n.getPaddingBottom());
        }
        if (!mcy.z(aadwVar) || this.g.getResources().getConfiguration().orientation == 2) {
            return;
        }
        if (mcy.x(aadwVar)) {
            dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.smaller_divider_height_dp);
        } else {
            dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.bigger_divider_height_dp);
        }
        ((gma) ajopVar).a.b(wbs.W(this.g, R.attr.adSeparator1).orElse(0));
        ((gma) ajopVar).a.d(dimensionPixelSize);
        if (!mcy.w(aadwVar) || viewGroup == null || viewGroup.getLayoutParams() == null) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = this.g.getResources().getDimensionPixelSize(R.dimen.inline_metadata_exp_bot_margin_dp);
        if (mcy.y(aadwVar)) {
            dimensionPixelSize2 = this.g.getResources().getDimensionPixelSize(R.dimen.exp_layout_bot_padding_with_small_div);
        } else {
            dimensionPixelSize2 = this.g.getResources().getDimensionPixelSize(R.dimen.exp_layout_bot_padding_with_big_div);
        }
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), dimensionPixelSize2);
    }

    public static boolean g(gol golVar) {
        arhz arhzVar;
        if (golVar == null || (arhzVar = golVar.b) == null) {
            return false;
        }
        aulq aulqVar = arhzVar.n;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return aulqVar.pY(EndorsementMetadataSwapRendererOuterClass.endorsementMetadataSwapRenderer);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.b).b;
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.d.setAlpha(1.0f);
        this.F = false;
        this.a.c();
        mqr mqrVar = this.f;
        if (mqrVar != null) {
            mqrVar.a();
        }
    }

    @Override // defpackage.lsa
    public final frh d() {
        return this.r;
    }

    @Override // defpackage.lsa
    public final apju e() {
        return this.W;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0284  */
    @Override // defpackage.ajom
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oB(defpackage.ajok r18, defpackage.gol r19) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpp.oB(ajok, gol):void");
    }

    @Override // defpackage.ajof
    public final boolean h(View view) {
        mhg mhgVar = this.f239J;
        gol golVar = this.D;
        aahd aahdVar = this.c;
        ajok ajokVar = this.T;
        return mhgVar.b(golVar, aahdVar, ajokVar.a, ajokVar.e(), this);
    }

    @Override // defpackage.mlc, defpackage.ajog
    public final void oh(Map map) {
        avgg avggVar;
        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", this.d);
        arhz arhzVar = this.D.b;
        if ((arhzVar.b & 2) != 0) {
            avggVar = arhzVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avggVar);
        this.f239J.a(this.D, map);
    }
}
