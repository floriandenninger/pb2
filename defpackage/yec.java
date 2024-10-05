package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yec implements aaha {
    private final aben a;
    private final Activity b;
    private final ycs c = new ycs();
    private final akht d;

    public yec(aben abenVar, Activity activity, akht akhtVar, byte[] bArr, byte[] bArr2) {
        this.a = abenVar;
        this.b = activity;
        this.d = akhtVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        this.c.show(this.b.getFragmentManager(), ycs.a);
        abeh a = this.a.a();
        YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint = (YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint) apxfVar.pX(YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.ypcCompleteTransactionEndpoint);
        a.w = abeh.i(ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.b);
        a.l(apxfVar.c);
        aben abenVar = this.a;
        akht akhtVar = this.d;
        Activity activity = this.b;
        ycs ycsVar = this.c;
        yfi yfiVar = (yfi) yjj.u(map, "PostTransactionCallback", yfi.class);
        acpl acplVar = (acpl) akhtVar.d.get();
        acplVar.getClass();
        zaw zawVar = (zaw) akhtVar.a.get();
        zawVar.getClass();
        aoae aoaeVar = (aoae) akhtVar.e.get();
        aoaeVar.getClass();
        azrw azrwVar = akhtVar.b;
        acra acraVar = (acra) akhtVar.c.get();
        acraVar.getClass();
        ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.getClass();
        abenVar.d(a, new yeb(acplVar, zawVar, aoaeVar, azrwVar, acraVar, activity, ycsVar, ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint, yfiVar, null, null));
    }
}
