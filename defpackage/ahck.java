package defpackage;

import android.util.Pair;
import j$.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahck {
    public final aesh a;
    public aigl[] b;
    public final /* synthetic */ ahcl c;
    private long d;

    public ahck(ahcl ahclVar, aesh aeshVar) {
        this.c = ahclVar;
        this.a = aeshVar;
    }

    public final long a() {
        long j;
        long j2;
        aesh aeshVar = this.a;
        if (aeshVar != null && this.b == null) {
            j2 = this.c.c;
            this.b = b(aeshVar, j2);
        }
        j = this.c.c;
        return j + this.d;
    }

    public final aigl[] b(aesh aeshVar, long j) {
        List i;
        List i2;
        List i3;
        List i4;
        List list;
        long j2;
        ahck ahckVar = this;
        i = ahcl.i(aeshVar, "Stitched-Video-Id");
        i2 = ahcl.i(aeshVar, "Stitched-Video-Duration-Us");
        i3 = ahcl.i(aeshVar, "Stitched-Video-Cpn");
        i4 = ahcl.i(aeshVar, "Stitched-Video-Start-Time-Within-Ad-Us");
        int size = i.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap = new HashMap();
        long j3 = j;
        int i5 = 0;
        while (i5 < size) {
            try {
                long millis = TimeUnit.MICROSECONDS.toMillis(Long.parseLong((String) i2.get(i5)));
                long millis2 = TimeUnit.MICROSECONDS.toMillis(Long.parseLong((String) i4.get(i5)));
                long j4 = j3;
                try {
                    ahckVar.d += millis;
                    long j5 = j4;
                    long j6 = millis + j5;
                    String str = (String) i3.get(i5);
                    if (linkedHashMap.containsKey(str)) {
                        j5 = ((Long) ((Pair) linkedHashMap.get(str)).first).longValue();
                        linkedHashMap.remove(str);
                    }
                    list = i4;
                    linkedHashMap.put(str, new Pair(Long.valueOf(j5), Long.valueOf(j6)));
                    if (!hashMap.containsKey(str)) {
                        hashMap.put(str, Long.valueOf(j5 - millis2));
                    }
                    j3 = j6;
                } catch (NumberFormatException unused) {
                    j2 = j4;
                    list = i4;
                    j3 = j2;
                    i5++;
                    ahckVar = this;
                    i4 = list;
                }
            } catch (NumberFormatException unused2) {
                list = i4;
                j2 = j3;
            }
            i5++;
            ahckVar = this;
            i4 = list;
        }
        aigl[] aiglVarArr = new aigl[linkedHashMap.size()];
        int i6 = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            aiglVarArr[i6] = new aigl((String) entry.getKey(), ((Long) ((Pair) entry.getValue()).first).longValue(), ((Long) ((Pair) entry.getValue()).second).longValue(), ((Long) Map.EL.getOrDefault(hashMap, entry.getKey(), (Long) ((Pair) entry.getValue()).first)).longValue());
            i6++;
        }
        return aiglVarArr;
    }
}
