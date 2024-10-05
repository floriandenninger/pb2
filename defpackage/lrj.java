package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lrj implements aaha {
    public final aahd a;
    public final zaw b;
    private final aavj c;
    private final Executor d;
    private final Context e;
    private final aadw f;

    public lrj(aavj aavjVar, aahd aahdVar, Executor executor, Context context, aadw aadwVar, zaw zawVar) {
        aavjVar.getClass();
        this.c = aavjVar;
        aahdVar.getClass();
        this.a = aahdVar;
        executor.getClass();
        this.d = executor;
        this.e = context;
        aadwVar.getClass();
        this.f = aadwVar;
        zawVar.getClass();
        this.b = zawVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        final UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand updateShareSheetCommandOuterClass$UpdateShareSheetCommand = (UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand) apxfVar.pX(UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.updateShareSheetCommand);
        List aF = wbs.aF(this.e.getPackageManager());
        atej atejVar = this.f.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        apet apetVar = atejVar.m;
        if (apetVar == null) {
            apetVar = apet.a;
        }
        List J2 = ahbx.J(aF, apetVar);
        aavj aavjVar = this.c;
        String str = updateShareSheetCommandOuterClass$UpdateShareSheetCommand.c;
        int bv = aobq.bv(updateShareSheetCommandOuterClass$UpdateShareSheetCommand.d);
        if (bv == 0) {
            bv = 2;
        }
        String str2 = updateShareSheetCommandOuterClass$UpdateShareSheetCommand.e;
        angq angqVar = angq.a;
        aavp aavpVar = new aavp(aavjVar.f, aavjVar.a.c(), null, null, null);
        aavpVar.a = str;
        aavpVar.b = J2;
        aavpVar.d = bv;
        aavpVar.c = str2;
        ynm.k(aavjVar.c(arlc.a, aavjVar.b, aatt.t, aavd.d).b(aavpVar, angqVar), this.d, new ynk() { // from class: lrh
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                lrj lrjVar = lrj.this;
                UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand updateShareSheetCommandOuterClass$UpdateShareSheetCommand2 = updateShareSheetCommandOuterClass$UpdateShareSheetCommand;
                if ((updateShareSheetCommandOuterClass$UpdateShareSheetCommand2.b & 8) == 0) {
                    lrjVar.b.e(th);
                    return;
                }
                aahd aahdVar = lrjVar.a;
                apxf apxfVar2 = updateShareSheetCommandOuterClass$UpdateShareSheetCommand2.f;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar.a(apxfVar2);
            }
        }, new ynl() { // from class: lri
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                lrj lrjVar = lrj.this;
                arlc arlcVar = (arlc) obj;
                if ((arlcVar.b & 4) != 0) {
                    aahd aahdVar = lrjVar.a;
                    apxf apxfVar2 = arlcVar.e;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar.a(apxfVar2);
                }
            }
        });
    }
}
