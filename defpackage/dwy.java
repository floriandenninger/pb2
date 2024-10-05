package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class dwy {
    @Deprecated
    public static void a(Context context) {
        HashMap hashMap;
        if (TextUtils.isEmpty("<Android_YT_Open_App>")) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            if (!TextUtils.isEmpty("<Android_YT_Open_App>")) {
                hashMap.put("screen_name", "<Android_YT_Open_App>");
            }
        }
        dvy a = dvy.a(context);
        synchronized (a.a) {
            if (!a.b.contains("1001680686") && !a.c.containsKey("1001680686")) {
                a.e.o("1001680686", a.d);
                a.c.put("1001680686", Long.valueOf(a.d));
            }
        }
        try {
            dwf dwfVar = new dwf();
            dwfVar.a = "1001680686";
            dwfVar.c = true;
            dwfVar.d = hashMap;
            dwfVar.b = a.c.containsKey("1001680686");
            trp.n(context, dwfVar);
        } catch (Exception e) {
            Log.e("GoogleConversionReporter", "Error sending ping", e);
        }
    }

    public static dbg b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                c(cls, e);
            } catch (InstantiationException e2) {
                c(cls, e2);
            } catch (NoSuchMethodException e3) {
                c(cls, e3);
            } catch (InvocationTargetException e4) {
                c(cls, e4);
            }
            if (!(obj instanceof dbg)) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                sb.append("Expected instanceof GlideModule, but found: ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString());
            }
            return (dbg) obj;
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    private static void c(Class cls, Exception exc) {
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("Unable to instantiate GlideModule implementation for ");
        sb.append(valueOf);
        throw new RuntimeException(sb.toString(), exc);
    }
}
