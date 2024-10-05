package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum tfa {
    START(true, false, 0),
    FIRST_QUARTILE(true, false, 1),
    MIDPOINT(true, false, 2),
    THIRD_QUARTILE(true, false, 3),
    COMPLETE(false, false, 4, true),
    RESUME(true),
    PAUSE(false, true),
    SUSPEND(false, true),
    ABANDON(false, true, -1, true),
    SKIP_SHOWN(true),
    SKIP(false, true),
    MUTE,
    UNMUTE,
    VIEWABLE_IMPRESSION(false),
    MEASURABLE_IMPRESSION,
    GROUPM_VIEWABLE_IMPRESSION,
    FULLSCREEN(false),
    EXIT_FULLSCREEN(false);

    public final boolean s;
    public final boolean t;
    public final int u;
    public final boolean v;

    tfa() {
        this(false, false, -1, false);
    }

    public boolean a() {
        return this.u != -1;
    }

    public boolean b() {
        return this == SKIP || this == COMPLETE || this == ABANDON;
    }

    tfa(boolean z) {
        this(z, false, -1, false);
    }

    tfa(boolean z, boolean z2) {
        this(false, false, -1, true);
    }

    tfa(boolean z, boolean z2, int i) {
        this(true, false, i, false);
    }

    tfa(boolean z, boolean z2, int i, boolean z3) {
        this.s = z;
        this.t = z2;
        this.u = i;
        this.v = z3;
    }
}
