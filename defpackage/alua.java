package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum alua {
    CONFIG_DEFAULT(altc.CONFIG_PROGRESS_ILLUSTRATION_DEFAULT),
    CONFIG_ACCOUNT(altc.CONFIG_PROGRESS_ILLUSTRATION_ACCOUNT),
    CONFIG_CONNECTION(altc.CONFIG_PROGRESS_ILLUSTRATION_CONNECTION),
    CONFIG_UPDATE(altc.CONFIG_PROGRESS_ILLUSTRATION_UPDATE);

    alua(altc altcVar) {
        if (altcVar.bj != 8) {
            throw new IllegalArgumentException("Illustration progress only allow illustration resource");
        }
    }
}
