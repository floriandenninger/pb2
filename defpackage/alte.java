package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alte {
    static Bundle a = null;
    public static Bundle b = null;
    public static int c = 0;
    public static int d = 0;
    private static final String g = "alte";
    private static alte h = null;
    private static ContentObserver i = null;
    private static int j = 0;
    private static int k = 1;
    Bundle e;
    final EnumMap f;

    private alte(Context context) {
        this.e = null;
        EnumMap enumMap = new EnumMap(altc.class);
        this.f = enumMap;
        Bundle bundle = this.e;
        if (bundle == null || bundle.isEmpty()) {
            try {
                this.e = context.getContentResolver().call(e(), "getOverlayConfig", (String) null, (Bundle) null);
                enumMap.clear();
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(g, "Fail to get config from suw provider");
            }
        }
        if (m(context)) {
            if (i != null) {
                try {
                    context.getContentResolver().unregisterContentObserver(i);
                    i = null;
                } catch (IllegalArgumentException | NullPointerException | SecurityException e) {
                    String str = g;
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                    sb.append("Failed to unregister content observer: ");
                    sb.append(valueOf);
                    Log.w(str, sb.toString());
                }
            }
            Uri e2 = e();
            try {
                i = new altd();
                context.getContentResolver().registerContentObserver(e2, true, i);
            } catch (IllegalArgumentException | NullPointerException | SecurityException e3) {
                String str2 = g;
                String valueOf2 = String.valueOf(e2);
                String valueOf3 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42 + String.valueOf(valueOf3).length());
                sb2.append("Failed to register content observer for ");
                sb2.append(valueOf2);
                sb2.append(": ");
                sb2.append(valueOf3);
                Log.w(str2, sb2.toString());
            }
        }
    }

    static Uri e() {
        return new Uri.Builder().scheme("content").authority("com.google.android.setupwizard.partner").build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r1.screenHeightDp != defpackage.alte.c) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized defpackage.alte f(android.content.Context r4) {
        /*
            java.lang.Class<alte> r0 = defpackage.alte.class
            monitor-enter(r0)
            android.content.res.Resources r1 = r4.getResources()     // Catch: java.lang.Throwable -> L63
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L63
            alte r2 = defpackage.alte.h     // Catch: java.lang.Throwable -> L63
            if (r2 != 0) goto L22
            int r2 = r1.uiMode     // Catch: java.lang.Throwable -> L63
            r2 = r2 & 48
            defpackage.alte.j = r2     // Catch: java.lang.Throwable -> L63
            int r2 = r1.orientation     // Catch: java.lang.Throwable -> L63
            defpackage.alte.k = r2     // Catch: java.lang.Throwable -> L63
            int r2 = r1.screenWidthDp     // Catch: java.lang.Throwable -> L63
            defpackage.alte.d = r2     // Catch: java.lang.Throwable -> L63
            int r1 = r1.screenHeightDp     // Catch: java.lang.Throwable -> L63
            defpackage.alte.c = r1     // Catch: java.lang.Throwable -> L63
            goto L58
        L22:
            boolean r2 = m(r4)     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L31
            int r2 = r1.uiMode     // Catch: java.lang.Throwable -> L63
            r2 = r2 & 48
            int r3 = defpackage.alte.j     // Catch: java.lang.Throwable -> L63
            if (r2 == r3) goto L31
            goto L43
        L31:
            int r2 = r1.orientation     // Catch: java.lang.Throwable -> L63
            int r3 = defpackage.alte.k     // Catch: java.lang.Throwable -> L63
            if (r2 != r3) goto L43
            int r2 = r1.screenWidthDp     // Catch: java.lang.Throwable -> L63
            int r3 = defpackage.alte.d     // Catch: java.lang.Throwable -> L63
            if (r2 != r3) goto L43
            int r2 = r1.screenHeightDp     // Catch: java.lang.Throwable -> L63
            int r3 = defpackage.alte.c     // Catch: java.lang.Throwable -> L63
            if (r2 == r3) goto L5f
        L43:
            int r2 = r1.uiMode     // Catch: java.lang.Throwable -> L63
            r2 = r2 & 48
            defpackage.alte.j = r2     // Catch: java.lang.Throwable -> L63
            int r2 = r1.orientation     // Catch: java.lang.Throwable -> L63
            defpackage.alte.k = r2     // Catch: java.lang.Throwable -> L63
            int r2 = r1.screenHeightDp     // Catch: java.lang.Throwable -> L63
            defpackage.alte.c = r2     // Catch: java.lang.Throwable -> L63
            int r1 = r1.screenWidthDp     // Catch: java.lang.Throwable -> L63
            defpackage.alte.d = r1     // Catch: java.lang.Throwable -> L63
            i()     // Catch: java.lang.Throwable -> L63
        L58:
            alte r1 = new alte     // Catch: java.lang.Throwable -> L63
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L63
            defpackage.alte.h = r1     // Catch: java.lang.Throwable -> L63
        L5f:
            alte r4 = defpackage.alte.h     // Catch: java.lang.Throwable -> L63
            monitor-exit(r0)
            return r4
        L63:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alte.f(android.content.Context):alte");
    }

    public static synchronized void i() {
        synchronized (alte.class) {
            h = null;
            a = null;
            b = null;
        }
    }

    public static boolean m(Context context) {
        if (a == null) {
            try {
                a = context.getContentResolver().call(e(), "isSuwDayNightEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(g, "SetupWizard DayNight supporting status unknown; return as false.");
                a = null;
                return false;
            }
        }
        Bundle bundle = a;
        return bundle != null && bundle.getBoolean("isSuwDayNightEnabled", false);
    }

    public static boolean n(Context context) {
        if (b == null) {
            try {
                b = context.getContentResolver().call(e(), "isExtendedPartnerConfigEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(g, "SetupWizard extended partner configs supporting status unknown; return as false.");
                b = null;
                return false;
            }
        }
        Bundle bundle = b;
        return bundle != null && bundle.getBoolean("isExtendedPartnerConfigEnabled", false);
    }

    private static float q(Context context, TypedValue typedValue) {
        return typedValue.getDimension(context.getResources().getDisplayMetrics());
    }

    public final float a(Context context, altc altcVar) {
        return b(context, altcVar, 0.0f);
    }

    public final float b(Context context, altc altcVar, float f) {
        if (altcVar.bj != 6) {
            throw new IllegalArgumentException("Not a dimension resource");
        }
        if (!this.f.containsKey(altcVar)) {
            try {
                altf g2 = g(context, altcVar.bi);
                Resources resources = g2.b;
                int i2 = g2.a;
                resources.getDimension(i2);
                TypedValue typedValue = new TypedValue();
                resources.getValue(i2, typedValue, true);
                if (typedValue.type == 5) {
                    this.f.put((EnumMap) altcVar, (altc) typedValue);
                    return q(context, (TypedValue) this.f.get(altcVar));
                }
                String hexString = Integer.toHexString(i2);
                String hexString2 = Integer.toHexString(typedValue.type);
                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 37 + String.valueOf(hexString2).length());
                sb.append("Resource ID #0x");
                sb.append(hexString);
                sb.append(" type #0x");
                sb.append(hexString2);
                sb.append(" is not valid");
                throw new Resources.NotFoundException(sb.toString());
            } catch (Resources.NotFoundException | NullPointerException unused) {
                return f;
            }
        }
        return q(context, (TypedValue) this.f.get(altcVar));
    }

    public final int c(Context context, altc altcVar) {
        int color;
        if (altcVar.bj != 3) {
            throw new IllegalArgumentException("Not a color resource");
        }
        if (!this.f.containsKey(altcVar)) {
            int i2 = 0;
            try {
                altf g2 = g(context, altcVar.bi);
                Resources resources = g2.b;
                int i3 = g2.a;
                TypedValue typedValue = new TypedValue();
                resources.getValue(i3, typedValue, true);
                if (typedValue.type == 1 && typedValue.data == 0) {
                    return 0;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    color = resources.getColor(i3, null);
                } else {
                    color = resources.getColor(i3);
                }
                i2 = color;
                this.f.put((EnumMap) altcVar, (altc) Integer.valueOf(i2));
                return i2;
            } catch (NullPointerException unused) {
                return i2;
            }
        }
        return ((Integer) this.f.get(altcVar)).intValue();
    }

    public final Drawable d(Context context, altc altcVar) {
        if (altcVar.bj != 4) {
            throw new IllegalArgumentException("Not a drawable resource");
        }
        if (!this.f.containsKey(altcVar)) {
            Drawable drawable = null;
            try {
                altf g2 = g(context, altcVar.bi);
                Resources resources = g2.b;
                int i2 = g2.a;
                TypedValue typedValue = new TypedValue();
                resources.getValue(i2, typedValue, true);
                if (typedValue.type == 1 && typedValue.data == 0) {
                    return null;
                }
                drawable = resources.getDrawable(i2, null);
                this.f.put((EnumMap) altcVar, (altc) drawable);
                return drawable;
            } catch (Resources.NotFoundException | NullPointerException unused) {
                return drawable;
            }
        }
        return (Drawable) this.f.get(altcVar);
    }

    final altf g(Context context, String str) {
        Bundle bundle = this.e.getBundle(str);
        Bundle bundle2 = this.e.getBundle("fallbackConfig");
        if (bundle2 != null) {
            bundle.putBundle("fallbackConfig", bundle2.getBundle(str));
        }
        altf a2 = altf.a(context, bundle);
        Resources resources = a2.b;
        Configuration configuration = resources.getConfiguration();
        if (!m(context) && (configuration.uiMode & 48) == 32) {
            if (a2 == null) {
                Log.w(g, "resourceEntry is null, skip to force day mode.");
            } else {
                configuration.uiMode = (configuration.uiMode & (-49)) | 16;
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            }
        }
        return a2;
    }

    public final String h(Context context, altc altcVar) {
        if (altcVar.bj != 5) {
            throw new IllegalArgumentException("Not a string resource");
        }
        if (!this.f.containsKey(altcVar)) {
            try {
                altf g2 = g(context, altcVar.bi);
                String string = g2.b.getString(g2.a);
                try {
                    this.f.put((EnumMap) altcVar, (altc) string);
                    return string;
                } catch (NullPointerException unused) {
                    return string;
                }
            } catch (NullPointerException unused2) {
                return null;
            }
        }
        return (String) this.f.get(altcVar);
    }

    public final boolean j(Context context, altc altcVar, boolean z) {
        if (altcVar.bj != 2) {
            throw new IllegalArgumentException("Not a bool resource");
        }
        if (!this.f.containsKey(altcVar)) {
            try {
                altf g2 = g(context, altcVar.bi);
                z = g2.b.getBoolean(g2.a);
                this.f.put((EnumMap) altcVar, (altc) Boolean.valueOf(z));
                return z;
            } catch (Resources.NotFoundException | NullPointerException unused) {
                return z;
            }
        }
        return ((Boolean) this.f.get(altcVar)).booleanValue();
    }

    public final boolean k() {
        Bundle bundle = this.e;
        return (bundle == null || bundle.isEmpty()) ? false : true;
    }

    public final boolean l(altc altcVar) {
        return k() && this.e.containsKey(altcVar.bi);
    }

    public final float o(Context context, altc altcVar) {
        if (altcVar.bj != 7) {
            throw new IllegalArgumentException("Not a fraction resource");
        }
        if (!this.f.containsKey(altcVar)) {
            try {
                altf g2 = g(context, altcVar.bi);
                float fraction = g2.b.getFraction(g2.a, 1, 1);
                try {
                    this.f.put((EnumMap) altcVar, (altc) Float.valueOf(fraction));
                    return fraction;
                } catch (Resources.NotFoundException | NullPointerException unused) {
                    return fraction;
                }
            } catch (Resources.NotFoundException | NullPointerException unused2) {
                return 0.0f;
            }
        }
        return ((Float) this.f.get(altcVar)).floatValue();
    }

    public final int p(Context context, altc altcVar) {
        if (altcVar.bj != 1) {
            throw new IllegalArgumentException("Not a integer resource");
        }
        if (!this.f.containsKey(altcVar)) {
            try {
                altf g2 = g(context, altcVar.bi);
                int integer = g2.b.getInteger(g2.a);
                try {
                    this.f.put((EnumMap) altcVar, (altc) Integer.valueOf(integer));
                    return integer;
                } catch (Resources.NotFoundException | NullPointerException unused) {
                    return integer;
                }
            } catch (Resources.NotFoundException | NullPointerException unused2) {
                return 0;
            }
        }
        return ((Integer) this.f.get(altcVar)).intValue();
    }
}
