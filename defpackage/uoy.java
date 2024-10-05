package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uoy {
    private static final amxj b = amxj.l("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer");
    private static final amnm c = amnm.b('/');
    private static final Pattern d = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap a = new ConcurrentHashMap();

    static String a(String str) {
        List h = c.h(str);
        if (h.size() != 3) {
            ((amxh) ((amxh) b.c()).i("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "sanitizeSyncName", 55, "HashingNameSanitizer.java")).s("malformed sync name: %s", str);
            return "MALFORMED";
        }
        return (String) h.get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.babe b(defpackage.uox r17, defpackage.babe r18) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uoy.b(uox, babe):babe");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final babe c(babe babeVar) {
        baaz baazVar = babeVar.e;
        if (baazVar == null) {
            baazVar = baaz.a;
        }
        if ((baazVar.b & 1) == 0) {
            return babeVar;
        }
        baaz baazVar2 = babeVar.e;
        if (baazVar2 == null) {
            baazVar2 = baaz.a;
        }
        aone builder = baazVar2.toBuilder();
        Long l = (Long) this.a.get(Long.valueOf(((baaz) builder.instance).c));
        l.getClass();
        aone builder2 = babeVar.toBuilder();
        long longValue = l.longValue();
        builder.copyOnWrite();
        baaz baazVar3 = (baaz) builder.instance;
        baazVar3.b |= 1;
        baazVar3.c = longValue;
        builder2.copyOnWrite();
        babe babeVar2 = (babe) builder2.instance;
        baaz baazVar4 = (baaz) builder.build();
        baazVar4.getClass();
        babeVar2.e = baazVar4;
        babeVar2.b |= 4;
        return (babe) builder2.build();
    }
}
