package defpackage;

import com.google.android.gms.cast.CastDevice;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adoo {
    public static final String a = zga.a("MDX.EventLogger");
    public final acpl b;

    public adoo(acpl acplVar) {
        acplVar.getClass();
        this.b = acplVar;
    }

    public static atag a(adgb adgbVar) {
        boolean z = adgbVar instanceof adfy;
        if (!z && !(adgbVar instanceof adfu)) {
            return null;
        }
        aone createBuilder = atag.a.createBuilder();
        if (z) {
            adfy adfyVar = (adfy) adgbVar;
            String str = adfyVar.d;
            createBuilder.copyOnWrite();
            atag atagVar = (atag) createBuilder.instance;
            str.getClass();
            atagVar.b |= 1;
            atagVar.c = str;
            String str2 = adfyVar.f;
            if (str2 != null && !str2.isEmpty()) {
                createBuilder.copyOnWrite();
                atag atagVar2 = (atag) createBuilder.instance;
                atagVar2.b |= 4;
                atagVar2.e = str2;
            }
            String str3 = adfyVar.g;
            if (str3 != null && !str3.isEmpty()) {
                createBuilder.copyOnWrite();
                atag atagVar3 = (atag) createBuilder.instance;
                atagVar3.b |= 2;
                atagVar3.d = str3;
            }
        } else {
            CastDevice castDevice = ((adfu) adgbVar).a;
            String str4 = castDevice.d;
            if (!str4.isEmpty()) {
                createBuilder.copyOnWrite();
                atag atagVar4 = (atag) createBuilder.instance;
                str4.getClass();
                atagVar4.b |= 1;
                atagVar4.c = str4;
            }
            createBuilder.copyOnWrite();
            atag atagVar5 = (atag) createBuilder.instance;
            atagVar5.b |= 4;
            atagVar5.e = "UnknownCastManufacturer";
            String str5 = castDevice.e;
            createBuilder.copyOnWrite();
            atag atagVar6 = (atag) createBuilder.instance;
            str5.getClass();
            atagVar6.b |= 2;
            atagVar6.d = str5;
        }
        return (atag) createBuilder.build();
    }

    public static int b(int i) {
        if (i != 0) {
            return i != 1 ? 4 : 3;
        }
        return 2;
    }

    public static aone c(adot adotVar) {
        aone createBuilder = aszt.a.createBuilder();
        adfy adfyVar = (adfy) adotVar.k();
        adgn adgnVar = adotVar.aq.j;
        int a2 = adfyVar.a.a();
        int i = a2 != -1 ? a2 != 0 ? a2 != 1 ? a2 != 2 ? a2 != 3 ? 2 : 6 : 4 : 5 : 7 : 3;
        createBuilder.copyOnWrite();
        aszt asztVar = (aszt) createBuilder.instance;
        asztVar.c = i - 1;
        asztVar.b |= 1;
        boolean z = adfyVar.l == 1;
        createBuilder.copyOnWrite();
        aszt asztVar2 = (aszt) createBuilder.instance;
        asztVar2.b = 4 | asztVar2.b;
        asztVar2.e = z;
        boolean p = adfyVar.p();
        createBuilder.copyOnWrite();
        aszt asztVar3 = (aszt) createBuilder.instance;
        asztVar3.b |= 2;
        asztVar3.d = p;
        int i2 = adfyVar.m;
        createBuilder.copyOnWrite();
        aszt asztVar4 = (aszt) createBuilder.instance;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        asztVar4.g = i3;
        asztVar4.b |= 16;
        int re = adotVar.re();
        createBuilder.copyOnWrite();
        aszt asztVar5 = (aszt) createBuilder.instance;
        asztVar5.b |= 32;
        asztVar5.h = re;
        if (adgnVar != null) {
            String str = adgnVar.c;
            createBuilder.copyOnWrite();
            aszt asztVar6 = (aszt) createBuilder.instance;
            asztVar6.b |= 8;
            asztVar6.f = str;
        }
        aszt asztVar7 = (aszt) createBuilder.build();
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        int cV = amkq.cV(asztVar7.c);
        if (cV == 0) {
            cV = 1;
        }
        objArr[0] = Integer.valueOf(cV - 1);
        objArr[1] = Boolean.valueOf(asztVar7.e);
        objArr[2] = Boolean.valueOf(asztVar7.d);
        String.format(locale, "dial info: appStatus=%d isSleeping=%b isWakeOnLan=%b", objArr);
        return createBuilder;
    }
}
