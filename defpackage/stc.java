package defpackage;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class stc implements sym {
    private final syd a;
    private final Map b;
    private final Map c;
    private final boolean d;

    public stc(Map map, Map map2, ammv ammvVar, syd sydVar) {
        this.a = sydVar;
        this.d = ((Boolean) ammvVar.e(false)).booleanValue();
        amrw amrwVar = new amrw();
        for (Map.Entry entry : ((amrz) map).entrySet()) {
            amrwVar.g(189078944, (sgf) entry.getValue());
        }
        amrw amrwVar2 = new amrw();
        for (Map.Entry entry2 : ((amrz) map2).entrySet()) {
            amrwVar2.g(Integer.valueOf(((syz) ((Pair) entry2.getValue()).first).a().a()), (Pair) entry2.getValue());
        }
        this.b = amrwVar.c();
        this.c = amrwVar2.c();
    }

    private static void d(sxc sxcVar, dit ditVar) {
        Map map = sxcVar.i;
        if (map != null) {
            map.put(ditVar, true);
        }
    }

    @Override // defpackage.sym
    public final int a() {
        return 168774549;
    }

    @Override // defpackage.sym
    public final /* synthetic */ aoam b(ByteBuffer byteBuffer) {
        return axpc.aJ(byteBuffer);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0279 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d0  */
    @Override // defpackage.syn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void c(defpackage.dhe r24, defpackage.sxc r25, java.lang.String r26, java.lang.Object r27, defpackage.sxs r28, defpackage.swt r29) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stc.c(dhe, sxc, java.lang.String, java.lang.Object, sxs, swt):void");
    }

    @Override // defpackage.syn
    public final void e(sxs sxsVar) {
        dgy a = sxsVar.a();
        a.p(1.0f);
        a.s(true);
    }
}
