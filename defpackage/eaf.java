package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eaf extends eaj {
    public pvg r;

    protected eaf(Context context) {
        super(context);
    }

    public static eaf p(Context context) {
        u(context, true);
        return new eaf(context);
    }

    @Override // defpackage.eaj, defpackage.eae
    protected final aone j(Context context, View view, Activity activity) {
        return null;
    }

    @Override // defpackage.eaj, defpackage.eae
    protected final aone n(Context context, View view, Activity activity) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eaj
    public final List q(ebe ebeVar, Context context, aone aoneVar, dvj dvjVar) {
        ArrayList arrayList = new ArrayList();
        if (ebeVar.b == null) {
            return arrayList;
        }
        arrayList.add(new ebs(ebeVar, aoneVar, ebeVar.a()));
        return arrayList;
    }

    @Override // defpackage.eaj
    protected final void r(ebe ebeVar, Context context, aone aoneVar, dvj dvjVar) {
        if (!ebeVar.l) {
            v(q(ebeVar, context, aoneVar, dvjVar));
            return;
        }
        pvg pvgVar = this.r;
        if (pvgVar != null) {
            String str = pvgVar.a;
            if (!TextUtils.isEmpty(str)) {
                String d = ebg.d(str);
                aoneVar.copyOnWrite();
                dvo dvoVar = (dvo) aoneVar.instance;
                dvo dvoVar2 = dvo.a;
                d.getClass();
                dvoVar.d |= 512;
                dvoVar.ab = d;
                aoneVar.copyOnWrite();
                dvo dvoVar3 = (dvo) aoneVar.instance;
                dvoVar3.ac = 5;
                dvoVar3.d |= 1024;
                boolean z = this.r.b;
                aoneVar.copyOnWrite();
                dvo dvoVar4 = (dvo) aoneVar.instance;
                dvoVar4.d |= 2048;
                dvoVar4.ad = z;
            }
            this.r = null;
        }
    }
}
