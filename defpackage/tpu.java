package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tpu implements anfz {
    public final /* synthetic */ tqd a;
    private final /* synthetic */ int b;

    public /* synthetic */ tpu(tqd tqdVar, int i) {
        this.b = i;
        this.a = tqdVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = 0;
        switch (this.b) {
            case 0:
                return this.a.e.b();
            case 1:
                tqd tqdVar = this.a;
                SharedPreferences ar = rwh.ar(tqdVar.b, "gms_icing_mdd_manager_metadata", tqdVar.m);
                if (!ar.contains("gms_icing_mdd_reset_trigger")) {
                    SharedPreferences.Editor edit = ar.edit();
                    tqdVar.p.y();
                    edit.putInt("gms_icing_mdd_reset_trigger", 0).commit();
                }
                int i2 = ar.getInt("gms_icing_mdd_reset_trigger", 0);
                tqdVar.p.y();
                if (i2 < 0) {
                    ar.edit().putInt("gms_icing_mdd_reset_trigger", 0).commit();
                    int i3 = tsx.a;
                    tqdVar.c.g(1045);
                    final trf trfVar = tqdVar.f;
                    return anfq.i(anfq.i(trfVar.c.c(), new anfz() { // from class: trc
                        @Override // defpackage.anfz
                        public final anhy a(Object obj2) {
                            final trf trfVar2 = trf.this;
                            List<tlg> list = (List) obj2;
                            ArrayList arrayList = new ArrayList();
                            int i4 = 0;
                            try {
                                for (tlg tlgVar : list) {
                                    arrayList.add(anfq.i(trfVar2.c.e(tlgVar), new tre(trfVar2, tlgVar, i4), trfVar2.k));
                                }
                            } catch (Exception e) {
                                trfVar2.b.a(e, "Failed to cancel all downloads during clear", new Object[0]);
                            }
                            return anaf.H(arrayList).b(new anfy() { // from class: tqr
                                @Override // defpackage.anfy
                                public final anhy a() {
                                    return trf.this.a();
                                }
                            }, trfVar2.k);
                        }
                    }, trfVar.k), new tpu(tqdVar, 2), tqdVar.n);
                }
                return anaf.O(null);
            case 2:
                tqd tqdVar2 = this.a;
                return anfq.i(tqdVar2.g.a(), new tpu(tqdVar2, i), tqdVar2.n);
            case 3:
                return this.a.e.b();
            case 4:
                tqd tqdVar3 = this.a;
                return amkq.n(tqdVar3.g.a(), new tpu(tqdVar3, 3), tqdVar3.n);
            case 5:
                return this.a.e.c();
            case 6:
                tqd tqdVar4 = this.a;
                return amkq.n(tqdVar4.g.d(), new tpu(tqdVar4, 12), tqdVar4.n);
            case 7:
                return this.a.e.f();
            case 8:
                this.a.p.i();
                return anaf.O(-1);
            case 9:
                tqd tqdVar5 = this.a;
                tqdVar5.p.x();
                tqdVar5.c.g(1032);
                tov tovVar = tqdVar5.d;
                return anfq.i(tovVar.d.d(), new tns(tovVar, 6), tovVar.h);
            case 10:
                tqd tqdVar6 = this.a;
                trf trfVar2 = tqdVar6.f;
                SharedPreferences ar2 = rwh.ar(trfVar2.a, "gms_icing_mdd_shared_file_manager_metadata", trfVar2.j);
                if (ar2.contains("migrated_to_new_file_key")) {
                    if (ar2.getBoolean("migrated_to_new_file_key", false)) {
                        rwh.bi(trfVar2.a);
                    }
                    ar2.edit().remove("migrated_to_new_file_key").commit();
                }
                return amkq.n(anaf.O(true), new tpu(tqdVar6, 11), tqdVar6.n);
            case 11:
                tqd tqdVar7 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    return anhv.a;
                }
                tsx.g("%s Failed to init shared file manager.", "MDDManager");
                return tqdVar7.a();
            default:
                tqd tqdVar8 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    return anhv.a;
                }
                tsx.g("%s Failed to init shared file metadata.", "MDDManager");
                return tqdVar8.a();
        }
    }
}
