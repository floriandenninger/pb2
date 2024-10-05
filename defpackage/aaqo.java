package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function;
import j$.util.function.UnaryOperator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaqo {
    public final aaea a;
    public final aaqq b;
    public final TelephonyManager c;
    public final AtomicReference d;
    public final aadw e;
    public final amea f;
    private final army g;
    private final shf h;
    private final azrw i;
    private final azrw j;
    private final zgd k;
    private final amcc l;
    private final AtomicBoolean m;
    private final armx n;
    private final String o;
    private final ysy p;
    private final axzf q;

    public aaqo(Context context, army armyVar, TelephonyManager telephonyManager, shf shfVar, azrw azrwVar, azrw azrwVar2, aaea aaeaVar, aadw aadwVar, aaqq aaqqVar, ysy ysyVar, amea ameaVar, axzf axzfVar, amcc amccVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        armx armxVar;
        String str;
        this.g = armyVar;
        this.c = telephonyManager;
        this.h = shfVar;
        this.i = azrwVar;
        this.a = aaeaVar;
        this.e = aadwVar;
        this.j = azrwVar2;
        this.b = aaqqVar;
        this.k = new aaqm(context);
        if (zgx.f(context)) {
            armxVar = armx.WEARABLE_FORM_FACTOR;
        } else if (zgx.e(context)) {
            armxVar = armx.AUTOMOTIVE_FORM_FACTOR;
        } else {
            int O = yjk.O(context);
            if (O == 1 || O == 2) {
                armxVar = armx.SMALL_FORM_FACTOR;
            } else if (O == 3 || O == 4) {
                armxVar = armx.LARGE_FORM_FACTOR;
            } else {
                armxVar = armx.UNKNOWN_FORM_FACTOR;
            }
        }
        this.n = armxVar;
        if (zgx.f(context)) {
            str = "Android Wear";
        } else if (zgx.e(context)) {
            str = "Android Automotive";
        } else {
            context.getClass();
            if (zgx.a.c == null) {
                zgx.a.c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
            }
            str = zgx.a.c.booleanValue() ? "ChromeOS" : "Android";
        }
        this.o = str;
        this.p = ysyVar;
        this.f = ameaVar;
        this.q = axzfVar;
        this.d = new AtomicReference();
        this.m = new AtomicBoolean(false);
        this.l = amccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String d() {
        Boolean bool;
        aqvj aqvjVar = this.q.a.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45352485L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45352485L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45352485L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            if (!this.m.getAndSet(true) && Build.VERSION.SDK_INT <= 30) {
                this.l.post(new Runnable() { // from class: aaqk
                    @Override // java.lang.Runnable
                    public final void run() {
                        aaqo aaqoVar = aaqo.this;
                        aaqoVar.c.listen(new aaqn(aaqoVar), 1);
                    }
                });
            }
            return (String) DesugarAtomicReference.updateAndGet(this.d, new UnaryOperator() { // from class: aaql
                @Override // j$.util.function.Function
                public final /* synthetic */ Function andThen(Function function) {
                    return Function.CC.$default$andThen(this, function);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    return str == null ? aaqo.this.a() : str;
                }

                @Override // j$.util.function.Function
                public final /* synthetic */ Function compose(Function function) {
                    return Function.CC.$default$compose(this, function);
                }
            });
        }
        return wbs.ad(this.c);
    }

    public final String a() {
        return wbs.ad(this.c);
    }

    public final void b() {
        d();
        this.k.get();
        this.i.get();
        ((aasd) this.j.get()).a();
    }

    public final aone c() {
        aone createBuilder = armz.a.createBuilder();
        String a = aarv.a(Locale.getDefault());
        createBuilder.copyOnWrite();
        armz armzVar = (armz) createBuilder.instance;
        a.getClass();
        armzVar.b |= 2;
        armzVar.f = a;
        army armyVar = this.g;
        createBuilder.copyOnWrite();
        armz armzVar2 = (armz) createBuilder.instance;
        armzVar2.p = armyVar.ay;
        armzVar2.b |= 16777216;
        String str = (String) this.k.get();
        createBuilder.copyOnWrite();
        armz armzVar3 = (armz) createBuilder.instance;
        str.getClass();
        armzVar3.b |= 67108864;
        armzVar3.r = str;
        String str2 = Build.VERSION.RELEASE;
        createBuilder.copyOnWrite();
        armz armzVar4 = (armz) createBuilder.instance;
        str2.getClass();
        armzVar4.c |= 32;
        armzVar4.w = str2;
        int i = Build.VERSION.SDK_INT;
        createBuilder.copyOnWrite();
        armz armzVar5 = (armz) createBuilder.instance;
        armzVar5.b |= 33554432;
        armzVar5.q = i;
        String str3 = this.o;
        createBuilder.copyOnWrite();
        armz armzVar6 = (armz) createBuilder.instance;
        armzVar6.c |= 16;
        armzVar6.v = str3;
        String str4 = Build.MANUFACTURER;
        createBuilder.copyOnWrite();
        armz armzVar7 = (armz) createBuilder.instance;
        str4.getClass();
        armzVar7.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        armzVar7.s = str4;
        String str5 = Build.BRAND;
        createBuilder.copyOnWrite();
        armz armzVar8 = (armz) createBuilder.instance;
        str5.getClass();
        armzVar8.c |= 1;
        armzVar8.t = str5;
        String str6 = Build.MODEL;
        createBuilder.copyOnWrite();
        armz armzVar9 = (armz) createBuilder.instance;
        str6.getClass();
        armzVar9.c |= 2;
        armzVar9.u = str6;
        int intValue = ((Integer) this.i.get()).intValue();
        createBuilder.copyOnWrite();
        armz armzVar10 = (armz) createBuilder.instance;
        armzVar10.d |= 2;
        armzVar10.K = intValue;
        armx armxVar = this.n;
        createBuilder.copyOnWrite();
        armz armzVar11 = (armz) createBuilder.instance;
        armzVar11.I = armxVar.f;
        armzVar11.c |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        long minutes = TimeUnit.MILLISECONDS.toMinutes(TimeZone.getDefault().getOffset(this.h.c()));
        createBuilder.copyOnWrite();
        armz armzVar12 = (armz) createBuilder.instance;
        armzVar12.d |= 64;
        armzVar12.M = (int) minutes;
        String id = TimeZone.getDefault().getID();
        createBuilder.copyOnWrite();
        armz armzVar13 = (armz) createBuilder.instance;
        id.getClass();
        armzVar13.d |= 128;
        armzVar13.N = id;
        String d = d();
        if (!TextUtils.isEmpty(d)) {
            createBuilder.copyOnWrite();
            armz armzVar14 = (armz) createBuilder.instance;
            d.getClass();
            armzVar14.b |= 16;
            armzVar14.i = d;
        }
        apue b = apue.b(this.p.a());
        if (b != null) {
            createBuilder.copyOnWrite();
            armz armzVar15 = (armz) createBuilder.instance;
            armzVar15.x = b.o;
            armzVar15.c |= 1024;
        }
        aasd aasdVar = (aasd) this.j.get();
        aasc a2 = aasdVar.a();
        int i2 = a2.a;
        createBuilder.copyOnWrite();
        armz armzVar16 = (armz) createBuilder.instance;
        armzVar16.c |= 524288;
        armzVar16.A = i2;
        int i3 = a2.b;
        createBuilder.copyOnWrite();
        armz armzVar17 = (armz) createBuilder.instance;
        armzVar17.c |= 1048576;
        armzVar17.B = i3;
        float f = a2.c;
        createBuilder.copyOnWrite();
        armz armzVar18 = (armz) createBuilder.instance;
        armzVar18.c |= 8388608;
        armzVar18.E = f;
        float f2 = a2.d;
        createBuilder.copyOnWrite();
        armz armzVar19 = (armz) createBuilder.instance;
        armzVar19.c = 16777216 | armzVar19.c;
        armzVar19.F = f2;
        float f3 = a2.e;
        createBuilder.copyOnWrite();
        armz armzVar20 = (armz) createBuilder.instance;
        armzVar20.c = 67108864 | armzVar20.c;
        armzVar20.H = f3;
        int round = Math.round(a2.e);
        createBuilder.copyOnWrite();
        armz armzVar21 = (armz) createBuilder.instance;
        armzVar21.c |= 33554432;
        armzVar21.G = round;
        aasc aascVar = aasdVar.a;
        if (aascVar != null) {
            int i4 = aascVar.b;
            createBuilder.copyOnWrite();
            armz armzVar22 = (armz) createBuilder.instance;
            armzVar22.c |= 4194304;
            armzVar22.D = i4;
            int i5 = aascVar.a;
            createBuilder.copyOnWrite();
            armz armzVar23 = (armz) createBuilder.instance;
            armzVar23.c |= 2097152;
            armzVar23.C = i5;
        }
        return createBuilder;
    }
}
