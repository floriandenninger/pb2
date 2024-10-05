package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ydx implements aaha {
    public final Activity a;
    public final ajut b;
    public final acra c;
    public final zaw d;
    public final aahd e;
    public final ycs f = new ycs();
    public final acpl g;
    public final aoae h;
    public final aoae i;
    private final aben j;

    public ydx(Activity activity, aben abenVar, ajut ajutVar, acra acraVar, zaw zawVar, aahd aahdVar, aoae aoaeVar, aoae aoaeVar2, acpl acplVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = activity;
        this.j = abenVar;
        this.b = ajutVar;
        this.c = acraVar;
        this.d = zawVar;
        this.e = aahdVar;
        this.h = aoaeVar2;
        this.i = aoaeVar;
        this.g = acplVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        arpp arppVar;
        arpp arppVar2;
        aben abenVar = this.j;
        abeg abegVar = new abeg(abenVar.f, abenVar.c.c(), null, null, null);
        abegVar.l(apxfVar.c);
        YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint = (YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint) apxfVar.pX(YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.ypcCancelRecurrenceEndpoint);
        aomf aomfVar = ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.e;
        List list = null;
        if (aomfVar.H()) {
            arppVar = null;
        } else {
            yey yeyVar = new yey();
            yeyVar.a = aomfVar;
            arpn a = arpp.a();
            awfw d = yeyVar.d();
            a.copyOnWrite();
            ((arpp) a.instance).es(d);
            arppVar = (arpp) a.build();
        }
        if (aomfVar.H()) {
            arppVar2 = null;
        } else {
            yey yeyVar2 = new yey();
            yeyVar2.a = aomfVar;
            yeyVar2.b = 4;
            arpn a2 = arpp.a();
            awfw d2 = yeyVar2.d();
            a2.copyOnWrite();
            ((arpp) a2.instance).ep(d2);
            arppVar2 = (arpp) a2.build();
        }
        ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.getClass();
        abegVar.a = abeg.i(ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.b);
        abegVar.b = abeg.i(ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.c);
        awhh awhhVar = ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.d;
        if (awhhVar == null) {
            awhhVar = awhh.a;
        }
        if (awhhVar.b.isEmpty()) {
            try {
                list = (List) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", List.class);
            } catch (ClassCastException unused) {
            }
            abegVar.d(list);
        } else {
            awhh awhhVar2 = ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.d;
            if (awhhVar2 == null) {
                awhhVar2 = awhh.a;
            }
            abegVar.d(awhhVar2.b);
        }
        awhh awhhVar3 = ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.d;
        if (awhhVar3 == null) {
            awhhVar3 = awhh.a;
        }
        if (!awhhVar3.c.isEmpty()) {
            awhh awhhVar4 = ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.d;
            if (awhhVar4 == null) {
                awhhVar4 = awhh.a;
            }
            aony aonyVar = awhhVar4.c;
            if (aonyVar != null && !aonyVar.isEmpty()) {
                abegVar.c = aonyVar;
            }
        }
        if (apxfVar.pY(aupg.b)) {
            aupf aupfVar = (aupf) apxfVar.pX(aupg.b);
            if (!aupfVar.c.isEmpty()) {
                abegVar.n(aupfVar.c);
            }
        }
        this.f.show(this.a.getFragmentManager(), ycs.a);
        this.j.i.e(abegVar, new ydw(this, arppVar, arppVar2));
    }
}
