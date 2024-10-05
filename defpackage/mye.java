package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mye extends mlc {
    private final ajop C;
    private final ajoi D;
    private final nbp E;
    public final RelativeLayout a;
    public aqco b;
    private final LinearLayout c;
    private final TextView d;
    private final Resources e;
    private final ajuw f;

    public mye(Context context, ajjz ajjzVar, aahd aahdVar, gma gmaVar, ajuw ajuwVar, tdv tdvVar, euv euvVar) {
        super(context, ajjzVar, aahdVar, gmaVar, R.layout.compact_promoted_video_item, null, null, null, null, null, null, null);
        this.C = gmaVar;
        this.e = context.getResources();
        ajuwVar.getClass();
        this.f = ajuwVar;
        this.D = new ajoi(aahdVar, gmaVar);
        LinearLayout linearLayout = (LinearLayout) this.i.findViewById(R.id.video_info_view);
        this.c = linearLayout;
        this.a = (RelativeLayout) linearLayout.findViewById(R.id.thumbnail_layout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.ad_call_to_action);
        this.d = textView;
        textView.setOnClickListener(new myc(this, aahdVar));
        this.E = new nbp(aahdVar, tdvVar, euvVar, a());
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.C).b;
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.D.c();
        this.E.c();
    }

    @Override // defpackage.ajom
    public final /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aoxy aoxyVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        Spanned spanned;
        aqyg aqygVar3;
        aqyg aqygVar4;
        int dimension;
        aqco aqcoVar = (aqco) obj;
        ajoi ajoiVar = this.D;
        acra acraVar = ajokVar.a;
        if ((aqcoVar.b & 512) != 0) {
            apxfVar = aqcoVar.i;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.b(acraVar, apxfVar, ajokVar.e(), this);
        aqcoVar.getClass();
        this.b = aqcoVar;
        nbp nbpVar = this.E;
        acra acraVar2 = ajokVar.a;
        String str = aqcoVar.q;
        amru a = nbp.a(aqcoVar.k);
        if ((aqcoVar.b & 65536) != 0) {
            aoxy aoxyVar2 = aqcoVar.o;
            if (aoxyVar2 == null) {
                aoxyVar2 = aoxy.a;
            }
            aoxyVar = aoxyVar2;
        } else {
            aoxyVar = null;
        }
        nbpVar.d(acraVar2, aqcoVar, str, a, aoxyVar, aqcoVar.j.I());
        if ((aqcoVar.b & 4) != 0) {
            aqygVar = aqcoVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        A(ajcq.b(aqygVar));
        if ((aqcoVar.b & 16) != 0) {
            aqygVar2 = aqcoVar.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b = ajcq.b(aqygVar2);
        int i = aqcoVar.b;
        if ((i & 128) != 0) {
            aqyg aqygVar5 = aqcoVar.g;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
            spanned = ajcq.b(aqygVar5);
        } else if ((i & 64) != 0) {
            aqyg aqygVar6 = aqcoVar.f;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
            spanned = ajcq.b(aqygVar6);
        } else {
            spanned = null;
        }
        m(b, spanned, false);
        if ((aqcoVar.b & 256) != 0) {
            aqygVar3 = aqcoVar.h;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        Spanned b2 = ajcq.b(aqygVar3);
        if ((aqcoVar.b & 256) != 0) {
            aqygVar4 = aqcoVar.h;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
        } else {
            aqygVar4 = null;
        }
        o(b2, ajcq.i(aqygVar4));
        if (fav.h(ajokVar)) {
            this.c.setOrientation(1);
            this.z = this.e.getInteger(R.integer.compact_renderer_title_grid_mode_max_lines);
            yny.z(this.a, yny.x(-1), LinearLayout.LayoutParams.class);
            dimension = 0;
        } else {
            this.c.setOrientation(0);
            this.z = this.e.getInteger(R.integer.compact_renderer_title_max_lines);
            dimension = (int) this.e.getDimension(R.dimen.compact_video_thumbnail_margin);
            this.a.getViewTreeObserver().addOnPreDrawListener(new myd(this, aqcoVar));
        }
        yny.z(this.a, yny.q(dimension), LinearLayout.LayoutParams.class);
        avgg avggVar = aqcoVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        y(avggVar);
        aqcn aqcnVar = this.b.p;
        if (aqcnVar == null) {
            aqcnVar = aqcn.a;
        }
        if ((aqcnVar.b & 1) == 0) {
            this.n.setVisibility(0);
            this.d.setVisibility(8);
        } else {
            aqcn aqcnVar2 = this.b.p;
            if (aqcnVar2 == null) {
                aqcnVar2 = aqcn.a;
            }
            auib auibVar = aqcnVar2.c;
            if (auibVar == null) {
                auibVar = auib.a;
            }
            aqyg aqygVar7 = auibVar.c;
            if (aqygVar7 == null) {
                aqygVar7 = aqyg.a;
            }
            Spanned b3 = ajcq.b(aqygVar7);
            if (!TextUtils.isEmpty(b3)) {
                this.d.setText(b3);
                this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            } else {
                this.d.setText((CharSequence) null);
                jm.t(this.d, 0, R.drawable.ad_feed_call_to_action_arrow);
            }
            this.n.setVisibility(4);
            this.d.setVisibility(0);
        }
        atdf atdfVar = aqcoVar.m;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) == 0) {
            this.y.setVisibility(8);
        } else {
            ajuw ajuwVar = this.f;
            View view = ((gma) this.C).b;
            View view2 = this.y;
            atdf atdfVar2 = aqcoVar.m;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdc atdcVar = atdfVar2.c;
            if (atdcVar == null) {
                atdcVar = atdc.a;
            }
            ajuwVar.e(view, view2, atdcVar, aqcoVar, ajokVar.a);
            this.y.setVisibility(0);
        }
        this.C.e(ajokVar);
    }
}
