package defpackage;

import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrg {
    public final acsc a;
    private final String b;
    private final Set c = new HashSet();
    private final Set d = new HashSet();

    public acrg(String str, acsc acscVar) {
        this.b = str;
        this.a = acscVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        return String.format("INTERACTIONLOGGINGBUG->%s_MISSING_ATTACH", str);
    }

    private final void d(String str, awav awavVar, boolean z) {
        a(str);
        String i = acrh.i(this.a);
        String str2 = this.b;
        String j = acrh.j(awavVar);
        String.valueOf(i).length();
        String.valueOf(str2).length();
        String.valueOf(j).length();
    }

    private final boolean e(owc owcVar) {
        return this.c.contains(i(owcVar));
    }

    private static final acrf f(awav awavVar) {
        return new acrf(awavVar.d, awavVar.f);
    }

    private static final boolean g(awav awavVar) {
        return awavVar.c.d() > 0;
    }

    private static final owc h(awav awavVar) {
        try {
            return (owc) aonm.parseFrom(owc.a, awavVar.c, aomw.b());
        } catch (aoob unused) {
            return owc.a;
        }
    }

    private static final String i(owc owcVar) {
        Object[] objArr = new Object[3];
        owb owbVar = owcVar.d;
        if (owbVar == null) {
            owbVar = owb.a;
        }
        objArr[0] = Long.valueOf(owbVar.b);
        owb owbVar2 = owcVar.d;
        if (owbVar2 == null) {
            owbVar2 = owb.a;
        }
        objArr[1] = Integer.valueOf(owbVar2.c);
        owb owbVar3 = owcVar.d;
        if (owbVar3 == null) {
            owbVar3 = owb.a;
        }
        objArr[2] = Integer.valueOf(owbVar3.d);
        return Integer.toString(Objects.hash(objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(awav awavVar) {
        if (g(awavVar)) {
            owc h = h(awavVar);
            if ((h.b & 4) == 0) {
                return false;
            }
            if (e(h)) {
                String i = acrh.i(this.a);
                String str = this.b;
                String j = acrh.j(awavVar);
                String.valueOf(i).length();
                String.valueOf(str).length();
                String.valueOf(j).length();
                return false;
            }
            this.c.add(i(h));
            return true;
        }
        this.d.add(f(awavVar));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(awav awavVar, String str) {
        if (g(awavVar)) {
            owc h = h(awavVar);
            if ((h.b & 4) == 0) {
                return false;
            }
            if (e(h)) {
                return true;
            }
            d(str, awavVar, true);
            return false;
        }
        if (this.d.contains(f(awavVar))) {
            return true;
        }
        d(str, awavVar, false);
        return false;
    }
}
