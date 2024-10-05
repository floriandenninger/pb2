package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeht {
    public final aesn a;
    private final boolean b;
    private final boolean c;
    private final Handler d = new Handler(Looper.getMainLooper());

    public aeht(aesn aesnVar, boolean z, boolean z2) {
        this.a = aesnVar;
        this.b = z;
        this.c = z2;
    }

    private final void b(final String str, final afgj afgjVar) {
        this.d.post(new Runnable() { // from class: aehp
            @Override // java.lang.Runnable
            public final void run() {
                aeht aehtVar = aeht.this;
                aehtVar.a.i(str, afgjVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(aehn aehnVar) {
        if (this.b) {
            aenk aenkVar = aehnVar.i;
            long j = aenkVar.b;
            if (j > 0) {
                int i = aehnVar.a;
                int i2 = aenkVar.c;
                StringBuilder sb = new StringBuilder(54);
                sb.append("rn.");
                sb.append(i);
                sb.append(";bw.");
                sb.append(j);
                sb.append(";src.");
                sb.append(i2);
                b("bwinfo", new aeqs(sb.toString()));
            }
        }
        if (this.b) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rn.");
            sb2.append(aehnVar.a);
            sb2.append(";rt.");
            sb2.append(aehnVar.j);
            long j2 = aehnVar.i.b;
            if (j2 > 0) {
                long j3 = aehnVar.e;
                if (j3 > 0) {
                    sb2.append(";pt.");
                    sb2.append((j3 * 8000) / j2);
                    sb2.append(";ps.");
                    sb2.append(aehnVar.e);
                }
            }
            if (aehnVar.d > 0) {
                sb2.append(";pmd.");
                sb2.append(aehnVar.d);
            }
            if (aehnVar.k > 0) {
                sb2.append(";ct.");
                sb2.append(aehnVar.k);
            }
            if (aehnVar.l != null) {
                sb2.append(";ec.");
                sb2.append(aehnVar.l);
            }
            b("rqs", new aehq(sb2.toString(), aehnVar.b + aehnVar.j));
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < aehnVar.c.length()) {
                int i4 = aehnVar.a;
                StringBuilder sb3 = aehnVar.c;
                int i5 = i3 + 260;
                String substring = sb3.substring(i3, Math.min(i5, sb3.length()));
                StringBuilder sb4 = new StringBuilder(String.valueOf(substring).length() + 33);
                sb4.append("rn.");
                sb4.append(i4);
                sb4.append(";idx.");
                sb4.append(i3 / 260);
                sb4.append(";d.");
                sb4.append(substring);
                b("rqd", new aeqs(sb4.toString()));
                i3 = i5;
            }
        }
    }
}
