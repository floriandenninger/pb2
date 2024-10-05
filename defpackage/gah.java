package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gah {
    public Optional a;
    public Optional b;
    private Boolean c;

    public gah(byte[] bArr) {
        this.a = Optional.empty();
        this.b = Optional.empty();
    }

    public final gai a() {
        Boolean bool = this.c;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: shouldShowPivotBar");
        }
        return new gai(this.a, bool.booleanValue(), this.b);
    }

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void c(gaj gajVar) {
        this.b = Optional.of(gajVar);
    }

    public final void d(gak gakVar) {
        this.a = Optional.of(gakVar);
    }

    public gah() {
    }
}
