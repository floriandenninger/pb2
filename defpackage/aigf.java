package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aigf {
    DEFAULT(0),
    MINIMIZED(1),
    FULLSCREEN(2),
    BACKGROUND(3),
    INLINE_IN_FEED(5),
    VIRTUAL_REALITY(6),
    PICTURE_IN_PICTURE(7),
    REMOTE(-1);

    public final int i;

    aigf(int i) {
        this.i = i;
    }

    public final String a() {
        return String.valueOf(this.i);
    }

    public final boolean b() {
        int ordinal = ordinal();
        return ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 4 || ordinal == 5 || ordinal == 6;
    }
}
