package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aclj extends RelativeLayout {
    public final TextView a;
    public final TextView b;

    public aclj(Context context) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.lc_stat_item, (ViewGroup) this, true);
        setPaddingRelative((int) getResources().getDimension(R.dimen.lc_post_stream_containers_margin), (int) getResources().getDimension(R.dimen.lc_post_stream_stat_margin_top), 0, 0);
        this.a = (TextView) findViewById(R.id.stat_title_text_view);
        this.b = (TextView) findViewById(R.id.stat_value_text_view);
    }
}
