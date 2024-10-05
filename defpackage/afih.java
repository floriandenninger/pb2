package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afih {
    private static final Pattern a = Pattern.compile("[a-z0-9.]+");
    private String b;
    private final long c;
    private final afif d;
    private String e;
    private Throwable f;
    private boolean g;
    private final Object h;

    public afih(afif afifVar, String str, long j) {
        this(afifVar, str, j, (String) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static boolean A(String str, afif afifVar) {
        char c;
        switch (str.hashCode()) {
            case -1261329207:
                if (str.equals("unimplemented")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1091234348:
                if (str.equals("hdunavailable")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -966515002:
                if (str.equals("response.parse")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -753093467:
                if (str.equals("servererror")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -665462704:
                if (str.equals("unavailable")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -547120939:
                if (str.equals("provision")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -95045900:
                if (str.equals("missingapi")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 0:
                if (str.equals("")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3005864:
                if (str.equals("auth")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3540994:
                if (str.equals("stop")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 506615561:
                if (str.equals("keyerror")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return afifVar.equals(afif.DRM);
            case '\b':
            case '\t':
                return afifVar.equals(afif.HEARTBEAT);
            case '\n':
                return afifVar.equals(afif.ONESIE);
            default:
                return true;
        }
    }

    public static afih e(adww adwwVar) {
        afie afieVar = new afie(adwwVar.c, 0L);
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : Collections.unmodifiableMap(adwwVar.e).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            hashSet.add(sb.toString());
        }
        afieVar.a = afif.SCRIPTED_PLAYER;
        afieVar.b = ammr.b(";").d(hashSet);
        afih a2 = afieVar.a();
        if (adwwVar.d) {
            a2.f();
        }
        return a2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean o(String str) {
        char c;
        switch (str.hashCode()) {
            case -2066954240:
                if (str.equals("android.stuck.bufferfull")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1799818200:
                if (str.equals("fmt.unplayable")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1358693043:
                if (str.equals("offline.nocontent")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1261329207:
                if (str.equals("unimplemented")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1171266961:
                if (str.equals("fmt.decode")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -665462704:
                if (str.equals("unavailable")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -586033327:
                if (str.equals("android.hfrdroppedframes")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -547120939:
                if (str.equals("provision")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -285378030:
                if (str.equals("net.retryexhausted")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -283551911:
                if (str.equals("player.outofmemory")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -263879979:
                if (str.equals("manifest.unparseable")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -95045900:
                if (str.equals("missingapi")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 0:
                if (str.equals("")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3301:
                if (str.equals("gl")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 3401:
                if (str.equals("js")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3005864:
                if (str.equals("auth")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83706931:
                if (str.equals("fmt.unparseable")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 506615561:
                if (str.equals("keyerror")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 514665859:
                if (str.equals("surfaceunavailable")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 668542996:
                if (str.equals("android.audiotrack")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 697384568:
                if (str.equals("player.fatalexception")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1486707235:
                if (str.equals("qoe.livewindow")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1592401765:
                if (str.equals("policy.app")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2112079600:
                if (str.equals("fmt.noneavailable")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2119141204:
                if (str.equals("player.timeout")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean p(String str) {
        char c;
        switch (str.hashCode()) {
            case -1111791584:
                if (str.equals("offline.partial.nocontent")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -753093467:
                if (str.equals("servererror")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3540994:
                if (str.equals("stop")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 587558939:
                if (str.equals("staleconfig")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        return c == 0 || c == 1 || c == 2 || c == 3;
    }

    public static boolean s(String str) {
        return str.startsWith("net.");
    }

    private static String x(String str, afif afifVar) {
        if (afifVar.equals(afif.DRM) && str.isEmpty()) {
            return str;
        }
        zhq.m(str);
        if (!a.matcher(str).matches()) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid code ".concat(valueOf) : new String("Invalid code "));
        }
        if (A(str, afifVar)) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid context for code %s %s", afifVar.name(), str));
    }

    private static String y(String str, afif afifVar, Throwable th) {
        if (s(str) || z(afifVar, str)) {
            return afhm.f(th, true, 3);
        }
        return afhm.f(th, false, 3);
    }

    private static boolean z(afif afifVar, String str) {
        return afifVar.equals(afif.ONESIE) || afifVar.equals(afif.SCRIPTED_PLAYER) || str.equals("player.timeout") || str.equals("fmt.noneavailable") || o(str);
    }

    public long a() {
        return this.c;
    }

    public adww b() {
        String k = k();
        HashMap hashMap = new HashMap();
        if (k != null) {
            for (String str : k.split(";", -1)) {
                String[] split = str.split("\\.", 2);
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                } else {
                    afid.b(afic.QOE, "Invalid error details. Part: %s. Full String: %s.", str, k);
                }
            }
        }
        aone createBuilder = adww.a.createBuilder();
        String i = i();
        createBuilder.copyOnWrite();
        adww adwwVar = (adww) createBuilder.instance;
        i.getClass();
        adwwVar.b = 1 | adwwVar.b;
        adwwVar.c = i;
        boolean n = n();
        createBuilder.copyOnWrite();
        adww adwwVar2 = (adww) createBuilder.instance;
        adwwVar2.b = 2 | adwwVar2.b;
        adwwVar2.d = n;
        createBuilder.copyOnWrite();
        adww adwwVar3 = (adww) createBuilder.instance;
        aoot aootVar = adwwVar3.e;
        if (!aootVar.b) {
            adwwVar3.e = aootVar.a();
        }
        adwwVar3.e.putAll(hashMap);
        return (adww) createBuilder.build();
    }

    public afif c() {
        return this.d;
    }

    public afih d() {
        String i = i();
        String k = k();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(k).length());
        sb.append("w.");
        sb.append(i);
        sb.append(";action.ignored;");
        sb.append(k);
        return new afih("qoe.ignored", a(), sb.toString());
    }

    public afih f() {
        this.g = true;
        return this;
    }

    public afih g() {
        this.g = false;
        return this;
    }

    public Object h() {
        return this.h;
    }

    public String i() {
        if (this.b.equals("")) {
            return this.d.name().toLowerCase(Locale.ENGLISH);
        }
        String valueOf = String.valueOf(this.d.equals(afif.DEFAULT) ? "" : String.valueOf(this.d.toString().toLowerCase(Locale.ENGLISH)).concat("."));
        String valueOf2 = String.valueOf(this.b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public String j() {
        return this.b;
    }

    public String k() {
        return this.e;
    }

    public void l() {
        afid.c(afic.EXO, this.f, "Error: %s:%s", this.b, ammx.d(this.e));
    }

    public boolean m() {
        return this.d.equals(afif.DRM);
    }

    public boolean n() {
        return this.g;
    }

    public boolean q() {
        String str;
        return "fmt.noneavailable".equals(this.b) && (str = this.e) != null && str.contains("c.invalidStreamingData");
    }

    public boolean r() {
        return this.b.startsWith("net.");
    }

    public boolean t() {
        return p(this.b);
    }

    public boolean u() {
        return this.b.startsWith("qoe.restart");
    }

    public boolean v() {
        char c;
        String str = this.b;
        int hashCode = str.hashCode();
        if (hashCode != 3143036) {
            if (hashCode == 83706931 && str.equals("fmt.unparseable")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("file")) {
                c = 1;
            }
            c = 65535;
        }
        return c == 0 || c == 1;
    }

    public boolean w() {
        char c;
        String str = this.b;
        int hashCode = str.hashCode();
        if (hashCode != -665462704) {
            if (hashCode == 506615561 && str.equals("keyerror")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("unavailable")) {
                c = 1;
            }
            c = 65535;
        }
        return c == 0 || c == 1;
    }

    public afih(afif afifVar, String str, long j, String str2) {
        this(afifVar, str, j, str2, null, null);
    }

    public afih(afif afifVar, String str, long j, String str2, Throwable th, Object obj) {
        this.d = afifVar;
        x(str, afifVar);
        this.b = str;
        this.g = o(str);
        this.c = j;
        if (str2 != null) {
            this.e = str2;
            if (th != null) {
                String y = y(this.b, afifVar, th);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(y).length());
                sb.append(str2);
                sb.append(";");
                sb.append(y);
                this.e = sb.toString();
            }
            this.e = afhm.e(this.e);
        } else if (th != null) {
            this.e = y(this.b, afifVar, th);
        }
        this.h = obj;
        this.f = th;
    }

    public afih(afif afifVar, String str, long j, Throwable th) {
        this(afifVar, str, j, null, th, null);
    }

    public afih(String str, long j) {
        this(afif.DEFAULT, str, j);
    }

    public afih(String str, long j, String str2) {
        this(afif.DEFAULT, str, j, str2);
    }

    public afih(String str, long j, Throwable th) {
        this(afif.DEFAULT, str, j, th);
    }
}
