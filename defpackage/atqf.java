package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atqf implements aonq {
    OFFLINE_REFRESH_ACTION_UNKNOWN(0),
    OFFLINE_REFRESH_ACTION_REFRESH_PLAYER_RESPONSE(1),
    OFFLINE_REFRESH_ACTION_REFRESH_ADS(2),
    OFFLINE_REFRESH_ACTION_DELETE_ADS(3),
    OFFLINE_REFRESH_ACTION_REFRESH_STREAMS(4),
    OFFLINE_REFRESH_ACTION_REFRESH_METADATA(5),
    OFFLINE_REFRESH_ACTION_REFRESH_STORYBOARDS(6);

    public final int h;

    atqf(int i2) {
        this.h = i2;
    }

    public static aons a() {
        return atnn.t;
    }

    public static atqf b(int i2) {
        switch (i2) {
            case 0:
                return OFFLINE_REFRESH_ACTION_UNKNOWN;
            case 1:
                return OFFLINE_REFRESH_ACTION_REFRESH_PLAYER_RESPONSE;
            case 2:
                return OFFLINE_REFRESH_ACTION_REFRESH_ADS;
            case 3:
                return OFFLINE_REFRESH_ACTION_DELETE_ADS;
            case 4:
                return OFFLINE_REFRESH_ACTION_REFRESH_STREAMS;
            case 5:
                return OFFLINE_REFRESH_ACTION_REFRESH_METADATA;
            case 6:
                return OFFLINE_REFRESH_ACTION_REFRESH_STORYBOARDS;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
