package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rfk {
    protected static final AtomicReference a = new AtomicReference();
    protected static final AtomicReference b = new AtomicReference();
    protected static final AtomicReference c = new AtomicReference();
    public final rhl d;

    public rfk(rhl rhlVar) {
        this.d = rhlVar;
    }

    private static final String f(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        qip.an(strArr);
        qip.an(strArr2);
        qip.an(atomicReference);
        qip.ao(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (rkm.ap(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(valueOf);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.d.a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(d(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.d.a() ? str : f(str, rhi.c, rhi.a, a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.d.a() ? str : f(str, rhj.b, rhj.a, b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.d.a()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return f(str, rhk.b, rhk.a, c);
    }
}
