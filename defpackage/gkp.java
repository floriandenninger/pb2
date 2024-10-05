package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gkp implements gkv {
    private final /* synthetic */ int k;
    public static final /* synthetic */ gkp j = new gkp(9);
    public static final /* synthetic */ gkp i = new gkp(8);
    public static final /* synthetic */ gkp h = new gkp(7);
    public static final /* synthetic */ gkp g = new gkp(6);
    public static final /* synthetic */ gkp f = new gkp(5);
    public static final /* synthetic */ gkp e = new gkp(4);
    public static final /* synthetic */ gkp d = new gkp(3);
    public static final /* synthetic */ gkp c = new gkp(2);
    public static final /* synthetic */ gkp b = new gkp(1);
    public static final /* synthetic */ gkp a = new gkp(0);

    private /* synthetic */ gkp(int i2) {
        this.k = i2;
    }

    @Override // defpackage.gkv
    public final gkj a(Context context, Runnable runnable) {
        switch (this.k) {
            case 0:
                return new gkj(context, R.drawable.quantum_ic_skip_next_white_24, R.string.playback_control_next, R.string.playback_control_next, "com.google.android.libraries.youtube.player.action.controller_notification_next", runnable);
            case 1:
                return new gkj(context, R.drawable.quantum_ic_not_interested_white_24, R.string.pip_cancel_autoplay, R.string.pip_cancel_autoplay, "com.google.android.youtube.action.autonav.cancel", runnable);
            case 2:
                return new gkj(context, R.drawable.quantum_ic_pause_white_24, R.string.playback_control_play_pause, R.string.accessibility_pause, "com.google.android.libraries.youtube.player.action.controller_notification_pause", runnable);
            case 3:
                return new gkj(context, R.drawable.quantum_ic_play_arrow_white_24, R.string.playback_control_play_pause, R.string.accessibility_play, "com.google.android.libraries.youtube.player.action.controller_notification_play", runnable);
            case 4:
                return new gkj(context, R.drawable.quantum_ic_play_arrow_white_24, R.string.pip_play_next_video, R.string.pip_play_next_video, "com.google.android.youtube.action.autonav.play", runnable);
            case 5:
                return new gkj(context, R.drawable.quantum_ic_skip_previous_white_24, R.string.playback_control_previous, R.string.accessibility_previous, "com.google.android.libraries.youtube.player.action.controller_notification_prev", runnable);
            case 6:
                return new gkj(context, R.drawable.quantum_ic_replay_white_24, R.string.pip_playback_control_replay, R.string.pip_playback_control_replay, "com.google.android.libraries.youtube.player.action.controller_notification_replay", runnable);
            case 7:
                return new gkj(context, R.drawable.quantum_ic_replay_white_24, R.string.pip_playback_control_retry, R.string.pip_playback_control_retry, "com.google.android.libraries.youtube.player.action.controller_notification_retry", runnable);
            case 8:
                return new gkj(context, R.drawable.quantum_ic_skip_next_white_24, R.string.skip_ad, R.string.skip_ad, "com.google.android.libraries.youtube.player.action.controller_notification_skip_ad", runnable);
            default:
                return new gkj(context, R.drawable.quantum_ic_headset_white_24, R.string.playback_control_background_playback, R.string.playback_control_background_playback, "com.google.android.youtube.action.background", runnable);
        }
    }
}
