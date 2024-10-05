package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sju implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;

    public sju(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    public static sjp b(ammv ammvVar, sjr sjrVar, ammv ammvVar2, anic anicVar) {
        return new sjp(ammvVar, sjrVar, ammvVar2, anicVar);
    }

    public static sju c(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new sju(azrwVar, azrwVar2, azrwVar3, azrwVar4);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sjp get() {
        return b((ammv) ((axqs) this.a).a, ((sjs) this.b).get(), (ammv) this.c.get(), (anic) this.d.get());
    }
}
