package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lfq extends ajpc implements lgk {
    private final LayoutInflater a;
    private final ajjz b;
    private final ajoi c;
    private final ViewGroup d;
    private final akbd e;
    private boolean f;
    private lfp g;
    private lfp h;

    public lfq(Context context, ajjz ajjzVar, aahd aahdVar, akbd akbdVar) {
        this.a = LayoutInflater.from(context);
        this.b = ajjzVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setClickable(true);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.c = new ajoi(aahdVar, frameLayout);
        this.e = akbdVar;
    }

    private final lfp m() {
        if (this.f) {
            if (this.g == null) {
                this.g = new lfp(this.a.inflate(R.layout.watch_card_hero_one_vs_one_event, this.d, false));
            }
            if (this.e.d()) {
                akbd akbdVar = this.e;
                ImageView imageView = this.g.i;
                akbdVar.c(imageView, akbdVar.a(imageView, null));
            } else {
                whu.s(this.g.i, whu.x(this.d.getContext(), 0));
            }
            return this.g;
        }
        if (this.h == null) {
            this.h = new lfp(this.a.inflate(R.layout.watch_card_hero_one_vs_one_event_no_thumbnail, this.d, false));
        }
        return this.h;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.c();
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        auxo auxoVar = (auxo) obj;
        this.f = 1 == (auxoVar.b & 1);
        lfp m = m();
        this.d.removeAllViews();
        this.d.addView(m.a);
        ajoi ajoiVar = this.c;
        acra acraVar = ajokVar.a;
        if ((auxoVar.b & 2) != 0) {
            apxfVar = auxoVar.d;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        if (this.f) {
            ajjz ajjzVar = this.b;
            ImageView imageView = m.i;
            avgg avggVar = auxoVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
            TextView textView = m.h;
            if ((auxoVar.b & 8) != 0) {
                aqygVar = auxoVar.f;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            Spanned b = ajcq.b(aqygVar);
            if ((auxoVar.b & 8) != 0) {
                aqygVar2 = auxoVar.f;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            fkc.m(textView, b, ajcq.i(aqygVar2), auxoVar.g, null);
        }
        auxp auxpVar = auxoVar.e;
        if (auxpVar == null) {
            auxpVar = auxp.h();
        }
        mcy.L(this, auxpVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auxo) obj).h.I();
    }

    @Override // defpackage.lgk
    public final TextView f() {
        return m().g;
    }

    @Override // defpackage.lgk
    public final TextView g() {
        return m().d;
    }

    @Override // defpackage.lgk
    public final TextView h() {
        return m().e;
    }

    @Override // defpackage.lgk
    public final TextView i() {
        return m().f;
    }

    @Override // defpackage.lgk
    public final TextView j() {
        return m().b;
    }

    @Override // defpackage.lgk
    public final TextView k() {
        return m().c;
    }
}
