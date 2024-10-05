package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xzm extends wv {
    final TextView t;
    final TextView u;

    public xzm(View view, int i) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.select_image_cell_title);
        this.u = (TextView) view.findViewById(R.id.select_image_cell_subtitle);
        view.getLayoutParams().width = i;
        view.getLayoutParams().height = i;
    }
}
