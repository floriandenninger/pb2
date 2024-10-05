package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
enum zan {
    IMMERSIVE(2, 0, true),
    IMMERSIVE_FLEX(2, 2, true),
    IMMERSIVE_SHOW_UI(2, 1, true),
    VR(2, 0, true),
    LAYOUT_FULLSCREEN(1, 1, true),
    DEFAULT(0, 1, false),
    NON_STICKY_FULLSCREEN(2, 0, false);

    public final int h;
    public final boolean i;
    public final int j;

    zan(int i, int i2, boolean z) {
        this.h = i;
        this.i = z;
        this.j = i2;
    }
}
