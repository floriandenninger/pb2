package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fso {
    private final Context a;
    private final ProgressBar b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final YouTubeTextView f;
    private final aahd g;

    public fso(Context context, ViewGroup viewGroup, aahd aahdVar) {
        this.a = context;
        this.g = aahdVar;
        this.b = (ProgressBar) viewGroup.findViewById(R.id.progress_bar);
        this.c = (YouTubeTextView) viewGroup.findViewById(R.id.start_label);
        this.d = (YouTubeTextView) viewGroup.findViewById(R.id.end_label);
        this.e = (YouTubeTextView) viewGroup.findViewById(R.id.amount_raised_label);
        this.f = (YouTubeTextView) viewGroup.findViewById(R.id.match_label);
    }

    public final void a(aqlc aqlcVar) {
        if ((aqlcVar.b & 8192) != 0) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.b.setProgress((int) (aqlcVar.g * 100.0f));
            this.b.setProgressTintList(ColorStateList.valueOf(wbs.W(this.a, R.attr.ytCallToAction).orElse(0)));
        }
        YouTubeTextView youTubeTextView = this.c;
        aqyg aqygVar = aqlcVar.h;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(youTubeTextView, ajcq.b(aqygVar));
        YouTubeTextView youTubeTextView2 = this.d;
        aqyg aqygVar2 = aqlcVar.i;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(youTubeTextView2, ajcq.b(aqygVar2));
        YouTubeTextView youTubeTextView3 = this.e;
        aqyg aqygVar3 = aqlcVar.k;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(youTubeTextView3, ajcq.b(aqygVar3));
        YouTubeTextView youTubeTextView4 = this.f;
        aqyg aqygVar4 = aqlcVar.j;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        whu.G(youTubeTextView4, ajcq.c(aqygVar4, new ajrv(this.g)));
        this.f.c();
    }
}
