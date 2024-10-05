package defpackage;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fsl {
    public final ajjz a;
    public final ImageView b;
    public final YouTubeTextView c;
    public final YouTubeTextView d;

    public fsl(ViewGroup viewGroup, boolean z, ajjz ajjzVar) {
        this.b = (ImageView) viewGroup.findViewById(R.id.campaign_image);
        YouTubeTextView youTubeTextView = (YouTubeTextView) viewGroup.findViewById(R.id.campaign_title_view);
        this.c = youTubeTextView;
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) viewGroup.findViewById(R.id.campaign_subtitle_view);
        this.d = youTubeTextView2;
        if (z) {
            youTubeTextView.setMaxLines(1);
            youTubeTextView.setEllipsize(TextUtils.TruncateAt.END);
            youTubeTextView2.setMaxLines(1);
            youTubeTextView2.setEllipsize(TextUtils.TruncateAt.END);
        }
        this.a = ajjzVar;
    }

    public final void a(aqlc aqlcVar) {
        ajjz ajjzVar = this.a;
        ImageView imageView = this.b;
        avgg avggVar = aqlcVar.e;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        YouTubeTextView youTubeTextView = this.c;
        aqyg aqygVar = aqlcVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(youTubeTextView, ajcq.b(aqygVar));
        YouTubeTextView youTubeTextView2 = this.d;
        aqyg aqygVar2 = aqlcVar.d;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(youTubeTextView2, ajcq.b(aqygVar2));
    }

    public fsl(ajjz ajjzVar, ViewGroup viewGroup) {
        this.a = ajjzVar;
        this.b = (ImageView) viewGroup.findViewById(R.id.creator_message_thumbnail);
        this.c = (YouTubeTextView) viewGroup.findViewById(R.id.creator_message_title);
        this.d = (YouTubeTextView) viewGroup.findViewById(R.id.creator_message_description);
    }
}
