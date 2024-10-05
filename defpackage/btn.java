package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class btn implements bum, bul {
    static final TreeMap a = new TreeMap();
    final long[] b;
    final double[] c;
    final String[] d;
    final byte[][] e;
    final int f;
    int g;
    private volatile String h;
    private final int[] i;

    private btn(int i) {
        this.f = i;
        int i2 = i + 1;
        this.i = new int[i2];
        this.b = new long[i2];
        this.c = new double[i2];
        this.d = new String[i2];
        this.e = new byte[i2];
    }

    public static btn a(String str, int i) {
        TreeMap treeMap = a;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                btn btnVar = (btn) ceilingEntry.getValue();
                btnVar.h(str, i);
                return btnVar;
            }
            btn btnVar2 = new btn(i);
            btnVar2.h(str, i);
            return btnVar2;
        }
    }

    @Override // defpackage.bum
    public final String b() {
        return this.h;
    }

    @Override // defpackage.bul
    public final void c(int i, byte[] bArr) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.bul
    public final void d(int i, long j) {
        this.i[1] = 2;
        this.b[1] = j;
    }

    @Override // defpackage.bul
    public final void e(int i) {
        this.i[i] = 1;
    }

    @Override // defpackage.bul
    public final void f(int i, String str) {
        this.i[i] = 4;
        this.d[i] = str;
    }

    @Override // defpackage.bum
    public final void g(bul bulVar) {
        for (int i = 1; i <= this.g; i++) {
            int i2 = this.i[i];
            if (i2 == 1) {
                bulVar.e(i);
            } else if (i2 == 2) {
                bulVar.d(i, this.b[i]);
            } else if (i2 == 3) {
                ((but) bulVar).a.bindDouble(i, this.c[i]);
            } else if (i2 == 4) {
                bulVar.f(i, this.d[i]);
            } else if (i2 == 5) {
                bulVar.c(i, this.e[i]);
            }
        }
    }

    final void h(String str, int i) {
        this.h = str;
        this.g = i;
    }

    public final void i() {
        TreeMap treeMap = a;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}
