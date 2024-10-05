package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aolb {
    public static final amnm a;
    public static final ammr b;
    public static final ammr c;
    private static final amnm d;
    private static final amnm e;
    private static final ammr f;
    private static final amru g;

    static {
        amnm a2 = amnm.b('=').a();
        amkq.H(true, "must be greater than zero: %s", 2);
        a = new amnm(a2.c, a2.b, a2.a, 2);
        d = amnm.b('/');
        e = amnm.b('-');
        b = ammr.b("/");
        f = ammr.b("-");
        c = ammr.b("=");
        g = amru.A(new aola("s", false), new aola("w", false), new aola("c", true), new aola("d", true), new aola("h", false), new aola("s", true), new aola("h", true), new aola("p", true), new aola("pp", true), new aola("pf", true), new aola("n", true), new aola("r", false), new aola("r", true), new aola("o", true), new aola("o", false), new aola("j", false), new aola("x", false), new aola("y", false), new aola("z", false), new aola("g", true), new aola("e", false), new aola("f", false), new aola("k", true), new aola("u", true), new aola("ut", true), new aola("i", true), new aola("a", true), new aola("b", true), new aola("b", false), new aola("c", false), new aola("t", false), new aola("nt0", false), new aola("v", true), new aola("q", false), new aola("fh", true), new aola("fv", true), new aola("fg", true), new aola("ci", true), new aola("rw", true), new aola("rwu", true), new aola("rwa", true), new aola("nw", true), new aola("rh", true), new aola("no", true), new aola("ns", true), new aola("k", false), new aola("p", false), new aola("l", false), new aola("v", false), new aola("nu", true), new aola("ft", true), new aola("cc", true), new aola("nd", true), new aola("ip", true), new aola("nc", true), new aola("a", false), new aola("rj", true), new aola("rp", true), new aola("rg", true), new aola("pd", true), new aola("pa", true), new aola("m", false), new aola("vb", false), new aola("vl", false), new aola("lf", true), new aola("mv", true), new aola("id", true), new aola("al", true), new aola("ic", false), new aola("pg", true), new aola("mo", true), new aola("iv", false), new aola("il", false), new aola("ba", false));
    }

    protected aolb() {
    }

    public aolb(byte[] bArr) {
        this();
    }

    public static List a(String str, boolean z) {
        amkq.F(str != null, "options is null");
        ArrayList aO = amkq.aO();
        Iterator it = e.f(str).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!str2.isEmpty()) {
                if (str2.startsWith("O") || str2.startsWith("J")) {
                    while (str2.length() < 12) {
                        str2 = f.e(str2, it.hasNext() ? it.next() : "", new Object[0]);
                    }
                }
                if (str2.equals("pi") || str2.equals("ya") || str2.equals("ro")) {
                    str2 = f.e(str2, it.hasNext() ? it.next() : "", new Object[0]);
                }
                if (!z || Character.isUpperCase(str2.charAt(0))) {
                    aO.add(str2);
                }
            }
        }
        return aO;
    }

    public static final String b(tcv tcvVar) {
        ArrayList aP = amkq.aP(a.f(tcvVar.a()));
        return aP.size() == 2 ? (String) aP.get(1) : "";
    }

    public static final String c(List list) {
        if (list.size() == 4) {
            list.add("");
        } else if (list.size() == 5) {
            list.add(4, "");
        }
        return (String) list.get(4);
    }

    public static final List d(tcv tcvVar) {
        ArrayList aP = amkq.aP(d.f(tcvVar.a()));
        return (aP.size() <= 0 || !((String) aP.get(0)).isEmpty()) ? aP : aP.subList(1, aP.size());
    }

    public static final boolean e(List list) {
        int size = list.size();
        return size > 0 && size <= 1 && !((String) list.get(0)).isEmpty();
    }

    public static final boolean f(List list) {
        int size = list.size();
        if (size < 4) {
            return false;
        }
        return size == 4 ? !((String) list.get(3)).isEmpty() : size <= 6;
    }

    public static String g(String str, String str2) {
        amkq.F(str != null, "oldOptions is null");
        amkq.F(str2 != null, "newOptions is null");
        if (str.isEmpty()) {
            return str2;
        }
        List<String> a2 = a(str, true);
        if (a2.isEmpty()) {
            return str2;
        }
        a2.addAll(a(str2, false));
        amkq.F(true, "options is null");
        ampf u = ampf.u();
        ArrayList aO = amkq.aO();
        for (String str3 : a2) {
            amru amruVar = g;
            int i = ((amvj) amruVar).c;
            aola aolaVar = null;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                aola aolaVar2 = (aola) amruVar.get(i2);
                if (str3.toLowerCase().startsWith(aolaVar2.a)) {
                    if (aolaVar2.b) {
                        if (str3.length() == aolaVar2.a.length()) {
                            aolaVar = aolaVar2;
                            break;
                        }
                    } else {
                        aolaVar = aolaVar2;
                    }
                }
                i2++;
            }
            if (aolaVar != null) {
                u.p(aolaVar, str3);
            } else {
                aO.add(str3);
            }
        }
        ArrayList aO2 = amkq.aO();
        amru amruVar2 = g;
        int i3 = ((amvj) amruVar2).c;
        for (int i4 = 0; i4 < i3; i4++) {
            String str4 = "";
            for (String str5 : u.e((aola) amruVar2.get(i4))) {
                if (Character.isUpperCase(str5.charAt(0))) {
                    aO2.add(str5);
                } else {
                    str4 = str5;
                }
            }
            if (!str4.isEmpty()) {
                aO2.add(str4);
            }
        }
        aO2.addAll(aO);
        return f.d(aO2);
    }

    public static final List h(tcv tcvVar) {
        if (tcvVar.a() == null) {
            throw new aokz("url path is null");
        }
        List d2 = d(tcvVar);
        if (d2.isEmpty() || !"u".equals(d2.get(0))) {
            if (!d2.isEmpty() && "image".equals(d2.get(0))) {
                d2.remove(0);
            }
        } else {
            d2.remove(1);
            d2.remove(0);
        }
        if (d2.size() == 2) {
            d2.remove(0);
        }
        return d2;
    }

    public final boolean i(Uri uri) {
        tcv tcvVar = new tcv(uri);
        amkq.E(true);
        return aoll.a(tcvVar.toString());
    }

    public final Uri j(aolh aolhVar, Uri uri) {
        try {
            tcv tcvVar = new tcv(uri);
            boolean z = true;
            amkq.F(true, "options is null");
            amkq.F(true, "url is null");
            List h = h(tcvVar);
            if (f(h)) {
                amkq.F(true, "options is null");
                amkq.F(true, "url is null");
                amkq.F(tcvVar.a() != null, "url path is null");
                List d2 = d(tcvVar);
                if (d2.size() <= 0 || !((String) d2.get(0)).equals("image")) {
                    z = false;
                } else {
                    d2.remove(0);
                }
                String g2 = g(c(d2), aolhVar.a(""));
                d2.set(4, g2);
                if (g2.equals("") && d2.size() > 5) {
                    d2.remove(4);
                }
                if (z) {
                    d2.add(0, "image");
                }
                String valueOf = String.valueOf(b.d(d2));
                return tcvVar.b(valueOf.length() != 0 ? "/".concat(valueOf) : new String("/")).a;
            }
            if (e(h)) {
                amkq.F(true, "options is null");
                amkq.F(true, "url is null");
                if (tcvVar.a() == null) {
                    z = false;
                }
                amkq.F(z, "url path is null");
                ArrayList aP = amkq.aP(a.f(tcvVar.a()));
                String g3 = g(b(tcvVar), aolhVar.a(""));
                String str = (String) aP.get(0);
                if (!g3.isEmpty()) {
                    str = c.e(str, g3, new Object[0]);
                }
                return tcvVar.b(str).a;
            }
            throw new aokz(tcvVar.toString());
        } catch (aokz e2) {
            throw new tcw(e2);
        }
    }
}
