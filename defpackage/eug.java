package defpackage;

import com.google.android.libraries.youtube.ads.model.PlayerAd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eug implements ypd {
    private final aahd a;
    private final PriorityQueue b = new PriorityQueue();
    private long c;
    private boolean d;

    public eug(aahd aahdVar) {
        this.a = aahdVar;
    }

    public final void a() {
        this.b.clear();
        this.c = 0L;
        this.d = false;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        Collection emptyList;
        long round;
        if (i == -1) {
            return new Class[]{xad.class, xag.class, ahef.class, aheg.class};
        }
        if (i == 0) {
            if (((xad) obj).a() == xce.VIDEO_ENDED) {
                while (!this.b.isEmpty()) {
                    this.a.c(((euf) this.b.poll()).b, null);
                }
            }
            a();
            return null;
        }
        if (i != 1) {
            if (i == 2) {
                if (((ahef) obj).c() != aign.VIDEO_REQUESTED) {
                    return null;
                }
                this.d = true;
                return null;
            }
            if (i == 3) {
                aheg ahegVar = (aheg) obj;
                if (this.d) {
                    return null;
                }
                long e = ahegVar.e();
                if (e < this.c) {
                    return null;
                }
                while (!this.b.isEmpty() && e >= ((euf) this.b.peek()).a) {
                    this.a.c(((euf) this.b.poll()).b, null);
                }
                this.c = e;
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        xag xagVar = (xag) obj;
        if (xagVar.a() != xaf.AD_VIDEO_PLAY_REQUESTED) {
            return null;
        }
        a();
        PlayerAd c = xagVar.c();
        if (c == null) {
            return null;
        }
        for (aozf aozfVar : c.A()) {
            long millis = TimeUnit.SECONDS.toMillis(c.c());
            if ((aozfVar.b & 1) != 0) {
                aozg aozgVar = aozfVar.c;
                if (aozgVar == null) {
                    aozgVar = aozg.a;
                }
                int bT = amkq.bT(aozgVar.b);
                if (bT == 0) {
                    bT = 1;
                }
                int i2 = bT - 1;
                if (i2 == 1) {
                    round = Math.round(aozgVar.c * ((float) millis));
                } else if (i2 == 2) {
                    round = aozgVar.d;
                } else {
                    emptyList = Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                if ((aozfVar.b & 2) != 0) {
                    apxf apxfVar = aozfVar.d;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    arrayList.add(new euf(round, apxfVar));
                }
                if ((aozfVar.b & 4) != 0) {
                    apxf apxfVar2 = aozfVar.e;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    arrayList.add(new euf(round, apxfVar2));
                }
                emptyList = amru.o(arrayList);
            } else {
                emptyList = Collections.emptyList();
            }
            this.b.addAll(emptyList);
        }
        return null;
    }
}
