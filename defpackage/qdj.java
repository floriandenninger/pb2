package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qdj {
    private final Context a;
    private final qdi b;

    public qdj(Context context) {
        qdi qdiVar = new qdi();
        this.a = context;
        this.b = qdiVar;
    }

    public static qdj a(Context context) {
        return new qdj(context);
    }

    static String b(String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        for (int i = 0; i <= 0; i++) {
            String str = strArr[i];
            try {
                URL url = new URL(str);
                String protocol = url.getProtocol();
                String host = url.getHost();
                StringBuilder sb = new StringBuilder(String.valueOf(protocol).length() + 3 + String.valueOf(host).length());
                sb.append(protocol);
                sb.append("://");
                sb.append(host);
                builder.appendQueryParameter("url", sb.toString());
            } catch (MalformedURLException unused) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid URL: ".concat(valueOf) : new String("Invalid URL: "));
            }
        }
        String valueOf2 = String.valueOf(builder.build().getQuery());
        return valueOf2.length() != 0 ? "weblogin:".concat(valueOf2) : new String("weblogin:");
    }

    private final Set d(List list) {
        Set hashSet;
        Set set;
        String str;
        int size = list.size();
        int i = 128;
        if (size == 0) {
            set = new aeb();
        } else {
            if (size <= 128) {
                hashSet = new aeb(size);
            } else {
                hashSet = new HashSet(size, 0.75f);
            }
            set = hashSet;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qeg qegVar = (qeg) it.next();
            String str2 = !TextUtils.isEmpty(qegVar.f) ? qegVar.f : qegVar.e;
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(qegVar.c) || TextUtils.isEmpty(qegVar.d)) {
                Log.w("WebLoginHelper", "Invalid cookie.");
            } else {
                Boolean valueOf = (qegVar.b & 32) != 0 ? Boolean.valueOf(qegVar.h) : null;
                qip.ax(str2);
                String str3 = true != qar.e(valueOf) ? "http" : "https";
                StringBuilder sb = new StringBuilder(str3.length() + 3 + String.valueOf(str2).length());
                sb.append(str3);
                sb.append("://");
                sb.append(str2);
                String sb2 = sb.toString();
                String str4 = qegVar.c;
                String str5 = qegVar.d;
                String str6 = qegVar.e;
                String str7 = qegVar.g;
                Boolean valueOf2 = (qegVar.b & 64) != 0 ? Boolean.valueOf(qegVar.i) : null;
                Boolean valueOf3 = (qegVar.b & 32) != 0 ? Boolean.valueOf(qegVar.h) : null;
                Long valueOf4 = (qegVar.b & i) != 0 ? Long.valueOf(qegVar.j) : null;
                if ((qegVar.b & 256) != 0) {
                    int F = prh.F(qegVar.k);
                    str = (F == 0 || F == 1) ? "UNKNOWN_PRIORITY" : F != 2 ? F != 3 ? "HIGH" : "MEDIUM" : "LOW";
                } else {
                    str = null;
                }
                int i2 = qegVar.b;
                String str8 = (i2 & 512) != 0 ? qegVar.l : null;
                Boolean valueOf5 = Boolean.valueOf(((i2 & 1024) == 0 || TextUtils.isEmpty(qegVar.m)) ? false : true);
                if (str4 == null) {
                    str4 = "";
                }
                StringBuilder sb3 = new StringBuilder(str4);
                sb3.append('=');
                if (!TextUtils.isEmpty(str5)) {
                    sb3.append(str5);
                }
                if (qar.e(valueOf2)) {
                    sb3.append(";HttpOnly");
                }
                if (qar.e(valueOf3)) {
                    sb3.append(";Secure");
                }
                if (!TextUtils.isEmpty(str6)) {
                    sb3.append(";Domain=");
                    sb3.append(str6);
                }
                if (!TextUtils.isEmpty(str7)) {
                    sb3.append(";Path=");
                    sb3.append(str7);
                }
                if (valueOf4 != null && valueOf4.longValue() > 0) {
                    sb3.append(";Max-Age=");
                    sb3.append(valueOf4);
                }
                if (!TextUtils.isEmpty(str)) {
                    sb3.append(";Priority=");
                    sb3.append(str);
                }
                if (!TextUtils.isEmpty(str8)) {
                    sb3.append(";SameSite=");
                    sb3.append(str8);
                }
                if (qar.e(valueOf5)) {
                    sb3.append(";SameParty");
                }
                String sb4 = sb3.toString();
                String valueOf6 = String.valueOf(sb2);
                if (valueOf6.length() != 0) {
                    "Setting cookie for url: ".concat(valueOf6);
                }
                this.b.a.setCookie(sb2, sb4);
                set.add(sb2);
            }
            i = 128;
        }
        return set;
    }

    public final Set c(Account account, String... strArr) {
        qip.an(account);
        qip.ap(true, "Must have at least one URL.");
        try {
            qeh qehVar = (qeh) aonm.parseFrom(qeh.a, Base64.decode(qde.e(this.a, account, b(strArr)), 9), aomw.b());
            if (qehVar == null || (qehVar.b & 1) == 0) {
                throw new qcw("Invalid response.");
            }
            qej qejVar = qehVar.c;
            if (qejVar == null) {
                qejVar = qej.a;
            }
            int D = prh.D(qejVar.b);
            if (D == 0) {
                D = 1;
            }
            int i = D - 1;
            if (i == 1) {
                return d(qejVar.c);
            }
            if (i == 2) {
                throw new IOException("Request failed, but server said RETRY.");
            }
            if (i == 5) {
                d(qejVar.c);
                for (qei qeiVar : qejVar.d) {
                    int E = prh.E(qeiVar.b);
                    if (E == 0) {
                        E = 1;
                    }
                    int i2 = E - 1;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            String str = qeiVar.c;
                            throw new qdh();
                        }
                        if (i2 != 3) {
                            int E2 = prh.E(qeiVar.b);
                            if (E2 == 0) {
                                E2 = 1;
                            }
                            StringBuilder sb = new StringBuilder(47);
                            sb.append("Unrecognized failed account status: ");
                            sb.append(E2 - 1);
                            Log.w("WebLoginHelper", sb.toString());
                        }
                    }
                }
                throw new qcw("Authorization failed, but no recoverable accounts.");
            }
            String valueOf = String.valueOf(qejVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb2.append("Unexpected response: ");
            sb2.append(valueOf);
            Log.w("WebLoginHelper", sb2.toString());
            int D2 = prh.D(qejVar.b);
            int i3 = D2 != 0 ? D2 : 1;
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("Unknown response status: ");
            sb3.append(i3 - 1);
            throw new qcw(sb3.toString());
        } catch (aoob e) {
            throw new qcw("Couldn't read data from server.", e);
        }
    }
}
