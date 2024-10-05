package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zwq extends zwp {
    public zwq(Context context) {
        super(context);
    }

    @Override // defpackage.zwp
    protected final void b(Context context) {
        LayoutInflater.from(context).inflate(R.layout.media_grid_thumb_view_with_duration_background, (ViewGroup) this, true);
    }
}
