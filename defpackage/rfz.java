package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rfz {
    final /* synthetic */ rgc a;
    private final String b;
    private final long c;
    private boolean d;
    private long e;

    public rfz(rgc rgcVar, String str, long j) {
        this.a = rgcVar;
        qip.ax(str);
        this.b = str;
        this.c = j;
    }

    public final long a() {
        if (!this.d) {
            this.d = true;
            this.e = this.a.a().getLong(this.b, this.c);
        }
        return this.e;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.a.a().edit();
        edit.putLong(this.b, j);
        edit.apply();
        this.e = j;
    }
}
