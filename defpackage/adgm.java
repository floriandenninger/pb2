package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgm extends adft {
    public final Duration b;

    public adgm(String str, int i, Duration duration) {
        super(str, i);
        this.b = duration;
    }

    @Override // defpackage.adgn
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return this.b.equals(((adgm) obj).b);
        }
        return false;
    }
}
