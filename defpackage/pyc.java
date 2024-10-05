package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class pyc {
    public final int a;
    public final String b;
    public final Object c;

    public pyc(int i, String str, Object obj) {
        this.a = i;
        this.b = str;
        this.c = obj;
        pwa.a().a.add(this);
    }

    public static pyc d(int i, String str, Boolean bool) {
        return new pxx(i, str, bool);
    }

    public static void f(String str, float f) {
        new pya(str, Float.valueOf(f));
    }

    public static void g(String str, int i) {
        new pxy(str, Integer.valueOf(i));
    }

    public static pyc h(String str, long j) {
        return new pxz(str, Long.valueOf(j));
    }

    public static pyc i(String str, String str2) {
        return new pyb(str, str2);
    }

    protected abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object c(SharedPreferences sharedPreferences);

    public final Object e() {
        final pyh b = pwa.b();
        if (!b.b.block(5000L)) {
            synchronized (b.a) {
                if (!b.d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!b.c || b.e == null) {
            synchronized (b.a) {
                if (b.c && b.e != null) {
                }
                return this.c;
            }
        }
        if (this.a == 2) {
            Bundle bundle = b.f;
            return bundle == null ? this.c : b(bundle);
        }
        if (!b.h.has(this.b)) {
            return pse.l(new amnv() { // from class: pyf
                @Override // defpackage.amnv
                public final Object get() {
                    return this.c(pyh.this.e);
                }
            });
        }
        return a(b.h);
    }
}
