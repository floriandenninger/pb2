package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.infocards.ui.InfoCardsPlaylistThumbnailView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaac extends wv {
    final InfoCardsPlaylistThumbnailView t;
    final TextView u;
    final View v;
    final TextView w;
    final TextView x;
    final TextView y;

    public aaac(View view) {
        super(view);
        this.t = (InfoCardsPlaylistThumbnailView) view.findViewById(R.id.playlist_thumbnail);
        this.u = (TextView) view.findViewById(R.id.custom_message);
        this.v = view.findViewById(R.id.custom_message_divider);
        this.w = (TextView) view.findViewById(R.id.title);
        this.x = (TextView) view.findViewById(R.id.owner);
        this.y = (TextView) view.findViewById(R.id.video_count);
    }
}
