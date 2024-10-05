package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
enum afgn {
    BUFFERING("B"),
    ERROR("ER"),
    ENDED("EN"),
    NOT_STARTED("N"),
    PAUSED("PA"),
    PLAYING("PL"),
    SEEKING("S"),
    NOT_VALID("X"),
    PAUSED_BUFFERING("PB"),
    SUSPENDED("SU");

    private final String l;

    afgn(String str) {
        this.l = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.l;
    }
}
