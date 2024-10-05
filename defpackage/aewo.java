package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aewo extends IOException implements afjr {
    public final long a;
    public final String b;

    public aewo(long j, long j2) {
        afki.b(j < j2);
        this.a = j2;
        StringBuilder sb = new StringBuilder(25);
        sb.append("diff.");
        sb.append(j2 - j);
        this.b = sb.toString();
    }

    @Override // defpackage.afjr
    public final String a(boolean z) {
        return "manifestless.head.race";
    }

    @Override // defpackage.afjr
    public final String b() {
        return this.b;
    }
}
