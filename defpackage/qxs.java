package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qxs implements qxh {
    public final qxt a;
    private final Object b;
    private final qxe c;
    private final eaz d;

    public qxs(Object obj, qxt qxtVar, eaz eazVar, qxe qxeVar) {
        this.b = obj;
        this.a = qxtVar;
        this.d = eazVar;
        this.c = qxeVar;
    }

    private static long h(long j) {
        return System.currentTimeMillis() - j;
    }

    private static String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        aone createBuilder = dvt.a.createBuilder();
        createBuilder.copyOnWrite();
        dvt dvtVar = (dvt) createBuilder.instance;
        dvtVar.e = 4;
        dvtVar.b = 4 | dvtVar.b;
        createBuilder.f(aomf.x(bArr));
        return Base64.encodeToString(((dvt) createBuilder.build()).toByteArray(), 11);
    }

    private final synchronized byte[] j(Map map) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.c.c(2007, h(currentTimeMillis), e);
            return null;
        }
        return (byte[]) this.b.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.b, null, map);
    }

    @Override // defpackage.qxh
    public final synchronized String a(Context context, String str, View view, Activity activity) {
        Map a;
        eaz eazVar = this.d;
        a = eazVar.a();
        a.put("lts", Long.valueOf(eazVar.c.a()));
        a.put("f", "c");
        a.put("ctx", context);
        a.put("cs", str);
        a.put("aid", null);
        a.put("view", view);
        a.put("act", activity);
        return i(j(a));
    }

    @Override // defpackage.qxh
    public final synchronized String b(Context context, View view, Activity activity) {
        Map a;
        a = this.d.a();
        a.put("f", "v");
        a.put("ctx", context);
        a.put("aid", null);
        a.put("view", view);
        a.put("act", activity);
        return i(j(a));
    }

    @Override // defpackage.qxh
    public final synchronized String c(Context context) {
        Map a;
        long j;
        eaz eazVar = this.d;
        a = eazVar.a();
        dvo a2 = qxo.a(eazVar.b.d, qxm.a);
        a.put("gai", Boolean.valueOf(eazVar.a.b));
        a.put("did", a2.ab);
        int J2 = esv.J(a2.ac);
        if (J2 == 0) {
            J2 = 3;
        }
        a.put("dst", Integer.valueOf(J2 - 1));
        a.put("doo", Boolean.valueOf(a2.ad));
        eao eaoVar = eazVar.d;
        if (eaoVar != null) {
            synchronized (eao.class) {
                NetworkCapabilities networkCapabilities = eaoVar.a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        j = 2;
                    } else if (eaoVar.a.hasTransport(1)) {
                        j = 1;
                    } else if (eaoVar.a.hasTransport(0)) {
                        j = 0;
                    }
                }
                j = -1;
            }
            a.put("nt", Long.valueOf(j));
        }
        a.put("f", "q");
        a.put("ctx", context);
        a.put("aid", null);
        return i(j(a));
    }

    @Override // defpackage.qxh
    public final synchronized void d(MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.b.getClass().getDeclaredMethod("he", Map.class).invoke(this.b, hashMap);
            this.c.d(3003, h(currentTimeMillis));
        } catch (Exception e) {
            throw new qxw(2005, e);
        }
    }

    public final synchronized int e() {
        try {
        } catch (Exception e) {
            throw new qxw(2006, e);
        }
        return ((Integer) this.b.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.b, new Object[0])).intValue();
    }

    public final synchronized void f() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.b.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.b, new Object[0]);
            this.c.d(3001, h(currentTimeMillis));
        } catch (Exception e) {
            throw new qxw(2003, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g() {
        try {
        } catch (Exception e) {
            throw new qxw(2001, e);
        }
        return ((Boolean) this.b.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.b, new Object[0])).booleanValue();
    }
}
