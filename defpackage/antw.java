package defpackage;

import android.os.Bundle;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class antw {
    public final Bundle a;
    public Thing.Metadata b;
    public String c;
    private final String d;

    public antw(String str) {
        qip.ax(str);
        this.a = new Bundle();
        this.d = str;
    }

    public static Object[] b(Object[] objArr) {
        return objArr.length < 100 ? objArr : Arrays.copyOf(objArr, 100);
    }

    public final antv a() {
        Bundle bundle = new Bundle(this.a);
        Thing.Metadata metadata = this.b;
        if (metadata == null) {
            metadata = aobq.G(axkk.a.b, axkk.a.c, axkk.a.d, new Bundle());
        }
        return new Thing(bundle, metadata, this.c, this.d);
    }

    public final void c(String str, String... strArr) {
        Bundle bundle = this.a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
        if (strArr2.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < Math.min(strArr2.length, 100); i2++) {
                String str2 = strArr2[i2];
                strArr2[i] = str2;
                if (strArr2[i2] != null) {
                    int i3 = 20000;
                    if (str2.length() > 20000) {
                        String str3 = strArr2[i];
                        if (str3.length() > 20000) {
                            if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                                i3 = 19999;
                            }
                            str3 = str3.substring(0, i3);
                        }
                        strArr2[i] = str3;
                    }
                    i++;
                }
            }
            if (i > 0) {
                bundle.putStringArray(str, (String[]) b((String[]) Arrays.copyOfRange(strArr2, 0, i)));
            }
        }
    }

    public final void d(String str) {
        qip.an(str);
        c("name", str);
    }

    public antw() {
        this("Person");
    }
}
