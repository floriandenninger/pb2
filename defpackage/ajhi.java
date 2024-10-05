package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajhi {
    private Boolean a;

    public final ajhj a() {
        Boolean bool = this.a;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: swipeToCameraEnabled");
        }
        return new ajhj(bool.booleanValue());
    }

    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final xkb c() {
        Boolean bool = this.a;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: remotePlayback");
        }
        return new xkb(bool.booleanValue());
    }

    public final void d(boolean z) {
        this.a = Boolean.valueOf(z);
    }
}
