package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lfo implements ajom {
    private final Context a;
    private final ajos b;
    private final LinearLayout c;
    private ajom d;
    private ajom e;
    private ajom f;

    public lfo(Context context, ajos ajosVar) {
        this.a = context;
        this.b = ajosVar;
        this.c = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.watch_card_header_hero_layout, (ViewGroup) null, false);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.removeAllViews();
        ajom ajomVar = this.d;
        if (ajomVar != null) {
            ajomVar.b(ajosVar);
            ajosVar.b(this.d.a());
            this.d = null;
        }
        ajom ajomVar2 = this.e;
        if (ajomVar2 != null) {
            ajomVar2.b(ajosVar);
            ajosVar.b(this.e.a());
            this.e = null;
        }
        ajom ajomVar3 = this.f;
        if (ajomVar3 != null) {
            ajomVar3.b(ajosVar);
            ajosVar.b(this.f.a());
            this.f = null;
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        let letVar = (let) obj;
        this.c.removeAllViews();
        awcm awcmVar = letVar.a;
        awcw awcwVar = (awcmVar == null || awcmVar.b != 117928329) ? null : (awcw) awcmVar.c;
        if (awcwVar != null) {
            ajom r = ahbw.r(this.b, awcwVar, null);
            this.d = r;
            if (r != null) {
                r.a().setId(R.id.card_header);
                this.c.addView(this.d.a());
                this.d.oB(ajokVar, awcwVar);
                ahbw.x(this.d.a(), this.d, this.b.c(awcwVar));
            }
        }
        awcj awcjVar = letVar.b;
        awcn awcnVar = (awcjVar == null || awcjVar.b != 122710540) ? null : (awcn) awcjVar.c;
        auxo auxoVar = (awcjVar == null || awcjVar.b != 132989167) ? null : (auxo) awcjVar.c;
        if (awcnVar != null) {
            ajom r2 = ahbw.r(this.b, awcnVar, null);
            this.e = r2;
            if (r2 != null) {
                r2.a().setId(R.id.watch_card_hero);
                this.c.addView(this.e.a(), new ViewGroup.LayoutParams(-2, -1));
                this.e.oB(ajokVar, awcnVar);
                ahbw.x(this.e.a(), this.e, this.b.c(awcnVar));
            }
        } else if (auxoVar != null) {
            ajom r3 = ahbw.r(this.b, auxoVar, null);
            this.f = r3;
            if (r3 != null) {
                r3.a().setId(R.id.watch_card_hero);
                this.c.addView(this.f.a());
                this.f.oB(ajokVar, auxoVar);
                ahbw.x(this.f.a(), this.f, this.b.c(auxoVar));
            }
        }
        View findViewById = this.c.findViewById(R.id.card_header);
        View findViewById2 = this.c.findViewById(R.id.watch_card_hero);
        if (yjk.aa(this.a)) {
            this.c.setOrientation(0);
            if (findViewById != null) {
                yny.z(findViewById, yny.h(yny.y(0, -1), yny.w(true != yjk.Y(this.a) ? 0.4f : 0.5f)), LinearLayout.LayoutParams.class);
            }
            if (findViewById2 != null) {
                yny.z(findViewById2, yny.h(yny.x(0), yny.w(true != yjk.Y(this.a) ? 0.6f : 0.5f)), LinearLayout.LayoutParams.class);
                return;
            }
            return;
        }
        this.c.setOrientation(1);
        if (findViewById != null) {
            yny.z(findViewById, yny.h(yny.y(-1, -2), yny.w(0.0f)), LinearLayout.LayoutParams.class);
        }
        if (findViewById2 != null) {
            yny.z(findViewById2, yny.h(yny.x(-1), yny.w(0.0f)), LinearLayout.LayoutParams.class);
        }
    }
}
