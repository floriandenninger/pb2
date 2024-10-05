package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.net.Uri;
import android.system.Os;
import android.system.StructStat;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class vls {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "FAILURE" : "SUCCESSFUL" : "EDITING" : "IN_PROGRESS" : "INITIALIZED";
    }

    public static /* synthetic */ void b(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static Uri c(aodg aodgVar) {
        StringBuilder sb = new StringBuilder("https://lh3.googleusercontent.com/p/");
        if ((aodgVar.b & 1) != 0) {
            sb.append(aodgVar.c);
        }
        if ((aodgVar.b & 2) != 0) {
            sb.append("=iv");
            sb.append(aodgVar.d);
        }
        return Uri.parse(sb.toString());
    }

    public static void d(Activity activity) {
        try {
            ComponentCallbacks2 application = activity.getApplication();
            if (application instanceof vjt) {
                ((vjt) application).a().h(activity);
                return;
            }
            if (application instanceof axpj) {
                ComponentCallbacks2 application2 = activity.getApplication();
                if (!(application2 instanceof axpj)) {
                    throw new RuntimeException(String.format("%s does not implement %s", application2.getClass().getCanonicalName(), axpj.class.getCanonicalName()));
                }
                axpj axpjVar = (axpj) application2;
                amsj g = axpjVar.g();
                axpjVar.getClass();
                g.getClass();
                g.g(activity);
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    public static /* synthetic */ String e(int i) {
        return i != 1 ? i != 2 ? "ALL_PHOTOS" : "CLUSTERS" : "ME_PHOTOS";
    }

    public static vqc f(vmr vmrVar) {
        amru m = m(vmrVar.a, 7);
        vqa a = vqc.a();
        m.getClass();
        a.a = new vpp(m);
        boolean z = true;
        if (m.size() >= vmrVar.a.size() && !vmrVar.c) {
            z = false;
        }
        a.b(z);
        a.b = vmrVar.d;
        return a.a();
    }

    public static vqc g(vnb vnbVar, int i, vpw vpwVar) {
        amru amruVar = vnbVar.a;
        amrp amrpVar = new amrp();
        int size = amruVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            aodg aodgVar = (aodg) amruVar.get(i2);
            int a = aobq.a(aodgVar.e);
            if (a != 0 && a == 2) {
                amrpVar.h(aodgVar);
            }
        }
        amru m = m(amrpVar.g(), i);
        vqa a2 = vqc.a();
        a2.a = vpwVar.a(m);
        a2.b(m.size() < vnbVar.a.size() || vnbVar.c);
        a2.b = vnbVar.d;
        return a2.a();
    }

    public static String h(aoqa aoqaVar) {
        Date date = new Date(aora.b(aoqaVar));
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        dateTimeInstance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return dateTimeInstance.format(date);
    }

    public static Uri i(Uri uri, String str) {
        Uri.Builder buildUpon = uri.buildUpon();
        String valueOf = String.valueOf(uri.getPath());
        return buildUpon.path(str.length() != 0 ? valueOf.concat(str) : new String(valueOf)).build();
    }

    public static IOException j(vcw vcwVar, Uri uri, IOException iOException) {
        try {
            vef b = vef.b();
            b.d();
            File file = (File) vcwVar.c(uri, b);
            if (file.exists()) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.canWrite()) {
                            return o(file, iOException);
                        }
                        return o(file, iOException);
                    }
                    if (file.canWrite()) {
                        return o(file, iOException);
                    }
                    return o(file, iOException);
                }
                if (file.canRead()) {
                    if (file.canWrite()) {
                        return o(file, iOException);
                    }
                    return o(file, iOException);
                }
                if (file.canWrite()) {
                    return o(file, iOException);
                }
                return o(file, iOException);
            }
            return o(file, iOException);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static void k(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static final File l(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new vdo("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new vdo("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new vdo("Did not expect uri to have authority");
    }

    private static amru m(amru amruVar, int i) {
        return amruVar.subList(0, Math.min(amruVar.size(), i));
    }

    private static IOException n(File file, IOException iOException) {
        String concat;
        try {
            String valueOf = String.valueOf(String.format(Locale.US, " canonical[%s] freeSpace[%d]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace())));
            concat = valueOf.length() != 0 ? "Inoperable file:".concat(valueOf) : new String("Inoperable file:");
            try {
                StructStat stat = Os.stat(file.getCanonicalPath());
                String valueOf2 = String.valueOf(concat);
                String valueOf3 = String.valueOf(String.format(Locale.US, " mode[%d]", Integer.valueOf(stat.st_mode)));
                concat = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            concat = String.valueOf("Inoperable file:").concat(" failed");
        }
        return new IOException(concat, iOException);
    }

    private static IOException o(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return n(file, iOException);
        }
        if (parentFile.exists()) {
            if (parentFile.isDirectory()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return n(file, iOException);
                    }
                    return n(file, iOException);
                }
                if (parentFile.canWrite()) {
                    return n(file, iOException);
                }
                return n(file, iOException);
            }
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return n(file, iOException);
                }
                return n(file, iOException);
            }
            if (parentFile.canWrite()) {
                return n(file, iOException);
            }
            return n(file, iOException);
        }
        return n(file, iOException);
    }
}
