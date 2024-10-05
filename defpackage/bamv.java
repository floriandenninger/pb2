package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamv {
    public final bajf a;
    public bajn b;
    public Integer c;
    public final Locale d;
    public bamt[] e = new bamt[8];
    public int f;
    public boolean g;
    private Object h;

    public bamv(bajf bajfVar) {
        bajf d = bajk.d(bajfVar);
        this.b = d.z();
        this.a = d.a();
        this.d = Locale.getDefault();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(bajp bajpVar, bajp bajpVar2) {
        if (bajpVar == null || !bajpVar.h()) {
            return (bajpVar2 == null || !bajpVar2.h()) ? 0 : -1;
        }
        if (bajpVar2 == null || !bajpVar2.h()) {
            return 1;
        }
        return -bajpVar.compareTo(bajpVar2);
    }

    public final Object b() {
        if (this.h == null) {
            this.h = new bamu(this);
        }
        return this.h;
    }

    public final void c(bamt bamtVar) {
        bamt[] bamtVarArr = this.e;
        int i = this.f;
        int length = bamtVarArr.length;
        if (i == length || this.g) {
            if (i == length) {
                length = i + i;
            }
            bamt[] bamtVarArr2 = new bamt[length];
            System.arraycopy(bamtVarArr, 0, bamtVarArr2, 0, i);
            this.e = bamtVarArr2;
            this.g = false;
            bamtVarArr = bamtVarArr2;
        }
        this.h = null;
        bamtVarArr[i] = bamtVar;
        this.f = i + 1;
    }

    public final void d(bajj bajjVar, int i) {
        c(new bamt(bajjVar.a(this.a), i));
    }

    public final void e(Integer num) {
        this.h = null;
        this.c = num;
    }

    public final void f(bajn bajnVar) {
        this.h = null;
        this.b = bajnVar;
    }

    public final long g(String str) {
        bamt[] bamtVarArr = this.e;
        int i = this.f;
        if (this.g) {
            bamtVarArr = (bamt[]) bamtVarArr.clone();
            this.e = bamtVarArr;
            this.g = false;
        }
        if (i > 10) {
            Arrays.sort(bamtVarArr, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2;
                while (i3 > 0) {
                    int i4 = i3 - 1;
                    if (bamtVarArr[i4].compareTo(bamtVarArr[i3]) > 0) {
                        bamt bamtVar = bamtVarArr[i3];
                        bamtVarArr[i3] = bamtVarArr[i4];
                        bamtVarArr[i4] = bamtVar;
                        i3 = i4;
                    }
                }
            }
        }
        long j = 0;
        if (i > 0) {
            bajp a = bajr.e.a(this.a);
            bajp a2 = bajr.g.a(this.a);
            bajp p = bamtVarArr[0].a.p();
            if (a(p, a) >= 0 && a(p, a2) <= 0) {
                d(bajj.g, 2000);
                return g(str);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            try {
                j = bamtVarArr[i5].b(j, true);
            } catch (bajs e) {
                if (str != null) {
                    StringBuilder sb = new StringBuilder(str.length() + 15);
                    sb.append("Cannot parse \"");
                    sb.append(str);
                    sb.append('\"');
                    String sb2 = sb.toString();
                    String str2 = e.a;
                    if (str2 == null) {
                        e.a = sb2;
                    } else if (sb2 != null) {
                        StringBuilder sb3 = new StringBuilder(sb2.length() + 2 + str2.length());
                        sb3.append(sb2);
                        sb3.append(": ");
                        sb3.append(str2);
                        e.a = sb3.toString();
                    }
                }
                throw e;
            }
        }
        int i6 = 0;
        while (i6 < i) {
            j = bamtVarArr[i6].b(j, i6 == i + (-1));
            i6++;
        }
        if (this.c != null) {
            return j - r0.intValue();
        }
        bajn bajnVar = this.b;
        if (bajnVar == null) {
            return j;
        }
        int b = bajnVar.b(j);
        long j2 = j - b;
        if (b == this.b.a(j2)) {
            return j2;
        }
        String valueOf = String.valueOf(this.b);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb4.append("Illegal instant due to time zone offset transition (");
        sb4.append(valueOf);
        sb4.append(')');
        String sb5 = sb4.toString();
        if (str != null) {
            StringBuilder sb6 = new StringBuilder(str.length() + 17 + String.valueOf(sb5).length());
            sb6.append("Cannot parse \"");
            sb6.append(str);
            sb6.append("\": ");
            sb6.append(sb5);
            sb5 = sb6.toString();
        }
        throw new bajt(sb5);
    }

    public final void h(Object obj) {
        if (obj instanceof bamu) {
            bamu bamuVar = (bamu) obj;
            if (this != bamuVar.e) {
                return;
            }
            this.b = bamuVar.a;
            this.c = bamuVar.b;
            this.e = bamuVar.c;
            int i = bamuVar.d;
            if (i < this.f) {
                this.g = true;
            }
            this.f = i;
            this.h = obj;
        }
    }
}
