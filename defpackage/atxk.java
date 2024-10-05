package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atxk implements aonq {
    PLAYBACK_EXCEPTION_ERROR_REASON_UNKNOWN(0),
    PLAYBACK_EXCEPTION_ERROR_REASON_VIDEO_ERROR(1),
    PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE(2),
    PLAYBACK_EXCEPTION_ERROR_REASON_REQUEST_FAILED(3),
    PLAYBACK_EXCEPTION_ERROR_REASON_USER_AGE_CHECK_FAILED(4),
    PLAYBACK_EXCEPTION_ERROR_REASON_USER_CONTENT_CHECK_FAILED(5),
    PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_ERROR(6),
    PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_NET_ERROR(7),
    PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_CONCURRENT_PLAYBACK_ERROR(8),
    PLAYBACK_EXCEPTION_ERROR_REASON_PLAYER_ERROR(9),
    PLAYBACK_EXCEPTION_ERROR_REASON_NO_STREAMS(10),
    PLAYBACK_EXCEPTION_ERROR_REASON_WATCH_NEXT_ERROR(11),
    PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE_IN_BACKGROUND(12),
    PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE_BY_APP_POLICY(13),
    PLAYBACK_EXCEPTION_ERROR_REASON_PARTIAL_PLAYBACK_DATA_EXHAUSTED(14);

    public final int p;

    atxk(int i) {
        this.p = i;
    }

    public static aons a() {
        return atxj.d;
    }

    public static atxk b(int i) {
        switch (i) {
            case 0:
                return PLAYBACK_EXCEPTION_ERROR_REASON_UNKNOWN;
            case 1:
                return PLAYBACK_EXCEPTION_ERROR_REASON_VIDEO_ERROR;
            case 2:
                return PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE;
            case 3:
                return PLAYBACK_EXCEPTION_ERROR_REASON_REQUEST_FAILED;
            case 4:
                return PLAYBACK_EXCEPTION_ERROR_REASON_USER_AGE_CHECK_FAILED;
            case 5:
                return PLAYBACK_EXCEPTION_ERROR_REASON_USER_CONTENT_CHECK_FAILED;
            case 6:
                return PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_ERROR;
            case 7:
                return PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_NET_ERROR;
            case 8:
                return PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_CONCURRENT_PLAYBACK_ERROR;
            case 9:
                return PLAYBACK_EXCEPTION_ERROR_REASON_PLAYER_ERROR;
            case 10:
                return PLAYBACK_EXCEPTION_ERROR_REASON_NO_STREAMS;
            case 11:
                return PLAYBACK_EXCEPTION_ERROR_REASON_WATCH_NEXT_ERROR;
            case 12:
                return PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE_IN_BACKGROUND;
            case 13:
                return PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE_BY_APP_POLICY;
            case 14:
                return PLAYBACK_EXCEPTION_ERROR_REASON_PARTIAL_PLAYBACK_DATA_EXHAUSTED;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
