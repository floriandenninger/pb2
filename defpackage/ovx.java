package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum ovx implements aonq {
    UNKNOWN(0),
    ONESIE_HEADER(10),
    ONESIE_DATA(11),
    ONESIE_ENCRYPTED_MEDIA(12),
    MEDIA_HEADER(20),
    MEDIA(21),
    MEDIA_END(22),
    CONFIG(30),
    LIVE_METADATA(31),
    HOSTNAME_CHANGE_HINT(32),
    LIVE_METADATA_PROMISE(33),
    LIVE_METADATA_PROMISE_CANCELLATION(34),
    NEXT_REQUEST_POLICY(35),
    FORMAT_SELECTION_CONFIG(37),
    FORMAT_INITIALIZATION_METADATA(42),
    SABR_REDIRECT(43),
    SABR_ERROR(44),
    SABR_SEEK(45),
    USTREAMER_VIDEO_AND_FORMAT_METADATA(36),
    USTREAMER_SELECTED_MEDIA_STREAM(38);

    private final int v;

    ovx(int i) {
        this.v = i;
    }

    public static ovx a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        switch (i) {
            case 10:
                return ONESIE_HEADER;
            case 11:
                return ONESIE_DATA;
            case 12:
                return ONESIE_ENCRYPTED_MEDIA;
            default:
                switch (i) {
                    case 20:
                        return MEDIA_HEADER;
                    case 21:
                        return MEDIA;
                    case 22:
                        return MEDIA_END;
                    default:
                        switch (i) {
                            case 30:
                                return CONFIG;
                            case 31:
                                return LIVE_METADATA;
                            case 32:
                                return HOSTNAME_CHANGE_HINT;
                            case 33:
                                return LIVE_METADATA_PROMISE;
                            case 34:
                                return LIVE_METADATA_PROMISE_CANCELLATION;
                            case 35:
                                return NEXT_REQUEST_POLICY;
                            case 36:
                                return USTREAMER_VIDEO_AND_FORMAT_METADATA;
                            case 37:
                                return FORMAT_SELECTION_CONFIG;
                            case 38:
                                return USTREAMER_SELECTED_MEDIA_STREAM;
                            default:
                                switch (i) {
                                    case 42:
                                        return FORMAT_INITIALIZATION_METADATA;
                                    case 43:
                                        return SABR_REDIRECT;
                                    case 44:
                                        return SABR_ERROR;
                                    case 45:
                                        return SABR_SEEK;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}
