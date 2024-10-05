package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisl {
    public final ScheduledExecutorService a;
    public final FormatStreamModel b;
    public final TreeMap c;
    public final String d;
    public final aixm e;
    public final aidl f;
    public final aitq g;
    public final String h;
    public Future i;
    public Long j;
    public boolean k;
    public final Long l;
    public final Long m;
    public final banw n;

    public aisl(String str, ScheduledExecutorService scheduledExecutorService, FormatStreamModel formatStreamModel, String str2, aixm aixmVar, zfi zfiVar, aidl aidlVar, banw banwVar, Long l, Long l2) {
        aitq aitrVar;
        this.h = str;
        this.b = formatStreamModel;
        this.a = scheduledExecutorService;
        this.d = str2;
        this.e = aixmVar;
        int e = formatStreamModel.e();
        if (e != 386) {
            aitrVar = e != 387 ? null : new aits(zfiVar);
        } else {
            aitrVar = new aitr(zfiVar);
        }
        this.g = aitrVar;
        this.f = aidlVar;
        this.n = banwVar;
        this.l = l;
        this.m = l2;
        this.c = new TreeMap();
        this.i = null;
        this.j = null;
        this.k = false;
    }

    public final Long a(long j) {
        TreeMap treeMap = this.c;
        Long valueOf = Long.valueOf(j);
        Map.Entry floorEntry = treeMap.floorEntry(valueOf);
        Map.Entry ceilingEntry = this.c.ceilingEntry(valueOf);
        if (floorEntry == null && ceilingEntry == null) {
            floorEntry = null;
        } else if (floorEntry == null || (ceilingEntry != null && j - ((Long) floorEntry.getKey()).longValue() >= ((Long) ceilingEntry.getKey()).longValue() - j)) {
            floorEntry = ceilingEntry;
        }
        if (floorEntry == null) {
            return null;
        }
        Pair pair = (Pair) floorEntry.getValue();
        return Long.valueOf(((float) ((Long) pair.first).longValue()) + (((float) (j - ((Long) floorEntry.getKey()).longValue())) / ((Integer) pair.second).intValue()));
    }

    public final synchronized void b() {
        this.c.clear();
        Future future = this.i;
        if (future != null && !future.isDone()) {
            this.i.cancel(true);
        }
        this.i = null;
        this.j = null;
        this.k = false;
    }

    public final boolean c() {
        return this.f != null;
    }
}
