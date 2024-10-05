package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vya implements Comparable {
    public final int a;
    private Bitmap b;
    private int c;
    private final vyb d;

    public vya(vyb vybVar, int i) {
        vybVar.getClass();
        this.d = vybVar;
        this.a = i;
        this.c = 1;
    }

    public final long a() {
        return this.d.a.a.l(this.a);
    }

    public final synchronized Bitmap b() {
        return this.b;
    }

    public final synchronized vya c() {
        vcp.d(this.c >= 0);
        int i = this.c;
        if (i <= 0) {
            return null;
        }
        this.c = i + 1;
        return this;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this.a;
        int i2 = ((vya) obj).a;
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    public final void d() {
        boolean z;
        synchronized (this) {
            z = false;
            vcp.d(this.c > 0);
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                Bitmap bitmap = this.b;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.b = null;
                }
                z = true;
            }
        }
        if (z) {
            vyb vybVar = this.d;
            synchronized (vybVar.a.b) {
                vyk vykVar = vybVar.a.b;
                vya vyaVar = (vya) vykVar.a.remove(Integer.valueOf(this.a));
                if (vyaVar != this && vyaVar != null) {
                    vykVar.c(vyaVar);
                }
            }
        }
    }

    public final synchronized void e(Bitmap bitmap) {
        if (f() != 3 && this.b == null) {
            this.b = bitmap;
            return;
        }
        bitmap.recycle();
    }

    public final synchronized int f() {
        return this.c == 0 ? 3 : this.b != null ? 2 : 1;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Object[] objArr = new Object[2];
        int i = this.a;
        StringBuilder sb = new StringBuilder(22);
        sb.append("frameIndex=");
        sb.append(i);
        objArr[0] = sb.toString();
        int f = f();
        String str = f != 1 ? f != 2 ? "DISPOSED" : "EXTRACTED" : "CREATED";
        StringBuilder sb2 = new StringBuilder(str.length() + 6);
        sb2.append("state=");
        sb2.append(str);
        objArr[1] = sb2.toString();
        return uqq.o(simpleName, objArr);
    }
}
