package defpackage;

import com.google.android.youtube.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aikk implements aikb {
    private final aivq a;
    private final aivo b;

    public aikk(aivq aivqVar, aivo aivoVar) {
        this.a = aivqVar;
        this.b = aivoVar;
    }

    @Override // defpackage.aikb
    public final int a() {
        switch (this.a.b) {
            case 0:
            case 3:
            case 4:
            case 10:
                return R.drawable.quantum_ic_play_arrow_white_36;
            case 1:
            case 5:
            default:
                return R.drawable.ic_notification_play_arrow_disabled;
            case 2:
            case 9:
                return R.drawable.quantum_ic_pause_white_36;
            case 6:
                return R.drawable.ic_notifications_pause_disabled;
            case 7:
                return R.drawable.quantum_ic_replay_white_36;
            case 8:
                return R.drawable.quantum_ic_error_white_36;
        }
    }

    @Override // defpackage.aikb
    public final int b() {
        int i = this.a.b;
        if (i == 0) {
            return R.string.playback_control_play;
        }
        if (i == 2) {
            return R.string.playback_control_pause;
        }
        if (i == 3 || i == 4) {
            return R.string.playback_control_play;
        }
        switch (i) {
            case 7:
                return R.string.playback_control_replay;
            case 8:
                return R.string.playback_control_retry;
            case 9:
                return R.string.playback_control_pause;
            case 10:
                return R.string.playback_control_play;
            default:
                return R.string.playback_control_play_pause;
        }
    }

    @Override // defpackage.aikb
    public final /* synthetic */ ammv c() {
        return amlr.a;
    }

    @Override // defpackage.aikb
    public final String d() {
        int i = this.a.b;
        if (i == 0) {
            return "com.google.android.libraries.youtube.player.action.controller_notification_play";
        }
        if (i == 2) {
            return "com.google.android.libraries.youtube.player.action.controller_notification_pause";
        }
        if (i == 3 || i == 4) {
            return "com.google.android.libraries.youtube.player.action.controller_notification_play";
        }
        switch (i) {
            case 7:
                return "com.google.android.libraries.youtube.player.action.controller_notification_replay";
            case 8:
                return "com.google.android.libraries.youtube.player.action.controller_notification_retry";
            case 9:
                return "com.google.android.libraries.youtube.player.action.controller_notification_pause";
            case 10:
                return "com.google.android.libraries.youtube.player.action.controller_notification_play";
            default:
                return "noop";
        }
    }

    @Override // defpackage.aikb
    public final Set e() {
        return amsx.u("com.google.android.libraries.youtube.player.action.controller_notification_retry", "com.google.android.libraries.youtube.player.action.controller_notification_replay", "com.google.android.libraries.youtube.player.action.controller_notification_pause", "com.google.android.libraries.youtube.player.action.controller_notification_play");
    }

    @Override // defpackage.aikb
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.aikb
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aikb
    public final void h(aika aikaVar) {
    }

    @Override // defpackage.aikb
    public final boolean i(String str) {
        if ("com.google.android.libraries.youtube.player.action.controller_notification_play".equals(str)) {
            this.b.d();
            return true;
        }
        if ("com.google.android.libraries.youtube.player.action.controller_notification_pause".equals(str)) {
            this.b.c();
            return true;
        }
        if ("com.google.android.libraries.youtube.player.action.controller_notification_replay".equals(str)) {
            this.b.e();
            return true;
        }
        if (!"com.google.android.libraries.youtube.player.action.controller_notification_retry".equals(str)) {
            return false;
        }
        this.b.f();
        return true;
    }

    @Override // defpackage.aikb
    public final boolean j() {
        return true;
    }

    @Override // defpackage.aikb
    public final boolean k() {
        return true;
    }
}
