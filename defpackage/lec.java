package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lec extends kwy {
    public static final /* synthetic */ int o = 0;
    private final Context p;
    private final ajop q;
    private final ajoi r;

    public lec(Context context, ajjz ajjzVar, gma gmaVar, aahd aahdVar, ajuw ajuwVar, ajut ajutVar, ViewGroup viewGroup) {
        super(context, ajjzVar, ajuwVar, R.layout.playlist_card_item, ajutVar, viewGroup, null, null, null, null, null, null, null);
        this.p = context;
        this.q = gmaVar;
        final View view = this.c;
        gmaVar.c(view);
        this.r = new ajoi(aahdVar, gmaVar);
        a().setTag(R.id.offset_adjuster_tag, new fyc() { // from class: leb
            @Override // defpackage.fyc
            public final void a(Rect rect) {
                View view2 = view;
                int i = lec.o;
                rect.left -= view2.getPaddingLeft();
                rect.right -= view2.getPaddingRight();
                rect.top -= view2.getPaddingTop();
            }
        });
        a().setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
    }

    private final int n() {
        return this.p.getResources().getDimensionPixelSize(R.dimen.playlist_card_width) + this.c.getPaddingLeft() + this.c.getPaddingRight();
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.q).b;
    }

    @Override // defpackage.kwy, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.r.c();
    }

    @Override // defpackage.ajom
    public final /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aqyg aqygVar;
        int n;
        auaq auaqVar = (auaq) obj;
        ajoi ajoiVar = this.r;
        acra acraVar = ajokVar.a;
        aqyg aqygVar2 = null;
        if ((auaqVar.b & 8) != 0) {
            apxfVar = auaqVar.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        ajokVar.a.u(new acqx(auaqVar.j), null);
        if (a().getLayoutParams() != null) {
            Resources resources = this.p.getResources();
            if ((auaqVar.b & 32) == 0 || resources.getConfiguration().orientation != 1) {
                n = n();
            } else {
                int i = resources.getDisplayMetrics().widthPixels;
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.horizontal_card_list_item_spacing);
                int bD = anaf.bD(auaqVar.i);
                if (bD == 0) {
                    bD = 1;
                }
                int i2 = bD - 1;
                if (i2 == 0) {
                    n = n();
                } else if (i2 != 1) {
                    n = (i - ((dimensionPixelSize * 3) + resources.getDimensionPixelSize(R.dimen.playlist_card_peek_width_two_or_more_fully_visible))) / 2;
                } else {
                    n = i - ((dimensionPixelSize + dimensionPixelSize) + resources.getDimensionPixelSize(R.dimen.playlist_card_peek_width_one_fully_visible));
                }
            }
            yny.z(a(), yny.x(n), ViewGroup.LayoutParams.class);
        }
        auda audaVar = auaqVar.c;
        if (audaVar == null) {
            audaVar = auda.a;
        }
        h(audaVar, null);
        i(auaqVar.f);
        if ((auaqVar.b & 2) != 0) {
            aqygVar = auaqVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        k(ajcq.b(aqygVar));
        if ((auaqVar.b & 4) != 0 && (aqygVar2 = auaqVar.e) == null) {
            aqygVar2 = aqyg.a;
        }
        d(ajcq.b(aqygVar2));
        View view = ((gma) this.q).b;
        atdf atdfVar = auaqVar.h;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        f(view, atdfVar, auaqVar, ajokVar.a);
        this.q.e(ajokVar);
    }
}
