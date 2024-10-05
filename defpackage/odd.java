package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class odd {
    public static final zgd a = new ocl();

    public static int a(int i) {
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            if (i != 4) {
                if (i == 8) {
                    return 4;
                }
                if (i != 32 && i != 64) {
                    if (i != 128) {
                        return i != 256 ? 0 : 3;
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    public static boolean b(int i, int i2) {
        return ((SparseArray) a.get()).get(i | i2) != null;
    }

    public static obx c(View view, final obp obpVar, final obp obpVar2) {
        final ocu ocuVar = new ocu(false, obpVar, obpVar2);
        obpVar2.K(ocuVar);
        obpVar.K(ocuVar);
        ocu ocuVar2 = new ocu(true, obpVar, obpVar2);
        obpVar2.K(ocuVar2);
        obpVar.K(ocuVar2);
        oco ocoVar = new oco(view.getContext(), obpVar, obpVar2, 0.05f, view.getHeight());
        oco ocoVar2 = new oco(view.getContext(), obpVar, obpVar2, 0.3f, view.getHeight());
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new obw(0.0f, ocuVar));
        arrayList.add(new obw(0.01f, ocuVar2));
        arrayList.add(new obw(0.15f, ocoVar));
        arrayList.add(new obw(1.0f, ocoVar2));
        return new obx(arrayList, new obv() { // from class: oce
            @Override // defpackage.obv
            public final void a() {
                obp obpVar3 = obp.this;
                ocu ocuVar3 = ocuVar;
                obp obpVar4 = obpVar;
                zgd zgdVar = odd.a;
                obpVar3.L(ocuVar3);
                obpVar4.L(ocuVar3);
            }
        });
    }

    public static obx d(int i, obp obpVar, int i2, obp obpVar2, aypn aypnVar) {
        final Runnable runnable;
        obp obpVar3;
        final obp obpVar4 = i2 == 1 ? obpVar : obpVar2;
        final obp obpVar5 = i2 == 1 ? obpVar2 : obpVar;
        final ocv ocvVar = new ocv(obpVar4, obpVar5);
        obpVar4.K(ocvVar);
        obpVar5.K(ocvVar);
        if (i == 2 || i2 == 2) {
            final ocx ocxVar = new ocx(obpVar4);
            obpVar4.K(ocxVar);
            final ayqx X = aypnVar.X(new ocj(ocxVar, 2));
            runnable = new Runnable() { // from class: ocb
                @Override // java.lang.Runnable
                public final void run() {
                    obp obpVar6 = obp.this;
                    ocv ocvVar2 = ocvVar;
                    obp obpVar7 = obpVar5;
                    ocx ocxVar2 = ocxVar;
                    Object obj = X;
                    zgd zgdVar = odd.a;
                    obpVar6.L(ocvVar2);
                    obpVar7.L(ocvVar2);
                    obpVar6.L(ocxVar2);
                    azqb.f((AtomicReference) obj);
                }
            };
            obpVar3 = ocxVar;
        } else {
            obp ocyVar = new ocy(obpVar4);
            runnable = new Runnable() { // from class: oca
                @Override // java.lang.Runnable
                public final void run() {
                    obp obpVar6 = obp.this;
                    ocv ocvVar2 = ocvVar;
                    obp obpVar7 = obpVar5;
                    zgd zgdVar = odd.a;
                    obpVar6.L(ocvVar2);
                    obpVar7.L(ocvVar2);
                }
            };
            obpVar3 = ocyVar;
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new obw(0.0f, obpVar3));
        arrayList.add(new obw(1.0f, ocvVar));
        obx obxVar = new obx(arrayList, new obv() { // from class: oci
            @Override // defpackage.obv
            public final void a() {
                runnable.run();
            }
        });
        if (i2 == 1) {
            return obxVar;
        }
        obxVar.b();
        return obxVar;
    }

    public static obx e(View view, int i, obp obpVar, int i2, obp obpVar2) {
        int a2 = a(i);
        obp obpVar3 = a2 == 2 ? obpVar : obpVar2;
        if (a2 == 2) {
            obpVar = obpVar2;
        }
        Context context = view.getContext();
        if (a2 == 2) {
            i = i2;
        }
        ocn ocnVar = new ocn(context, i, obpVar3, obpVar);
        obpVar3.K(ocnVar);
        obpVar.K(ocnVar);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new obw(0.0f, new ocy(obpVar3)));
        arrayList.add(new obw(1.0f, ocnVar));
        obx obxVar = new obx(arrayList, new occ(obpVar3, ocnVar, obpVar, 0));
        if (a2 == 2) {
            return obxVar;
        }
        obxVar.b();
        return obxVar;
    }

    public static obx f(int i, obp obpVar, final obp obpVar2) {
        if (i == 32) {
            obpVar = obpVar2;
        }
        final oda odaVar = new oda(obpVar);
        obpVar2.K(odaVar);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new obw(0.0f, odaVar));
        arrayList.add(new obw(1.0f, obpVar2));
        return new obx(arrayList, new obv() { // from class: ocf
            @Override // defpackage.obv
            public final void a() {
                obp obpVar3 = obp.this;
                oda odaVar2 = odaVar;
                zgd zgdVar = odd.a;
                obpVar3.L(odaVar2);
            }
        });
    }
}
