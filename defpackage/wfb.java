package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wfb extends wv {
    public static final /* synthetic */ int u = 0;
    public final TextView t;

    public wfb(View view) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.dropdown_item_label);
    }

    public wfb(TextView textView) {
        super(textView);
        this.t = textView;
    }
}
