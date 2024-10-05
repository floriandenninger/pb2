package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahjv extends ahhi {
    public final ahjo a;
    public final ahjo b;
    private final ahjo c;

    public ahjv(ahkv ahkvVar, ahjl ahjlVar) {
        ahjo a = ahjlVar.a(ahkvVar.clone(), 0.0f, 40.0f);
        this.a = a;
        a.h(17);
        a.B(true, true);
        a.z(-7829368);
        a.A(2.0f);
        a.l(0.0f, 6.0f, 0.0f);
        n(a);
        a.qE(true);
        ahjo a2 = ahjlVar.a(ahkvVar.clone(), 40.0f, 0.0f);
        this.b = a2;
        a2.B(false, true);
        a2.A(2.0f);
        a2.h(1);
        a2.l(0.0f, 2.0f, 0.0f);
        a2.g(new ahju(this));
        n(a2);
        ahjo a3 = ahjlVar.a(ahkvVar.clone(), 40.0f, 0.0f);
        this.c = a3;
        a3.B(false, true);
        a3.A(1.5f);
        a3.h(1);
        n(a3);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.c.y("");
            this.c.qE(true);
            return;
        }
        ahjo ahjoVar = this.c;
        if (str.length() > 40) {
            str = String.valueOf(str.substring(0, 37)).concat("...");
        }
        ahjoVar.y(str);
        this.c.qE(false);
    }

    public final void b(String str) {
        this.b.y(str);
    }
}
