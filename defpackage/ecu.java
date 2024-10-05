package defpackage;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ecu {
    public String a;
    public String b;
    public int c;
    public final Map d;
    public ecy e;
    public String f;
    public String g;

    public ecu() {
        String.format("Android %s", Build.VERSION.RELEASE);
        this.a = "_s";
        this.b = "https://csi.gstatic.com/csi";
        this.c = 1;
        this.d = new LinkedHashMap();
    }

    public final void a() {
        this.c = 1;
    }

    public final void b(String str, String str2) {
        this.f = str;
        this.g = str2;
    }
}
