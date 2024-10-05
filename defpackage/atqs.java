package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atqs implements aonq {
    UNKNOWN_FAILURE_REASON(0),
    CONNECTION_LOST(1),
    LOW_STORAGE(2),
    NO_FETCHED_DATA(3),
    NO_RESPONSE(4),
    NO_VIDEO_STREAM(5),
    NOT_OFFLINABLE(6),
    TOO_MANY_RETRIES(7),
    OFFLINE_CONTENT_VALIDATION_ERROR(8),
    OFFLINE_CONTENT_EXPIRED(9),
    NOT_PLAYABLE(10),
    NO_OFFLINE_STORAGE(11),
    TRANSFER_PAUSED(12),
    AD_FAILED_TO_GET_FORMAT_STREAM(13),
    AD_NO_FORMAT_STREAMS_AVAILABLE(14),
    AD_FAILED_UNKNOWN_REASON(15),
    PLAYER_REQUEST_FAILURE(16),
    OFFLINE_REQUEST_FAILURE(17),
    OFFLINE_DATABASE_ERROR(18),
    OFFLINE_DOWNLOAD_CONTROLLER_ERROR(19),
    OFFLINE_VIDEO_NOT_FOUND_IN_DATABASE(20),
    OFFLINE_DISK_ERROR(21),
    OFFLINE_TRANSFER_INTERRUPTED(22),
    OFFLINE_WIDEVINE_EXCEPTION(23),
    OFFLINE_NETWORK_ERROR(24),
    OFFLINE_TIME_WINDOW_EXCEEDED(25),
    NO_AUDIO_STREAM(26),
    TOO_MANY_FAILED_STREAM_VERIFICATIONS(27),
    STREAM_VERIFICATION_FAILED(28),
    RETRY_NOT_ALLOWED(29),
    CANNOT_DOWNLOAD_STREAMS_FOR_OFFLINE_REFRESH(30),
    YTB_ERROR(31),
    OFFLINE_STREAM_URL_EXPIRED(32);

    public final int H;

    atqs(int i) {
        this.H = i;
    }

    public static aons a() {
        return atqp.d;
    }

    public static atqs b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FAILURE_REASON;
            case 1:
                return CONNECTION_LOST;
            case 2:
                return LOW_STORAGE;
            case 3:
                return NO_FETCHED_DATA;
            case 4:
                return NO_RESPONSE;
            case 5:
                return NO_VIDEO_STREAM;
            case 6:
                return NOT_OFFLINABLE;
            case 7:
                return TOO_MANY_RETRIES;
            case 8:
                return OFFLINE_CONTENT_VALIDATION_ERROR;
            case 9:
                return OFFLINE_CONTENT_EXPIRED;
            case 10:
                return NOT_PLAYABLE;
            case 11:
                return NO_OFFLINE_STORAGE;
            case 12:
                return TRANSFER_PAUSED;
            case 13:
                return AD_FAILED_TO_GET_FORMAT_STREAM;
            case 14:
                return AD_NO_FORMAT_STREAMS_AVAILABLE;
            case 15:
                return AD_FAILED_UNKNOWN_REASON;
            case 16:
                return PLAYER_REQUEST_FAILURE;
            case 17:
                return OFFLINE_REQUEST_FAILURE;
            case 18:
                return OFFLINE_DATABASE_ERROR;
            case 19:
                return OFFLINE_DOWNLOAD_CONTROLLER_ERROR;
            case 20:
                return OFFLINE_VIDEO_NOT_FOUND_IN_DATABASE;
            case 21:
                return OFFLINE_DISK_ERROR;
            case 22:
                return OFFLINE_TRANSFER_INTERRUPTED;
            case 23:
                return OFFLINE_WIDEVINE_EXCEPTION;
            case 24:
                return OFFLINE_NETWORK_ERROR;
            case 25:
                return OFFLINE_TIME_WINDOW_EXCEEDED;
            case 26:
                return NO_AUDIO_STREAM;
            case 27:
                return TOO_MANY_FAILED_STREAM_VERIFICATIONS;
            case 28:
                return STREAM_VERIFICATION_FAILED;
            case 29:
                return RETRY_NOT_ALLOWED;
            case 30:
                return CANNOT_DOWNLOAD_STREAMS_FOR_OFFLINE_REFRESH;
            case 31:
                return YTB_ERROR;
            case 32:
                return OFFLINE_STREAM_URL_EXPIRED;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.H;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.H);
    }
}
