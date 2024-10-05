package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avxt implements aonq {
    DOWNLOAD_STATE_UNKNOWN(0),
    DOWNLOAD_STATE_NOT_DOWNLOADED(1),
    DOWNLOAD_STATE_PENDING_DOWNLOAD(2),
    DOWNLOAD_STATE_DOWNLOAD_IN_PROGRESS(3),
    DOWNLOAD_STATE_COMPLETE(4),
    DOWNLOAD_STATE_FAILED(5),
    DOWNLOAD_STATE_PAUSED(6),
    DOWNLOAD_STATE_RETRYABLE_FAILURE(7),
    DOWNLOAD_STATE_SYNC_NOW(8);

    public final int j;

    avxt(int i) {
        this.j = i;
    }

    public static aons a() {
        return avts.u;
    }

    public static avxt b(int i) {
        switch (i) {
            case 0:
                return DOWNLOAD_STATE_UNKNOWN;
            case 1:
                return DOWNLOAD_STATE_NOT_DOWNLOADED;
            case 2:
                return DOWNLOAD_STATE_PENDING_DOWNLOAD;
            case 3:
                return DOWNLOAD_STATE_DOWNLOAD_IN_PROGRESS;
            case 4:
                return DOWNLOAD_STATE_COMPLETE;
            case 5:
                return DOWNLOAD_STATE_FAILED;
            case 6:
                return DOWNLOAD_STATE_PAUSED;
            case 7:
                return DOWNLOAD_STATE_RETRYABLE_FAILURE;
            case 8:
                return DOWNLOAD_STATE_SYNC_NOW;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
