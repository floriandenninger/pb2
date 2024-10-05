package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avut implements aonq {
    USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_UNKNOWN(0),
    USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_MENTION_FLOW_STARTED(1),
    USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_MENTION_FLOW_STOPPED(2),
    USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_SUGGESTION_SELECTED(3),
    USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_BOX_OPENED(4),
    USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_INPUT_TEXT_UPDATED(5),
    USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_CONTENT_UPDATED(6);

    public final int h;

    avut(int i2) {
        this.h = i2;
    }

    public static aons a() {
        return avts.f;
    }

    public static avut b(int i2) {
        switch (i2) {
            case 0:
                return USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_UNKNOWN;
            case 1:
                return USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_MENTION_FLOW_STARTED;
            case 2:
                return USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_MENTION_FLOW_STOPPED;
            case 3:
                return USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_SUGGESTION_SELECTED;
            case 4:
                return USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_BOX_OPENED;
            case 5:
                return USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_INPUT_TEXT_UPDATED;
            case 6:
                return USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_CONTENT_UPDATED;
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
