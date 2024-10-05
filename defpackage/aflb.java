package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aflb {
    UNKNOWN(false, false, false, 0),
    NONE(false, false, false, 1),
    TEXTURE(true, false, false, 2),
    SURFACE(afky.h, false, true, 3),
    YUV_SURFACE(afky.h, false, true, 4),
    SECURE_SURFACE(afky.h, true, true, 5),
    GL_GVR(false, false, false, 6),
    GL_VPX(false, false, false, 7),
    APPLICATION(false, false, false, 8);

    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;

    aflb(boolean z, boolean z2, boolean z3, int i) {
        this.j = z;
        this.k = z3;
        this.l = z2;
        this.m = i;
    }
}
