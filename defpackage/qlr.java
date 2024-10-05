package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qlr extends qpb {
    final /* synthetic */ qls a;
    private final qli b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlr(qls qlsVar, qli qliVar, qof qofVar) {
        super(qlm.a, qofVar);
        this.a = qlsVar;
        this.b = qliVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qom a(Status status) {
        return status;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x062b, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0304, code lost:
    
        defpackage.sla.a = new defpackage.skx(new defpackage.qlm(r3, "COLLECTION_BASIS_VERIFIER", null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0025, code lost:
    
        r4 = defpackage.qlm.c.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x002f, code lost:
    
        if (r4.hasNext() == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0031, code lost:
    
        r0 = ((defpackage.acow) r4.next()).a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x003b, code lost:
    
        if (r0 != null) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x003e, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0701 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05c6 A[Catch: IOException -> 0x0641, TryCatch #11 {IOException -> 0x0641, blocks: (B:165:0x03ce, B:168:0x03da, B:175:0x05c6, B:177:0x05d1, B:179:0x05d7, B:194:0x05df, B:196:0x05e5, B:181:0x05ee, B:190:0x05f4, B:192:0x05fa, B:183:0x0603, B:185:0x061e, B:198:0x05cb, B:200:0x03e1, B:202:0x03e7, B:203:0x03f5, B:205:0x03fd, B:212:0x0416, B:219:0x0433, B:221:0x043b, B:223:0x0441, B:225:0x0455, B:228:0x0459, B:260:0x04cc, B:262:0x04d2, B:233:0x04f2, B:237:0x0507, B:239:0x0511, B:241:0x051b, B:246:0x052b, B:250:0x053a, B:252:0x054c, B:258:0x04ff, B:263:0x0473, B:266:0x047c, B:268:0x0486, B:270:0x0494, B:272:0x0498, B:273:0x049e, B:275:0x04a8, B:276:0x04bc, B:277:0x04c1, B:280:0x04c2, B:282:0x04f7, B:286:0x041e, B:289:0x057c, B:291:0x0582, B:294:0x0588, B:296:0x058e, B:297:0x059c, B:299:0x05ac, B:303:0x05b3, B:305:0x05b8, B:308:0x055a, B:310:0x0560, B:313:0x0568, B:315:0x056e, B:319:0x063b, B:320:0x0640), top: B:164:0x03ce }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05d7 A[Catch: IOException -> 0x0641, TryCatch #11 {IOException -> 0x0641, blocks: (B:165:0x03ce, B:168:0x03da, B:175:0x05c6, B:177:0x05d1, B:179:0x05d7, B:194:0x05df, B:196:0x05e5, B:181:0x05ee, B:190:0x05f4, B:192:0x05fa, B:183:0x0603, B:185:0x061e, B:198:0x05cb, B:200:0x03e1, B:202:0x03e7, B:203:0x03f5, B:205:0x03fd, B:212:0x0416, B:219:0x0433, B:221:0x043b, B:223:0x0441, B:225:0x0455, B:228:0x0459, B:260:0x04cc, B:262:0x04d2, B:233:0x04f2, B:237:0x0507, B:239:0x0511, B:241:0x051b, B:246:0x052b, B:250:0x053a, B:252:0x054c, B:258:0x04ff, B:263:0x0473, B:266:0x047c, B:268:0x0486, B:270:0x0494, B:272:0x0498, B:273:0x049e, B:275:0x04a8, B:276:0x04bc, B:277:0x04c1, B:280:0x04c2, B:282:0x04f7, B:286:0x041e, B:289:0x057c, B:291:0x0582, B:294:0x0588, B:296:0x058e, B:297:0x059c, B:299:0x05ac, B:303:0x05b3, B:305:0x05b8, B:308:0x055a, B:310:0x0560, B:313:0x0568, B:315:0x056e, B:319:0x063b, B:320:0x0640), top: B:164:0x03ce }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05cb A[Catch: IOException -> 0x0641, TryCatch #11 {IOException -> 0x0641, blocks: (B:165:0x03ce, B:168:0x03da, B:175:0x05c6, B:177:0x05d1, B:179:0x05d7, B:194:0x05df, B:196:0x05e5, B:181:0x05ee, B:190:0x05f4, B:192:0x05fa, B:183:0x0603, B:185:0x061e, B:198:0x05cb, B:200:0x03e1, B:202:0x03e7, B:203:0x03f5, B:205:0x03fd, B:212:0x0416, B:219:0x0433, B:221:0x043b, B:223:0x0441, B:225:0x0455, B:228:0x0459, B:260:0x04cc, B:262:0x04d2, B:233:0x04f2, B:237:0x0507, B:239:0x0511, B:241:0x051b, B:246:0x052b, B:250:0x053a, B:252:0x054c, B:258:0x04ff, B:263:0x0473, B:266:0x047c, B:268:0x0486, B:270:0x0494, B:272:0x0498, B:273:0x049e, B:275:0x04a8, B:276:0x04bc, B:277:0x04c1, B:280:0x04c2, B:282:0x04f7, B:286:0x041e, B:289:0x057c, B:291:0x0582, B:294:0x0588, B:296:0x058e, B:297:0x059c, B:299:0x05ac, B:303:0x05b3, B:305:0x05b8, B:308:0x055a, B:310:0x0560, B:313:0x0568, B:315:0x056e, B:319:0x063b, B:320:0x0640), top: B:164:0x03ce }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04f2 A[Catch: IOException -> 0x0641, TryCatch #11 {IOException -> 0x0641, blocks: (B:165:0x03ce, B:168:0x03da, B:175:0x05c6, B:177:0x05d1, B:179:0x05d7, B:194:0x05df, B:196:0x05e5, B:181:0x05ee, B:190:0x05f4, B:192:0x05fa, B:183:0x0603, B:185:0x061e, B:198:0x05cb, B:200:0x03e1, B:202:0x03e7, B:203:0x03f5, B:205:0x03fd, B:212:0x0416, B:219:0x0433, B:221:0x043b, B:223:0x0441, B:225:0x0455, B:228:0x0459, B:260:0x04cc, B:262:0x04d2, B:233:0x04f2, B:237:0x0507, B:239:0x0511, B:241:0x051b, B:246:0x052b, B:250:0x053a, B:252:0x054c, B:258:0x04ff, B:263:0x0473, B:266:0x047c, B:268:0x0486, B:270:0x0494, B:272:0x0498, B:273:0x049e, B:275:0x04a8, B:276:0x04bc, B:277:0x04c1, B:280:0x04c2, B:282:0x04f7, B:286:0x041e, B:289:0x057c, B:291:0x0582, B:294:0x0588, B:296:0x058e, B:297:0x059c, B:299:0x05ac, B:303:0x05b3, B:305:0x05b8, B:308:0x055a, B:310:0x0560, B:313:0x0568, B:315:0x056e, B:319:0x063b, B:320:0x0640), top: B:164:0x03ce }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x052b A[Catch: IOException -> 0x0641, TryCatch #11 {IOException -> 0x0641, blocks: (B:165:0x03ce, B:168:0x03da, B:175:0x05c6, B:177:0x05d1, B:179:0x05d7, B:194:0x05df, B:196:0x05e5, B:181:0x05ee, B:190:0x05f4, B:192:0x05fa, B:183:0x0603, B:185:0x061e, B:198:0x05cb, B:200:0x03e1, B:202:0x03e7, B:203:0x03f5, B:205:0x03fd, B:212:0x0416, B:219:0x0433, B:221:0x043b, B:223:0x0441, B:225:0x0455, B:228:0x0459, B:260:0x04cc, B:262:0x04d2, B:233:0x04f2, B:237:0x0507, B:239:0x0511, B:241:0x051b, B:246:0x052b, B:250:0x053a, B:252:0x054c, B:258:0x04ff, B:263:0x0473, B:266:0x047c, B:268:0x0486, B:270:0x0494, B:272:0x0498, B:273:0x049e, B:275:0x04a8, B:276:0x04bc, B:277:0x04c1, B:280:0x04c2, B:282:0x04f7, B:286:0x041e, B:289:0x057c, B:291:0x0582, B:294:0x0588, B:296:0x058e, B:297:0x059c, B:299:0x05ac, B:303:0x05b3, B:305:0x05b8, B:308:0x055a, B:310:0x0560, B:313:0x0568, B:315:0x056e, B:319:0x063b, B:320:0x0640), top: B:164:0x03ce }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x054c A[Catch: IOException -> 0x0641, TryCatch #11 {IOException -> 0x0641, blocks: (B:165:0x03ce, B:168:0x03da, B:175:0x05c6, B:177:0x05d1, B:179:0x05d7, B:194:0x05df, B:196:0x05e5, B:181:0x05ee, B:190:0x05f4, B:192:0x05fa, B:183:0x0603, B:185:0x061e, B:198:0x05cb, B:200:0x03e1, B:202:0x03e7, B:203:0x03f5, B:205:0x03fd, B:212:0x0416, B:219:0x0433, B:221:0x043b, B:223:0x0441, B:225:0x0455, B:228:0x0459, B:260:0x04cc, B:262:0x04d2, B:233:0x04f2, B:237:0x0507, B:239:0x0511, B:241:0x051b, B:246:0x052b, B:250:0x053a, B:252:0x054c, B:258:0x04ff, B:263:0x0473, B:266:0x047c, B:268:0x0486, B:270:0x0494, B:272:0x0498, B:273:0x049e, B:275:0x04a8, B:276:0x04bc, B:277:0x04c1, B:280:0x04c2, B:282:0x04f7, B:286:0x041e, B:289:0x057c, B:291:0x0582, B:294:0x0588, B:296:0x058e, B:297:0x059c, B:299:0x05ac, B:303:0x05b3, B:305:0x05b8, B:308:0x055a, B:310:0x0560, B:313:0x0568, B:315:0x056e, B:319:0x063b, B:320:0x0640), top: B:164:0x03ce }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05ac A[Catch: IOException -> 0x0641, TryCatch #11 {IOException -> 0x0641, blocks: (B:165:0x03ce, B:168:0x03da, B:175:0x05c6, B:177:0x05d1, B:179:0x05d7, B:194:0x05df, B:196:0x05e5, B:181:0x05ee, B:190:0x05f4, B:192:0x05fa, B:183:0x0603, B:185:0x061e, B:198:0x05cb, B:200:0x03e1, B:202:0x03e7, B:203:0x03f5, B:205:0x03fd, B:212:0x0416, B:219:0x0433, B:221:0x043b, B:223:0x0441, B:225:0x0455, B:228:0x0459, B:260:0x04cc, B:262:0x04d2, B:233:0x04f2, B:237:0x0507, B:239:0x0511, B:241:0x051b, B:246:0x052b, B:250:0x053a, B:252:0x054c, B:258:0x04ff, B:263:0x0473, B:266:0x047c, B:268:0x0486, B:270:0x0494, B:272:0x0498, B:273:0x049e, B:275:0x04a8, B:276:0x04bc, B:277:0x04c1, B:280:0x04c2, B:282:0x04f7, B:286:0x041e, B:289:0x057c, B:291:0x0582, B:294:0x0588, B:296:0x058e, B:297:0x059c, B:299:0x05ac, B:303:0x05b3, B:305:0x05b8, B:308:0x055a, B:310:0x0560, B:313:0x0568, B:315:0x056e, B:319:0x063b, B:320:0x0640), top: B:164:0x03ce }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0168  */
    @Override // defpackage.qpb
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.qlt r31) {
        /*
            Method dump skipped, instructions count: 1964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qlr.c(qlt):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qpb, defpackage.qpc
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        super.n(obj);
    }
}
