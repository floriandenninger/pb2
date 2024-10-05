package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bame implements bamw, bams {
    public final bamw[] a;
    public final bams[] b;
    private final int c;
    private final int d;

    public bame(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof bame) {
                e(arrayList, ((bame) obj).a);
            } else {
                arrayList.add(obj);
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof bame) {
                e(arrayList2, ((bame) obj2).b);
            } else {
                arrayList2.add(obj2);
            }
        }
        if (arrayList.contains(null) || arrayList.isEmpty()) {
            this.a = null;
            this.c = 0;
        } else {
            int size2 = arrayList.size();
            this.a = new bamw[size2];
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                bamw bamwVar = (bamw) arrayList.get(i3);
                i2 += bamwVar.b();
                this.a[i3] = bamwVar;
            }
            this.c = i2;
        }
        if (arrayList2.contains(null) || arrayList2.isEmpty()) {
            this.b = null;
            this.d = 0;
            return;
        }
        int size3 = arrayList2.size();
        this.b = new bams[size3];
        int i4 = 0;
        for (int i5 = 0; i5 < size3; i5++) {
            bams bamsVar = (bams) arrayList2.get(i5);
            i4 += bamsVar.a();
            this.b[i5] = bamsVar;
        }
        this.d = i4;
    }

    private static final void e(List list, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.bams
    public final int a() {
        return this.d;
    }

    @Override // defpackage.bamw
    public final int b() {
        return this.c;
    }

    @Override // defpackage.bams
    public final int c(bamv bamvVar, String str, int i) {
        bams[] bamsVarArr = this.b;
        if (bamsVarArr == null) {
            throw new UnsupportedOperationException();
        }
        int length = bamsVarArr.length;
        for (int i2 = 0; i2 < length && i >= 0; i2++) {
            i = bamsVarArr[i2].c(bamvVar, str, i);
        }
        return i;
    }

    @Override // defpackage.bamw
    public final void d(StringBuffer stringBuffer, long j, bajf bajfVar, int i, bajn bajnVar, Locale locale) {
        bamw[] bamwVarArr = this.a;
        if (bamwVarArr == null) {
            throw new UnsupportedOperationException();
        }
        Locale locale2 = locale == null ? Locale.getDefault() : locale;
        for (bamw bamwVar : bamwVarArr) {
            bamwVar.d(stringBuffer, j, bajfVar, i, bajnVar, locale2);
        }
    }
}
