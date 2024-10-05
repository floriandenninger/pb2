package defpackage;

import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xor implements xqm {
    final /* synthetic */ xpa a;
    final /* synthetic */ audq b;
    final /* synthetic */ xos c;

    public xor(xos xosVar, xpa xpaVar, audq audqVar) {
        this.c = xosVar;
        this.a = xpaVar;
        this.b = audqVar;
    }

    @Override // defpackage.xqm
    public final void a(UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction) {
        apyv apyvVar;
        apyx apyxVar = this.a.a().c;
        if (apyxVar == null) {
            apyxVar = apyx.a;
        }
        if (apyxVar.b == 62285947) {
            apyvVar = (apyv) apyxVar.c;
        } else {
            apyvVar = apyv.a;
        }
        this.c.b(apyvVar.i, this.b, updateBackstagePollActionOuterClass$UpdateBackstagePollAction);
    }
}
