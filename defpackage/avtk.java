package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avtk implements aonq {
    UPLOAD_CREATION_FAILURE_REASON_UNKNOWN(0),
    UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_FAILED(1),
    UPLOAD_CREATION_FAILURE_REASON_JOB_CHANGE_FAILED(2),
    UPLOAD_CREATION_FAILURE_REASON_JOB_CONFIRMATION_FAILED(3),
    UPLOAD_CREATION_FAILURE_REASON_JOB_CANCELLATION_FAILED(4),
    UPLOAD_CREATION_FAILURE_REASON_NOT_OPENABLE_SOURCE_VIDEO(5),
    UPLOAD_CREATION_FAILURE_REASON_JOB_EXECUTION_NOT_SCHEDULED(6),
    UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_TIMED_OUT(7),
    UPLOAD_CREATION_FAILURE_REASON_JOB_CHANGE_TIMED_OUT(8),
    UPLOAD_CREATION_FAILURE_REASON_JOB_CONFIRMATION_TIMED_OUT(9),
    UPLOAD_CREATION_FAILURE_REASON_JOB_CANCELLATION_TIMED_OUT(10);

    public final int l;

    avtk(int i) {
        this.l = i;
    }

    public static aons a() {
        return avhw.l;
    }

    public static avtk b(int i) {
        switch (i) {
            case 0:
                return UPLOAD_CREATION_FAILURE_REASON_UNKNOWN;
            case 1:
                return UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_FAILED;
            case 2:
                return UPLOAD_CREATION_FAILURE_REASON_JOB_CHANGE_FAILED;
            case 3:
                return UPLOAD_CREATION_FAILURE_REASON_JOB_CONFIRMATION_FAILED;
            case 4:
                return UPLOAD_CREATION_FAILURE_REASON_JOB_CANCELLATION_FAILED;
            case 5:
                return UPLOAD_CREATION_FAILURE_REASON_NOT_OPENABLE_SOURCE_VIDEO;
            case 6:
                return UPLOAD_CREATION_FAILURE_REASON_JOB_EXECUTION_NOT_SCHEDULED;
            case 7:
                return UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_TIMED_OUT;
            case 8:
                return UPLOAD_CREATION_FAILURE_REASON_JOB_CHANGE_TIMED_OUT;
            case 9:
                return UPLOAD_CREATION_FAILURE_REASON_JOB_CONFIRMATION_TIMED_OUT;
            case 10:
                return UPLOAD_CREATION_FAILURE_REASON_JOB_CANCELLATION_TIMED_OUT;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
