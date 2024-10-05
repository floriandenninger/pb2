package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqtl implements aonq {
    ENGAGEMENT_PANEL_SNAP_STATE_UNKNOWN(0),
    ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER(1),
    ENGAGEMENT_PANEL_SNAP_STATE_FULL_BLEED(2);

    private final int e;

    aqtl(int i) {
        this.e = i;
    }

    public static aons a() {
        return aqtk.e;
    }

    public static aqtl b(int i) {
        if (i == 0) {
            return ENGAGEMENT_PANEL_SNAP_STATE_UNKNOWN;
        }
        if (i == 1) {
            return ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER;
        }
        if (i != 2) {
            return null;
        }
        return ENGAGEMENT_PANEL_SNAP_STATE_FULL_BLEED;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
