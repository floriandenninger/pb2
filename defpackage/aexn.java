package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aexn implements bdr, aewr {
    private final PlayerConfigModel a;
    private final String b;
    private final FormatStreamModel[] c;
    private final ate e;
    private final bel f;
    private final aewz g;
    private bdu i;
    private final ysy j;
    private final aevc[] k;
    private final afhs l;
    private final Map d = new HashMap();
    private final Map h = new HashMap();

    public aexn(PlayerConfigModel playerConfigModel, FormatStreamModel[] formatStreamModelArr, afhf afhfVar, att attVar, bel belVar, String str, int i, aevc[] aevcVarArr, ysy ysyVar, afhs afhsVar) {
        afki.b(formatStreamModelArr.length > 0);
        for (int i2 = 0; i2 < belVar.d(); i2++) {
            FormatStreamModel formatStreamModel = formatStreamModelArr[belVar.a(i2)];
            boolean L = formatStreamModel.L();
            String str2 = formatStreamModel.e;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 19);
            sb.append("Format ");
            sb.append(str2);
            sb.append(" is not OTF.");
            afki.c(L, sb.toString());
        }
        this.a = playerConfigModel;
        this.b = str;
        ate c = afhfVar.c(afhi.m, str, ammv.i(formatStreamModelArr[0].b));
        this.e = c;
        if (attVar != null) {
            c.b(attVar);
        }
        this.f = belVar;
        this.g = new aewz();
        this.c = formatStreamModelArr;
        this.k = aevcVarArr;
        this.j = ysyVar;
        this.l = afhsVar;
        for (FormatStreamModel formatStreamModel2 : formatStreamModelArr) {
            pms m = formatStreamModel2.m();
            this.d.put(m, new bdm(aedn.c(formatStreamModel2.v(), amsx.r("http://youtube.com/streaming/otf/durations/112015"), this), i, m));
        }
    }

    @Override // defpackage.bdr
    public final int a(long j, List list) {
        return this.f.g(j, list);
    }

    @Override // defpackage.bdr
    public final long b(long j, poi poiVar) {
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x017e A[Catch: all -> 0x0229, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x002f, B:10:0x0033, B:12:0x0048, B:14:0x0058, B:15:0x0062, B:16:0x0065, B:17:0x005d, B:18:0x0066, B:20:0x0072, B:22:0x0082, B:23:0x008c, B:24:0x008f, B:25:0x0087, B:26:0x0090, B:29:0x009e, B:33:0x0157, B:35:0x017e, B:36:0x0223, B:39:0x01c6, B:40:0x00bc, B:42:0x00c2, B:45:0x00c8, B:47:0x00d0, B:49:0x00de, B:54:0x00ee, B:57:0x00f8, B:58:0x011a, B:60:0x0122, B:69:0x012d, B:71:0x0134, B:72:0x0137), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c6 A[Catch: all -> 0x0229, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x002f, B:10:0x0033, B:12:0x0048, B:14:0x0058, B:15:0x0062, B:16:0x0065, B:17:0x005d, B:18:0x0066, B:20:0x0072, B:22:0x0082, B:23:0x008c, B:24:0x008f, B:25:0x0087, B:26:0x0090, B:29:0x009e, B:33:0x0157, B:35:0x017e, B:36:0x0223, B:39:0x01c6, B:40:0x00bc, B:42:0x00c2, B:45:0x00c8, B:47:0x00d0, B:49:0x00de, B:54:0x00ee, B:57:0x00f8, B:58:0x011a, B:60:0x0122, B:69:0x012d, B:71:0x0134, B:72:0x0137), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee A[Catch: all -> 0x0229, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x002f, B:10:0x0033, B:12:0x0048, B:14:0x0058, B:15:0x0062, B:16:0x0065, B:17:0x005d, B:18:0x0066, B:20:0x0072, B:22:0x0082, B:23:0x008c, B:24:0x008f, B:25:0x0087, B:26:0x0090, B:29:0x009e, B:33:0x0157, B:35:0x017e, B:36:0x0223, B:39:0x01c6, B:40:0x00bc, B:42:0x00c2, B:45:0x00c8, B:47:0x00d0, B:49:0x00de, B:54:0x00ee, B:57:0x00f8, B:58:0x011a, B:60:0x0122, B:69:0x012d, B:71:0x0134, B:72:0x0137), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8 A[Catch: all -> 0x0229, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x002f, B:10:0x0033, B:12:0x0048, B:14:0x0058, B:15:0x0062, B:16:0x0065, B:17:0x005d, B:18:0x0066, B:20:0x0072, B:22:0x0082, B:23:0x008c, B:24:0x008f, B:25:0x0087, B:26:0x0090, B:29:0x009e, B:33:0x0157, B:35:0x017e, B:36:0x0223, B:39:0x01c6, B:40:0x00bc, B:42:0x00c2, B:45:0x00c8, B:47:0x00d0, B:49:0x00de, B:54:0x00ee, B:57:0x00f8, B:58:0x011a, B:60:0x0122, B:69:0x012d, B:71:0x0134, B:72:0x0137), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a A[Catch: all -> 0x0229, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x002f, B:10:0x0033, B:12:0x0048, B:14:0x0058, B:15:0x0062, B:16:0x0065, B:17:0x005d, B:18:0x0066, B:20:0x0072, B:22:0x0082, B:23:0x008c, B:24:0x008f, B:25:0x0087, B:26:0x0090, B:29:0x009e, B:33:0x0157, B:35:0x017e, B:36:0x0223, B:39:0x01c6, B:40:0x00bc, B:42:0x00c2, B:45:0x00c8, B:47:0x00d0, B:49:0x00de, B:54:0x00ee, B:57:0x00f8, B:58:0x011a, B:60:0x0122, B:69:0x012d, B:71:0x0134, B:72:0x0137), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    @Override // defpackage.bdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(long r26, long r28, java.util.List r30, defpackage.bdp r31) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexn.c(long, long, java.util.List, bdp):void");
    }

    @Override // defpackage.bdr
    public final void d() {
    }

    @Override // defpackage.bdr
    public final void e(bdn bdnVar) {
    }

    @Override // defpackage.bdr
    public final void f() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((bdm) it.next()).c();
        }
    }

    @Override // defpackage.bdr
    public final synchronized boolean g(bdn bdnVar, boolean z, bfr bfrVar, bfs bfsVar) {
        if (!z) {
            return false;
        }
        affp d = bfsVar.d(aezt.e(this.f), bfrVar);
        if (this.l.Q() && d != null) {
            bel belVar = this.f;
            if (belVar.q(belVar.c(bdnVar.h), d.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bdr
    public final void h() {
    }

    @Override // defpackage.aewr
    public final synchronized void i(aesh aeshVar) {
        if (this.i instanceof aexp) {
            this.h.put(this.i.h, aexq.b(aeshVar));
        }
    }

    @Override // defpackage.aewr
    public final synchronized void j(IOException iOException) {
        this.g.c = iOException;
    }
}
