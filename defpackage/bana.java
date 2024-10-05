package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bana implements banj, bani {
    private final banj[] a;
    private final bani[] b;

    public bana(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof banj) {
                if (obj instanceof bana) {
                    d(arrayList, ((bana) obj).a);
                } else {
                    arrayList.add(obj);
                }
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof bani) {
                if (obj2 instanceof bana) {
                    d(arrayList2, ((bana) obj2).b);
                } else {
                    arrayList2.add(obj2);
                }
            }
        }
        if (arrayList.size() <= 0) {
            this.a = null;
        } else {
            this.a = (banj[]) arrayList.toArray(new banj[arrayList.size()]);
        }
        if (arrayList2.size() <= 0) {
            this.b = null;
        } else {
            this.b = (bani[]) arrayList2.toArray(new bani[arrayList2.size()]);
        }
    }

    private static final void d(List list, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.banj
    public final int a(bakb bakbVar) {
        banj[] banjVarArr = this.a;
        int length = banjVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += banjVarArr[length].a(bakbVar);
        }
    }

    @Override // defpackage.banj
    public final int b(bakb bakbVar, int i) {
        banj[] banjVarArr = this.a;
        int length = banjVarArr.length;
        int i2 = 0;
        while (i2 < i) {
            length--;
            if (length < 0) {
                break;
            }
            i2 += banjVarArr[length].b(bakbVar, Integer.MAX_VALUE);
        }
        return i2;
    }

    @Override // defpackage.banj
    public final void c(StringBuffer stringBuffer, bakb bakbVar) {
        for (banj banjVar : this.a) {
            banjVar.c(stringBuffer, bakbVar);
        }
    }
}
