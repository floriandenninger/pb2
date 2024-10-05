package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.CancellationSignal;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abn {
    public abn() {
        new aeb();
        new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.Builder a(Context context) {
        return new BiometricPrompt.Builder(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt b(BiometricPrompt.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
        builder.setNegativeButton(charSequence, executor, onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    public static boolean h(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return h(context, str, R.array.hide_fingerprint_instantly_prefixes);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.byq j(byte[] r7) {
        /*
            byq r0 = new byq
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
        L17:
            if (r7 <= 0) goto L32
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            byp r5 = new byp     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            java.util.Set r3 = r0.a     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            r3.add(r5)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            int r7 = r7 + (-1)
            goto L17
        L32:
            r2.close()     // Catch: java.io.IOException -> L36
            goto L3a
        L36:
            r7 = move-exception
            r7.printStackTrace()
        L3a:
            r1.close()     // Catch: java.io.IOException -> L5b
            goto L5f
        L3e:
            r7 = move-exception
            r0 = r7
            r7 = r2
            goto L60
        L42:
            r7 = move-exception
            goto L4a
        L44:
            r0 = move-exception
            goto L60
        L46:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4a:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L57
            r2.close()     // Catch: java.io.IOException -> L53
            goto L57
        L53:
            r7 = move-exception
            r7.printStackTrace()
        L57:
            r1.close()     // Catch: java.io.IOException -> L5b
            goto L5f
        L5b:
            r7 = move-exception
            r7.printStackTrace()
        L5f:
            return r0
        L60:
            if (r7 == 0) goto L6a
            r7.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r7 = move-exception
            r7.printStackTrace()
        L6a:
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r7 = move-exception
            r7.printStackTrace()
        L72:
            goto L74
        L73:
            throw r0
        L74:
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abn.j(byte[]):byq");
    }

    public static int l(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
    }

    public static int m(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
    }

    public static int n(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to State");
    }

    public static int o(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
    }

    public static int k(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 4;
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + ((Object) abm.c(i)) + " to int");
                    }
                }
            }
        }
        return i3;
    }
}
