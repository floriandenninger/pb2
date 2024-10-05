package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wnn {
    public final xgh a;
    public final xeo b;
    public wqz i;
    public wxl j;
    public wsx k;
    public boolean l;
    public boolean m;
    public xev n;
    public int o;
    public int p;
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final Map f = new HashMap();
    public final Map e = new HashMap();
    public final List g = new ArrayList();
    public final Set h = new HashSet();

    public wnn(xgh xghVar, xeo xeoVar) {
        this.a = xghVar;
        this.b = xeoVar;
    }

    public final String a() {
        int i = this.o;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "EXIT_REQUESTED" : "RENDERING_STOP_REQUESTED" : "RENDERING" : "ENTERED" : "ENTER_REQUESTED" : "SCHEDULED" : "NOT_SCHEDULED";
    }

    public final boolean b() {
        return this.p == 1;
    }

    public final boolean c() {
        int i = this.o;
        return i == 2 || i == 3 || i == 4 || i == 5 || i == 6;
    }

    public final boolean d() {
        int i = this.o;
        return i == 4 || i == 5;
    }

    public final boolean e() {
        return this.o == 1;
    }

    public final boolean f() {
        return this.o == 2;
    }

    public final boolean g() {
        return this.o == 6;
    }
}
