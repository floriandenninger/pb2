package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uyv {
    public final TextView a;
    public final ImageView b;
    public final ImageView c;

    public uyv(View view) {
        this.a = (TextView) view.findViewById(R.id.list_item_text);
        this.b = (ImageView) view.findViewById(R.id.list_item_icon_primary);
        this.c = (ImageView) view.findViewById(R.id.list_item_icon_secondary);
    }
}
