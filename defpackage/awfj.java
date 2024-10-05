package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum awfj implements aonq {
    YOU_THERE_EVENT_TYPE_UNKNOWN(0),
    YOU_THERE_EVENT_TYPE_BELOW_LACT_THRESHOLD(1),
    YOU_THERE_EVENT_TYPE_PROMPT_SHOWN(2),
    YOU_THERE_EVENT_TYPE_WARNING_PROMPT_SHOWN(22),
    YOU_THERE_EVENT_TYPE_WARNING_PROMPT_SHOWN_IN_DIALOG(23),
    YOU_THERE_EVENT_TYPE_PLAYBACK_PAUSED(3),
    YOU_THERE_EVENT_TYPE_USER_RESPONDED(4),
    YOU_THERE_EVENT_TYPE_LACT_RESET(8),
    YOU_THERE_EVENT_TYPE_RATE_LIMITED(14),
    YOU_THERE_EVENT_TYPE_NAVIGATED_OUT(17),
    YOU_THERE_EVENT_TYPE_AUTOPLAY_PAUSED(5),
    YOU_THERE_EVENT_TYPE_AUTOPLAY_RESUMED(6),
    YOU_THERE_EVENT_TYPE_AUTOPLAY_APP_EXIT(7),
    YOU_THERE_EVENT_TYPE_AUTOPLAY_RATE_LIMITED(15),
    YOU_THERE_EVENT_TYPE_AUTOPLAY_NAVIGATED_OUT(18),
    YOU_THERE_EVENT_TYPE_F_AUTONAV_BELOW_LACT_THRESHOLD(9),
    YOU_THERE_EVENT_TYPE_F_AUTONAV_PAUSE_ENABLED(10),
    YOU_THERE_EVENT_TYPE_F_AUTONAV_PAUSE_DISABLED_BY_LACT_RESET(11),
    YOU_THERE_EVENT_TYPE_F_AUTONAV_PAUSED(12),
    YOU_THERE_EVENT_TYPE_F_AUTONAV_INVALID_LACT_THRESHOLD(13),
    YOU_THERE_EVENT_TYPE_F_AUTONAV_RATE_LIMITED(16),
    YOU_THERE_EVENT_TYPE_F_AUTONAV_NAVIGATED_OUT(19),
    YOU_THERE_EVENT_TYPE_ABR_TRIGGERED(20),
    YOU_THERE_EVENT_TYPE_ABR_LACT_RESET(21);

    public final int y;

    awfj(int i) {
        this.y = i;
    }

    public static aons a() {
        return aweb.e;
    }

    public static awfj b(int i) {
        switch (i) {
            case 0:
                return YOU_THERE_EVENT_TYPE_UNKNOWN;
            case 1:
                return YOU_THERE_EVENT_TYPE_BELOW_LACT_THRESHOLD;
            case 2:
                return YOU_THERE_EVENT_TYPE_PROMPT_SHOWN;
            case 3:
                return YOU_THERE_EVENT_TYPE_PLAYBACK_PAUSED;
            case 4:
                return YOU_THERE_EVENT_TYPE_USER_RESPONDED;
            case 5:
                return YOU_THERE_EVENT_TYPE_AUTOPLAY_PAUSED;
            case 6:
                return YOU_THERE_EVENT_TYPE_AUTOPLAY_RESUMED;
            case 7:
                return YOU_THERE_EVENT_TYPE_AUTOPLAY_APP_EXIT;
            case 8:
                return YOU_THERE_EVENT_TYPE_LACT_RESET;
            case 9:
                return YOU_THERE_EVENT_TYPE_F_AUTONAV_BELOW_LACT_THRESHOLD;
            case 10:
                return YOU_THERE_EVENT_TYPE_F_AUTONAV_PAUSE_ENABLED;
            case 11:
                return YOU_THERE_EVENT_TYPE_F_AUTONAV_PAUSE_DISABLED_BY_LACT_RESET;
            case 12:
                return YOU_THERE_EVENT_TYPE_F_AUTONAV_PAUSED;
            case 13:
                return YOU_THERE_EVENT_TYPE_F_AUTONAV_INVALID_LACT_THRESHOLD;
            case 14:
                return YOU_THERE_EVENT_TYPE_RATE_LIMITED;
            case 15:
                return YOU_THERE_EVENT_TYPE_AUTOPLAY_RATE_LIMITED;
            case 16:
                return YOU_THERE_EVENT_TYPE_F_AUTONAV_RATE_LIMITED;
            case 17:
                return YOU_THERE_EVENT_TYPE_NAVIGATED_OUT;
            case 18:
                return YOU_THERE_EVENT_TYPE_AUTOPLAY_NAVIGATED_OUT;
            case 19:
                return YOU_THERE_EVENT_TYPE_F_AUTONAV_NAVIGATED_OUT;
            case 20:
                return YOU_THERE_EVENT_TYPE_ABR_TRIGGERED;
            case 21:
                return YOU_THERE_EVENT_TYPE_ABR_LACT_RESET;
            case 22:
                return YOU_THERE_EVENT_TYPE_WARNING_PROMPT_SHOWN;
            case 23:
                return YOU_THERE_EVENT_TYPE_WARNING_PROMPT_SHOWN_IN_DIALOG;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.y;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.y);
    }
}
