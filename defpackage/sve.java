package defpackage;

import android.content.Context;
import android.provider.Settings;
import com.google.android.libraries.elements.interfaces.DebuggerCallback;
import com.google.android.libraries.elements.interfaces.DebuggerClient;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sve {
    private static final sxe b = new svd();
    public static final syx a = new syx();
    private static final syx c = new syx();
    private static final syx d = new syx();

    public static svo a(ammv ammvVar, final Context context, final azrw azrwVar, final ammv ammvVar2) {
        if (!((Boolean) ammvVar.e(false)).booleanValue()) {
            throw new IllegalStateException("Creating DebuggerCallback when debugger is disabled");
        }
        return (svo) c.a(new syw() { // from class: sva
            @Override // defpackage.syw
            public final Object a() {
                return new svo(context, azrwVar, ammvVar2);
            }
        });
    }

    public static DebuggerClient b(ammv ammvVar, final String str, final azrw azrwVar, final Context context) {
        if (!((Boolean) ammvVar.e(false)).booleanValue()) {
            throw new IllegalStateException("Creating DebuggerClient when debugger is disabled");
        }
        return (DebuggerClient) d.a(new syw() { // from class: svc
            @Override // defpackage.syw
            public final Object a() {
                String str2 = str;
                Context context2 = context;
                azrw azrwVar2 = azrwVar;
                String valueOf = String.valueOf(Settings.Secure.getString(context2.getContentResolver(), "android_id"));
                String valueOf2 = String.valueOf(context2.getPackageName());
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                String valueOf3 = String.valueOf(context2.getApplicationInfo().loadLabel(context2.getPackageManager()));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 10);
                sb.append("Android - ");
                sb.append(valueOf3);
                return DebuggerClient.create(str2, concat, sb.toString(), (DebuggerCallback) azrwVar2.get());
            }
        });
    }

    public static sxe c(ammv ammvVar, azrw azrwVar) {
        return !((Boolean) ammvVar.e(false)).booleanValue() ? b : (sxe) azrwVar.get();
    }

    public static String d(ammv ammvVar) {
        return ((String) ammvVar.e("localhost")).concat(":5001");
    }
}
