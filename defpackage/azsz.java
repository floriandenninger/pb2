package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azsz implements azsq {
    public static final azsz a = new azsz();

    private azsz() {
    }

    @Override // defpackage.azsq
    public final azsv getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // defpackage.azsq
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
