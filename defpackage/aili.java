package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aili {
    public final ywr a;

    public aili(ywr ywrVar) {
        this.a = ywrVar;
    }

    public static String b(afsx afsxVar, String str) {
        String d = afsxVar.d();
        StringBuilder sb = new StringBuilder(str.length() + 1 + d.length());
        sb.append(str);
        sb.append(":");
        sb.append(d);
        return sb.toString();
    }

    public static boolean f(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("playability_adult_confirmations:");
    }

    public final anhy a(afsx afsxVar) {
        return anfq.h(this.a.a(), new ailh(b(afsxVar, "playability_adult_confirmations"), 0), angq.a);
    }

    public final void e(afsx afsxVar, boolean z) {
        ynm.m(this.a.b(new fju(b(afsxVar, "playability_adult_confirmations"), z, 3)), ailg.a);
    }

    public final anhy g() {
        return anfq.h(this.a.a(), fjw.o, angq.a);
    }

    public final anhy j(amml ammlVar) {
        return this.a.b(ammlVar);
    }
}
