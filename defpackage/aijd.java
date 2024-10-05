package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aijd implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final azrw i;

    public aijd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.g = azrwVar7;
        this.h = azrwVar8;
        this.i = azrwVar9;
    }

    public static aijd b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9) {
        return new aijd(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9);
    }

    public static aijc c(ypa ypaVar, aarm aarmVar, ajoy ajoyVar, afsy afsyVar, aijp aijpVar, Set set, abdt abdtVar, aaea aaeaVar, aelm aelmVar) {
        return new aijc(ypaVar, aarmVar, ajoyVar, afsyVar, aijpVar, set, abdtVar, aaeaVar, aelmVar, null, null, null);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aijc get() {
        return c((ypa) this.a.get(), (aarm) this.b.get(), (ajoy) this.c.get(), (afsy) this.d.get(), (aijp) this.e.get(), ((axqw) this.f).get(), (abdt) this.g.get(), (aaea) this.h.get(), ((aham) this.i).get());
    }
}
