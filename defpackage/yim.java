package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yim extends ajpc {
    public final View a;
    public final ViewGroup b;
    private final YouTubeTextView c;
    private final ajyf d;
    private final YouTubeTextView e;
    private final ajyf f;
    private final Context g;
    private final aahd h;
    private final ajjz i;
    private final yiq j;

    public yim(ajyg ajygVar, aahd aahdVar, ajjz ajjzVar, Context context, final yii yiiVar, ViewGroup viewGroup) {
        this.g = context;
        this.h = aahdVar;
        this.i = ajjzVar;
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sponsorships_celebration_layout, viewGroup, false);
        this.a = inflate;
        yiq yiqVar = new yiq(context, ajjzVar, R.layout.sponsorships_header_layout_celebration, (ViewGroup) inflate.findViewById(R.id.header_view));
        this.j = yiqVar;
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.primary_button);
        this.c = youTubeTextView;
        ajyf a = ajygVar.a(youTubeTextView);
        this.d = a;
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) inflate.findViewById(R.id.secondary_button);
        this.e = youTubeTextView2;
        ajyf a2 = ajygVar.a(youTubeTextView2);
        this.f = a2;
        this.b = (ViewGroup) inflate.findViewById(R.id.content);
        final int i2 = 1;
        a.c = new ajyc() { // from class: yik
            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                if (i2 != 0) {
                    yiiVar.a();
                } else {
                    yiiVar.a();
                }
            }
        };
        a2.c = new ajyc() { // from class: yik
            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                if (i != 0) {
                    yiiVar.a();
                } else {
                    yiiVar.a();
                }
            }
        };
        ((ViewGroup) inflate.findViewById(R.id.header_view)).addView(yiqVar.a);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.removeAllViews();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apmg apmgVar;
        apmg apmgVar2;
        auwv auwvVar = (auwv) obj;
        acra acraVar = ajokVar.a;
        ajyf ajyfVar = this.d;
        aulq aulqVar = auwvVar.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        auwy auwyVar = null;
        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar2 = auwvVar.c;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        ajyfVar.b(apmgVar, acraVar);
        ajyf ajyfVar2 = this.f;
        aulq aulqVar3 = auwvVar.d;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        if (aulqVar3.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar4 = auwvVar.d;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            apmgVar2 = (apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar2 = null;
        }
        ajyfVar2.b(apmgVar2, acraVar);
        yiq yiqVar = this.j;
        aulq aulqVar5 = auwvVar.b;
        if (aulqVar5 == null) {
            aulqVar5 = aulq.a;
        }
        if (aulqVar5.pY(SponsorshipsRenderers.sponsorshipsHeaderRenderer)) {
            aulq aulqVar6 = auwvVar.b;
            if (aulqVar6 == null) {
                aulqVar6 = aulq.a;
            }
            auwyVar = (auwy) aulqVar6.pX(SponsorshipsRenderers.sponsorshipsHeaderRenderer);
        }
        yiqVar.d(auwyVar);
        Iterator it = auwvVar.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            aulq aulqVar7 = (aulq) it.next();
            if (aulqVar7.pY(SponsorshipsRenderers.sponsorshipsListTileRenderer)) {
                ycc yccVar = new ycc(this.h);
                final yiu yiuVar = new yiu(this.g, yccVar, this.i, this.b);
                yiuVar.oB(ajokVar, (auxb) aulqVar7.pX(SponsorshipsRenderers.sponsorshipsListTileRenderer));
                this.b.addView(yiuVar.a);
                yccVar.f(new ycb(new Runnable() { // from class: yil
                    @Override // java.lang.Runnable
                    public final void run() {
                        yim.this.b.removeView(yiuVar.a);
                    }
                }, 0));
            }
        }
        ViewGroup viewGroup = this.b;
        whu.I(viewGroup, viewGroup.getChildCount() > 0);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auwv) obj).f.I();
    }
}
