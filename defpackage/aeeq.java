package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aeeq {
    public static final VideoQuality[] a = new VideoQuality[0];
    public static final aanb[] b = new aanb[0];

    public abstract aeeu a(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, aees aeesVar);

    public final aeeu b(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z) {
        return c(videoStreamingData, playerConfigModel, z, null);
    }

    public final aeeu c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aees aeesVar) {
        return d(videoStreamingData, playerConfigModel, z, aeesVar, Integer.MAX_VALUE);
    }

    public abstract aeeu d(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aees aeesVar, int i);
}
