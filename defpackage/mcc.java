package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mcc extends ajxe {
    final ammv a;
    final ammv b;
    final ammv c;
    final aamd d;
    final Parcelable e;
    public final boolean f;
    public final boolean g;
    final aone h;
    public final aone i;

    public mcc(aone aoneVar, ammv ammvVar, ammv ammvVar2, ammv ammvVar3, aamd aamdVar, LinearLayoutManager linearLayoutManager, boolean z, boolean z2, aone aoneVar2, boolean z3, ajpd ajpdVar) {
        if (aoneVar != null && !z3) {
            ArrayList arrayList = new ArrayList(ajpdVar.size());
            ajpdVar.k(arrayList);
            aoneVar.copyOnWrite();
            aqwh aqwhVar = (aqwh) aoneVar.instance;
            aqwh aqwhVar2 = aqwh.a;
            aqwhVar.c = aqwh.emptyProtobufList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof aptg) {
                    aong aongVar = (aong) aulq.a.createBuilder();
                    aongVar.e(ChipCloudRendererOuterClass.chipCloudChipRenderer, (aptg) obj);
                    aoneVar.af(aongVar);
                } else if (obj instanceof apmg) {
                    aong aongVar2 = (aong) aulq.a.createBuilder();
                    aongVar2.e(ButtonRendererOuterClass.buttonRenderer, (apmg) obj);
                    aoneVar.af(aongVar2);
                } else if (obj instanceof aptl) {
                    aong aongVar3 = (aong) aulq.a.createBuilder();
                    aongVar3.e(ChipCloudRendererOuterClass.chipDividerRenderer, (aptl) obj);
                    aoneVar.af(aongVar3);
                }
            }
        }
        this.a = ammvVar;
        this.b = ammvVar2;
        this.c = ammvVar3;
        this.d = aamdVar;
        this.e = linearLayoutManager.P();
        this.h = aoneVar;
        this.f = z;
        this.g = z2;
        this.i = aoneVar2;
    }
}
