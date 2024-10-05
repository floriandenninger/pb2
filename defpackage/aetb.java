package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Exchanger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aetb extends pdk {
    final /* synthetic */ aesy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetb(aesy aesyVar) {
        super(0, null);
        this.a = aesyVar;
    }

    @Override // defpackage.pdk
    protected final void b(pgx pgxVar) {
        boolean z;
        Long l;
        Long l2;
        Exchanger exchanger;
        pgxVar.z(12);
        String q = pgxVar.q();
        pgxVar.q();
        pgxVar.n();
        pgxVar.n();
        pgxVar.n();
        pgxVar.n();
        HashMap hashMap = new HashMap();
        String p = pgxVar.p();
        while (true) {
            z = true;
            if (TextUtils.isEmpty(p)) {
                break;
            }
            List h = amnm.c(": ").h(p);
            if (h.size() >= 2) {
                hashMap.put((String) h.get(0), (String) h.get(1));
            }
            p = pgxVar.p();
        }
        aesh aeshVar = new aesh("http://youtube.com/streaming/metadata/segment/102015", hashMap);
        if (((q.hashCode() == -415751771 && q.equals("http://youtube.com/streaming/metadata/segment/102015")) ? (char) 0 : (char) 65535) != 0) {
            aesy aesyVar = this.a;
            Handler handler = aesyVar.c;
            if (handler == null || aesyVar.d == null) {
                return;
            }
            handler.post(new omm(20));
            return;
        }
        Long c = aeshVar.c("Sequence-Number");
        if (c != null) {
            aesy aesyVar2 = this.a;
            if (aesyVar2.g == null && (exchanger = aesyVar2.f) != null) {
                try {
                    Long valueOf = Long.valueOf(Math.max(c.longValue(), ((Long) exchanger.exchange(c)).longValue()));
                    this.a.g = valueOf;
                    if (!valueOf.equals(c)) {
                        aesy aesyVar3 = this.a;
                        afif afifVar = afif.DEFAULT;
                        long o = this.a.l.o();
                        long longValue = valueOf.longValue() - c.longValue();
                        StringBuilder sb = new StringBuilder(25);
                        sb.append("diff.");
                        sb.append(longValue);
                        aesyVar3.k(afifVar, "manifestless.head.race", o, sb.toString());
                        valueOf.longValue();
                        throw new oyo(new aesx());
                    }
                } catch (InterruptedException e) {
                    throw new oyo(e);
                }
            } else {
                aesyVar2.g = c;
            }
            Long c2 = aeshVar.c("Ingestion-Walltime-Us");
            aesy aesyVar4 = this.a;
            if (aesyVar4.i == null && c2 != null) {
                aesyVar4.i = c2;
            }
            synchronized (aesyVar4) {
                aesy aesyVar5 = this.a;
                if (!"T".equals(aeshVar.d("Stream-Finished"))) {
                    aesy aesyVar6 = this.a;
                    if (!aesyVar6.b || (l = aesyVar6.g) == null || (l2 = aesyVar6.k) == null || !l2.equals(Long.valueOf(l.longValue()))) {
                        z = false;
                    }
                }
                aesyVar5.h = z;
            }
            return;
        }
        throw new oyo("Invalid manifestless sequence number");
    }

    public aetb() {
        super(0, null);
    }
}
