package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zqx implements zfi {
    public final /* synthetic */ zrs a;
    public final /* synthetic */ zsq b;
    private final /* synthetic */ int c;

    public /* synthetic */ zqx(zrs zrsVar, zsq zsqVar, int i) {
        this.c = i;
        this.a = zrsVar;
        this.b = zsqVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        if (this.c == 0) {
            zrs zrsVar = this.a;
            zrsVar.l = new zqr(this.b, (Map) obj);
            zrsVar.l.b = zrsVar.r;
            return;
        }
        final zrs zrsVar2 = this.a;
        final ztp ztpVar = (ztp) obj;
        zrsVar2.d.add(this.b.c(new zsm() { // from class: zrm
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, zqv] */
            @Override // defpackage.zfi
            public final void a(Object obj2) {
                zrs zrsVar3 = zrs.this;
                ztp ztpVar2 = ztpVar;
                aoae aoaeVar = (aoae) obj2;
                synchronized (zrsVar3.d) {
                    List list = zrsVar3.d;
                    zsq zsqVar = zrsVar3.c;
                    final ?? r9 = new zfi(ztpVar2, aoaeVar, null, null, null) { // from class: zqv
                        public final /* synthetic */ ztp b;
                        public final /* synthetic */ aoae c;

                        @Override // defpackage.zfi
                        public final void a(Object obj3) {
                            zrs zrsVar4 = zrs.this;
                            ztp ztpVar3 = this.b;
                            aoae aoaeVar2 = this.c;
                            List list2 = (List) obj3;
                            if (!zrsVar4.j.h()) {
                                boolean z = false;
                                if (aoaeVar2 != null && aoaeVar2.h(avwy.EFFECTS_FEATURE_KAZOO_OUTPUT_EVENTS)) {
                                    z = true;
                                }
                                zrsVar4.t(list2, ztpVar3, z);
                                return;
                            }
                            zrsVar4.j.d(list2);
                        }
                    };
                    synchronized (((ztd) zsqVar).m) {
                        List list2 = ((ztd) zsqVar).s;
                        if (list2 != null) {
                            r9.a(list2);
                        }
                        wcy.y(((ztd) zsqVar).m, r9);
                    }
                    final ztd ztdVar = (ztd) zsqVar;
                    list.add(new zsk() { // from class: zsx
                        @Override // defpackage.zsk
                        public final void a() {
                            ztd ztdVar2 = ztd.this;
                            zqv zqvVar = r9;
                            synchronized (ztdVar2.m) {
                                ztdVar2.m.remove(zqvVar);
                            }
                        }
                    });
                }
            }
        }));
    }
}
