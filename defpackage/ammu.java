package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ammu {
    public boolean a;
    private final String b;
    private final ammt c;
    private ammt d;

    public ammu(String str) {
        ammt ammtVar = new ammt();
        this.c = ammtVar;
        this.d = ammtVar;
        this.a = false;
        str.getClass();
        this.b = str;
    }

    private final ammt h() {
        ammt ammtVar = new ammt();
        this.d.c = ammtVar;
        this.d = ammtVar;
        return ammtVar;
    }

    public final void a(Object obj) {
        h().b = obj;
    }

    public final void b(String str, Object obj) {
        ammt h = h();
        h.b = obj;
        h.a = str;
    }

    public final void c(String str, Object obj) {
        amms ammsVar = new amms();
        this.d.c = ammsVar;
        this.d = ammsVar;
        ammsVar.b = obj;
        ammsVar.a = str;
    }

    public final void d(String str, float f) {
        c(str, String.valueOf(f));
    }

    public final void e(String str, int i) {
        c(str, String.valueOf(i));
    }

    public final void f(String str, long j) {
        c(str, String.valueOf(j));
    }

    public final void g(String str, boolean z) {
        c(str, String.valueOf(z));
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.b);
        sb.append('{');
        String str = "";
        for (ammt ammtVar = this.c.c; ammtVar != null; ammtVar = ammtVar.c) {
            Object obj = ammtVar.b;
            if ((ammtVar instanceof amms) || obj != null || !z) {
                sb.append(str);
                String str2 = ammtVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
