package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xwo {
    final View a;
    final View b;
    final YouTubeTextView c;
    final ImageView d;

    public xwo(View view, Context context, boolean z) {
        this.a = view;
        this.b = view.findViewById(R.id.access_restriction_background);
        YouTubeTextView youTubeTextView = (YouTubeTextView) view.findViewById(R.id.access_restriction_text);
        this.c = youTubeTextView;
        this.d = (ImageView) view.findViewById(R.id.access_restriction_image);
        if (z) {
            youTubeTextView.setTextAppearance(context, R.style.TextAppearance_YouTube_Spec_Body2a);
            youTubeTextView.setTextColor(wbs.W(context, R.attr.ytTextSecondary).orElse(0));
        }
    }
}
