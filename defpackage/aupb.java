package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aupb implements aonq {
    SEEK_SOURCE_UNKNOWN(0),
    SEEK_SOURCE_TIMESTAMP_IN_COMMENTS(1),
    SEEK_SOURCE_TIMESTAMP_IN_DESCRIPTION(2),
    SEEK_SOURCE_MACRO_MARKER_LIST_ITEM(3),
    SEEK_SOURCE_DOUBLE_TAP_TO_SEEK(4),
    SEEK_SOURCE_DOUBLE_TAP_TO_SKIP_CHAPTER(5),
    SEEK_SOURCE_PICK_UP_PLAY_HEAD(6),
    SEEK_SOURCE_SLIDE_ON_SCRUBBER_BAR(7),
    SEEK_SOURCE_SLIDE_ON_PLAYER(8),
    SEEK_SOURCE_SABR_PARTIAL_CHUNK(9),
    SEEK_SOURCE_SABR_SEEK_TO_HEAD(10),
    SEEK_SOURCE_SABR_LIVE_DVR_USER_SEEK(11),
    SEEK_SOURCE_SABR_SEEK_TO_DVR_LOWER_BOUND(12);

    public final int n;

    aupb(int i) {
        this.n = i;
    }

    public static aons a() {
        return aukz.q;
    }

    public static aupb b(int i) {
        switch (i) {
            case 0:
                return SEEK_SOURCE_UNKNOWN;
            case 1:
                return SEEK_SOURCE_TIMESTAMP_IN_COMMENTS;
            case 2:
                return SEEK_SOURCE_TIMESTAMP_IN_DESCRIPTION;
            case 3:
                return SEEK_SOURCE_MACRO_MARKER_LIST_ITEM;
            case 4:
                return SEEK_SOURCE_DOUBLE_TAP_TO_SEEK;
            case 5:
                return SEEK_SOURCE_DOUBLE_TAP_TO_SKIP_CHAPTER;
            case 6:
                return SEEK_SOURCE_PICK_UP_PLAY_HEAD;
            case 7:
                return SEEK_SOURCE_SLIDE_ON_SCRUBBER_BAR;
            case 8:
                return SEEK_SOURCE_SLIDE_ON_PLAYER;
            case 9:
                return SEEK_SOURCE_SABR_PARTIAL_CHUNK;
            case 10:
                return SEEK_SOURCE_SABR_SEEK_TO_HEAD;
            case 11:
                return SEEK_SOURCE_SABR_LIVE_DVR_USER_SEEK;
            case 12:
                return SEEK_SOURCE_SABR_SEEK_TO_DVR_LOWER_BOUND;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
