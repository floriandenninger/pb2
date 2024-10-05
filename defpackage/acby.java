package defpackage;

import android.os.Handler;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acby {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public final acco f;
    public final acco g;
    public final acco h;
    private final Handler i;
    private final Runnable j;
    private final int k;
    private final int l;

    public acby(acco accoVar, acco accoVar2, int i, int i2, acco accoVar3, byte[] bArr, byte[] bArr2) {
        this.g = accoVar;
        this.f = accoVar2;
        this.k = Math.max(100, i);
        this.l = i2 <= 0 ? 10 : i2;
        this.h = accoVar3;
        this.i = new Handler();
        this.j = new Runnable() { // from class: acbx
            /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 220
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.acbx.run():void");
            }
        };
    }

    public final void a() {
        this.i.removeCallbacks(this.j);
    }

    public final void b(String str, String str2) {
        int i = this.e + 1;
        this.e = i;
        int i2 = this.l;
        StringBuilder sb = new StringBuilder(str2.length() + 26);
        sb.append(str2);
        sb.append(" (");
        sb.append(i);
        sb.append("/");
        sb.append(i2);
        sb.append(")");
        Log.e("CaptureMonitor", sb.toString());
        int i3 = this.e;
        if (i3 == this.l) {
            StringBuilder sb2 = new StringBuilder(57);
            sb2.append(i3);
            sb2.append(" consecutive errors found; triggering failure.");
            Log.e("CaptureMonitor", sb2.toString());
            this.d = true;
            a();
            this.h.b(str);
        }
    }

    public final void c() {
        this.i.postDelayed(this.j, this.k);
    }
}
