package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rfx {
    final /* synthetic */ rgc a;
    private final String b;
    private final boolean c;
    private boolean d;
    private boolean e;

    public rfx(rgc rgcVar, String str, boolean z) {
        this.a = rgcVar;
        qip.ax(str);
        this.b = str;
        this.c = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.a.a().edit();
        edit.putBoolean(this.b, z);
        edit.apply();
        this.e = z;
    }

    public final boolean b() {
        if (!this.d) {
            this.d = true;
            this.e = this.a.a().getBoolean(this.b, this.c);
        }
        return this.e;
    }
}
