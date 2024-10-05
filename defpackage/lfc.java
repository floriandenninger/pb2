package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lfc extends mlc {
    private final ajoi a;
    private final ajut b;
    private final ajuw c;
    private final TextView d;
    private final View e;
    private final ViewGroup f;

    public lfc(Context context, ajjz ajjzVar, aahd aahdVar, ajop ajopVar, ajuw ajuwVar, ajut ajutVar) {
        super(context, ajjzVar, aahdVar, ajopVar, R.layout.watch_card_compact_video_condensed_item, null, null, null, null, null, null, null);
        this.a = new ajoi(aahdVar, ajopVar);
        View view = this.i;
        this.d = (TextView) view.findViewById(R.id.serial_id);
        this.e = view.findViewById(R.id.thumbnail_layout);
        this.f = (ViewGroup) view.findViewById(R.id.badge_layout);
        this.c = ajuwVar;
        this.b = ajutVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.i;
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.a.c();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        atdc atdcVar;
        awcl awclVar = (awcl) obj;
        ajoi ajoiVar = this.a;
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
        if ((awclVar.b & 1) != 0) {
            avgg avggVar = awclVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            y(avggVar);
            whu.I(this.e, true);
            whu.I(this.d, false);
        } else {
            whu.G(this.d, awclVar.m);
            whu.I(this.e, false);
        }
        TextView textView = this.j;
        if ((awclVar.b & 2) != 0) {
            aqygVar = awclVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.n;
        if ((awclVar.b & 4) != 0) {
            aqygVar2 = awclVar.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        mcy.K(this.g, this.f, this.b, awclVar.j, false);
        if ((awclVar.b & 16) != 0) {
            aqygVar3 = awclVar.g;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        Spanned b = ajcq.b(aqygVar3);
        if ((awclVar.b & 16) != 0) {
            aqygVar4 = awclVar.g;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
        } else {
            aqygVar4 = null;
        }
        p(b, ajcq.i(aqygVar4), awclVar.i, null);
        ajuw ajuwVar = this.c;
        View view = this.i;
        View view2 = this.y;
        atdf atdfVar = awclVar.l;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((1 & atdfVar.b) != 0) {
            atdf atdfVar2 = awclVar.l;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdc atdcVar2 = atdfVar2.c;
            if (atdcVar2 == null) {
                atdcVar2 = atdc.a;
            }
            atdcVar = atdcVar2;
        } else {
            atdcVar = null;
        }
        ajuwVar.e(view, view2, atdcVar, awclVar, ajokVar.a);
    }
}
