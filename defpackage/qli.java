package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qli {
    public final qlm a;
    public final qlh b;
    public final axkl c;
    boolean d;
    public ArrayList e;
    public ArrayList f;
    public ArrayList g;
    public final boolean h;
    public String i;
    public String j;
    public final boolean k;
    public int l;
    public sky m;

    public qli(qlm qlmVar, aomf aomfVar, qlh qlhVar) {
        axkl g = axkm.g();
        this.c = g;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = true;
        this.k = true;
        this.a = qlmVar;
        this.j = qlmVar.j;
        this.i = qlmVar.k;
        this.l = qlmVar.l;
        long currentTimeMillis = System.currentTimeMillis();
        g.copyOnWrite();
        ((axkm) g.instance).v(currentTimeMillis);
        int offset = TimeZone.getDefault().getOffset(((axkm) g.instance).e());
        g.copyOnWrite();
        ((axkm) g.instance).z(offset / 1000);
        if (slf.d(qlmVar.e)) {
            boolean d = slf.d(qlmVar.e);
            g.copyOnWrite();
            ((axkm) g.instance).x(d);
        }
        if (SystemClock.elapsedRealtime() != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g.copyOnWrite();
            ((axkm) g.instance).w(elapsedRealtime);
        }
        if (aomfVar != null) {
            g.copyOnWrite();
            ((axkm) g.instance).y(aomfVar);
        }
        this.b = qlhVar;
    }

    public final int a() {
        return ((axkm) this.c.instance).a();
    }

    public final qoi b() {
        if (this.d) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.d = true;
        return this.a.m.a(this);
    }

    public final void c(int i) {
        axkl axklVar = this.c;
        axklVar.copyOnWrite();
        ((axkm) axklVar.instance).t(i);
    }

    public final void d(long j) {
        axkl axklVar = this.c;
        axklVar.copyOnWrite();
        ((axkm) axklVar.instance).u(j);
    }

    public final void e(String str) {
        if (this.a.g.contains(qll.ACCOUNT_NAME)) {
            this.i = str;
            return;
        }
        throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClearcutLogger.LogEventBuilder[");
        sb.append("uploadAccount: ");
        sb.append(this.i);
        sb.append(", logSourceName: ");
        sb.append(this.j);
        sb.append(", qosTier: ");
        int i = this.l;
        int i2 = i - 1;
        if (i != 0) {
            sb.append(i2);
            sb.append(", loggingId: null, SourceExtensionByteStringProvider: ");
            sb.append(this.b);
            sb.append(", veMessageProducer: ");
            sb.append((Object) null);
            sb.append(", testCodes: ");
            ArrayList arrayList = this.e;
            sb.append(arrayList != null ? qlm.e(arrayList) : null);
            sb.append(", mendelPackages: ");
            ArrayList arrayList2 = this.f;
            sb.append(arrayList2 != null ? qlm.e(arrayList2) : null);
            sb.append(", experimentIds: ");
            ArrayList arrayList3 = this.g;
            sb.append(arrayList3 != null ? qlm.e(arrayList3) : null);
            sb.append(", experimentTokens: null, experimentTokensBytes: ");
            qnw qnwVar = qlm.a;
            sb.append("null, addPhenotype: ");
            sb.append(true);
            sb.append(", logVerifier: ");
            sb.append(this.m);
            sb.append("]");
            return sb.toString();
        }
        throw null;
    }
}
