package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqxl implements aonq {
    FLOW_TYPE_UNKNOWN(0),
    FLOW_TYPE_NOTAIRE(1),
    FLOW_TYPE_OFFLINE_TRANSFER_STATUS_CHANGED(2),
    FLOW_TYPE_OFFLINE_ORCHESTRATION(3),
    FLOW_TYPE_PLAYBACK_QUEUE(4),
    FLOW_TYPE_OFFLINE_TRANSFER_SERVICE(5),
    FLOW_TYPE_IN_APP_UPDATE(6),
    FLOW_TYPE_SHORTS_CREATION(7),
    FLOW_TYPE_MDX_CONNECTION(8),
    FLOW_TYPE_CHIME_REGISTRATION(9),
    FLOW_TYPE_MDX_RECEIVER_CONNECTION(10),
    FLOW_TYPE_PREMIUM_MULTI_STEP_PURCHASE(11),
    FLOW_TYPE_PARENT_TOOLS_ONBOARDING(12),
    FLOW_TYPE_LIVE_STREAMING(13),
    FLOW_TYPE_HASHTAG_SUGGESTIONS(14),
    FLOW_TYPE_KIDS_ONBOARDING(15),
    FLOW_TYPE_TOU_APPEAL(16);

    public final int r;

    aqxl(int i) {
        this.r = i;
    }

    public static aons a() {
        return aquw.m;
    }

    public static aqxl b(int i) {
        switch (i) {
            case 0:
                return FLOW_TYPE_UNKNOWN;
            case 1:
                return FLOW_TYPE_NOTAIRE;
            case 2:
                return FLOW_TYPE_OFFLINE_TRANSFER_STATUS_CHANGED;
            case 3:
                return FLOW_TYPE_OFFLINE_ORCHESTRATION;
            case 4:
                return FLOW_TYPE_PLAYBACK_QUEUE;
            case 5:
                return FLOW_TYPE_OFFLINE_TRANSFER_SERVICE;
            case 6:
                return FLOW_TYPE_IN_APP_UPDATE;
            case 7:
                return FLOW_TYPE_SHORTS_CREATION;
            case 8:
                return FLOW_TYPE_MDX_CONNECTION;
            case 9:
                return FLOW_TYPE_CHIME_REGISTRATION;
            case 10:
                return FLOW_TYPE_MDX_RECEIVER_CONNECTION;
            case 11:
                return FLOW_TYPE_PREMIUM_MULTI_STEP_PURCHASE;
            case 12:
                return FLOW_TYPE_PARENT_TOOLS_ONBOARDING;
            case 13:
                return FLOW_TYPE_LIVE_STREAMING;
            case 14:
                return FLOW_TYPE_HASHTAG_SUGGESTIONS;
            case 15:
                return FLOW_TYPE_KIDS_ONBOARDING;
            case 16:
                return FLOW_TYPE_TOU_APPEAL;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
