package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avtr implements aonq {
    UPLOAD_PROCESSOR_TYPE_UNKNOWN(0),
    UPLOAD_PROCESSOR_TYPE_JOB(1),
    UPLOAD_PROCESSOR_TYPE_COPY_FILE(36),
    UPLOAD_PROCESSOR_TYPE_FILE_ANALYSIS(2),
    UPLOAD_PROCESSOR_TYPE_TRANSCODE(3),
    UPLOAD_PROCESSOR_TYPE_CREATE_TRANSFER(33),
    UPLOAD_PROCESSOR_TYPE_TRANSFER(4),
    UPLOAD_PROCESSOR_TYPE_CREATE_DRAFT_VIDEO(5),
    UPLOAD_PROCESSOR_TYPE_CREATE_REEL_ITEMS(6),
    UPLOAD_PROCESSOR_TYPE_COMMIT_VIDEO(26),
    UPLOAD_PROCESSOR_TYPE_SAVE_METADATA(27),
    UPLOAD_PROCESSOR_TYPE_REGISTER_VIDEO(28),
    UPLOAD_PROCESSOR_TYPE_PROCESS_VIDEO(29),
    UPLOAD_PROCESSOR_TYPE_FEEDBACK(34),
    UPLOAD_PROCESSOR_TYPE_CANCELLATION(30),
    UPLOAD_PROCESSOR_TYPE_CLEANUP(31),
    UPLOAD_PROCESSOR_TYPE_GARBAGE_COLLECTION(32),
    UPLOAD_PROCESSOR_TYPE_CREATE_VIDEO(41),
    UPLOAD_PROCESSOR_TYPE_SOURCE_VIDEO_CHECK(42),
    UPLOAD_PROCESSOR_TYPE_FINAL_CLEANUP(43),
    UPLOAD_PROCESSOR_TYPE_IOS_JOB(7),
    UPLOAD_PROCESSOR_TYPE_IOS_CANCELLATION(8),
    UPLOAD_PROCESSOR_TYPE_IOS_CLEANUP(9),
    UPLOAD_PROCESSOR_TYPE_IOS_COMMIT_VIDEO(10),
    UPLOAD_PROCESSOR_TYPE_IOS_COMPLETION(11),
    UPLOAD_PROCESSOR_TYPE_IOS_COPY_FILE(38),
    UPLOAD_PROCESSOR_TYPE_IOS_CREATE_DRAFT_VIDEO(12),
    UPLOAD_PROCESSOR_TYPE_IOS_CREATE_LOW_RES_DRAFT_VIDEO(13),
    UPLOAD_PROCESSOR_TYPE_IOS_CREATE_REEL_ITEMS(14),
    UPLOAD_PROCESSOR_TYPE_IOS_FEEDBACK(15),
    UPLOAD_PROCESSOR_TYPE_IOS_LOW_RES_TRANSCODE(16),
    UPLOAD_PROCESSOR_TYPE_IOS_LOW_RES_TRANSFER(17),
    UPLOAD_PROCESSOR_TYPE_IOS_PROCESS_VIDEO(18),
    UPLOAD_PROCESSOR_TYPE_IOS_REGISTRATION(19),
    UPLOAD_PROCESSOR_TYPE_IOS_SAVE_METADATA(20),
    UPLOAD_PROCESSOR_TYPE_IOS_TASK(21),
    UPLOAD_PROCESSOR_TYPE_IOS_TRANSCODE(22),
    UPLOAD_PROCESSOR_TYPE_IOS_CREATE_TRANSFER(35),
    UPLOAD_PROCESSOR_TYPE_IOS_TRANSFER(23),
    UPLOAD_PROCESSOR_TYPE_IOS_STREAMING_UPLOAD_FMP4_PROCESSOR(24),
    UPLOAD_PROCESSOR_TYPE_IOS_IOSGUARD_CHALLENGE(25),
    UPLOAD_PROCESSOR_TYPE_IOS_REMOTE_ASSET_FETCH(37),
    UPLOAD_PROCESSOR_TYPE_IOS_REPLACE_DRAFT_VIDEO(39),
    UPLOAD_PROCESSOR_TYPE_IOS_CREATE_VIDEO(40);

    public final int S;

    avtr(int i) {
        this.S = i;
    }

    public static aons a() {
        return avts.b;
    }

    public static avtr b(int i) {
        switch (i) {
            case 0:
                return UPLOAD_PROCESSOR_TYPE_UNKNOWN;
            case 1:
                return UPLOAD_PROCESSOR_TYPE_JOB;
            case 2:
                return UPLOAD_PROCESSOR_TYPE_FILE_ANALYSIS;
            case 3:
                return UPLOAD_PROCESSOR_TYPE_TRANSCODE;
            case 4:
                return UPLOAD_PROCESSOR_TYPE_TRANSFER;
            case 5:
                return UPLOAD_PROCESSOR_TYPE_CREATE_DRAFT_VIDEO;
            case 6:
                return UPLOAD_PROCESSOR_TYPE_CREATE_REEL_ITEMS;
            case 7:
                return UPLOAD_PROCESSOR_TYPE_IOS_JOB;
            case 8:
                return UPLOAD_PROCESSOR_TYPE_IOS_CANCELLATION;
            case 9:
                return UPLOAD_PROCESSOR_TYPE_IOS_CLEANUP;
            case 10:
                return UPLOAD_PROCESSOR_TYPE_IOS_COMMIT_VIDEO;
            case 11:
                return UPLOAD_PROCESSOR_TYPE_IOS_COMPLETION;
            case 12:
                return UPLOAD_PROCESSOR_TYPE_IOS_CREATE_DRAFT_VIDEO;
            case 13:
                return UPLOAD_PROCESSOR_TYPE_IOS_CREATE_LOW_RES_DRAFT_VIDEO;
            case 14:
                return UPLOAD_PROCESSOR_TYPE_IOS_CREATE_REEL_ITEMS;
            case 15:
                return UPLOAD_PROCESSOR_TYPE_IOS_FEEDBACK;
            case 16:
                return UPLOAD_PROCESSOR_TYPE_IOS_LOW_RES_TRANSCODE;
            case 17:
                return UPLOAD_PROCESSOR_TYPE_IOS_LOW_RES_TRANSFER;
            case 18:
                return UPLOAD_PROCESSOR_TYPE_IOS_PROCESS_VIDEO;
            case 19:
                return UPLOAD_PROCESSOR_TYPE_IOS_REGISTRATION;
            case 20:
                return UPLOAD_PROCESSOR_TYPE_IOS_SAVE_METADATA;
            case 21:
                return UPLOAD_PROCESSOR_TYPE_IOS_TASK;
            case 22:
                return UPLOAD_PROCESSOR_TYPE_IOS_TRANSCODE;
            case 23:
                return UPLOAD_PROCESSOR_TYPE_IOS_TRANSFER;
            case 24:
                return UPLOAD_PROCESSOR_TYPE_IOS_STREAMING_UPLOAD_FMP4_PROCESSOR;
            case 25:
                return UPLOAD_PROCESSOR_TYPE_IOS_IOSGUARD_CHALLENGE;
            case 26:
                return UPLOAD_PROCESSOR_TYPE_COMMIT_VIDEO;
            case 27:
                return UPLOAD_PROCESSOR_TYPE_SAVE_METADATA;
            case 28:
                return UPLOAD_PROCESSOR_TYPE_REGISTER_VIDEO;
            case 29:
                return UPLOAD_PROCESSOR_TYPE_PROCESS_VIDEO;
            case 30:
                return UPLOAD_PROCESSOR_TYPE_CANCELLATION;
            case 31:
                return UPLOAD_PROCESSOR_TYPE_CLEANUP;
            case 32:
                return UPLOAD_PROCESSOR_TYPE_GARBAGE_COLLECTION;
            case 33:
                return UPLOAD_PROCESSOR_TYPE_CREATE_TRANSFER;
            case 34:
                return UPLOAD_PROCESSOR_TYPE_FEEDBACK;
            case 35:
                return UPLOAD_PROCESSOR_TYPE_IOS_CREATE_TRANSFER;
            case 36:
                return UPLOAD_PROCESSOR_TYPE_COPY_FILE;
            case 37:
                return UPLOAD_PROCESSOR_TYPE_IOS_REMOTE_ASSET_FETCH;
            case 38:
                return UPLOAD_PROCESSOR_TYPE_IOS_COPY_FILE;
            case 39:
                return UPLOAD_PROCESSOR_TYPE_IOS_REPLACE_DRAFT_VIDEO;
            case 40:
                return UPLOAD_PROCESSOR_TYPE_IOS_CREATE_VIDEO;
            case 41:
                return UPLOAD_PROCESSOR_TYPE_CREATE_VIDEO;
            case 42:
                return UPLOAD_PROCESSOR_TYPE_SOURCE_VIDEO_CHECK;
            case 43:
                return UPLOAD_PROCESSOR_TYPE_FINAL_CLEANUP;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.S;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.S);
    }
}
