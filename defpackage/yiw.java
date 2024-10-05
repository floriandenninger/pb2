package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yiw implements ajom {
    public final ViewGroup a;
    private final Context b;
    private final aahd c;
    private final ajjz d;
    private final YouTubeTextView e;
    private final ViewGroup f;
    private final ArrayList g = new ArrayList();
    private int h = -1;

    public yiw(Context context, aahd aahdVar, ajjz ajjzVar, ViewGroup viewGroup) {
        this.b = context;
        this.c = aahdVar;
        this.d = ajjzVar;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.sponsorships_loyalty_badges_layout, viewGroup, false);
        this.a = viewGroup2;
        this.e = (YouTubeTextView) viewGroup2.findViewById(R.id.description);
        this.f = (ViewGroup) viewGroup2.findViewById(R.id.badges);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    public final void d(boolean z) {
        int i = 0;
        while (i < this.g.size()) {
            yiv yivVar = (yiv) this.g.get(i);
            if (z) {
                int i2 = this.h;
                if (i2 != -1) {
                    yivVar.d(i2 == i ? 1 : 2);
                } else {
                    yivVar.d(4);
                }
            } else {
                int i3 = this.h;
                if (i3 == -1) {
                    i3 = 0;
                }
                yivVar.d(i != i3 ? 3 : 4);
            }
            i++;
        }
    }

    public final void e(auxd auxdVar) {
        aqyg aqygVar;
        YouTubeTextView youTubeTextView = this.e;
        if ((auxdVar.b & 1) != 0) {
            aqygVar = auxdVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(youTubeTextView, aahk.a(aqygVar, this.c, false));
        this.h = auxdVar.e;
        for (aulq aulqVar : auxdVar.d) {
            yiv yivVar = new yiv(this.b, this.c, this.d, this.f);
            yivVar.e((auxc) ahbj.n(aulqVar, SponsorshipsRenderers.sponsorshipsLoyaltyBadgeRenderer));
            this.f.addView(yivVar.a);
            this.g.add(yivVar);
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        e((auxd) obj);
    }
}
