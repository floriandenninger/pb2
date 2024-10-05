package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avbu implements aonq {
    SURVEY_DISPLAY_TRIGGER_UI_EVENT_UNSPECIFIED(0),
    SURVEY_DISPLAY_TRIGGER_UI_EVENT_APP_FOREGROUNDED(1);

    private static final aonr c = new ancw(5);
    private final int e;

    avbu(int i) {
        this.e = i;
    }

    public static aons a() {
        return auye.s;
    }

    public static avbu b(int i) {
        if (i == 0) {
            return SURVEY_DISPLAY_TRIGGER_UI_EVENT_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return SURVEY_DISPLAY_TRIGGER_UI_EVENT_APP_FOREGROUNDED;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
