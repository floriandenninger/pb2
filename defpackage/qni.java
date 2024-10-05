package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import com.google.android.gms.common.GoogleCertificatesQuery;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qni {
    static final qng a;
    static final qng b;
    private static final Object c;
    private static Context d;
    private static volatile qsw e;

    static {
        new qnb(qss.b("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new qnc(qss.b("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new qnd(qss.b("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new qne(qss.b("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        c = new Object();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(Context context) {
        synchronized (qni.class) {
            if (d != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                d = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                f();
                qsw qswVar = e;
                Parcel po = qswVar.po(7, qswVar.pn());
                boolean j = ecr.j(po);
                po.recycle();
                return j;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | qvq e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static qnj c(String str, qss qssVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return d(str, qssVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static qnj d(final String str, final qss qssVar, final boolean z, boolean z2) {
        try {
            f();
            qip.an(d);
            GoogleCertificatesQuery googleCertificatesQuery = new GoogleCertificatesQuery(str, qssVar, z, z2);
            try {
                qsw qswVar = e;
                qvf a2 = qve.a(d.getPackageManager());
                Parcel pn = qswVar.pn();
                ecr.g(pn, googleCertificatesQuery);
                ecr.i(pn, a2);
                Parcel po = qswVar.po(5, pn);
                boolean j = ecr.j(po);
                po.recycle();
                if (j) {
                    return qnj.a;
                }
                new Callable() { // from class: qna
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z3 = z;
                        String str2 = str;
                        qss qssVar2 = qssVar;
                        return qnj.a(str2, qssVar2, z3, !z3 && qni.d(str2, qssVar2, true, false).b);
                    }
                };
                return new qnj(false);
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return qnj.c();
            }
        } catch (qvq e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            String valueOf = String.valueOf(e3.getMessage());
            if (valueOf.length() != 0) {
                "module init: ".concat(valueOf);
            }
            return qnj.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r8v0, types: [qvf, android.os.IBinder] */
    public static qnj e(String str, boolean z) {
        qnj c2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            qip.an(d);
            try {
                f();
                GoogleCertificatesLookupQuery googleCertificatesLookupQuery = new GoogleCertificatesLookupQuery(str, z, false, qve.a(d), false);
                try {
                    qsw qswVar = e;
                    Parcel pn = qswVar.pn();
                    ecr.g(pn, googleCertificatesLookupQuery);
                    Parcel po = qswVar.po(6, pn);
                    GoogleCertificatesLookupResponse googleCertificatesLookupResponse = (GoogleCertificatesLookupResponse) ecr.a(po, GoogleCertificatesLookupResponse.CREATOR);
                    po.recycle();
                    if (googleCertificatesLookupResponse.a) {
                        c2 = qnj.a;
                    } else {
                        String str2 = googleCertificatesLookupResponse.b;
                        if (pse.o(googleCertificatesLookupResponse.c) == 4) {
                            new PackageManager.NameNotFoundException();
                            c2 = qnj.c();
                        } else {
                            c2 = qnj.b();
                        }
                    }
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                    c2 = qnj.c();
                }
            } catch (qvq e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                String valueOf = String.valueOf(e3.getMessage());
                if (valueOf.length() != 0) {
                    "module init: ".concat(valueOf);
                }
                c2 = qnj.c();
            }
            return c2;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static void f() {
        qsw qswVar;
        if (e != null) {
            return;
        }
        qip.an(d);
        synchronized (c) {
            if (e == null) {
                IBinder d2 = qvu.e(d, qvu.b, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl");
                if (d2 == null) {
                    qswVar = null;
                } else {
                    IInterface queryLocalInterface = d2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    if (queryLocalInterface instanceof qsw) {
                        qswVar = (qsw) queryLocalInterface;
                    } else {
                        qswVar = new qsw(d2);
                    }
                }
                e = qswVar;
            }
        }
    }
}
