package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ucm extends Exception {
    public ucm() {
        super("Failed to get ContentProviderClient for accounts from GmsCore");
    }

    public ucm(Throwable th) {
        super("Error getting accounts via GmsCore", th);
    }
}
