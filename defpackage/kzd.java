package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kzd extends wv {
    final zbb t;
    final ImageView u;
    final View v;
    final ImageView w;

    public kzd(View view, zbb zbbVar) {
        super(view);
        this.t = zbbVar;
        this.u = (ImageView) view.findViewById(R.id.image);
        this.v = view.findViewById(R.id.scrim);
        this.w = (ImageView) view.findViewById(R.id.logo);
    }
}
