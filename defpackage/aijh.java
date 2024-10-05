package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aijh implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final /* synthetic */ int e;

    public aijh(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i) {
        this.e = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    public aijh(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = azrwVar;
        this.d = azrwVar2;
        this.c = azrwVar3;
        this.b = azrwVar4;
    }

    public aijh(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, char[] cArr) {
        this.e = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    public aijh(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, float[] fArr) {
        this.e = i;
        this.b = azrwVar;
        this.d = azrwVar2;
        this.a = azrwVar3;
        this.c = azrwVar4;
    }

    public aijh(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, int[] iArr) {
        this.e = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
        this.d = azrwVar4;
    }

    public aijh(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, short[] sArr) {
        this.e = i;
        this.b = azrwVar;
        this.d = azrwVar2;
        this.c = azrwVar3;
        this.a = azrwVar4;
    }

    public aijh(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, boolean[] zArr) {
        this.e = i;
        this.b = azrwVar;
        this.d = azrwVar2;
        this.c = azrwVar3;
        this.a = azrwVar4;
    }

    public static aijh a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aijh(azrwVar, azrwVar2, azrwVar3, azrwVar4, 0);
    }

    public static aivu b(aivo aivoVar, aifv aifvVar, aivs aivsVar, ypa ypaVar) {
        return new aivu(aivoVar, aifvVar, aivsVar, ypaVar);
    }

    public static aijh c(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aijh(azrwVar, azrwVar2, azrwVar3, azrwVar4, 1, (byte[]) null);
    }

    public static aijh d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aijh(azrwVar, azrwVar2, azrwVar3, azrwVar4, 2, (char[]) null);
    }

    public static aijh e(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aijh(azrwVar, azrwVar2, azrwVar3, azrwVar4, 3, (short[]) null);
    }

    public static aijh f(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aijh(azrwVar, azrwVar2, azrwVar3, azrwVar4, 4, (int[]) null);
    }

    public static aijh g(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aijh(azrwVar, azrwVar2, azrwVar3, azrwVar4, 5, (boolean[]) null);
    }

    public static aijh h(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aijh(azrwVar, azrwVar2, azrwVar3, azrwVar4, 6, (float[]) null);
    }

    public static airc i(afsy afsyVar, aayb aaybVar, akfq akfqVar, aadw aadwVar) {
        return new airc(afsyVar, aaybVar, akfqVar, aadwVar, null, null);
    }

    public static ajaa j(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar) {
        return new ajaa(aarmVar, ajoyVar, afsyVar, yslVar, null, null, null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        int i = this.e;
        if (i == 0) {
            ypa ypaVar = (ypa) this.a.get();
            abds abdsVar = (abds) this.b.get();
            abdt abdtVar = (abdt) this.c.get();
            return new aijg(ypaVar, abdsVar, abdtVar);
        }
        if (i == 1) {
            return new aian((Executor) this.a.get(), ((ahzl) this.d).get(), ((ahzp) this.c).get(), (aifk) this.b.get(), null, null, null);
        }
        if (i == 2) {
            return new aikd(this.b, (aadw) this.a.get(), (ajbh) this.c.get(), this.d, null);
        }
        if (i == 3) {
            return new aiow((banw) this.b.get(), ((aioj) this.d).get(), (aiih) this.c.get(), (aipd) this.a.get(), null);
        }
        if (i == 4) {
            return i((afsy) this.c.get(), (aayb) this.a.get(), ((aiqz) this.b).get(), (aadw) this.d.get());
        }
        if (i != 5) {
            return j((aarm) this.b.get(), (ajoy) this.d.get(), (afsy) this.a.get(), (ysl) this.c.get());
        }
        aivu b = b((aivo) this.b.get(), (aifv) this.d.get(), (aivs) this.c.get(), (ypa) this.a.get());
        b.a();
        return b;
    }
}
