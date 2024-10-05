package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdk implements bdo {
    public final bcx[] a;
    private final int[] b;

    public bdk(int[] iArr, bcx[] bcxVarArr) {
        this.b = iArr;
        this.a = bcxVarArr;
    }

    @Override // defpackage.bdo
    public final bjc a(int i, int i2) {
        char c = 0;
        while (true) {
            int[] iArr = this.b;
            if (c > 0) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(i2);
                Log.e("BaseMediaChunkOutput", sb.toString());
                return new big();
            }
            if (i2 == iArr[0]) {
                return this.a[0];
            }
            c = 1;
        }
    }

    public final void b(long j) {
        bcx bcxVar = this.a[0];
        if (bcxVar.f != j) {
            bcxVar.f = j;
            bcxVar.d = true;
        }
    }
}
