package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lfd extends mlc {
    protected final Resources a;
    protected final LinearLayout b;
    protected final RelativeLayout c;
    private final ajoi d;
    private final ajut e;
    private final ViewGroup f;

    public lfd(Context context, ajjz ajjzVar, aahd aahdVar, ajop ajopVar, ajut ajutVar) {
        super(context, ajjzVar, aahdVar, ajopVar, R.layout.watch_card_compact_video_item, null, null, null, null, null, null, null);
        this.a = context.getResources();
        this.d = new ajoi(aahdVar, ajopVar);
        LinearLayout linearLayout = (LinearLayout) this.i.findViewById(R.id.video_info_view);
        this.b = linearLayout;
        this.c = (RelativeLayout) linearLayout.findViewById(R.id.thumbnail_layout);
        this.f = (ViewGroup) linearLayout.findViewById(R.id.badge_layout);
        this.e = ajutVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.i;
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.d.c();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apxf apxfVar;
        int dimension;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        aqyg aqygVar5;
        awcl awclVar = (awcl) obj;
        ajoi ajoiVar = this.d;
        acra acraVar = ajokVar.a;
        if ((awclVar.b & 64) != 0) {
            apxfVar = awclVar.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.b(acraVar, apxfVar, ajokVar.e(), this);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.c.getLayoutParams();
        if (fav.h(ajokVar)) {
            this.b.setOrientation(1);
            layoutParams.width = -1;
            dimension = 0;
        } else {
            this.b.setOrientation(0);
            layoutParams.width = (int) this.a.getDimension(R.dimen.watch_card_list_item_thumbnail_width);
            dimension = (int) this.a.getDimension(R.dimen.compact_video_thumbnail_margin);
        }
        layoutParams.setMarginEnd(dimension);
        if ((awclVar.b & 2) != 0) {
            aqygVar = awclVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        A(ajcq.b(aqygVar));
        if ((awclVar.b & 8) != 0) {
            aqygVar2 = awclVar.f;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(this.m, ajcq.b(aqygVar2));
        if ((awclVar.b & 4) != 0) {
            aqygVar3 = awclVar.e;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(this.n, ajcq.b(aqygVar3));
        if ((awclVar.b & 16) != 0) {
            aqygVar4 = awclVar.g;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
        } else {
            aqygVar4 = null;
        }
        Spanned b = ajcq.b(aqygVar4);
        if ((awclVar.b & 16) != 0) {
            aqygVar5 = awclVar.g;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
        } else {
            aqygVar5 = null;
        }
        p(b, ajcq.i(aqygVar5), awclVar.i, null);
        avgg avggVar = awclVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        y(avggVar);
        mcy.K(this.g, this.f, this.e, awclVar.j, false);
    }
}
