package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfq {
    public static final Map a = new HashMap();
    private static final byte[] b = {80, 75, 3, 4};

    public static cgf a(Context context, String str) {
        String valueOf = String.valueOf(str);
        return b(context, str, valueOf.length() != 0 ? "asset_".concat(valueOf) : new String("asset_"));
    }

    public static cgf b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return c(context.getAssets().open(str), str2);
            }
            return g(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new cgf((Throwable) e);
        }
    }

    public static cgf c(InputStream inputStream, String str) {
        try {
            return d(clh.e(bacz.a(bacz.b(inputStream))), str);
        } finally {
            cls.i(inputStream);
        }
    }

    public static cgf d(clh clhVar, String str) {
        return o(clhVar, str, true);
    }

    public static cgf e(String str, String str2) {
        return d(clh.e(bacz.a(bacz.b(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    public static cgf f(Context context, int i, String str) {
        Boolean bool;
        try {
            bacw a2 = bacz.a(bacz.b(context.getResources().openRawResource(i)));
            try {
                bacw a3 = bacz.a(new badb(a2));
                byte[] bArr = b;
                int length = bArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < 4) {
                        byte b2 = bArr[i2];
                        if (!((badd) a3).n(1L)) {
                            throw new EOFException();
                        }
                        if (((badd) a3).a.b() != b2) {
                            bool = false;
                            break;
                        }
                        i2++;
                    } else {
                        a3.close();
                        bool = true;
                        break;
                    }
                }
            } catch (Exception unused) {
                int i3 = cll.a;
                bool = false;
            }
            if (bool.booleanValue()) {
                return g(new ZipInputStream(a2.f()), str);
            }
            return c(a2.f(), str);
        } catch (Resources.NotFoundException e) {
            return new cgf((Throwable) e);
        }
    }

    public static cgf g(ZipInputStream zipInputStream, String str) {
        cgf cgfVar;
        cga cgaVar;
        try {
            HashMap hashMap = new HashMap();
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                Object obj = null;
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name.contains("__MACOSX")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().contains(".json")) {
                        obj = o(clh.e(bacz.a(bacz.b(zipInputStream))), null, false).a;
                    } else {
                        if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                            zipInputStream.closeEntry();
                        }
                        hashMap.put(name.split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                if (obj == null) {
                    cgfVar = new cgf((Throwable) new IllegalArgumentException("Unable to parse composition"));
                } else {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Iterator it = ((cfj) obj).b.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                cgaVar = null;
                                break;
                            }
                            cgaVar = (cga) it.next();
                            if (cgaVar.d.equals(str2)) {
                                break;
                            }
                        }
                        if (cgaVar != null) {
                            cgaVar.e = cls.e((Bitmap) entry.getValue(), cgaVar.a, cgaVar.b);
                        }
                    }
                    Iterator it2 = ((cfj) obj).b.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            if (((cga) entry2.getValue()).e == null) {
                                String str3 = ((cga) entry2.getValue()).d;
                                cgfVar = new cgf((Throwable) new IllegalStateException(str3.length() != 0 ? "There is no image for ".concat(str3) : new String("There is no image for ")));
                            }
                        } else {
                            if (str != null) {
                                cii.a.a(str, (cfj) obj);
                            }
                            cgfVar = new cgf(obj);
                        }
                    }
                }
            } catch (IOException e) {
                cgfVar = new cgf((Throwable) e);
            }
            return cgfVar;
        } finally {
            cls.i(zipInputStream);
        }
    }

    public static cgi h(Context context, String str) {
        String valueOf = String.valueOf(str);
        return i(context, str, valueOf.length() != 0 ? "asset_".concat(valueOf) : new String("asset_"));
    }

    public static cgi i(Context context, String str, String str2) {
        return p(str2, new cfm(context.getApplicationContext(), str, str2));
    }

    public static cgi j(InputStream inputStream, String str) {
        return p(str, new cfo(inputStream, str));
    }

    public static cgi k(Context context, int i, String str) {
        return p(str, new cfn(new WeakReference(context), context.getApplicationContext(), i, str));
    }

    public static cgi l(Context context, String str) {
        String valueOf = String.valueOf(str);
        return m(context, str, valueOf.length() != 0 ? "url_".concat(valueOf) : new String("url_"));
    }

    public static cgi m(Context context, String str, String str2) {
        return p(str2, new cfl(context, str, str2));
    }

    public static String n(Context context, int i) {
        String str = (context.getResources().getConfiguration().uiMode & 48) != 32 ? "_day_" : "_night_";
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("rawRes");
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    private static cgf o(clh clhVar, String str, boolean z) {
        try {
            try {
                cfj a2 = cks.a(clhVar);
                if (str != null) {
                    cii.a.a(str, a2);
                }
                cgf cgfVar = new cgf(a2);
                if (z) {
                    cls.i(clhVar);
                }
                return cgfVar;
            } catch (Exception e) {
                cgf cgfVar2 = new cgf((Throwable) e);
                if (z) {
                    cls.i(clhVar);
                }
                return cgfVar2;
            }
        } catch (Throwable th) {
            if (z) {
                cls.i(clhVar);
            }
            throw th;
        }
    }

    private static cgi p(String str, Callable callable) {
        cfj cfjVar = str == null ? null : (cfj) cii.a.b.c(str);
        if (cfjVar != null) {
            return new cgi(new cfp(cfjVar));
        }
        if (str != null) {
            Map map = a;
            if (map.containsKey(str)) {
                return (cgi) map.get(str);
            }
        }
        cgi cgiVar = new cgi(callable);
        if (str != null) {
            cgiVar.e(new cfk(str, 1));
            cgiVar.d(new cfk(str, 0));
            a.put(str, cgiVar);
        }
        return cgiVar;
    }
}
