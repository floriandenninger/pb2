package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class phs extends IOException implements afjr {
    private final String a;

    public phs(String str, Exception exc) {
        super(str, exc);
        this.a = "file";
    }

    @Override // defpackage.afjr
    public final String a(boolean z) {
        return this.a;
    }

    @Override // defpackage.afjr
    public final String b() {
        return getMessage();
    }
}
