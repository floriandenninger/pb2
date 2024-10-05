package defpackage;

import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ype implements ypb {
    private final WeakReference a;
    private final Class b;
    private final Class[] c;
    private final int d;

    public ype(ypd ypdVar, Class cls, Class[] clsArr) {
        this.a = new WeakReference(ypdVar);
        this.b = cls;
        this.c = clsArr;
        this.d = Arrays.hashCode(new Object[]{ypdVar, Integer.valueOf(Arrays.hashCode(clsArr))});
    }

    @Override // defpackage.ypb
    public final void a(Object obj) {
        ypd ypdVar = (ypd) this.a.get();
        if (ypdVar == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        Class cls2 = this.b;
        Class<?>[] clsArr = this.c;
        int length = clsArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (clsArr[i] == cls) {
                    length = i;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        ypdVar.kz(cls2, obj, length);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ype) {
            ype ypeVar = (ype) obj;
            if (ypeVar.a.get() == this.a.get() && Arrays.equals(this.c, ypeVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }
}
