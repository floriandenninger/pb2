package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abev implements axqr {
    private final azrw a;
    private final azrw b;
    private final /* synthetic */ int c;

    public abev(azrw azrwVar, azrw azrwVar2, int i) {
        this.c = i;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public abev(azrw azrwVar, azrw azrwVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public abev(azrw azrwVar, azrw azrwVar2, int i, char[] cArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public abev(azrw azrwVar, azrw azrwVar2, int i, float[] fArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public abev(azrw azrwVar, azrw azrwVar2, int i, int[] iArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public abev(azrw azrwVar, azrw azrwVar2, int i, short[] sArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public abev(azrw azrwVar, azrw azrwVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public abev(azrw azrwVar, azrw azrwVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public abev(azrw azrwVar, azrw azrwVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public abev(azrw azrwVar, azrw azrwVar2, int i, int[][] iArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public abev(azrw azrwVar, azrw azrwVar2, int i, short[][] sArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public static abev A(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 9);
    }

    public static abev B(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 10, (int[]) null);
    }

    public static abev C(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 11, (boolean[]) null);
    }

    public static abev D(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 12, (float[]) null);
    }

    public static abev E(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 13);
    }

    public static abev F(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 14);
    }

    public static abev G(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 15, (byte[][]) null);
    }

    public static abev H(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 16);
    }

    public static abev I(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 17);
    }

    public static abev J(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 18, (char[][]) null);
    }

    public static abev K(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 19, (short[][]) null);
    }

    public static abev L(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 20, (int[][]) null);
    }

    public static abeu a(azrw azrwVar, azrw azrwVar2) {
        return new abeu(azrwVar, azrwVar2);
    }

    public static abev b(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 0);
    }

    public static aawl c(aabx aabxVar, azrw azrwVar) {
        boolean z = aabxVar.h;
        aawl aawlVar = (aawl) azrwVar.get();
        ayaw.k(aawlVar);
        return aawlVar;
    }

    public static acpm d(aadw aadwVar, shf shfVar) {
        return new acpm(aadwVar, shfVar);
    }

    public static advq e(azrw azrwVar, azrw azrwVar2) {
        return new advq(azrwVar, azrwVar2);
    }

    public static adxl f(ammv ammvVar, adxm adxmVar) {
        return (adxl) ammvVar.e(adxmVar);
    }

    public static aenf g(ammv ammvVar, aenj aenjVar) {
        return (aenf) ammvVar.e(aenjVar);
    }

    public static afjj h(shf shfVar, aaoz aaozVar) {
        float f;
        PlayerConfigModel playerConfigModel = aaozVar.get();
        aquz aquzVar = playerConfigModel.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        if (aquzVar.aT != 0.0f) {
            aquz aquzVar2 = playerConfigModel.c.e;
            if (aquzVar2 == null) {
                aquzVar2 = aquz.b;
            }
            f = aquzVar2.aT;
        } else {
            f = 5.0f;
        }
        double d = f;
        aquz aquzVar3 = playerConfigModel.c.e;
        if (aquzVar3 == null) {
            aquzVar3 = aquz.b;
        }
        return new afjj(shfVar, d, aquzVar3.aU);
    }

    public static afhf i(aaoz aaozVar, afix afixVar) {
        return afiy.a(afixVar, aaozVar, advx.b, false, 3);
    }

    public static void j(aaea aaeaVar, yss yssVar) {
        atfr atfrVar = aaeaVar.a().f;
        if (atfrVar == null) {
            atfrVar = atfr.a;
        }
        atmg atmgVar = atfrVar.k;
        if (atmgVar == null) {
            atmgVar = atmg.a;
        }
        yssVar.a(atmgVar.c * atmgVar.b);
        ayaw.k(yssVar);
    }

    public static afjy k(shf shfVar, afhz afhzVar) {
        return new afjy(shfVar, afhzVar, 2);
    }

    public static afjy l(shf shfVar, afhz afhzVar) {
        return new afjy(shfVar, afhzVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static shf m(aaea aaeaVar, zhr zhrVar, afjj afjjVar) {
        auij auijVar;
        if (aaeaVar == null || aaeaVar.a() == null) {
            auijVar = auij.b;
        } else {
            atcl atclVar = aaeaVar.a().i;
            if (atclVar == null) {
                atclVar = atcl.a;
            }
            auijVar = atclVar.f;
            if (auijVar == null) {
                auijVar = auij.b;
            }
        }
        int aI = aobq.aI(auijVar.g);
        if (aI == 0) {
            aI = 1;
        }
        if (aI - 1 == 2) {
            zhrVar = afjjVar;
        }
        ayaw.k(zhrVar);
        return zhrVar;
    }

    public static aeey n(afhs afhsVar, shf shfVar) {
        return new aeey(afhsVar, shfVar);
    }

    public static aehs o(aaea aaeaVar, Executor executor) {
        return new aehs(aaeaVar, executor);
    }

    public static afdq p(afhs afhsVar, shf shfVar) {
        return new afdq(afhsVar, shfVar);
    }

    public static afqj q(afqp afqpVar, Context context) {
        afqh afqhVar;
        String packageName;
        String c;
        context.getClass();
        if (zgx.a.b == null) {
            zgx.a.b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.television"));
        }
        if (zgx.a.b.booleanValue()) {
            afqhVar = afqh.TV;
        } else {
            afqhVar = yjk.X(context) ? afqh.TABLET : afqh.MOBILE;
        }
        afqh afqhVar2 = afqhVar;
        amnv amnvVar = afqpVar.c;
        if (amnvVar != null) {
            packageName = ((ota) amnvVar).a();
        } else {
            packageName = context.getPackageName();
        }
        String str = packageName;
        amnv amnvVar2 = afqpVar.d;
        if (amnvVar2 != null) {
            c = ((ota) amnvVar2).a();
        } else {
            c = zgx.c(context);
        }
        String str2 = c;
        afqi afqiVar = afqpVar.b;
        amnv amnvVar3 = afqpVar.e;
        ammv i = ammv.i(null);
        str.getClass();
        str2.getClass();
        afqhVar2.getClass();
        return new afqj(str, str2, afqhVar2, afqiVar, i);
    }

    public static afqn r(azrw azrwVar) {
        afqn afqnVar = (afqn) azrwVar.get();
        ayaw.k(afqnVar);
        return afqnVar;
    }

    public static abev s(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new abev(azrwVar, azrwVar2, 1);
    }

    public static abev t(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 2);
    }

    public static abev u(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 3);
    }

    public static abev v(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 4, (byte[]) null);
    }

    public static abev w(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 5, (char[]) null);
    }

    public static abev x(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 6);
    }

    public static abev y(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 7);
    }

    public static abev z(azrw azrwVar, azrw azrwVar2) {
        return new abev(azrwVar, azrwVar2, 8, (short[]) null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                return a(this.a, this.b);
            case 1:
                return c((aabx) ((axqs) this.a).a, this.b);
            case 2:
                return d((aadw) this.a.get(), (shf) this.b.get());
            case 3:
                return ((zfj) this.b).get().e((SharedPreferences) this.a.get());
            case 4:
                return advd.a((ansv) this.b.get(), ((yjz) this.a).get());
            case 5:
                return e(this.b, this.a);
            case 6:
                return f((ammv) ((axqs) this.a).a, ((adxn) this.b).get());
            case 7:
                return g((ammv) ((axqs) this.a).a, (aenj) this.b.get());
            case 8:
                return h((shf) this.b.get(), (aaoz) this.a.get());
            case 9:
                return i((aaoz) this.a.get(), (afix) this.b.get());
            case 10:
                aaea aaeaVar = (aaea) this.b.get();
                yss yssVar = (yss) this.a.get();
                j(aaeaVar, yssVar);
                return yssVar;
            case 11:
                return k((shf) this.b.get(), (afhz) this.a.get());
            case 12:
                return l((shf) this.b.get(), (afhz) this.a.get());
            case 13:
                return m((aaea) this.a.get(), xuq.h(), (afjj) this.b.get());
            case 14:
                return n((afhs) this.a.get(), (shf) this.b.get());
            case 15:
                return o((aaea) this.b.get(), (Executor) this.a.get());
            case 16:
                return p((afhs) this.a.get(), (shf) this.b.get());
            case 17:
                return new afjo((ypa) this.a.get(), (shf) this.b.get());
            case 18:
                return q((afqp) ((axqs) this.b).a, (Context) ((axqs) this.a).a);
            case 19:
                return r(this.a);
            default:
                return ((afui) this.b).get().a(((axqw) this.a).get());
        }
    }
}
