package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yat implements aaha {
    public final acqz a;
    public final zaw b;
    public final aahd c;
    public final ycs d = new ycs();
    private final Activity e;
    private final Executor f;
    private final aaxn g;

    public yat(Activity activity, aaxn aaxnVar, acqz acqzVar, zaw zawVar, aahd aahdVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.e = activity;
        this.g = aaxnVar;
        this.a = acqzVar;
        this.b = zawVar;
        this.c = aahdVar;
        this.f = executor;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand ypcGetCancellationFlowCommand$YPCGetCancellationFlowCommand = (YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand) apxfVar.pX(YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.ypcGetCancellationFlowCommand);
        aaxn aaxnVar = this.g;
        abdx abdxVar = new abdx(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        ypcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.getClass();
        abdxVar.a = abdx.i(ypcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.b);
        abdxVar.l(apxfVar.c);
        this.d.show(this.e.getFragmentManager(), ycs.a);
        aaxn aaxnVar2 = this.g;
        ynm.k(aaxnVar2.b.b(abdxVar, angq.a), this.f, new ynk() { // from class: yar
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                yat yatVar = yat.this;
                yatVar.d.dismiss();
                yatVar.b.e(th);
            }
        }, new ynl() { // from class: yas
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                yat yatVar = yat.this;
                arrk arrkVar = (arrk) obj;
                yatVar.d.dismiss();
                yatVar.a.mM().D(new acqx(arrkVar.d));
                aahd aahdVar = yatVar.c;
                apxf apxfVar2 = arrkVar.c;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar.c(apxfVar2, null);
            }
        });
    }
}
