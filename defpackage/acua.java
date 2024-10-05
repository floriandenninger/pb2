package defpackage;

import java.util.Iterator;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acua {
    public static final String[] a = {"app_l", "shell_OnCreate", "uiwwa_c", "uiwwa_s", "uiwwa_r", "critical", "intentCritical", "nonCritical", "th0", "brn", "ebrn", "brp"};

    public static asme a(String str, yyx yyxVar, Queue queue) {
        String str2;
        Throwable th = yyxVar.g;
        String b = b(yyxVar);
        if (th != null) {
            afsi.c(2, 18, String.format("SS %s %s", str, b), th);
        }
        long j = yyxVar.b - yyxVar.a;
        long j2 = yyxVar.c;
        long j3 = yyxVar.d;
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                yyx yyxVar2 = (yyx) it.next();
                if (yyxVar2.h == 2 && yyxVar2.g == null) {
                    str2 = b;
                    j += yyxVar2.b - yyxVar2.a;
                    j2 += yyxVar2.c;
                    j3 += yyxVar2.d;
                } else {
                    str2 = b;
                }
                b = str2;
            }
        }
        String str3 = b;
        aone createBuilder = asme.a.createBuilder();
        createBuilder.copyOnWrite();
        asme asmeVar = (asme) createBuilder.instance;
        str.getClass();
        asmeVar.b |= 1;
        asmeVar.c = str;
        long j4 = yyxVar.a;
        createBuilder.copyOnWrite();
        asme asmeVar2 = (asme) createBuilder.instance;
        asmeVar2.b |= 8;
        asmeVar2.f = j4;
        createBuilder.copyOnWrite();
        asme asmeVar3 = (asme) createBuilder.instance;
        asmeVar3.b |= 4;
        asmeVar3.e = j;
        createBuilder.copyOnWrite();
        asme asmeVar4 = (asme) createBuilder.instance;
        asmeVar4.b |= 128;
        asmeVar4.j = j2;
        if (j3 > 0) {
            createBuilder.copyOnWrite();
            asme asmeVar5 = (asme) createBuilder.instance;
            asmeVar5.b |= 256;
            asmeVar5.k = j3;
        }
        if (th != null) {
            createBuilder.copyOnWrite();
            asme asmeVar6 = (asme) createBuilder.instance;
            asmeVar6.l = 1;
            asmeVar6.b |= 512;
            Object[] objArr = new Object[3];
            int i = yyxVar.h;
            objArr[0] = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "ACTION" : "SPAN" : "DEPENDENCY" : "SPAWN" : "TASK";
            objArr[1] = str;
            objArr[2] = str3;
            afsi.c(2, 18, String.format("SS task %s error %s %s", objArr), th);
        }
        return (asme) createBuilder.build();
    }

    public static String b(yyx yyxVar) {
        return yyxVar.f != -1 ? a[yyxVar.f] : yyxVar.e;
    }
}
