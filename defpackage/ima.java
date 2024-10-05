package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ima {
    public final TextView a;
    public final TextView b;
    public final ajkj c;
    private final ImageView d;

    public ima(View view, ajjz ajjzVar) {
        ImageView imageView = (ImageView) view.findViewById(R.id.reel_vod_link_thumbnail);
        this.d = imageView;
        this.a = (TextView) view.findViewById(R.id.reel_vod_link_duration);
        this.b = (TextView) view.findViewById(R.id.reel_vod_link_title);
        this.c = new ajkj(ajjzVar, new yzw(), imageView, false);
    }
}
