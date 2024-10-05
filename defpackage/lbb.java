package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class lbb implements ajvz {
    public final Activity A;
    public final LoadingFrameLayout B;
    public final acra C;
    public final aaea D;
    public apxf E;
    public asah F;
    public auux G;
    protected asas H;
    public Bundle I;

    /* renamed from: J, reason: collision with root package name */
    public String f232J;
    public laz K;
    public atmc L;
    public final aadw M;

    public abstract void a();

    public abstract void b(String str, String str2);

    public abstract void c(Configuration configuration);

    public abstract void d(String str);

    public void l(Bundle bundle) {
        auux auuxVar = this.G;
        if (auuxVar != null) {
            bundle.putParcelable("innertube_search_filters", amkq.cl(auuxVar));
        }
        asas asasVar = this.H;
        if (asasVar != null) {
            bundle.putByteArray("searchbox_stats", asasVar.toByteArray());
        }
        apxf apxfVar = this.E;
        if (apxfVar != null) {
            bundle.putByteArray("navigation_endpoint", apxfVar.toByteArray());
        }
        bundle.putString("clone_csn", this.C.k());
    }

    public abstract boolean oa();

    @Override // defpackage.ajvz
    public ajxe ph() {
        return new lba(this.F, this.I);
    }

    public final List q() {
        ArrayList arrayList = new ArrayList();
        for (auuv auuvVar : this.G.b) {
            int i = 0;
            while (i < auuvVar.c.size()) {
                auuw auuwVar = (auuw) auuvVar.c.get(i);
                int bq = aobq.bq(auuwVar.d);
                if (bq != 0 && bq == 3) {
                    if (auuvVar.d || i != 0) {
                        arrayList.add(auuwVar.e);
                    } else {
                        i = 0;
                    }
                }
                i++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:3|(1:5)(1:38)|6|(12:33|34|9|10|11|(1:13)|15|(3:17|18|19)|22|(3:24|(1:26)(1:28)|27)|29|(1:31))|8|9|10|11|(0)|15|(0)|22|(0)|29|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        r1.G = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[Catch: aoob -> 0x0059, TRY_LEAVE, TryCatch #0 {aoob -> 0x0059, blocks: (B:11:0x0044, B:13:0x004a), top: B:10:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lbb(com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout r2, android.app.Activity r3, defpackage.acra r4, defpackage.aadw r5, defpackage.aaea r6, android.os.Bundle r7, defpackage.ajxe r8) {
        /*
            r1 = this;
            java.lang.String r0 = "innertube_search_filters"
            r1.<init>()
            r1.B = r2
            r1.A = r3
            r1.C = r4
            r1.M = r5
            r1.D = r6
            r2 = 0
            r1.F = r2
            if (r7 != 0) goto L16
            goto Ld7
        L16:
            java.lang.String r3 = "navigation_endpoint"
            byte[] r3 = r7.getByteArray(r3)
            java.lang.String r4 = "searchbox_stats"
            byte[] r4 = r7.getByteArray(r4)
            if (r3 == 0) goto L29
            apxf r3 = defpackage.aahg.c(r3)
            goto L2a
        L29:
            r3 = r2
        L2a:
            r1.E = r3
            if (r4 == 0) goto L41
            aomw r3 = defpackage.aomw.b()     // Catch: defpackage.aoob -> L3b
            asas r5 = defpackage.asas.a     // Catch: defpackage.aoob -> L3b
            aonm r3 = defpackage.aonm.parseFrom(r5, r4, r3)     // Catch: defpackage.aoob -> L3b
            asas r3 = (defpackage.asas) r3     // Catch: defpackage.aoob -> L3b
            goto L42
        L3b:
            r3 = move-exception
            java.lang.String r4 = "InvalidProtocolBufferException: "
            defpackage.zga.d(r4, r3)
        L41:
            r3 = r2
        L42:
            r1.H = r3
            boolean r3 = r7.containsKey(r0)     // Catch: defpackage.aoob -> L59
            if (r3 == 0) goto L5b
            auux r3 = defpackage.auux.a     // Catch: defpackage.aoob -> L59
            aomw r4 = defpackage.aomw.b()     // Catch: defpackage.aoob -> L59
            aooy r3 = defpackage.amkq.cj(r7, r0, r3, r4)     // Catch: defpackage.aoob -> L59
            auux r3 = (defpackage.auux) r3     // Catch: defpackage.aoob -> L59
            r1.G = r3     // Catch: defpackage.aoob -> L59
            goto L5b
        L59:
            r1.G = r2
        L5b:
            java.lang.String r2 = "navigation_endpoint_interaction_logging_extension"
            byte[] r2 = r7.getByteArray(r2)
            if (r2 == 0) goto L7d
            atmc r3 = defpackage.atmc.a
            aone r3 = r3.createBuilder()
            aomw r4 = defpackage.aomw.b()     // Catch: defpackage.aoob -> L7c
            aoln r2 = r3.mergeFrom(r2, r4)     // Catch: defpackage.aoob -> L7c
            aone r2 = (defpackage.aone) r2     // Catch: defpackage.aoob -> L7c
            aonm r2 = r2.build()     // Catch: defpackage.aoob -> L7c
            atmc r2 = (defpackage.atmc) r2     // Catch: defpackage.aoob -> L7c
            r1.L = r2     // Catch: defpackage.aoob -> L7c
            goto L7d
        L7c:
        L7d:
            atmc r2 = r1.L
            if (r2 == 0) goto Lc9
            aone r2 = r2.toBuilder()
            r2.copyOnWrite()
            aonm r3 = r2.instance
            atmc r3 = (defpackage.atmc) r3
            int r4 = r3.b
            r4 = r4 | 2
            r3.b = r4
            r4 = 22156(0x568c, float:3.1047E-41)
            r3.d = r4
            java.lang.String r3 = "clone_csn"
            java.lang.String r3 = r7.getString(r3)
            if (r3 == 0) goto Lae
            r2.copyOnWrite()
            aonm r4 = r2.instance
            atmc r4 = (defpackage.atmc) r4
            int r5 = r4.b
            r5 = r5 | 32
            r4.b = r5
            r4.f = r3
            goto Lc1
        Lae:
            r2.copyOnWrite()
            aonm r3 = r2.instance
            atmc r3 = (defpackage.atmc) r3
            int r4 = r3.b
            r4 = r4 & (-33)
            r3.b = r4
            atmc r4 = defpackage.atmc.a
            java.lang.String r4 = r4.f
            r3.f = r4
        Lc1:
            aonm r2 = r2.build()
            atmc r2 = (defpackage.atmc) r2
            r1.L = r2
        Lc9:
            java.lang.String r2 = "instance_controller_state"
            android.os.Bundle r3 = r7.getBundle(r2)
            if (r3 == 0) goto Ld7
            android.os.Bundle r2 = r7.getBundle(r2)
            r1.I = r2
        Ld7:
            boolean r2 = r8 instanceof defpackage.lba
            if (r2 != 0) goto Ldc
            return
        Ldc:
            lba r8 = (defpackage.lba) r8
            asah r2 = r8.a
            r1.F = r2
            android.os.Bundle r2 = r8.b
            r1.I = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbb.<init>(com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout, android.app.Activity, acra, aadw, aaea, android.os.Bundle, ajxe):void");
    }
}
