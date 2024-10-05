package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lva extends wv {
    public final View t;
    public final ImageView u;
    public final TextView v;
    public final YouTubeButton w;

    public lva(View view) {
        super(view);
        this.t = view;
        this.u = (ImageView) view.findViewById(R.id.multi_reel_dismissal_channel_avatar);
        this.v = (TextView) view.findViewById(R.id.multi_reel_dismissal_channel_title);
        this.w = (YouTubeButton) view.findViewById(R.id.multi_reel_dismissal_undo_button);
    }
}
