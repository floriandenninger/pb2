package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acpo implements Runnable {
    final /* synthetic */ cnq a;
    final /* synthetic */ acpq b;

    public acpo(acpq acpqVar, cnq cnqVar) {
        this.b = acpqVar;
        this.a = cnqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aone a = this.b.a.a();
        ArrayList arrayList = new ArrayList();
        for (aone aoneVar : this.b.b) {
            arpn a2 = arpp.a();
            try {
                a2.m22mergeFrom(((ovz) aoneVar.instance).e, aomw.b());
                if (!this.b.f.b.d.contains(((arpp) a2.instance).b())) {
                    arrayList.add((arpp) a2.build());
                }
            } catch (aoob e) {
                this.b.f.e(String.valueOf(getClass().getCanonicalName()).concat(" could not deserialize ClientEvent when retryOnError."), e);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        a.copyOnWrite();
        arpr arprVar = (arpr) a.instance;
        arpr arprVar2 = arpr.a;
        arprVar.f = arpr.emptyProtobufList();
        a.aj(arrayList);
        arpr arprVar3 = (arpr) a.build();
        acpq acpqVar = this.b;
        String str = acpqVar.c;
        afsg afsgVar = acpqVar.d;
        String str2 = afsgVar.a;
        boolean z = afsgVar.b;
        aone aoneVar2 = null;
        if (!TextUtils.isEmpty(str) && arprVar3 != null) {
            aoneVar2 = ovz.a.createBuilder();
            aomf byteString = arprVar3.toByteString();
            aoneVar2.copyOnWrite();
            ovz ovzVar = (ovz) aoneVar2.instance;
            ovzVar.b |= 4;
            ovzVar.e = byteString;
            aoneVar2.copyOnWrite();
            ovz ovzVar2 = (ovz) aoneVar2.instance;
            ovzVar2.b |= 2;
            ovzVar2.d = "event_logging_fixed_batch_retry";
            aoneVar2.copyOnWrite();
            ovz ovzVar3 = (ovz) aoneVar2.instance;
            str.getClass();
            ovzVar3.b |= 16;
            ovzVar3.g = str;
            if (!TextUtils.isEmpty(str2)) {
                aoneVar2.copyOnWrite();
                ovz ovzVar4 = (ovz) aoneVar2.instance;
                str2.getClass();
                ovzVar4.b |= 128;
                ovzVar4.j = str2;
            }
            aoneVar2.copyOnWrite();
            ovz ovzVar5 = (ovz) aoneVar2.instance;
            ovzVar5.b |= 256;
            ovzVar5.k = z;
        }
        if (aoneVar2 != null) {
            this.b.f.d("Store back to delayeEventService for retrying.");
            acpr acprVar = this.b.f;
            acprVar.c.g(acprVar.a(), new ArrayList(Arrays.asList(aoneVar2)), this.a);
        }
    }
}
