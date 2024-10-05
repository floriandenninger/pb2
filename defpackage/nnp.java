package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nnp extends nnk {
    private final VideoQuality a;

    public nnp(Context context, VideoQuality videoQuality) {
        super(context, videoQuality.b);
        this.a = videoQuality;
    }

    public final int c() {
        return this.a.a;
    }

    public final String d() {
        return this.a.b;
    }
}
