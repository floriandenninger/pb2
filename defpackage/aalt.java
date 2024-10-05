package defpackage;

import android.util.Base64;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aalt {
    static {
        amsx.s("/device/orientation", "/app/mdx");
    }

    public static int a(String str) {
        try {
            aqub c = c(str);
            if ((c.b & 1) != 0) {
                long j = c.c;
                if (j > 0) {
                    return (int) j;
                }
            }
        } catch (Exception unused) {
        }
        return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    public static aomf b(String str) {
        try {
            return c(str).e;
        } catch (Exception unused) {
            return aomf.b;
        }
    }

    public static aqub c(String str) {
        return (aqub) aonm.parseFrom(aqub.a, Base64.decode(URLDecoder.decode(str, "UTF-8"), 8));
    }

    public static String d(int i, String str) {
        str.getClass();
        aomf z = aomf.z(str);
        amkq.N(i > 0);
        aone createBuilder = aqub.a.createBuilder();
        createBuilder.copyOnWrite();
        aqub aqubVar = (aqub) createBuilder.instance;
        aqubVar.d = 2;
        aqubVar.b = 2 | aqubVar.b;
        createBuilder.copyOnWrite();
        aqub aqubVar2 = (aqub) createBuilder.instance;
        aqubVar2.b = 1 | aqubVar2.b;
        aqubVar2.c = i;
        createBuilder.copyOnWrite();
        aqub aqubVar3 = (aqub) createBuilder.instance;
        aqubVar3.b |= 4;
        aqubVar3.e = z;
        return h(createBuilder.build());
    }

    public static String e(int i, aomf aomfVar) {
        aomfVar.getClass();
        aone createBuilder = aqub.a.createBuilder();
        createBuilder.copyOnWrite();
        aqub aqubVar = (aqub) createBuilder.instance;
        aqubVar.d = 1;
        aqubVar.b |= 2;
        createBuilder.copyOnWrite();
        aqub aqubVar2 = (aqub) createBuilder.instance;
        aqubVar2.b = 1 | aqubVar2.b;
        aqubVar2.c = i;
        createBuilder.copyOnWrite();
        aqub aqubVar3 = (aqub) createBuilder.instance;
        aqubVar3.b |= 4;
        aqubVar3.e = aomfVar;
        return h(createBuilder.build());
    }

    public static String f(int i, String str) {
        str.getClass();
        return e(i, aomf.z(str));
    }

    public static String g(String str) {
        return b(str).E();
    }

    public static String h(aooy aooyVar) {
        try {
            return URLEncoder.encode(Base64.encodeToString(aooyVar.toByteArray(), 10), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean i(String str) {
        try {
            aqub c = c(str);
            if (c != null && (c.b & 1) != 0) {
                int bg = aocz.bg(c.d);
                if (bg != 0 && bg == 3) {
                    return true;
                }
            }
        } catch (aoob | UnsupportedEncodingException | IllegalArgumentException unused) {
        }
        return false;
    }

    public static boolean j(String str) {
        try {
            aqub c = c(str);
            if (c != null && (c.b & 1) != 0) {
                int bg = aocz.bg(c.d);
                if (bg != 0 && bg == 2) {
                    return true;
                }
            }
        } catch (aoob | UnsupportedEncodingException | IllegalArgumentException unused) {
        }
        return false;
    }
}
