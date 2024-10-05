package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum jps {
    PLAYABLE(false),
    TRANSFER_PENDING_USER_APPROVAL(true),
    TRANSFER_IN_PROGRESS(false),
    TRANSFER_WAITING_IN_QUEUE(false),
    TRANSFER_PAUSED(false),
    ERROR_PENDING_PLAYABILITY_ACTION(true),
    ERROR_NOT_PLAYABLE(true),
    ERROR_POLICY(true),
    ERROR_EXPIRED(true),
    ERROR_DISK(true),
    ERROR_DISK_SD_CARD(true),
    ERROR_STREAMS_MISSING(true),
    ERROR_EXPIRED_RENTAL(true),
    ERROR_GENERIC(true),
    UNKNOWN(false);

    public final boolean p;

    jps(boolean z) {
        this.p = z;
    }
}
