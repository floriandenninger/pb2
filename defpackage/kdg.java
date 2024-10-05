package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kdg {
    public final ajjz a;
    public final Context b;
    public final LinearLayout c;
    public final YouTubeTextView d;
    public final TextView e;
    public final ImageView f;
    public final DurationBadgeView g;
    public final View h;
    public atzm i;
    public boolean j;
    public final ajoy k;

    public kdg(View view, ajjz ajjzVar, Context context, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        view.getClass();
        this.a = ajjzVar;
        this.k = ajoyVar;
        this.d = (YouTubeTextView) view.findViewById(R.id.video_title);
        this.e = (TextView) view.findViewById(R.id.byline);
        this.f = (ImageView) view.findViewById(R.id.thumbnail);
        this.g = (DurationBadgeView) view.findViewById(R.id.duration);
        this.h = view.findViewById(R.id.touch_area);
        this.c = (LinearLayout) view.findViewById(R.id.top_badges_container);
        this.b = yjk.p(context, null, R.style.Theme_YouTube_Dark);
    }

    public final atzm a() {
        atzm atzmVar = this.i;
        atzmVar.getClass();
        return atzmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
        whu.I(this.h, onClickListener != null);
    }
}
