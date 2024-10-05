package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oyd extends IOException {
    public oyd(Throwable th) {
        super("Failed to query underlying media codecs", th);
    }
}
