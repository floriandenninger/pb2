package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaaj extends wv {
    final ImageView t;
    final TextView u;
    final TextView v;
    final TextView w;

    public aaaj(View view, byte[] bArr) {
        super(view);
        this.t = (ImageView) view.findViewById(R.id.image);
        this.v = (TextView) view.findViewById(R.id.subscriber_count);
        this.w = (TextView) view.findViewById(R.id.channel_name);
        this.u = (TextView) view.findViewById(R.id.custom_text);
    }

    public aaaj(View view) {
        super(view);
        this.t = (ImageView) view.findViewById(R.id.image);
        this.u = (TextView) view.findViewById(R.id.domain);
        this.v = (TextView) view.findViewById(R.id.title);
        this.w = (TextView) view.findViewById(R.id.call_to_action);
    }
}
