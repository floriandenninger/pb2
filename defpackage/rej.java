package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rej extends rka {
    private String a;
    private Set b;
    private Map c;
    private Long d;
    private Long e;

    public rej(rki rkiVar) {
        super(rkiVar);
    }

    private final ree c(Integer num) {
        if (this.c.containsKey(num)) {
            return (ree) this.c.get(num);
        }
        ree reeVar = new ree(this, this.a);
        this.c.put(num, reeVar);
        return reeVar;
    }

    private final boolean d(int i, int i2) {
        ree reeVar = (ree) this.c.get(Integer.valueOf(i));
        if (reeVar == null) {
            return false;
        }
        return reeVar.a.get(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(26:1|(2:2|(2:4|(2:6|7)(1:527))(2:528|529))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(21:(7:25|26|27|28|(3:30|(1:32)(1:34)|33)|35|(1:38)(1:37))|(1:40)|41|42|43|44|45|46|(3:48|(1:50)|51)(4:472|(6:473|474|475|476|477|(1:480)(1:479))|(1:482)|483)|52|(1:54)(6:302|(4:304|(7:401|402|403|404|405|(1:457)|(3:407|(1:409)|410))|306|307)(1:471)|308|(10:311|(3:315|(4:318|(5:324|325|(1:327)(1:330)|328|329)(3:320|321|322)|323|316)|331)|332|(3:336|(4:339|(3:344|345|346)|347|337)|350)|351|(3:353|(6:356|(2:358|(3:360|361|362))(1:365)|363|364|362|354)|366)|367|(3:376|(8:379|(1:381)|382|(1:384)|385|(3:387|388|389)(1:391)|390|377)|392)|393|309)|399|400)|55|56|(3:195|(4:198|(10:200|201|(1:203)(1:299)|204|(14:206|207|208|209|210|211|212|213|214|215|216|(3:(9:218|219|220|221|222|(3:224|225|226)(1:270)|227|228|(1:231)(1:230))|(1:233)|234)(3:274|275|(1:277))|235|236)(1:298)|237|(4:240|(3:258|259|260)(6:242|243|(2:244|(2:246|(1:248)(2:249|250))(2:256|257))|(1:252)|253|254)|255|238)|261|262|263)(1:300)|264|196)|301)|58|59|(3:61|(6:64|(10:66|67|68|69|70|(1:91)|(8:72|73|74|75|76|(1:78)|79|80)|(1:84)|85|86)|109|(2:110|(2:112|(3:163|164|165)(6:114|(2:115|(4:117|(5:119|(1:121)(1:159)|122|(1:124)(7:147|(1:149)(1:158)|150|(1:152)(1:157)|153|(1:155)|156)|125)(1:160)|126|(1:1)(2:130|(1:132)(2:133|134)))(2:161|162))|(2:139|138)|136|137|138))(0))|166|62)|168)|169|(11:172|(1:174)|175|176|177|178|179|180|(2:182|183)(1:185)|184|170)|193|194)(1:511))|526|42|43|44|45|46|(0)(0)|52|(0)(0)|55|56|(0)|58|59|(0)|169|(1:170)|193|194|(4:(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x09fb, code lost:
    
        r1 = aF().f;
        r7 = defpackage.rfp.a(r64.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0a0b, code lost:
    
        if ((r8.b & 1) == 0) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0a0d, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0a15, code lost:
    
        r1.c("Invalid property filter ID. appId, id", r7, java.lang.String.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0a14, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x02bd, code lost:
    
        if (r5 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x02bf, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x02eb, code lost:
    
        r1 = r12.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x02f7, code lost:
    
        if (r1.hasNext() == false) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x02f9, code lost:
    
        r4 = ((java.lang.Integer) r1.next()).intValue();
        r5 = java.lang.Integer.valueOf(r4);
        r6 = (defpackage.rlf) r12.get(r5);
        r7 = (java.util.List) r0.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0313, code lost:
    
        if (r7 == null) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0319, code lost:
    
        if (r7.isEmpty() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x031d, code lost:
    
        r17 = r0;
        r0 = U().k(r6.c, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x032d, code lost:
    
        if (r0.isEmpty() != false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x03cd, code lost:
    
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x032f, code lost:
    
        r5 = r6.toBuilder();
        r5.copyOnWrite();
        r19 = r1;
        r21 = r8;
        ((defpackage.rlf) r5.instance).c = defpackage.rlf.emptyLongList();
        r5.u(r0);
        r0 = U().k(r6.b, r7);
        r5.copyOnWrite();
        ((defpackage.rlf) r5.instance).b = defpackage.rlf.emptyLongList();
        r5.v(r0);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0368, code lost:
    
        if (r0 >= r6.d.size()) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x037c, code lost:
    
        if (r7.contains(java.lang.Integer.valueOf(((defpackage.rkx) r6.d.get(r0)).c)) == false) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x037e, code lost:
    
        r5.copyOnWrite();
        r1 = (defpackage.rlf) r5.instance;
        r1.a();
        r1.d.remove(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x038d, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0390, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0397, code lost:
    
        if (r0 >= r6.e.size()) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x03ab, code lost:
    
        if (r7.contains(java.lang.Integer.valueOf(((defpackage.rlg) r6.e.get(r0)).c)) == false) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x03ad, code lost:
    
        r5.copyOnWrite();
        r1 = (defpackage.rlf) r5.instance;
        r1.b();
        r1.e.remove(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x03bc, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x03bf, code lost:
    
        r3.put(java.lang.Integer.valueOf(r4), (defpackage.rlf) r5.build());
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x03da, code lost:
    
        r0 = r17;
        r1 = r19;
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x03d1, code lost:
    
        r17 = r0;
        r19 = r1;
        r21 = r8;
        r3.put(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x02c7, code lost:
    
        if (r5 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x02e8, code lost:
    
        if (r5 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0211, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0212, code lost:
    
        r20 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0219, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x021a, code lost:
    
        r20 = "audience_id";
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0215, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0216, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0147, code lost:
    
        if (r5 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0149, code lost:
    
        r5.close();
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0167, code lost:
    
        if (r5 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x08a0, code lost:
    
        if (r10 != null) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x08a2, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x08be, code lost:
    
        if (r10 == null) goto L352;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x01b6 A[Catch: SQLiteException -> 0x0211, all -> 0x0ad8, TRY_ENTER, TryCatch #26 {all -> 0x0ad8, blocks: (B:46:0x01a2, B:48:0x01a8, B:472:0x01b6, B:473:0x01bb, B:475:0x01c5, B:476:0x01d7, B:477:0x01fb, B:492:0x01e4, B:495:0x01f4, B:486:0x021d), top: B:43:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a8 A[Catch: SQLiteException -> 0x0211, all -> 0x0ad8, TRY_LEAVE, TryCatch #26 {all -> 0x0ad8, blocks: (B:46:0x01a2, B:48:0x01a8, B:472:0x01b6, B:473:0x01bb, B:475:0x01c5, B:476:0x01d7, B:477:0x01fb, B:492:0x01e4, B:495:0x01f4, B:486:0x021d), top: B:43:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0adc  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x07e9  */
    /* JADX WARN: Type inference failed for: r4v55, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(java.lang.String r65, java.util.List r66, java.util.List r67, java.lang.Long r68, java.lang.Long r69) {
        /*
            Method dump skipped, instructions count: 2786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rej.a(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // defpackage.rka
    protected final void b() {
    }
}
