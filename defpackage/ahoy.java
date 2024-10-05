package defpackage;

import com.google.vr.sdk.base.HeadsetSelector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahoy implements ahox {
    private static final String d = "ahoy";
    public ahos b;
    public ci c;
    private final ywr f;
    private boolean g;
    private final ahov e = new ahov();
    public final ahoz a = new ahoz();

    public ahoy(ywr ywrVar) {
        this.f = ywrVar;
    }

    @Override // defpackage.ahox
    public final boolean a() {
        ci ciVar = this.c;
        if (ciVar == null) {
            return false;
        }
        HeadsetSelector.HeadsetInfo a = ahot.a(ciVar, this.f);
        String str = d;
        String valueOf = String.valueOf(a.getDisplayName());
        zga.h(str, valueOf.length() != 0 ? "Current viewer: ".concat(valueOf) : new String("Current viewer: "));
        int e = ahot.e(a);
        if (e == 0) {
            return false;
        }
        int i = e - 1;
        if (i == 1 || i == 2) {
            this.g = true;
            ahos ahosVar = this.b;
            if (ahosVar != null) {
                ahosVar.k(e);
            }
        } else {
            this.g = true;
            ahos ahosVar2 = this.b;
            if (ahosVar2 != null) {
                ahosVar2.g();
            }
        }
        return true;
    }

    @Override // defpackage.ahox
    public final boolean b() {
        yjk.f();
        ci ciVar = this.c;
        if (ciVar == null) {
            return false;
        }
        if (this.g) {
            this.g = false;
            return false;
        }
        if (ahot.b(ciVar, this.f).size() < 2) {
            zga.h(d, "Less than 2 viewers available. Skipping showing the speed bump.");
            return a();
        }
        ahov ahovVar = this.e;
        ci ciVar2 = this.c;
        if (ahovVar.ar() || ahovVar.av()) {
            return true;
        }
        ahovVar.ag = this;
        ahovVar.qh(ciVar2.getSupportFragmentManager(), ahov.ae);
        return true;
    }
}
