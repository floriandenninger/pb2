package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afor extends wv {
    public final TextView t;
    public final TextView u;
    public final afol v;
    public final afon w;

    public afor(View view, afol afolVar, afon afonVar) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.location_search_item_title);
        this.u = (TextView) view.findViewById(R.id.location_search_item_subtitle);
        this.v = afolVar;
        this.w = afonVar;
    }
}
