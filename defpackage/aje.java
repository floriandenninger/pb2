package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aje {
    public static final aef a = new aef(16);
    public static final ExecutorService b;
    public static final Object c;
    public static final aeg d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new pkr(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new aeg();
    }

    public static ajd a(String str, Context context, aiy aiyVar, int i) {
        int length;
        Typeface typeface = (Typeface) a.c(str);
        if (typeface == null) {
            try {
                ajf a2 = aix.a(context, aiyVar, null);
                int i2 = 0;
                if (a2.a != 0) {
                    i2 = -2;
                } else {
                    ajg[] ajgVarArr = a2.b;
                    if (ajgVarArr == null || (length = ajgVarArr.length) == 0) {
                        i2 = 1;
                    } else {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                break;
                            }
                            int i4 = ajgVarArr[i3].e;
                            if (i4 != 0) {
                                i2 = i4 < 0 ? -3 : i4;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                if (i2 == 0) {
                    Typeface b2 = fq.b(context, null, a2.b, i);
                    if (b2 != null) {
                        a.d(str, b2);
                        return new ajd(b2);
                    }
                    return new ajd(-3);
                }
                return new ajd(i2);
            } catch (PackageManager.NameNotFoundException unused) {
                return new ajd(-1);
            }
        }
        return new ajd(typeface);
    }

    public static String b(aiy aiyVar, int i) {
        return aiyVar.f + "-" + i;
    }
}
