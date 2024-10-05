package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agrm extends agrl {
    private final List a;

    public agrm(agro agroVar, agrw agrwVar, shf shfVar, SharedPreferences sharedPreferences, aaea aaeaVar, aghr aghrVar, ypa ypaVar) {
        super(agroVar, agrwVar, shfVar, sharedPreferences, aaeaVar, aghrVar, ypaVar);
        this.a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agrl
    public final void f(arxw arxwVar, atqq atqqVar, agsn agsnVar, long j, agnu agnuVar) {
        if (agnuVar == null) {
            return;
        }
        aone builder = atqqVar.toBuilder();
        if (this.a.size() != 0) {
            aone builder2 = arxwVar.toBuilder();
            builder2.copyOnWrite();
            ((arxw) builder2.instance).c = arxw.emptyIntList();
            List list = this.a;
            builder2.copyOnWrite();
            arxw arxwVar2 = (arxw) builder2.instance;
            aonu aonuVar = arxwVar2.c;
            if (!aonuVar.c()) {
                arxwVar2.c = aonm.mutableCopy(aonuVar);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arxwVar2.c.g(((atqf) it.next()).h);
            }
            arxwVar = (arxw) builder2.build();
        }
        super.f(arxwVar, (atqq) builder.build(), agsnVar, j, agnuVar);
    }
}
