package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yfa implements aaha {
    public final zaw a;
    public final ycs b = new ycs();
    public final acpl c;
    public final aahd d;
    public final aoae e;
    private final Activity f;
    private final aaxn g;

    public yfa(Activity activity, aaxn aaxnVar, zaw zawVar, aoae aoaeVar, acpl acplVar, aahd aahdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f = activity;
        this.g = aaxnVar;
        this.a = zawVar;
        this.e = aoaeVar;
        this.c = acplVar;
        this.d = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        arpp arppVar;
        YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand = (YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand) apxfVar.pX(YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.ypcResumeSubscriptionCommand);
        aomf aomfVar = ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.c;
        if (aomfVar.H()) {
            arppVar = null;
        } else {
            yey yeyVar = new yey();
            yeyVar.a = aomfVar;
            arpn a = arpp.a();
            awgd a2 = yeyVar.a();
            a.copyOnWrite();
            ((arpp) a.instance).eH(a2);
            arppVar = (arpp) a.build();
        }
        aaxn aaxnVar = this.g;
        abef abefVar = new abef(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        abefVar.a = ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.b;
        abefVar.l(apxfVar.c);
        this.b.show(this.f.getFragmentManager(), ycs.a);
        aaxn aaxnVar2 = this.g;
        aaxnVar2.b.e(abefVar, new yez(this, aomfVar, arppVar));
    }
}
