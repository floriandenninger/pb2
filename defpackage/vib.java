package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vib extends Exception {
    public vib(Throwable th) {
        super("An unknown error occurred during upgrade. The upgrade may fail repeatedly when retried.", th);
    }
}
