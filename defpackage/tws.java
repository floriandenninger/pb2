package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tws {
    public Long a;
    public Long b;
    public Long c;
    public String d;
    public aols e;
    public String f;
    public Long g;
    public Long h;
    public aoky i;
    private String j;
    private aokd k;
    private List l;
    private String m;
    private List n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;

    public tws() {
    }

    public tws(txb txbVar) {
        this.j = txbVar.a;
        this.o = txbVar.o;
        this.p = txbVar.p;
        this.q = txbVar.q;
        this.r = txbVar.r;
        this.a = txbVar.b;
        this.b = txbVar.c;
        this.k = txbVar.d;
        this.l = txbVar.e;
        this.c = txbVar.f;
        this.d = txbVar.g;
        this.e = txbVar.h;
        this.f = txbVar.i;
        this.m = txbVar.j;
        this.g = txbVar.k;
        this.h = txbVar.l;
        this.s = txbVar.s;
        this.i = txbVar.m;
        this.n = txbVar.n;
    }

    public final txb a() {
        int i;
        int i2;
        int i3;
        int i4;
        Long l;
        Long l2;
        aokd aokdVar;
        List list;
        Long l3;
        String str;
        Long l4;
        Long l5;
        int i5;
        List list2;
        String str2 = this.j;
        if (str2 == null || (i = this.o) == 0 || (i2 = this.p) == 0 || (i3 = this.q) == 0 || (i4 = this.r) == 0 || (l = this.a) == null || (l2 = this.b) == null || (aokdVar = this.k) == null || (list = this.l) == null || (l3 = this.c) == null || (str = this.m) == null || (l4 = this.g) == null || (l5 = this.h) == null || (i5 = this.s) == 0 || (list2 = this.n) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.j == null) {
                sb.append(" id");
            }
            if (this.o == 0) {
                sb.append(" readState");
            }
            if (this.p == 0) {
                sb.append(" deletionStatus");
            }
            if (this.q == 0) {
                sb.append(" countBehavior");
            }
            if (this.r == 0) {
                sb.append(" systemTrayBehavior");
            }
            if (this.a == null) {
                sb.append(" lastUpdatedVersion");
            }
            if (this.b == null) {
                sb.append(" lastNotificationVersion");
            }
            if (this.k == null) {
                sb.append(" androidSdkMessage");
            }
            if (this.l == null) {
                sb.append(" notificationMetadataList");
            }
            if (this.c == null) {
                sb.append(" creationId");
            }
            if (this.m == null) {
                sb.append(" groupId");
            }
            if (this.g == null) {
                sb.append(" expirationTimestampUsec");
            }
            if (this.h == null) {
                sb.append(" insertionTimeMs");
            }
            if (this.s == 0) {
                sb.append(" storageMode");
            }
            if (this.n == null) {
                sb.append(" actionList");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new txb(str2, i, i2, i3, i4, l, l2, aokdVar, list, l3, this.d, this.e, this.f, str, l4, l5, i5, this.i, list2);
    }

    public final void b(List list) {
        if (list == null) {
            throw new NullPointerException("Null actionList");
        }
        this.n = list;
    }

    public final void c(aokd aokdVar) {
        if (aokdVar == null) {
            throw new NullPointerException("Null androidSdkMessage");
        }
        this.k = aokdVar;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null groupId");
        }
        this.m = str;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.j = str;
    }

    public final void f(List list) {
        if (list == null) {
            throw new NullPointerException("Null notificationMetadataList");
        }
        this.l = list;
    }

    public final void g(int i) {
        if (i == 0) {
            throw new NullPointerException("Null countBehavior");
        }
        this.q = i;
    }

    public final void h(int i) {
        if (i == 0) {
            throw new NullPointerException("Null deletionStatus");
        }
        this.p = i;
    }

    public final void i(int i) {
        if (i == 0) {
            throw new NullPointerException("Null readState");
        }
        this.o = i;
    }

    public final void j(int i) {
        if (i == 0) {
            throw new NullPointerException("Null storageMode");
        }
        this.s = i;
    }

    public final void k(int i) {
        if (i == 0) {
            throw new NullPointerException("Null systemTrayBehavior");
        }
        this.r = i;
    }
}
