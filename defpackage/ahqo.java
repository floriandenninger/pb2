package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ahqo {
    NEW,
    LOGGED_NEW_SCREEN,
    LOGGED_ATTACH_PLAYER,
    LOGGED_ATTACH_WATCH_NEXT;

    public final boolean a(ahqo ahqoVar) {
        return ordinal() >= ahqoVar.ordinal();
    }
}
