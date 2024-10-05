package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bamh implements bams {
    private final bams[] a;
    private final int b;

    public bamh(bams[] bamsVarArr) {
        int a;
        this.a = bamsVarArr;
        int length = bamsVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.b = i;
                return;
            }
            bams bamsVar = bamsVarArr[length];
            if (bamsVar != null && (a = bamsVar.a()) > i) {
                i = a;
            }
        }
    }

    @Override // defpackage.bams
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bams
    public final int c(bamv bamvVar, String str, int i) {
        int i2;
        int i3;
        bams[] bamsVarArr = this.a;
        int length = bamsVarArr.length;
        Object b = bamvVar.b();
        boolean z = false;
        Object obj = null;
        int i4 = i;
        int i5 = i4;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            bams bamsVar = bamsVarArr[i6];
            if (bamsVar != null) {
                int c = bamsVar.c(bamvVar, str, i);
                if (c >= i) {
                    if (c <= i4) {
                        continue;
                    } else {
                        if (c >= str.length() || (i3 = i6 + 1) >= length || bamsVarArr[i3] == null) {
                            break;
                        }
                        obj = bamvVar.b();
                        i4 = c;
                    }
                } else if (c < 0 && (i2 = c ^ (-1)) > i5) {
                    i5 = i2;
                }
                bamvVar.h(b);
                i6++;
            } else {
                if (i4 <= i) {
                    return i;
                }
                z = true;
            }
        }
        if (i4 <= i && (i4 != i || !z)) {
            return i5 ^ (-1);
        }
        if (obj != null) {
            bamvVar.h(obj);
        }
        return i4;
    }
}
