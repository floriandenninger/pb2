package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aigk {
    NEW,
    VIDEO_LOADING,
    VIDEO_PLAYBACK_ERROR,
    VIDEO_PLAYBACK_LOADED,
    VIDEO_WATCH_LOADED;

    public final boolean a(aigk... aigkVarArr) {
        for (aigk aigkVar : aigkVarArr) {
            if (this == aigkVar) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(aigk aigkVar) {
        return ordinal() >= aigkVar.ordinal();
    }
}
