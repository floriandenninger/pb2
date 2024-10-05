package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum adkb {
    CAST_TOOLTIP("cast-tooltip", false, acrb.CAST_TOOLTIP),
    CAST_TOOLTIP_REPRESSED("cast-tooltip-repressed", true, acrb.CAST_TOOLTIP_REPRESSED),
    CAST_SNACKBAR("cast-snackbar", false, acrb.CAST_SNACKBAR),
    CAST_SNACKBAR_REPRESSED("cast-snackbar-repressed", true, acrb.CAST_SNACKBAR_REPRESSED),
    CAST_CLING("cast-cling", false, acrb.CAST_CLING),
    CAST_CLING_REPRESSED("cast-cling-repressed", true, acrb.CAST_CLING_REPRESSED);

    public final boolean g;
    public final acrb h;
    private final String j;

    adkb(String str, boolean z, acrb acrbVar) {
        this.j = str;
        this.g = z;
        this.h = acrbVar;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.j;
    }
}
