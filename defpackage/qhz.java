package defpackage;

import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qhz {
    private final String b = "com.google.android.gms.cast.framework.media.MediaIntentReceiver";
    public NotificationOptions a = new NotificationOptions(NotificationOptions.a, NotificationOptions.b, 10000, null, qip.i("smallIconDrawableResId"), qip.i("stopLiveStreamDrawableResId"), qip.i("pauseDrawableResId"), qip.i("playDrawableResId"), qip.i("skipNextDrawableResId"), qip.i("skipPrevDrawableResId"), qip.i("forwardDrawableResId"), qip.i("forward10DrawableResId"), qip.i("forward30DrawableResId"), qip.i("rewindDrawableResId"), qip.i("rewind10DrawableResId"), qip.i("rewind30DrawableResId"), qip.i("disconnectDrawableResId"), qip.i("notificationImageSizeDimenResId"), qip.i("castingToDeviceStringResId"), qip.i("stopLiveStreamStringResId"), qip.i("pauseStringResId"), qip.i("playStringResId"), qip.i("skipNextStringResId"), qip.i("skipPrevStringResId"), qip.i("forwardStringResId"), qip.i("forward10StringResId"), qip.i("forward30StringResId"), qip.i("rewindStringResId"), qip.i("rewind10StringResId"), qip.i("rewind30StringResId"), qip.i("disconnectStringResId"), null);

    public final CastMediaOptions a() {
        return new CastMediaOptions(this.b, null, null, this.a, false, true);
    }
}
