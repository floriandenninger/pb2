package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiog implements axqr {
    private final azrw a;
    private final azrw b;
    private final /* synthetic */ int c;

    public aiog(azrw azrwVar, azrw azrwVar2, int i) {
        this.c = i;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public aiog(azrw azrwVar, azrw azrwVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public aiog(azrw azrwVar, azrw azrwVar2, int i, char[] cArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public aiog(azrw azrwVar, azrw azrwVar2, int i, int[] iArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public aiog(azrw azrwVar, azrw azrwVar2, int i, short[] sArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public aiog(azrw azrwVar, azrw azrwVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public static aipt A(axzg axzgVar, ywr ywrVar) {
        return new aipt(axzgVar, ywrVar, null, null);
    }

    public static aiog a(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 0);
    }

    public static aifs b(aifv aifvVar, aift aiftVar) {
        return new aifs(aifvVar, aiftVar);
    }

    public static Set c(aiik aiikVar, aijo aijoVar) {
        HashSet hashSet = new HashSet();
        hashSet.add(aiikVar);
        if (aijoVar != null) {
            hashSet.add(aijoVar);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        ayaw.k(unmodifiableSet);
        return unmodifiableSet;
    }

    public static aioe d(ainy ainyVar, aimb aimbVar) {
        return new aioe(aimbVar, ainyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ajbh] */
    public static ajbh e(airx airxVar, aadw aadwVar) {
        airx airxVar2 = airxVar;
        if (aifk.G(aadwVar)) {
            airxVar2 = new ajbh();
        }
        ayaw.k(airxVar2);
        return airxVar2;
    }

    public static aiog f(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 1, (byte[]) null);
    }

    public static aiog g(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 2);
    }

    public static aiog h(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 3, (char[]) null);
    }

    public static aiog i(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 4, (short[]) null);
    }

    public static aiog j(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 5, (int[]) null);
    }

    public static aiog k(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 6);
    }

    public static aiog l(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 7);
    }

    public static aiog m(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 8);
    }

    public static aiog n(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 9);
    }

    public static aiog o(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 10);
    }

    public static aiog p(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 11);
    }

    public static aiog q(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 12, (boolean[]) null);
    }

    public static aiog r(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 13);
    }

    public static aiog s(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 14);
    }

    public static aiog t(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 15);
    }

    public static aiog u(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 16);
    }

    public static aiog v(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 17);
    }

    public static aiog w(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 18);
    }

    public static aiog x(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 19);
    }

    public static aiog y(azrw azrwVar, azrw azrwVar2) {
        return new aiog(azrwVar, azrwVar2, 20);
    }

    public static airh z(ajyw ajywVar, aiov aiovVar) {
        return new airh(ajywVar, aiovVar, null, null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                azqw azqwVar = (azqw) this.b.get();
                ayaw.k(azqwVar);
                return azqwVar;
            case 1:
                return b((aifv) this.b.get(), (aift) this.a.get());
            case 2:
                azqw azqwVar2 = (azqw) this.b.get();
                ayaw.k(azqwVar2);
                return azqwVar2;
            case 3:
                return c((aiik) this.b.get(), (aijo) this.a.get());
            case 4:
                return d((ainy) this.b.get(), (aimb) this.a.get());
            case 5:
                return e((airx) this.b.get(), (aadw) this.a.get());
            case 6:
                azqw azqwVar3 = (azqw) this.b.get();
                ayaw.k(azqwVar3);
                return azqwVar3;
            case 7:
                azqw azqwVar4 = (azqw) this.b.get();
                ayaw.k(azqwVar4);
                return azqwVar4;
            case 8:
                azqv azqvVar = (azqv) this.b.get();
                ayaw.k(azqvVar);
                return azqvVar;
            case 9:
                azqw azqwVar5 = (azqw) this.b.get();
                ayaw.k(azqwVar5);
                return azqwVar5;
            case 10:
                azqw azqwVar6 = (azqw) this.b.get();
                ayaw.k(azqwVar6);
                return azqwVar6;
            case 11:
                azqv azqvVar2 = (azqv) this.b.get();
                ayaw.k(azqvVar2);
                return azqvVar2;
            case 12:
                return A((axzg) this.b.get(), (ywr) this.a.get());
            case 13:
                airh z = z(((airf) this.a).get(), (aiov) this.b.get());
                z.a();
                return z;
            case 14:
                azqv azqvVar3 = (azqv) this.b.get();
                ayaw.k(azqvVar3);
                return azqvVar3;
            case 15:
                azqv azqvVar4 = (azqv) this.b.get();
                ayaw.k(azqvVar4);
                return azqvVar4;
            case 16:
                azqv azqvVar5 = (azqv) this.b.get();
                ayaw.k(azqvVar5);
                return azqvVar5;
            case 17:
                azqv azqvVar6 = (azqv) this.b.get();
                ayaw.k(azqvVar6);
                return azqvVar6;
            case 18:
                azqv azqvVar7 = (azqv) this.b.get();
                ayaw.k(azqvVar7);
                return azqvVar7;
            case 19:
                azqv azqvVar8 = (azqv) this.b.get();
                ayaw.k(azqvVar8);
                return azqvVar8;
            default:
                azqv azqvVar9 = (azqv) this.b.get();
                ayaw.k(azqvVar9);
                return azqvVar9;
        }
    }
}
