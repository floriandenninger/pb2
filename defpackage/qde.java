package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qde {
    public static final String b = "androidPackageName";
    public static final String[] a = {"com.google", "com.google.work", "cn.google"};
    public static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final rvm d = qar.g("GoogleAuthUtil");

    public static TokenData a(Bundle bundle) {
        TokenData tokenData;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        qef a2 = qef.a(string);
        if (!qef.b(a2)) {
            if (qef.NETWORK_ERROR.equals(a2) || qef.SERVICE_UNAVAILABLE.equals(a2) || qef.INTNERNAL_ERROR.equals(a2) || qef.AUTH_SECURITY_ERROR.equals(a2)) {
                throw new IOException(string);
            }
            throw new qcw(string);
        }
        rvm rvmVar = d;
        String valueOf = String.valueOf(a2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("isUserRecoverableError status: ");
        sb.append(valueOf);
        rvmVar.b("GoogleAuthUtil", sb.toString());
        throw new UserRecoverableAuthException(string, intent);
    }

    public static TokenData b(Context context, final Account account, final String str, Bundle bundle) {
        qip.au("Calling this from your main thread can lead to deadlock");
        qip.ay(str, "Scope cannot be empty or null.");
        o(account);
        h(context, 8400000);
        final Bundle bundle2 = new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        String str3 = b;
        if (TextUtils.isEmpty(bundle2.getString(str3))) {
            bundle2.putString(str3, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        uvr.g(context);
        if (axst.c() && j(context)) {
            qog G = prh.G(context);
            qip.az(account, "Account name cannot be null!");
            qip.ay(str, "Scope cannot be null!");
            qrd b2 = qre.b();
            b2.b = new Feature[]{qcv.b};
            b2.a = new qqu() { // from class: qdp
                @Override // defpackage.qqu
                public final void a(Object obj, Object obj2) {
                    ((qdo) ((qdl) obj).D()).h(new qdm((rpv) obj2, 3, (short[]) null), account, str, bundle2);
                }
            };
            b2.c = 1512;
            try {
                Bundle bundle3 = (Bundle) d(((qob) G).w(b2.a()), "token retrieval");
                k(bundle3);
                return a(bundle3);
            } catch (qnx e) {
                i(e, "token retrieval");
            }
        }
        return (TokenData) c(context, c, new qdd() { // from class: qcx
            @Override // defpackage.qdd
            public final Object a(IBinder iBinder) {
                owo owoVar;
                Account account2 = account;
                String str4 = str;
                Bundle bundle4 = bundle2;
                String[] strArr = qde.a;
                if (iBinder == null) {
                    owoVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                    if (queryLocalInterface instanceof owo) {
                        owoVar = (owo) queryLocalInterface;
                    } else {
                        owoVar = new owo(iBinder);
                    }
                }
                Parcel pn = owoVar.pn();
                ecr.g(pn, account2);
                pn.writeString(str4);
                ecr.g(pn, bundle4);
                Parcel po = owoVar.po(5, pn);
                Bundle bundle5 = (Bundle) ecr.a(po, Bundle.CREATOR);
                po.recycle();
                if (bundle5 == null) {
                    throw new IOException("Service call returned null");
                }
                return qde.a(bundle5);
            }
        });
    }

    public static Object c(Context context, ComponentName componentName, qdd qddVar) {
        qmt qmtVar = new qmt(0);
        qsi a2 = qsi.a(context);
        try {
            try {
                if (a2.b(new qsh(componentName), qmtVar, "GoogleAuthUtil")) {
                    try {
                        qip.au("BlockingServiceConnection.getService() called on main thread");
                        if (!qmtVar.a) {
                            qmtVar.a = true;
                            return qddVar.a((IBinder) qmtVar.b.take());
                        }
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    } catch (RemoteException | InterruptedException e) {
                        throw new IOException("Error on service connection.", e);
                    }
                }
                throw new IOException("Could not bind to service.");
            } finally {
                a2.c(componentName, qmtVar);
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    public static Object d(rpt rptVar, String str) {
        try {
            return rqr.d(rptVar);
        } catch (InterruptedException e) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            d.b(format, new Object[0]);
            throw new IOException(format, e);
        } catch (CancellationException e2) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            d.b(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof qnx) {
                throw ((qnx) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            d.b(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    public static String e(Context context, Account account, String str) {
        return f(context, account, str, new Bundle());
    }

    public static String f(Context context, Account account, String str, Bundle bundle) {
        o(account);
        return b(context, account, str, bundle).b;
    }

    public static void g(Context context, String str) {
        qip.au("Calling this from your main thread can lead to deadlock");
        h(context, 8400000);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        String str3 = b;
        if (!bundle.containsKey(str3)) {
            bundle.putString(str3, str2);
        }
        uvr.g(context);
        if (axst.c() && j(context)) {
            qog G = prh.G(context);
            final ClearTokenRequest clearTokenRequest = new ClearTokenRequest();
            clearTokenRequest.b = str;
            qrd b2 = qre.b();
            b2.b = new Feature[]{qcv.b};
            b2.a = new qqu() { // from class: qdt
                @Override // defpackage.qqu
                public final void a(Object obj, Object obj2) {
                    ((qdo) ((qdl) obj).D()).a(new qdv((rpv) obj2), ClearTokenRequest.this);
                }
            };
            b2.c = 1513;
            try {
                d(((qob) G).w(b2.a()), "clear token");
                return;
            } catch (qnx e) {
                i(e, "clear token");
            }
        }
        c(context, c, new qda(str, bundle));
    }

    public static void h(Context context, int i) {
        try {
            qnm.d(context.getApplicationContext(), i);
        } catch (GooglePlayServicesIncorrectManifestValueException e) {
            e = e;
            throw new qcw(e.getMessage(), e);
        } catch (qnk e2) {
            e = e2;
            throw new qcw(e.getMessage(), e);
        } catch (qnl e3) {
            throw new qdf(e3.a, e3.getMessage(), new Intent(e3.b));
        }
    }

    public static void i(qnx qnxVar, String str) {
        d.b("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(qnxVar));
    }

    public static boolean j(Context context) {
        if (qmy.a.h(context, 17895000) != 0) {
            return false;
        }
        String str = context.getApplicationInfo().packageName;
        Iterator it = axst.a.get().a().b.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static void k(Object obj) {
        if (obj != null) {
            return;
        }
        d.b("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    @Deprecated
    public static String l(Context context, String str, String str2) {
        return e(context, new Account(str, "com.google"), str2);
    }

    public static Account[] m(Context context) {
        qip.ax("com.google");
        try {
            int i = qmz.c;
            qnm.d(context, 8400000);
            if (Build.VERSION.SDK_INT >= 23) {
                qip.an(context);
                ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
                if (acquireContentProviderClient == null) {
                    throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
                }
                try {
                    try {
                        Bundle call = acquireContentProviderClient.call("get_accounts", "com.google", new Bundle());
                        if (call == null) {
                            throw new RemoteException("Null result from AccountChimeraContentProvider");
                        }
                        Parcelable[] parcelableArray = call.getParcelableArray("accounts");
                        if (parcelableArray != null) {
                            Account[] accountArr = new Account[parcelableArray.length];
                            for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                                accountArr[i2] = (Account) parcelableArray[i2];
                            }
                            return accountArr;
                        }
                        throw new RemoteException("Key_Accounts is Null");
                    } catch (RemoteException e) {
                        d.c("RemoteException when fetching accounts", e);
                        throw e;
                    } catch (Exception e2) {
                        d.c("Exception when getting accounts", e2);
                        String valueOf = String.valueOf(e2.getMessage());
                        throw new RemoteException(valueOf.length() != 0 ? "Accounts ContentProvider failed: ".concat(valueOf) : new String("Accounts ContentProvider failed: "));
                    }
                } finally {
                    acquireContentProviderClient.release();
                }
            }
            return AccountManager.get(context).getAccountsByType("com.google");
        } catch (GooglePlayServicesIncorrectManifestValueException unused) {
            throw new qnk(18);
        }
    }

    public static Account[] n(Context context, final String[] strArr) {
        qip.an(context);
        qip.ax("com.google");
        h(context, 8400000);
        uvr.g(context);
        if (axst.b() && j(context)) {
            qog G = prh.G(context);
            final GetAccountsRequest getAccountsRequest = new GetAccountsRequest("com.google", strArr);
            qrd b2 = qre.b();
            b2.b = new Feature[]{qcv.c};
            b2.a = new qqu() { // from class: qdr
                @Override // defpackage.qqu
                public final void a(Object obj, Object obj2) {
                    ((qdo) ((qdl) obj).D()).g(new qdm((rpv) obj2, 2, (char[]) null), GetAccountsRequest.this);
                }
            };
            b2.c = 1516;
            try {
                List list = (List) d(((qob) G).w(b2.a()), "Accounts retrieval");
                k(list);
                return (Account[]) list.toArray(new Account[0]);
            } catch (qnx e) {
                i(e, "Accounts retrieval");
            }
        }
        return (Account[]) c(context, c, new qdd() { // from class: qcz
            @Override // defpackage.qdd
            public final Object a(IBinder iBinder) {
                owo owoVar;
                Parcelable[] parcelableArray;
                String[] strArr2 = strArr;
                String[] strArr3 = qde.a;
                if (iBinder == null) {
                    owoVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                    if (queryLocalInterface instanceof owo) {
                        owoVar = (owo) queryLocalInterface;
                    } else {
                        owoVar = new owo(iBinder);
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putString("accountType", "com.google");
                bundle.putStringArray("account_features", strArr2);
                Parcel pn = owoVar.pn();
                ecr.g(pn, bundle);
                Parcel po = owoVar.po(6, pn);
                Bundle bundle2 = (Bundle) ecr.a(po, Bundle.CREATOR);
                po.recycle();
                if (bundle2 == null || (parcelableArray = bundle2.getParcelableArray("accounts")) == null) {
                    throw new IOException("Receive null result from service call.");
                }
                Account[] accountArr = new Account[parcelableArray.length];
                for (int i = 0; i < parcelableArray.length; i++) {
                    accountArr[i] = (Account) parcelableArray[i];
                }
                return accountArr;
            }
        });
    }

    private static void o(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = a;
            for (int i = 0; i < 3; i++) {
                if (strArr[i].equals(account.type)) {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        }
        throw new IllegalArgumentException("Account name cannot be empty!");
    }
}
