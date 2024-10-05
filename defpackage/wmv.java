package defpackage;

import android.app.Application;
import android.view.View;
import com.google.android.libraries.lidar.VisibilityChangeEventData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wmv {
    public final tdw a;
    public wmu b;

    public wmv(tdq tdqVar, View view, baof baofVar, byte[] bArr) {
        tdqVar.getClass();
        this.a = new tdw(tdqVar, view, new wms(this), baofVar, null);
    }

    public final tdt a() {
        return this.a.a(tfa.ABANDON);
    }

    public final tdt b() {
        return this.a.a(tfa.COMPLETE);
    }

    public final tdt c() {
        return this.a.a(tfa.EXIT_FULLSCREEN);
    }

    public final tdt d() {
        return this.a.a(tfa.FULLSCREEN);
    }

    public final tdt e() {
        return this.a.a(tfa.START);
    }

    public final tdt f() {
        return this.a.a(tfa.PAUSE);
    }

    public final tdt g() {
        return this.a.a(tfa.RESUME);
    }

    public final tdt h(int i) {
        if (i == 1) {
            return this.a.a(tfa.FIRST_QUARTILE);
        }
        if (i == 2) {
            return this.a.a(tfa.MIDPOINT);
        }
        if (i != 3) {
            return null;
        }
        return this.a.a(tfa.THIRD_QUARTILE);
    }

    public final tdt i() {
        return this.a.a(tfa.SKIP);
    }

    public final void j() {
        this.a.a.g = null;
    }

    public final void k() {
        Application a;
        tdw tdwVar = this.a;
        tdwVar.b.b();
        tdq tdqVar = tdwVar.c;
        if (tdqVar == null || (a = tdqVar.a()) == null) {
            return;
        }
        a.unregisterActivityLifecycleCallbacks(tdwVar);
    }

    public final void l(VisibilityChangeEventData visibilityChangeEventData) {
        tei teiVar = this.a.b;
        if (teiVar instanceof tfb) {
            tfb tfbVar = (tfb) teiVar;
            tey teyVar = tfbVar.a;
            teyVar.l = false;
            teyVar.b = System.currentTimeMillis();
            tey teyVar2 = tfbVar.a;
            teyVar2.a = visibilityChangeEventData.c;
            tfb.c(teyVar2, visibilityChangeEventData, null);
            tfbVar.a.l();
            tfbVar.a.m();
        }
    }

    public final void m() {
        this.a.a(tfa.SUSPEND);
    }

    public final void n(int i, int i2, int i3, int i4) {
        this.a.a.e(i, i2, i3, i4);
    }

    public wmv(baof baofVar, byte[] bArr) {
        this.a = new tdw(new wms(this), baofVar, null);
    }
}
