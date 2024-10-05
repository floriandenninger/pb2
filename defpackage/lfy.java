package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lfy extends mlc implements lgk {
    private final TextView C;
    private final TextView D;
    private final ajoi a;
    private final ajop b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;

    public lfy(Context context, ajjz ajjzVar, aahd aahdVar, gma gmaVar) {
        super(context, ajjzVar, aahdVar, gmaVar, R.layout.watch_card_one_vs_one_event_compact_video_item, (ViewGroup) null, (ohg) null, (ajoy) null, (c) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.b = gmaVar;
        this.a = new ajoi(aahdVar, gmaVar);
        View view = this.i;
        this.c = view.findViewById(R.id.thumbnail_layout);
        this.d = (TextView) view.findViewById(R.id.top_name);
        this.e = (TextView) view.findViewById(R.id.top_result);
        this.f = (TextView) view.findViewById(R.id.bottom_name);
        this.C = (TextView) view.findViewById(R.id.bottom_result);
        this.D = (TextView) view.findViewById(R.id.additional_event_description);
    }

    private static void d(View view, int i) {
        jw.Y(view, i, view.getPaddingTop(), jw.h(view), view.getPaddingBottom());
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.b).b;
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.a.c();
    }

    @Override // defpackage.lgk
    public final TextView f() {
        return this.D;
    }

    @Override // defpackage.lgk
    public final TextView g() {
        return this.f;
    }

    @Override // defpackage.lgk
    public final TextView h() {
        return this.C;
    }

    @Override // defpackage.lgk
    public final TextView i() {
        return this.n;
    }

    @Override // defpackage.lgk
    public final TextView j() {
        return this.d;
    }

    @Override // defpackage.lgk
    public final TextView k() {
        return this.e;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        auxq auxqVar = (auxq) obj;
        ajoi ajoiVar = this.a;
        acra acraVar = ajokVar.a;
        if ((auxqVar.b & 8) != 0) {
            apxfVar = auxqVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.b(acraVar, apxfVar, ajokVar.e(), this);
        ajokVar.a.u(new acqx(auxqVar.h), null);
        ajok ajokVar2 = new ajok(ajokVar);
        ajokVar2.b = auxqVar.h.I();
        auxp auxpVar = auxqVar.d;
        if (auxpVar == null) {
            auxpVar = auxp.h();
        }
        mcy.L(this, auxpVar);
        int i = auxqVar.b;
        int i2 = 0;
        if ((i & 1) == 0) {
            this.c.setVisibility(8);
        } else {
            if ((i & 4) != 0) {
                aqygVar = auxqVar.e;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            Spanned b = ajcq.b(aqygVar);
            if ((auxqVar.b & 4) != 0) {
                aqygVar2 = auxqVar.e;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            p(b, ajcq.i(aqygVar2), auxqVar.g, null);
            avgg avggVar = auxqVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            y(avggVar);
            this.c.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            Resources resources = this.g.getResources();
            i2 = resources.getDimensionPixelSize(R.dimen.watch_card_one_vs_one_event_padding_start);
            yny.z(this.i, yny.n(resources.getDimensionPixelSize(R.dimen.watch_card_one_vs_one_event_no_thumbnail_height) - resources.getDimensionPixelSize(R.dimen.line_separator_height)), ViewGroup.LayoutParams.class);
        }
        d(this.d, i2);
        d(this.f, i2);
        d(this.n, i2);
        d(this.D, i2);
        this.b.e(ajokVar2);
    }
}
