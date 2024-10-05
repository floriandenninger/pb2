package defpackage;

import android.view.View;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.material.textview.MaterialTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vkf extends wv {
    public static final /* synthetic */ int w = 0;
    public final SquareImageView t;
    public final MaterialTextView u;
    public final View v;

    public vkf(View view) {
        super(view);
        this.t = (SquareImageView) view.findViewById(R.id.photo_picker_cluster_image_view);
        this.u = (MaterialTextView) view.findViewById(R.id.photo_picker_cluster_name);
        this.v = view.findViewById(R.id.photo_picker_cluster_gradient);
    }
}
