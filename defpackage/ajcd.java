package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ajcd {
    UNKNOWN,
    NEXT,
    PREVIOUS,
    RELOAD,
    TIMED,
    INVALIDATION,
    ADDITIONAL_ACCOUNT,
    NEXT_RADIO;

    public final boolean a(ajce ajceVar) {
        return ajceVar != null && equals(ajceVar.a());
    }
}
