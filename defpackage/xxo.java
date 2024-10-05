package defpackage;

import android.content.Intent;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xxo implements ykj {
    final /* synthetic */ xxp a;

    public xxo(xxp xxpVar) {
        this.a = xxpVar;
    }

    @Override // defpackage.ykj
    public final void kD(int i, int i2, Intent intent) {
        if (i == 1800 && i2 == -1) {
            String[] stringArrayExtra = intent.getStringArrayExtra("frontend_ids");
            if (stringArrayExtra != null && stringArrayExtra.length > 0) {
                this.a.aL = stringArrayExtra[0];
            } else {
                this.a.aL = null;
            }
            this.a.aM();
            xxp xxpVar = this.a;
            final yao yaoVar = new yao(xxpVar.aL, xxpVar.ai, xxpVar.as, xxpVar.aj);
            xxn xxnVar = new xxn(this, yaoVar);
            if (this.a.aL != null) {
                yaoVar.i = xxnVar;
                yaoVar.d.c(yaoVar.f);
                yaoVar.h = true;
                yaoVar.g = yaoVar.d.a(yaoVar.e.c());
                ynm.k(yaoVar.g, yaoVar.c, lra.n, new ynl() { // from class: yam
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        yao yaoVar2 = yao.this;
                        List<akzs> list = (List) obj;
                        if (yaoVar2.h && yaoVar2.b == null) {
                            for (akzs akzsVar : list) {
                                if (akzsVar.k.equals(yaoVar2.a)) {
                                    yaoVar2.b = akzsVar.Y;
                                    if (!yaoVar2.b.isEmpty()) {
                                        yaoVar2.i.a(yaoVar2.b);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }
    }
}
