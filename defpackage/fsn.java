package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fsn {
    public final Context a;
    public final aahd b;
    public final YouTubeTextView c;
    public final YouTubeTextView d;

    public fsn(Context context, aahd aahdVar, ViewGroup viewGroup) {
        this.a = context;
        this.b = aahdVar;
        this.c = (YouTubeTextView) viewGroup.findViewById(R.id.nonprofit_title_view);
        this.d = (YouTubeTextView) viewGroup.findViewById(R.id.nonprofit_subtitle_view);
    }
}
