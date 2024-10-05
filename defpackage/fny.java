package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fny {
    public final ammv a;
    public final ammv b;

    public fny(SharedPreferences sharedPreferences) {
        this.a = ammv.i(sharedPreferences);
        this.b = amlr.a;
    }

    public fny(vfm vfmVar) {
        this.a = amlr.a;
        this.b = ammv.i(vfmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(String str, int i) {
        return this.a.h() ? ((SharedPreferences) this.a.c()).getInt(str, i) : this.b.h() ? ((vfm) this.b.c()).a(str, i) : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(String str) {
        return this.a.h() ? ((SharedPreferences) this.a.c()).contains(str) : this.b.h() && ((vfm) this.b.c()).e(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(String str) {
        return this.a.h() ? ((SharedPreferences) this.a.c()).getBoolean(str, false) : this.b.h() && ((vfm) this.b.c()).f(str, false);
    }
}
