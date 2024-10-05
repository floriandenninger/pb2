package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tvu implements Runnable, Delayed {
    final /* synthetic */ tvq a;
    final /* synthetic */ tvx b;

    public tvu() {
    }

    public tvu(tvx tvxVar, tvq tvqVar) {
        this.b = tvxVar;
        this.a = tvqVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return 0;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return 0L;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:285:0x04c2
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04e8 A[Catch: all -> 0x054b, TryCatch #34 {all -> 0x054b, blocks: (B:100:0x04e2, B:102:0x04e8, B:104:0x04f4, B:105:0x04f7, B:113:0x0500, B:115:0x0506, B:117:0x0512, B:119:0x051a, B:121:0x0525, B:122:0x052e, B:125:0x0536, B:87:0x028c, B:88:0x0297, B:91:0x029d, B:92:0x02ae, B:94:0x02b4, B:129:0x02cb, B:132:0x02d9, B:134:0x02f8, B:136:0x030c, B:140:0x031e, B:142:0x0328, B:143:0x0333, B:146:0x033b, B:149:0x034a, B:155:0x0379, B:163:0x0390, B:164:0x0396, B:165:0x0397, B:169:0x03a3, B:174:0x03b1, B:178:0x03c0, B:179:0x03cc, B:180:0x03d7, B:182:0x03df, B:185:0x040b, B:193:0x0418, B:202:0x0443, B:203:0x0446, B:229:0x0461, B:230:0x0467, B:234:0x0450, B:236:0x0456, B:237:0x045d, B:238:0x045e, B:240:0x03e7, B:243:0x03ef, B:245:0x03f3, B:247:0x03fd, B:248:0x0408, B:249:0x0402, B:251:0x0468, B:256:0x0499, B:299:0x032d), top: B:86:0x028c }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0500 A[Catch: all -> 0x054b, TryCatch #34 {all -> 0x054b, blocks: (B:100:0x04e2, B:102:0x04e8, B:104:0x04f4, B:105:0x04f7, B:113:0x0500, B:115:0x0506, B:117:0x0512, B:119:0x051a, B:121:0x0525, B:122:0x052e, B:125:0x0536, B:87:0x028c, B:88:0x0297, B:91:0x029d, B:92:0x02ae, B:94:0x02b4, B:129:0x02cb, B:132:0x02d9, B:134:0x02f8, B:136:0x030c, B:140:0x031e, B:142:0x0328, B:143:0x0333, B:146:0x033b, B:149:0x034a, B:155:0x0379, B:163:0x0390, B:164:0x0396, B:165:0x0397, B:169:0x03a3, B:174:0x03b1, B:178:0x03c0, B:179:0x03cc, B:180:0x03d7, B:182:0x03df, B:185:0x040b, B:193:0x0418, B:202:0x0443, B:203:0x0446, B:229:0x0461, B:230:0x0467, B:234:0x0450, B:236:0x0456, B:237:0x045d, B:238:0x045e, B:240:0x03e7, B:243:0x03ef, B:245:0x03f3, B:247:0x03fd, B:248:0x0408, B:249:0x0402, B:251:0x0468, B:256:0x0499, B:299:0x032d), top: B:86:0x028c }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x01c3 A[Catch: all -> 0x01ad, IOException -> 0x01b0, RuntimeException -> 0x01b2, TryCatch #8 {IOException -> 0x01b0, blocks: (B:312:0x008d, B:316:0x009d, B:318:0x00ab, B:319:0x00b6, B:320:0x00bf, B:321:0x00b0, B:323:0x00c7, B:324:0x00d7, B:326:0x00da, B:330:0x00ee, B:331:0x00e6, B:334:0x00f1, B:335:0x0128, B:339:0x012b, B:341:0x0139, B:342:0x0144, B:343:0x014d, B:344:0x013e, B:347:0x014f, B:348:0x0153, B:350:0x015f, B:351:0x0162, B:353:0x0169, B:360:0x01b9, B:362:0x01c3, B:364:0x01c9, B:365:0x01cc, B:367:0x01da, B:368:0x01e4, B:372:0x01df, B:373:0x01f0, B:374:0x018a, B:376:0x0198, B:377:0x01a3, B:378:0x01ac, B:379:0x019d, B:37:0x01f4, B:39:0x0200, B:41:0x0203, B:69:0x0258, B:76:0x0259, B:78:0x0265, B:79:0x0270, B:83:0x026a), top: B:33:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x01f0 A[Catch: all -> 0x01ad, IOException -> 0x01b0, RuntimeException -> 0x01b2, TRY_ENTER, TryCatch #8 {IOException -> 0x01b0, blocks: (B:312:0x008d, B:316:0x009d, B:318:0x00ab, B:319:0x00b6, B:320:0x00bf, B:321:0x00b0, B:323:0x00c7, B:324:0x00d7, B:326:0x00da, B:330:0x00ee, B:331:0x00e6, B:334:0x00f1, B:335:0x0128, B:339:0x012b, B:341:0x0139, B:342:0x0144, B:343:0x014d, B:344:0x013e, B:347:0x014f, B:348:0x0153, B:350:0x015f, B:351:0x0162, B:353:0x0169, B:360:0x01b9, B:362:0x01c3, B:364:0x01c9, B:365:0x01cc, B:367:0x01da, B:368:0x01e4, B:372:0x01df, B:373:0x01f0, B:374:0x018a, B:376:0x0198, B:377:0x01a3, B:378:0x01ac, B:379:0x019d, B:37:0x01f4, B:39:0x0200, B:41:0x0203, B:69:0x0258, B:76:0x0259, B:78:0x0265, B:79:0x0270, B:83:0x026a), top: B:33:0x008b }] */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v62 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvu.run():void");
    }
}
