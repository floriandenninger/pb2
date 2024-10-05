package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hwe extends wv {
    public final View t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final TextView x;

    public hwe(View view) {
        super(view);
        this.t = view;
        this.u = (ImageView) view.findViewById(R.id.reel_create_new_playlist_button);
        this.x = (TextView) view.findViewById(R.id.reel_playlist_title);
        this.v = (ImageView) view.findViewById(R.id.reel_item_thumbnail);
        this.w = (ImageView) view.findViewById(R.id.reel_item_selected);
    }
}
