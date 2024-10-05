package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum awzc implements aonq {
    UNKNOWN_ENTRY_POINT(0),
    CONTACTS_ROW_CLICKED(1),
    CONTACTS_ROW_EDIT_ICON(2),
    CONTACTS_SEARCH_BAR(3),
    CONTACTS_CREATE_CONTACT_BUTTON(4),
    CONTACTS_TRASH_ROW_CLICKED(5),
    OBAKE_CAMERA_PHOTO_SELECTED(6),
    OBAKE_DEVICE_PHOTO_SELECTED(7),
    OBAKE_GOOGLE_PHOTOS_PHOTO_SELECTED(8),
    EMAIL_BUTTON(9),
    SCHEDULE_BUTTON(10),
    CHAT_BUTTON(11),
    CALL_BUTTON(12),
    MEET_BUTTON(13),
    OBAKE_ART_PHOTO_SELECTED(14),
    OBAKE_DELETE_PHOTO_SELECTED(15);

    public final int q;

    awzc(int i) {
        this.q = i;
    }

    public static aons a() {
        return awwu.k;
    }

    public static awzc b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ENTRY_POINT;
            case 1:
                return CONTACTS_ROW_CLICKED;
            case 2:
                return CONTACTS_ROW_EDIT_ICON;
            case 3:
                return CONTACTS_SEARCH_BAR;
            case 4:
                return CONTACTS_CREATE_CONTACT_BUTTON;
            case 5:
                return CONTACTS_TRASH_ROW_CLICKED;
            case 6:
                return OBAKE_CAMERA_PHOTO_SELECTED;
            case 7:
                return OBAKE_DEVICE_PHOTO_SELECTED;
            case 8:
                return OBAKE_GOOGLE_PHOTOS_PHOTO_SELECTED;
            case 9:
                return EMAIL_BUTTON;
            case 10:
                return SCHEDULE_BUTTON;
            case 11:
                return CHAT_BUTTON;
            case 12:
                return CALL_BUTTON;
            case 13:
                return MEET_BUTTON;
            case 14:
                return OBAKE_ART_PHOTO_SELECTED;
            case 15:
                return OBAKE_DELETE_PHOTO_SELECTED;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
