package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yjd implements ajom {
    public final LinearLayout a;
    public final ArrayList b = new ArrayList();
    private final yjc c;

    public yjd(Context context, yjc yjcVar, ViewGroup viewGroup) {
        this.c = yjcVar;
        this.a = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.sponsorships_perks_layout, viewGroup, false);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, auxj auxjVar) {
        this.a.removeAllViews();
        this.b.clear();
        if (auxjVar == null) {
            return;
        }
        if ((auxjVar.b & 1) != 0) {
            YouTubeTextView youTubeTextView = new YouTubeTextView(this.a.getContext());
            youTubeTextView.setTextAppearance(this.a.getContext(), R.style.TextAppearance_YouTube_Body2);
            aqyg aqygVar = auxjVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            youTubeTextView.setText(ajcq.b(aqygVar));
            this.a.addView(youTubeTextView);
        }
        Iterator it = auxjVar.d.iterator();
        while (it.hasNext()) {
            auxi auxiVar = (auxi) ahbj.n((aulq) it.next(), SponsorshipsRenderers.sponsorshipsPerkRenderer);
            if (auxiVar != null) {
                yjb b = this.c.b(this.a);
                this.b.add(b);
                this.a.addView(b.b);
                b.d(auxiVar);
            }
        }
    }
}
