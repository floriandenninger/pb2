package defpackage;

import android.util.SparseArray;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tas implements swr {
    public static final SparseArray b;
    public final int c;
    public boolean d;
    public final long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    private final tbt k;
    private final Executor l;
    private final String m;
    private int n;
    private String o;
    private final aksx p;

    static {
        SparseArray sparseArray = new SparseArray();
        b = sparseArray;
        sparseArray.put(16, tbp.FIRST_ROOT_PREPARATION);
        sparseArray.put(6, tbp.ROOT_MOUNTING);
    }

    public tas(int i, String str, tbt tbtVar, Executor executor) {
        tbl tblVar = tbl.b;
        this.n = -1;
        this.d = false;
        this.o = null;
        this.c = i;
        this.l = executor;
        this.k = tbtVar;
        this.e = ahbn.r();
        this.p = tbk.a();
        this.m = str;
    }

    @Override // defpackage.dlg
    public final void a(String str, String str2) {
        if ("CellLogId".equals(str)) {
            try {
                this.n = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                this.n = -1;
            }
        } else if ("CELL_NODE_ID".equals(str)) {
            this.o = str2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dlg
    public final void b(String str) {
        char c;
        if (this.c != 16) {
            return;
        }
        switch (str.hashCode()) {
            case -2086025552:
                if (str.equals("start_create_layout")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -935948671:
                if (str.equals("start_measure")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 749650793:
                if (str.equals("end_create_layout")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1694616058:
                if (str.equals("end_measure")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.i = ahbn.r();
            this.j = -1L;
        } else {
            if (c == 1) {
                this.j = ahbn.r();
                return;
            }
            if (c == 2) {
                this.g = ahbn.r();
                this.h = -1L;
            } else {
                if (c != 3) {
                    return;
                }
                this.h = ahbn.r();
            }
        }
    }

    @Override // defpackage.swr
    public final void c() {
        this.d = true;
    }

    @Override // defpackage.swr
    public final void d() {
        this.f = ahbn.r();
        this.l.execute(new Runnable() { // from class: tar
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                tas tasVar = tas.this;
                if (tasVar.d) {
                    return;
                }
                if (tas.b.get(tasVar.c) == null) {
                    str = tbp.UNKNOWN.m;
                } else {
                    str = ((tbp) tas.b.get(tasVar.c)).m;
                }
                tasVar.f(str, tasVar.e, tasVar.f);
                if (tasVar.i > 0 && tasVar.j > 0) {
                    tasVar.f(tbp.FIRST_ROOT_MATERIALIZATION.m, tasVar.i, tasVar.j);
                }
                if (tasVar.g <= 0 || tasVar.h <= 0) {
                    return;
                }
                tasVar.f(tbp.FIRST_ROOT_MEASUREMENT.m, tasVar.g, tasVar.h);
            }
        });
    }

    @Override // defpackage.swr
    public final boolean e() {
        return !this.d;
    }

    public final void f(String str, long j, long j2) {
        tbn a = tbo.a();
        a.h = this.p;
        a.c(amvs.a);
        String str2 = this.o;
        if (str2 != null) {
            a.a = str2;
        }
        tbm a2 = tbq.a();
        a2.b(str);
        a2.a = Long.valueOf(j);
        a2.b = Long.valueOf(j2);
        a2.e = a.a();
        tbq a3 = a2.a();
        int i = this.n;
        if (i > 0) {
            this.k.e(this.m, i, a3);
        } else {
            this.k.f(this.m, a3);
        }
    }
}
