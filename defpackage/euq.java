package defpackage;

import com.google.protos.youtube.api.innertube.HomeAdsPanelHideCommandOuterClass;
import com.google.protos.youtube.api.innertube.HomeAdsPanelShowCommandOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class euq implements aaha {
    private final mfr a;
    private final /* synthetic */ int b;

    public euq(mfr mfrVar, int i) {
        this.b = i;
        this.a = mfrVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.b != 0) {
            if (this.a != null && apxfVar.pY(HomeAdsPanelHideCommandOuterClass.homeAdsPanelHideCommand)) {
                arem aremVar = (arem) apxfVar.pX(HomeAdsPanelHideCommandOuterClass.homeAdsPanelHideCommand);
                if ((aremVar.b & 1) != 0) {
                    mfr mfrVar = this.a;
                    String str = aremVar.c;
                    aren arenVar = (aren) mfrVar.c.peek();
                    if (arenVar == null || !arenVar.c.equals(str)) {
                        return;
                    }
                    mfrVar.c.pop();
                    if (mfrVar.c.isEmpty()) {
                        mfrVar.a().a.dismiss();
                        return;
                    } else {
                        mfrVar.a().a((aren) mfrVar.c.peek());
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.a != null && apxfVar.pY(HomeAdsPanelShowCommandOuterClass.homeAdsPanelShowCommand)) {
            areo areoVar = (areo) apxfVar.pX(HomeAdsPanelShowCommandOuterClass.homeAdsPanelShowCommand);
            if ((areoVar.b & 1) != 0) {
                mfr mfrVar2 = this.a;
                String str2 = areoVar.c;
                if (mfrVar2.a.containsKey(str2)) {
                    aren arenVar2 = (aren) mfrVar2.a.get(str2);
                    mfrVar2.c.push(arenVar2);
                    if (mfrVar2.c.size() == 1) {
                        mfrVar2.d.a();
                        mfp a = mfrVar2.a();
                        a.a.qh(a.b.getSupportFragmentManager(), null);
                    }
                    mfrVar2.a().a(arenVar2);
                }
            }
        }
    }
}
