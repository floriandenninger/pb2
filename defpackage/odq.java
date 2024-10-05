package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class odq implements oev {
    private static final Rect b = new Rect(0, 0, 2, 2);
    public oev a;
    private final obs c;
    private final odr d;

    public odq(obs obsVar, odr odrVar) {
        this.c = obsVar;
        this.d = odrVar;
    }

    @Override // defpackage.oev
    public final Rect a() {
        oev oevVar = this.a;
        if (oevVar == null) {
            return b;
        }
        Rect a = oevVar.a();
        return (a.width() > 1 || a.height() > 1) ? a : b;
    }

    public final boolean b() {
        if (this.d.b()) {
            return true;
        }
        oev oevVar = this.a;
        if (oevVar == null) {
            return !this.c.g() || this.c.f();
        }
        oel oelVar = (oel) oevVar;
        return (!oelVar.a.d() && !oelVar.a.e()) || (oelVar.a.e() && oelVar.f != null);
    }
}
