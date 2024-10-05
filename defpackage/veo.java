package defpackage;

import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class veo {
    static {
        aone createBuilder = awzn.a.createBuilder();
        awzi awziVar = awzi.a;
        createBuilder.copyOnWrite();
        awzn awznVar = (awzn) createBuilder.instance;
        awziVar.getClass();
        awznVar.c = awziVar;
        awznVar.b = 1;
        aone createBuilder2 = awzn.a.createBuilder();
        awzl awzlVar = awzl.a;
        createBuilder2.copyOnWrite();
        awzn awznVar2 = (awzn) createBuilder2.instance;
        awzlVar.getClass();
        awznVar2.c = awzlVar;
        awznVar2.b = 2;
        aone createBuilder3 = awzn.a.createBuilder();
        awzm awzmVar = awzm.a;
        createBuilder3.copyOnWrite();
        awzn awznVar3 = (awzn) createBuilder3.instance;
        awzmVar.getClass();
        awznVar3.c = awzmVar;
        awznVar3.b = 3;
    }

    public static String a(awzo awzoVar) {
        String str;
        awzl awzlVar;
        awzm awzmVar;
        awzp awzpVar;
        awzk awzkVar;
        String str2;
        amrp f = amru.f();
        for (awzn awznVar : awzoVar.b) {
            int i = awznVar.b;
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 0) {
                    str = "compress";
                } else if (i3 == 1) {
                    if (i == 2) {
                        awzlVar = (awzl) awznVar.c;
                    } else {
                        awzlVar = awzl.a;
                    }
                    if (awzlVar.b == 1) {
                        String b = b((String) awzlVar.c);
                        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 21);
                        sb.append("encrypt(aes_gcm_key=");
                        sb.append(b);
                        sb.append(")");
                        str = sb.toString();
                    } else {
                        str = "encrypt";
                    }
                } else if (i3 == 2) {
                    if (i == 3) {
                        awzmVar = (awzm) awznVar.c;
                    } else {
                        awzmVar = awzm.a;
                    }
                    if (awzmVar.b == 1) {
                        String b2 = b((String) awzmVar.c);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(b2).length() + 18);
                        sb2.append("integrity(sha256=");
                        sb2.append(b2);
                        sb2.append(")");
                        str = sb2.toString();
                    } else {
                        str = "integrity";
                    }
                } else if (i3 == 3) {
                    if (i == 4) {
                        awzpVar = (awzp) awznVar.c;
                    } else {
                        awzpVar = awzp.a;
                    }
                    amkq.E(1 == (awzpVar.b & 1));
                    String b3 = b(awzpVar.c);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(b3).length() + 12);
                    sb3.append("zip(target=");
                    sb3.append(b3);
                    sb3.append(")");
                    str = sb3.toString();
                } else if (i3 == 4) {
                    if (i == 5) {
                        awzkVar = (awzk) awznVar.c;
                    } else {
                        awzkVar = awzk.a;
                    }
                    if (awzkVar.c.size() > 0) {
                        amrp f2 = amru.f();
                        for (awzj awzjVar : awzkVar.c) {
                            amkq.E(1 == (awzjVar.b & 1));
                            if ((awzjVar.b & 2) == 0) {
                                f2.h(awzjVar.c);
                            } else {
                                String str3 = awzjVar.c;
                                String b4 = b(awzjVar.d);
                                StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(b4).length());
                                sb4.append(str3);
                                sb4.append("=");
                                sb4.append(b4);
                                f2.h(sb4.toString());
                            }
                        }
                        String d = ammr.b(",").d(f2.g());
                        StringBuilder sb5 = new StringBuilder(String.valueOf(d).length() + 2);
                        sb5.append("(");
                        sb5.append(d);
                        sb5.append(")");
                        str2 = sb5.toString();
                    } else {
                        str2 = "";
                    }
                    String valueOf = String.valueOf(awzkVar.b);
                    String valueOf2 = String.valueOf(str2);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                } else {
                    throw new IllegalArgumentException("No transform specified");
                }
                f.h(str);
            } else {
                throw null;
            }
        }
        return vdy.b(f.g());
    }

    private static final String b(String str) {
        try {
            return URLEncoder.encode(str, vdv.a.displayName());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
