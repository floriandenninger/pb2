package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.RefinementChipRendererOuterClass;
import com.google.protos.youtube.api.innertube.RichListHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.VideoCardRendererOuterClass;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class led extends ajpc {
    private final CardView a;
    private final LinearLayout b;
    private final LinearLayout c;
    private final azrw d;
    private final lfb e;
    private final int f;
    private final int g;
    private ajom h;
    private final ArrayList i = new ArrayList();
    private final lei j;

    public led(Activity activity, lei leiVar, azrw azrwVar, lfb lfbVar, ViewGroup viewGroup) {
        LayoutInflater from = LayoutInflater.from(activity);
        from.getClass();
        this.j = leiVar;
        this.d = azrwVar;
        this.e = lfbVar;
        this.f = activity.getResources().getDimensionPixelSize(R.dimen.preview_card_refinement_chip_header_margin);
        this.g = activity.getResources().getDimensionPixelSize(R.dimen.preview_card_refinement_chip_header_bottom_margin);
        CardView cardView = (CardView) from.inflate(R.layout.preview_card, viewGroup, false);
        this.a = cardView;
        this.b = (LinearLayout) cardView.findViewById(R.id.card_layout);
        this.c = (LinearLayout) cardView.findViewById(R.id.preview_videos);
    }

    private final void f(View view) {
        view.setId(R.id.header);
        View findViewById = this.b.findViewById(R.id.header);
        if (findViewById != null) {
            this.b.removeView(findViewById);
        }
        this.b.addView(view, 0);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ajom ajomVar = this.h;
        if (ajomVar != null) {
            ajomVar.b(ajosVar);
        }
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ajom) arrayList.get(i)).b(ajosVar);
        }
    }

    @Override // defpackage.ajpc
    protected final /* synthetic */ void d(ajok ajokVar, Object obj) {
        aufd aufdVar = (aufd) obj;
        aulq aulqVar = aufdVar.b;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(RichListHeaderRendererOuterClass.richListHeaderRenderer)) {
            lej lejVar = (lej) this.d.get();
            this.h = lejVar;
            aulq aulqVar2 = aufdVar.b;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            lejVar.oB(ajokVar, (aumq) aulqVar2.pX(RichListHeaderRendererOuterClass.richListHeaderRenderer));
            f(lejVar.a);
        } else {
            aulq aulqVar3 = aufdVar.b;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            if (aulqVar3.pY(RefinementChipRendererOuterClass.refinementChipRenderer)) {
                leh b = this.j.b(null);
                this.h = b;
                aulq aulqVar4 = aufdVar.b;
                if (aulqVar4 == null) {
                    aulqVar4 = aulq.a;
                }
                b.oB(ajokVar, (aukx) aulqVar4.pX(RefinementChipRendererOuterClass.refinementChipRenderer));
                CardView cardView = b.a;
                f(cardView);
                ejz ejzVar = new ejz(15);
                int i = this.f;
                yny.A(cardView, ejzVar, yny.h(yny.y(-1, -2), yny.s(i, i, i, this.g)), ViewGroup.MarginLayoutParams.class);
            }
        }
        this.c.removeAllViews();
        this.i.clear();
        for (int i2 = 0; i2 < aufdVar.c.size(); i2++) {
            aulq aulqVar5 = (aulq) aufdVar.c.get(i2);
            if (aulqVar5.pY(VideoCardRendererOuterClass.videoCardRenderer)) {
                lfa b2 = this.e.b(this.c);
                this.i.add(b2);
                b2.oB(ajokVar, (avwg) aulqVar5.pX(VideoCardRendererOuterClass.videoCardRenderer));
                this.c.addView(b2.a());
            }
        }
        aulq aulqVar6 = aufdVar.b;
        if (aulqVar6 == null) {
            aulqVar6 = aulq.a;
        }
        if (aulqVar6.pY(RichListHeaderRendererOuterClass.richListHeaderRenderer)) {
            View findViewById = this.a.findViewById(R.id.header);
            this.c.measure(0, 0);
            yny.z(findViewById, yny.x(this.c.getMeasuredWidth()), ViewGroup.LayoutParams.class);
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aufd) obj).d.I();
    }
}
