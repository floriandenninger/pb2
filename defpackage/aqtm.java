package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqtm implements aonq {
    ENGAGEMENT_PANEL_SURFACE_UNKNOWN(0),
    ENGAGEMENT_PANEL_SURFACE_WATCH(1),
    ENGAGEMENT_PANEL_SURFACE_BROWSE(2),
    ENGAGEMENT_PANEL_SURFACE_SEARCH(3);

    private final int f;

    aqtm(int i) {
        this.f = i;
    }

    public static aons a() {
        return aqtk.i;
    }

    public static aqtm b(int i) {
        if (i == 0) {
            return ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
        }
        if (i == 1) {
            return ENGAGEMENT_PANEL_SURFACE_WATCH;
        }
        if (i == 2) {
            return ENGAGEMENT_PANEL_SURFACE_BROWSE;
        }
        if (i != 3) {
            return null;
        }
        return ENGAGEMENT_PANEL_SURFACE_SEARCH;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
