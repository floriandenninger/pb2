package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class koa {
    public final yzr a;
    public final yzr b;
    final yzr c;
    public final yzr d;
    public final yzr e;
    public final yzr f;
    public final yzr g;

    public koa(View view, int i) {
        long j = i;
        this.b = new yzr((FrameLayout) view.findViewById(R.id.player_video_heading), j, 8);
        this.a = new yzr((LinearLayout) view.findViewById(R.id.player_additional_view_container), j, 8);
        this.e = new yzr((TouchImageView) view.findViewById(R.id.player_collapse_button), j, 8);
        this.f = new yzr((TouchImageView) view.findViewById(R.id.player_overflow_button), j, 8);
        this.d = new yzr((TouchImageView) view.findViewById(R.id.live_chat_overlay_button), j, 8);
        this.c = new yzr(view.findViewById(R.id.title_anchor), j, 8);
        this.g = new yzr((ImageView) view.findViewById(R.id.hide_controls_button_top), j, 8);
    }
}
