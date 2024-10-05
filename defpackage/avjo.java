package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avjo implements aonq {
    TRANSFER_STATE_UNKNOWN(0),
    TRANSFER_STATE_TRANSFER_IN_QUEUE(1),
    TRANSFER_STATE_PRE_TRANSFER(2),
    TRANSFER_STATE_TRANSFERRING(3),
    TRANSFER_STATE_PAUSED_BY_USER(4),
    TRANSFER_STATE_FAILED(5),
    TRANSFER_STATE_COMPLETE(6),
    TRANSFER_STATE_WAITING_FOR_PLAYER_RESPONSE_REFRESH(7);

    public final int i;

    avjo(int i) {
        this.i = i;
    }

    public static aons a() {
        return avhw.e;
    }

    public static avjo b(int i) {
        switch (i) {
            case 0:
                return TRANSFER_STATE_UNKNOWN;
            case 1:
                return TRANSFER_STATE_TRANSFER_IN_QUEUE;
            case 2:
                return TRANSFER_STATE_PRE_TRANSFER;
            case 3:
                return TRANSFER_STATE_TRANSFERRING;
            case 4:
                return TRANSFER_STATE_PAUSED_BY_USER;
            case 5:
                return TRANSFER_STATE_FAILED;
            case 6:
                return TRANSFER_STATE_COMPLETE;
            case 7:
                return TRANSFER_STATE_WAITING_FOR_PLAYER_RESPONSE_REFRESH;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
