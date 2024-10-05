package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yfx {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ImageView g;
    public final FixedAspectRatioFrameLayout h;

    public yfx(View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.header);
        this.c = (TextView) view.findViewById(R.id.sub_header);
        this.d = (TextView) view.findViewById(R.id.description);
        this.e = (TextView) view.findViewById(R.id.details);
        this.f = (TextView) view.findViewById(R.id.extended_description);
        this.g = (ImageView) view.findViewById(R.id.image);
        this.h = (FixedAspectRatioFrameLayout) view.findViewById(R.id.image_container);
    }
}
