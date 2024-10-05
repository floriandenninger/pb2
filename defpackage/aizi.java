package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aizi implements axqr {
    private final azrw a;
    private final azrw b;
    private final /* synthetic */ int c;

    public aizi(azrw azrwVar, azrw azrwVar2, int i) {
        this.c = i;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public static aizi a(azrw azrwVar, azrw azrwVar2) {
        return new aizi(azrwVar, azrwVar2, 0);
    }

    public static aizi b(azrw azrwVar, azrw azrwVar2) {
        return new aizi(azrwVar, azrwVar2, 1);
    }

    public static aizi c(azrw azrwVar, azrw azrwVar2) {
        return new aizi(azrwVar, azrwVar2, 2);
    }

    public static aizi d(azrw azrwVar, azrw azrwVar2) {
        return new aizi(azrwVar, azrwVar2, 3);
    }

    public static aizi e(azrw azrwVar, azrw azrwVar2) {
        return new aizi(azrwVar, azrwVar2, 4);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        int i = this.c;
        if (i == 0) {
            azqv azqvVar = (azqv) this.b.get();
            ayaw.k(azqvVar);
            return azqvVar;
        }
        if (i == 1) {
            azqv azqvVar2 = (azqv) this.b.get();
            ayaw.k(azqvVar2);
            return azqvVar2;
        }
        if (i == 2) {
            azqv azqvVar3 = (azqv) this.b.get();
            ayaw.k(azqvVar3);
            return azqvVar3;
        }
        if (i == 3) {
            azqv azqvVar4 = (azqv) this.b.get();
            ayaw.k(azqvVar4);
            return azqvVar4;
        }
        azqv azqvVar5 = (azqv) this.b.get();
        ayaw.k(azqvVar5);
        return azqvVar5;
    }
}
