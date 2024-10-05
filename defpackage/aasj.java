package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aasj implements aasa {
    private final SharedPreferences a;
    private final afsy b;

    public aasj(SharedPreferences sharedPreferences, afsy afsyVar) {
        this.a = sharedPreferences;
        this.b = afsyVar;
    }

    @Override // defpackage.aasa
    public final void c(arnd arndVar) {
        if ((arndVar.b & 2) == 0 || TextUtils.isEmpty(arndVar.c)) {
            return;
        }
        String str = arndVar.c;
        if (this.b.c().g()) {
            if (str.equals(this.a.getString("incognito_visitor_id", null))) {
                return;
            }
            this.a.edit().putString("incognito_visitor_id", str).apply();
        } else {
            if (str.equals(this.a.getString("visitor_id", null))) {
                return;
            }
            this.a.edit().putString("visitor_id", str).apply();
        }
    }

    @Override // defpackage.aasa
    public final /* synthetic */ void d(aaru aaruVar, arnd arndVar) {
        whu.U(this, arndVar);
    }

    @Override // defpackage.aasa
    public final boolean f(aaru aaruVar) {
        if (aaruVar.o()) {
            return false;
        }
        return !aaruVar.m.equals("visitor_id") || this.b.c().g();
    }
}
