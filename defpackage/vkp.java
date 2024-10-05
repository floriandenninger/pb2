package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vkp extends wv {
    public static final /* synthetic */ int v = 0;
    public final ImageView t;
    public final MaterialTextView u;

    public vkp(View view) {
        super(view);
        this.t = (ImageView) view.findViewById(R.id.photo_picker_photos_header_image);
        this.u = (MaterialTextView) view.findViewById(R.id.photo_picker_photos_header_name);
    }
}
