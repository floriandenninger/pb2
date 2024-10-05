package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayic implements Runnable {
    final /* synthetic */ ayif a;
    private final aycm b;

    public ayic(ayif ayifVar, aycm aycmVar) {
        this.a = ayifVar;
        aycmVar.getClass();
        this.b = aycmVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(4:17|(1:19)|20|21)(14:57|58|59|60|61|62|(4:65|66|68|63)|96|97|98|(7:100|(6:359|(3:(1:362)|363|(1:367))(2:368|(1:370)(3:371|(5:374|375|(1:386)(4:377|(1:385)(1:381)|382|383)|384|372)|387))|(4:350|351|(1:353)|354)|104|(12:106|107|108|109|(4:112|(3:124|125|126)(3:114|115|(2:117|118)(3:120|121|122))|119|110)|127|128|(14:131|132|133|(2:136|134)|137|138|(5:142|(3:145|(2:147|148)(1:149)|143)|150|151|(2:154|155)(1:153))|286|(5:288|289|(1:296)(1:292)|293|(3:295|151|(0)(0)))|297|(5:301|(3:304|(1:306)(1:307)|302)|308|151|(0)(0))|309|(2:311|(0)(0))(3:312|313|314)|129)|319|(1:157)(1:285)|(3:159|(1:161)(16:165|166|167|(7:255|256|(1:258)|259|(1:263)|264|(1:266)(14:267|(3:270|(1:272)(3:273|274|275)|268)|276|277|(1:254)(2:173|(2:174|(2:176|(1:178)(5:179|180|(1:182)(1:251)|183|(1:185)(0)))(2:252|253)))|(1:187)(2:247|(1:249)(1:250))|188|(10:195|(1:197)(1:245)|198|(1:200)(1:244)|201|202|(1:204)(1:243)|205|(1:207)(4:209|(4:212|(2:217|218)(4:220|221|(4:224|(4:226|(1:228)(1:232)|229|230)(2:233|(2:235|236)(2:237|238))|231|222)|239)|219|210)|241|242)|208)|246|202|(0)(0)|205|(0)(0)|208))|169|(1:171)|254|(0)(0)|188|(11:192|195|(0)(0)|198|(0)(0)|201|202|(0)(0)|205|(0)(0)|208)|246|202|(0)(0)|205|(0)(0)|208)|162)(1:284)|163)(7:330|331|332|333|334|335|336)|164)|102|(0)|104|(0)(0)|164)(1:389)|75|76|(6:78|79|(1:81)(1:83)|82|29|30)(5:84|(1:86)|87|(1:89)|90))|22|23|(1:32)(1:27)|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0676, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0677, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x014a, code lost:
    
        if (r12 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x069e, code lost:
    
        r3 = "Unable to resolve host ".concat(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x06ba, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x06a3, code lost:
    
        r3 = new java.lang.String("Unable to resolve host ");
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b0 A[LOOP:2: B:129:0x0207->B:153:0x02b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02fb A[Catch: all -> 0x05a9, IOException -> 0x05af, TryCatch #27 {IOException -> 0x05af, all -> 0x05a9, blocks: (B:293:0x0276, B:297:0x0282, B:299:0x028a, B:301:0x0290, B:302:0x0294, B:304:0x029a, B:309:0x02a6, B:313:0x02b4, B:314:0x02c8, B:318:0x02cb, B:159:0x02fb, B:161:0x02ff, B:165:0x0307, B:167:0x030d, B:256:0x0311, B:258:0x031e, B:259:0x0325, B:261:0x032b, B:263:0x0333, B:264:0x0344, B:267:0x034c, B:268:0x0355, B:270:0x035b, B:272:0x0368, B:274:0x0389, B:275:0x03b9, B:277:0x03ba, B:171:0x03c6, B:173:0x03cc, B:174:0x03d7, B:176:0x03dd, B:178:0x03eb, B:180:0x03ef, B:182:0x03f5, B:183:0x040e, B:185:0x0418, B:188:0x0478, B:192:0x0483, B:195:0x048c, B:198:0x04a8, B:201:0x04b4, B:202:0x04c3, B:205:0x04da, B:207:0x04e2, B:208:0x058b, B:209:0x04f1, B:210:0x04f7, B:212:0x04fd, B:214:0x0510, B:221:0x0516, B:222:0x051a, B:224:0x0520, B:226:0x053a, B:229:0x0548, B:233:0x0550, B:235:0x0556, B:237:0x0565, B:242:0x0580, B:243:0x04d2, B:247:0x046a, B:249:0x046e, B:250:0x0474, B:253:0x0424, B:280:0x0453, B:283:0x0593, B:285:0x02e0, B:321:0x02e8, B:133:0x0213, B:134:0x021b, B:136:0x0221, B:138:0x0238, B:140:0x0240, B:142:0x0246, B:143:0x024a, B:145:0x0250, B:286:0x0261, B:288:0x0269), top: B:106:0x018f, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04e2 A[Catch: RuntimeException -> 0x0591, all -> 0x05a9, IOException -> 0x05af, TryCatch #1 {RuntimeException -> 0x0591, blocks: (B:167:0x030d, B:188:0x0478, B:192:0x0483, B:195:0x048c, B:198:0x04a8, B:201:0x04b4, B:202:0x04c3, B:205:0x04da, B:207:0x04e2, B:208:0x058b, B:209:0x04f1, B:210:0x04f7, B:212:0x04fd, B:214:0x0510, B:221:0x0516, B:222:0x051a, B:224:0x0520, B:226:0x053a, B:229:0x0548, B:233:0x0550, B:235:0x0556, B:237:0x0565, B:242:0x0580, B:243:0x04d2, B:247:0x046a, B:249:0x046e, B:250:0x0474, B:280:0x0453), top: B:166:0x030d, outer: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04f1 A[Catch: RuntimeException -> 0x0591, all -> 0x05a9, IOException -> 0x05af, TryCatch #1 {RuntimeException -> 0x0591, blocks: (B:167:0x030d, B:188:0x0478, B:192:0x0483, B:195:0x048c, B:198:0x04a8, B:201:0x04b4, B:202:0x04c3, B:205:0x04da, B:207:0x04e2, B:208:0x058b, B:209:0x04f1, B:210:0x04f7, B:212:0x04fd, B:214:0x0510, B:221:0x0516, B:222:0x051a, B:224:0x0520, B:226:0x053a, B:229:0x0548, B:233:0x0550, B:235:0x0556, B:237:0x0565, B:242:0x0580, B:243:0x04d2, B:247:0x046a, B:249:0x046e, B:250:0x0474, B:280:0x0453), top: B:166:0x030d, outer: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04d2 A[Catch: RuntimeException -> 0x0591, all -> 0x05a9, IOException -> 0x05af, TryCatch #1 {RuntimeException -> 0x0591, blocks: (B:167:0x030d, B:188:0x0478, B:192:0x0483, B:195:0x048c, B:198:0x04a8, B:201:0x04b4, B:202:0x04c3, B:205:0x04da, B:207:0x04e2, B:208:0x058b, B:209:0x04f1, B:210:0x04f7, B:212:0x04fd, B:214:0x0510, B:221:0x0516, B:222:0x051a, B:224:0x0520, B:226:0x053a, B:229:0x0548, B:233:0x0550, B:235:0x0556, B:237:0x0565, B:242:0x0580, B:243:0x04d2, B:247:0x046a, B:249:0x046e, B:250:0x0474, B:280:0x0453), top: B:166:0x030d, outer: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x046a A[Catch: RuntimeException -> 0x0591, all -> 0x05a9, IOException -> 0x05af, TryCatch #1 {RuntimeException -> 0x0591, blocks: (B:167:0x030d, B:188:0x0478, B:192:0x0483, B:195:0x048c, B:198:0x04a8, B:201:0x04b4, B:202:0x04c3, B:205:0x04da, B:207:0x04e2, B:208:0x058b, B:209:0x04f1, B:210:0x04f7, B:212:0x04fd, B:214:0x0510, B:221:0x0516, B:222:0x051a, B:224:0x0520, B:226:0x053a, B:229:0x0548, B:233:0x0550, B:235:0x0556, B:237:0x0565, B:242:0x0580, B:243:0x04d2, B:247:0x046a, B:249:0x046e, B:250:0x0474, B:280:0x0453), top: B:166:0x030d, outer: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x05b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x069e A[Catch: all -> 0x0673, TryCatch #11 {all -> 0x0673, blocks: (B:23:0x0657, B:36:0x068c, B:38:0x069e, B:39:0x06a9, B:47:0x06a3), top: B:22:0x0657 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x05f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:409:? A[Catch: all -> 0x0606, Exception -> 0x0609, SYNTHETIC, TRY_LEAVE, TryCatch #19 {all -> 0x0606, blocks: (B:164:0x05cb, B:336:0x05bf, B:71:0x060b, B:73:0x0619, B:74:0x0623, B:95:0x061e, B:405:0x05f8, B:406:0x0605), top: B:57:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x06a3 A[Catch: all -> 0x0673, TryCatch #11 {all -> 0x0673, blocks: (B:23:0x0657, B:36:0x068c, B:38:0x069e, B:39:0x06a9, B:47:0x06a3), top: B:22:0x0657 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0619 A[Catch: all -> 0x0606, IOException -> 0x0681, TryCatch #13 {IOException -> 0x0681, blocks: (B:164:0x05cb, B:336:0x05bf, B:71:0x060b, B:73:0x0619, B:74:0x0623, B:95:0x061e), top: B:57:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0631 A[Catch: all -> 0x0679, IOException -> 0x067d, TRY_LEAVE, TryCatch #25 {IOException -> 0x067d, all -> 0x0679, blocks: (B:76:0x062d, B:78:0x0631, B:84:0x064a, B:86:0x064e, B:87:0x0650, B:89:0x0654), top: B:75:0x062d }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x064a A[Catch: all -> 0x0679, IOException -> 0x067d, TRY_ENTER, TryCatch #25 {IOException -> 0x067d, all -> 0x0679, blocks: (B:76:0x062d, B:78:0x0631, B:84:0x064a, B:86:0x064e, B:87:0x0650, B:89:0x0654), top: B:75:0x062d }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x061e A[Catch: all -> 0x0606, IOException -> 0x0681, TryCatch #13 {IOException -> 0x0681, blocks: (B:164:0x05cb, B:336:0x05bf, B:71:0x060b, B:73:0x0619, B:74:0x0623, B:95:0x061e), top: B:57:0x00ba }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayic.run():void");
    }
}
