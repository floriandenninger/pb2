package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum fhg {
    NONE,
    HIDDEN,
    WATCH_WHILE_MINIMIZED,
    WATCH_WHILE_MAXIMIZED,
    WATCH_WHILE_FULLSCREEN,
    WATCH_WHILE_SLIDING_MAXIMIZED_FULLSCREEN,
    WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED,
    WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED,
    WATCH_WHILE_SLIDING_FULLSCREEN_DISMISSED,
    INLINE_MINIMAL,
    VIRTUAL_REALITY_FULLSCREEN,
    WATCH_WHILE_PICTURE_IN_PICTURE;

    public final boolean a() {
        return !e() && b() && h();
    }

    public final boolean b() {
        return this == WATCH_WHILE_FULLSCREEN || this == VIRTUAL_REALITY_FULLSCREEN || this == WATCH_WHILE_PICTURE_IN_PICTURE;
    }

    public final boolean c() {
        return this == NONE || d();
    }

    public final boolean d() {
        return this == INLINE_MINIMAL;
    }

    public final boolean e() {
        return this == WATCH_WHILE_PICTURE_IN_PICTURE;
    }

    public final boolean f() {
        return (this == NONE || this == HIDDEN) ? false : true;
    }

    public final boolean g() {
        return this == VIRTUAL_REALITY_FULLSCREEN;
    }

    public final boolean h() {
        return this == WATCH_WHILE_MINIMIZED || this == WATCH_WHILE_MAXIMIZED || this == WATCH_WHILE_FULLSCREEN || this == WATCH_WHILE_SLIDING_MAXIMIZED_FULLSCREEN || this == WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED || this == WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED || this == WATCH_WHILE_SLIDING_FULLSCREEN_DISMISSED || this == WATCH_WHILE_PICTURE_IN_PICTURE;
    }

    public final boolean i() {
        return this == WATCH_WHILE_MAXIMIZED || this == WATCH_WHILE_FULLSCREEN;
    }

    public final boolean j() {
        return i() || this == WATCH_WHILE_SLIDING_MAXIMIZED_FULLSCREEN;
    }

    public final boolean k() {
        return this == WATCH_WHILE_MINIMIZED || this == WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED;
    }

    public final boolean l() {
        return k() || m();
    }

    public final boolean m() {
        return this == WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED || this == WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED || this == WATCH_WHILE_SLIDING_MAXIMIZED_FULLSCREEN || this == WATCH_WHILE_SLIDING_FULLSCREEN_DISMISSED;
    }
}
