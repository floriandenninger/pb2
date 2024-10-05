package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aewp extends IOException implements afjr {
    public final long a;
    public final long b;
    public final long c;
    public final String d;

    public aewp(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j3;
        this.c = j4;
        StringBuilder sb = new StringBuilder(97);
        sb.append("seekTimeUs.");
        sb.append(j);
        sb.append(";errorChunks.");
        sb.append(j2);
        sb.append(";newSequence.");
        sb.append(j3);
        this.d = sb.toString();
    }

    @Override // defpackage.afjr
    public final String a(boolean z) {
        return "player.exception";
    }

    @Override // defpackage.afjr
    public final String b() {
        String valueOf = String.valueOf(this.d);
        return valueOf.length() != 0 ? "info.ManifestlessSeek;".concat(valueOf) : new String("info.ManifestlessSeek;");
    }
}
