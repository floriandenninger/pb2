package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdt implements Runnable {
    private static final String b = ajbh.S("EnqueueRunnable");
    public final bzp a = new bzp();
    private final bzu c;

    public cdt(bzu bzuVar) {
        this.c = bzuVar;
    }

    private static void a(cda cdaVar) {
        byo byoVar = cdaVar.k;
        String str = cdaVar.d;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (byoVar.d || byoVar.e) {
            HashMap hashMap = new HashMap();
            bxw.b(cdaVar.f.b, hashMap);
            bxw.d("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str, hashMap);
            cdaVar.d = ConstraintTrackingWorker.class.getName();
            cdaVar.f = bxw.a(hashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ff A[Catch: all -> 0x0398, TryCatch #4 {all -> 0x0398, blocks: (B:43:0x0366, B:88:0x01f5, B:89:0x01f9, B:91:0x01ff, B:95:0x020d, B:96:0x022c, B:98:0x0232, B:100:0x0238, B:101:0x0267, B:104:0x0271, B:107:0x0298, B:109:0x02a1, B:111:0x02a5, B:114:0x02cd, B:117:0x02da, B:118:0x02df, B:120:0x02e0, B:121:0x02ea, B:123:0x02f0, B:126:0x0317, B:129:0x031e, B:130:0x0323, B:133:0x0326, B:136:0x0347, B:141:0x034e, B:142:0x0353, B:146:0x035c, B:147:0x0363, B:153:0x023c, B:157:0x0244, B:158:0x024e, B:160:0x0254, B:163:0x0264, B:170:0x0214, B:171:0x0218, B:172:0x021d, B:174:0x0225, B:175:0x0228, B:184:0x014c, B:186:0x0152, B:187:0x0159, B:194:0x0176, B:196:0x017e, B:199:0x0188, B:202:0x0195, B:213:0x01a4, B:214:0x01aa, B:215:0x0156, B:223:0x01bb, B:224:0x01c7, B:226:0x01cd, B:228:0x01d9, B:229:0x01de, B:189:0x0165, B:191:0x016b, B:113:0x02c3, B:106:0x0288, B:135:0x033d, B:125:0x030d), top: B:183:0x014c, inners: #1, #5, #6, #9, #10 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdt.run():void");
    }
}
