package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wgv {
    public final azrw a;
    public String b;
    public final aadw c;
    public final vgz d;

    public wgv(azrw azrwVar, vgz vgzVar, aadw aadwVar) {
        this.a = azrwVar;
        this.d = vgzVar;
        this.c = aadwVar;
    }

    public static boolean e(aadw aadwVar) {
        atfq atfqVar = aadwVar.b().o;
        if (atfqVar == null) {
            atfqVar = atfq.a;
        }
        auie auieVar = atfqVar.g;
        if (auieVar == null) {
            auieVar = auie.a;
        }
        return auieVar.f;
    }

    public static anhy f(vgz vgzVar, String str) {
        return vgzVar.b(new wgs(str, 6), angq.a);
    }

    public final anhy a() {
        return this.d.b(wgr.c, angq.a);
    }

    public final anhy b() {
        if (!e(this.c)) {
            ((SharedPreferences) this.a.get()).edit().remove("pre_incognito_signed_in_user_id").apply();
            return anhv.a;
        }
        return f(this.d, "");
    }

    public final anhy c(String str) {
        return anfq.h(this.d.a(), new wgs(str, 1), angq.a);
    }

    public final anhy d() {
        return anfq.h(this.d.a(), wgr.d, angq.a);
    }
}
