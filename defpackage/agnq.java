package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum agnq {
    DELETED(true),
    PLAYABLE(false),
    CANDIDATE(false),
    TRANSFER_IN_PROGRESS(false),
    TRANSFER_WAITING_IN_QUEUE(false),
    TRANSFER_PENDING_USER_APPROVAL(false),
    TRANSFER_PENDING_NETWORK(false),
    TRANSFER_PENDING_WIFI(false),
    TRANSFER_PENDING_TOOTHFAIRY(false),
    TRANSFER_PENDING_STORAGE(false),
    TRANSFER_PAUSED(false),
    OFFLINE_IN_PROGRESS_VIDEO_PARTIALLY_PLAYABLE(false),
    ERROR_PENDING_PLAYABILITY_ACTION(true),
    ERROR_STREAMS_MISSING(true),
    ERROR_STREAMS_OUT_OF_DATE(true),
    ERROR_NOT_PLAYABLE(true),
    ERROR_POLICY(true),
    ERROR_EXPIRED(true),
    ERROR_EXPIRED_RENTAL(true),
    ERROR_NETWORK(true),
    ERROR_DISK(true),
    ERROR_DISK_SD_CARD(true),
    ERROR_GENERIC(true);

    public final boolean x;

    agnq(boolean z) {
        this.x = z;
    }
}
