package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yis implements ajom {
    private final aahd a;
    private final ViewGroup b;

    public yis(Context context, aahd aahdVar, ViewGroup viewGroup) {
        this.a = aahdVar;
        this.b = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.sponsorships_links_layout, viewGroup, false);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.removeAllViews();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.links_in_between_padding);
        for (aqyg aqygVar : ((auxa) obj).b) {
            YouTubeTextView youTubeTextView = new YouTubeTextView(this.b.getContext());
            youTubeTextView.setText(aahk.a(aqygVar, this.a, false));
            youTubeTextView.c();
            youTubeTextView.d(true);
            youTubeTextView.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            this.b.addView(youTubeTextView);
        }
    }
}
