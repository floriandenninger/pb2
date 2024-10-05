package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum awzd implements aonq {
    UNKNOWN_UI_EVENT_TYPE(0),
    COMPONENT_EXIT(1),
    COMPONENT_MINIMIZE(2),
    LANDING_PAGE_RENDERED(3),
    VIEW_EXIT(4),
    FIRST_USER_INTERACTION(5),
    RENDER(6),
    OBAKE_PHOTO_PICKING_SESSION_FINISHED(7),
    BUTTON_ACTION_URL_CREATION(8),
    BUTTON_ACTION_URL_HANDLING(9);

    public final int k;

    awzd(int i) {
        this.k = i;
    }

    public static aons a() {
        return awwu.l;
    }

    public static awzd b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_UI_EVENT_TYPE;
            case 1:
                return COMPONENT_EXIT;
            case 2:
                return COMPONENT_MINIMIZE;
            case 3:
                return LANDING_PAGE_RENDERED;
            case 4:
                return VIEW_EXIT;
            case 5:
                return FIRST_USER_INTERACTION;
            case 6:
                return RENDER;
            case 7:
                return OBAKE_PHOTO_PICKING_SESSION_FINISHED;
            case 8:
                return BUTTON_ACTION_URL_CREATION;
            case 9:
                return BUTTON_ACTION_URL_HANDLING;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
