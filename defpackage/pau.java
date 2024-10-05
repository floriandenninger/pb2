package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pau extends pav {
    public final Uri a;
    public final long b;
    public final pas c;
    private final pan j;

    public pau(String str, long j, ozv ozvVar, pba pbaVar, String str2, long j2, String str3) {
        super(str, j, ozvVar, str3, pbaVar, str2);
        this.a = Uri.parse(str3);
        long j3 = pbaVar.b;
        pas pasVar = j3 <= 0 ? null : new pas(null, pbaVar.a, j3);
        this.c = pasVar;
        this.b = j2;
        this.j = pasVar == null ? new pan(new pas("", 0L, j2)) : null;
    }

    @Override // defpackage.pav
    public final pah h() {
        return this.j;
    }

    @Override // defpackage.pav
    public final pas i() {
        return this.c;
    }
}
