package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fse extends ajpc {
    public final oja a;
    public final View b;
    public final grm c;
    private final ajjz d;
    private final ImageView e;
    private final YouTubeTextView f;
    private final YouTubeTextView g;
    private final ImageView h;
    private final YouTubeTextView i;
    private final YouTubeTextView j;
    private final YouTubeButton k;
    private final ajyd l;
    private final YouTubeButton m;
    private final ajyd n;

    public fse(Context context, akpq akpqVar, ajjz ajjzVar, oja ojaVar, ViewGroup viewGroup, grm grmVar, byte[] bArr) {
        this.d = ajjzVar;
        this.a = ojaVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.donation_post_transaction, viewGroup, false);
        this.b = inflate;
        this.e = (ImageView) inflate.findViewById(R.id.donation_post_header_icon);
        this.f = (YouTubeTextView) inflate.findViewById(R.id.donation_post_thanks);
        this.g = (YouTubeTextView) inflate.findViewById(R.id.donation_post_additional_info);
        this.h = (ImageView) inflate.findViewById(R.id.donation_post_creator_thumbnail);
        this.i = (YouTubeTextView) inflate.findViewById(R.id.donation_post_creator_message_title);
        this.j = (YouTubeTextView) inflate.findViewById(R.id.donation_post_creator_message_description);
        YouTubeButton youTubeButton = (YouTubeButton) inflate.findViewById(R.id.donation_post_done_button);
        this.k = youTubeButton;
        this.l = akpqVar.c(youTubeButton);
        YouTubeButton youTubeButton2 = (YouTubeButton) inflate.findViewById(R.id.donation_post_share_button);
        this.m = youTubeButton2;
        this.n = akpqVar.c(youTubeButton2);
        this.c = grmVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        avgg avggVar;
        aqlb aqlbVar = (aqlb) obj;
        acra acraVar = ajokVar.a;
        ajjz ajjzVar = this.d;
        ImageView imageView = this.e;
        if ((aqlbVar.b & 1) != 0) {
            avggVar = aqlbVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        ajjzVar.h(imageView, avggVar);
        YouTubeTextView youTubeTextView = this.f;
        aqyg aqygVar = aqlbVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(youTubeTextView, ajcq.b(aqygVar));
        YouTubeTextView youTubeTextView2 = this.g;
        aqyg aqygVar2 = aqlbVar.e;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(youTubeTextView2, ajcq.b(aqygVar2));
        ajjz ajjzVar2 = this.d;
        ImageView imageView2 = this.h;
        aqla aqlaVar = aqlbVar.f;
        if (aqlaVar == null) {
            aqlaVar = aqla.a;
        }
        avgg avggVar2 = aqlaVar.c;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        ajju a = ajjv.a();
        a.b(R.drawable.product_logo_avatar_square_grey_color_120);
        ajjzVar2.k(imageView2, avggVar2, a.a());
        YouTubeTextView youTubeTextView3 = this.i;
        aqla aqlaVar2 = aqlbVar.f;
        if (aqlaVar2 == null) {
            aqlaVar2 = aqla.a;
        }
        aqyg aqygVar3 = aqlaVar2.d;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(youTubeTextView3, ajcq.b(aqygVar3));
        YouTubeTextView youTubeTextView4 = this.j;
        aqla aqlaVar3 = aqlbVar.f;
        if (aqlaVar3 == null) {
            aqlaVar3 = aqla.a;
        }
        aqyg aqygVar4 = aqlaVar3.e;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        whu.G(youTubeTextView4, ajcq.b(aqygVar4));
        if ((aqlbVar.b & 16) == 0) {
            this.k.setVisibility(8);
        } else {
            aulq aulqVar = aqlbVar.g;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            apmg apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
            this.l.b(apmgVar, acraVar);
            this.l.c = new ajyc() { // from class: fsd
                @Override // defpackage.ajyc
                public final void oC(aong aongVar) {
                    fse fseVar = fse.this;
                    fseVar.c.a.dismiss();
                    ojb ojbVar = fseVar.a.a;
                    if (ojbVar == null) {
                        return;
                    }
                    nqp nqpVar = ((DefaultWatchPanelViewController) ojbVar).e;
                    nqpVar.n(eri.r, false);
                    nqpVar.n(eri.s, false);
                }
            };
            YouTubeButton youTubeButton = this.k;
            aqyg aqygVar5 = apmgVar.i;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
            whu.G(youTubeButton, ajcq.b(aqygVar5));
            YouTubeButton youTubeButton2 = this.k;
            whu.E(youTubeButton2, youTubeButton2.getBackground());
        }
        if ((aqlbVar.b & 32) != 0) {
            aulq aulqVar2 = aqlbVar.h;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apmg apmgVar2 = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
            this.n.b(apmgVar2, acraVar);
            YouTubeButton youTubeButton3 = this.m;
            aqyg aqygVar6 = apmgVar2.i;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
            whu.G(youTubeButton3, ajcq.b(aqygVar6));
            YouTubeButton youTubeButton4 = this.m;
            whu.E(youTubeButton4, youTubeButton4.getBackground());
            return;
        }
        this.m.setVisibility(8);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqlb) obj).i.I();
    }
}
