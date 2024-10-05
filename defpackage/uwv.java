package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class uwv implements anfz {
    public final /* synthetic */ uwm a;
    public final /* synthetic */ String b;
    public final /* synthetic */ uvi c;
    private final /* synthetic */ int d;

    public /* synthetic */ uwv(uvi uviVar, uwm uwmVar, String str, int i) {
        this.d = i;
        this.c = uviVar;
        this.a = uwmVar;
        this.b = str;
    }

    public /* synthetic */ uwv(uwm uwmVar, String str, uvi uviVar, int i) {
        this.d = i;
        this.a = uwmVar;
        this.b = str;
        this.c = uviVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        String str;
        if (this.d == 0) {
            final uwm uwmVar = this.a;
            String str2 = this.b;
            final uvi uviVar = this.c;
            List<String> list = (List) obj;
            if (!uwmVar.d) {
                list = amru.r("");
            }
            amrp f = amru.f();
            for (final String str3 : list) {
                if (!uxa.c.containsKey(ammw.a(str2, str3))) {
                    if (uwmVar.c) {
                        Context context = uviVar.f;
                        str = uwt.a(context).getString(uwmVar.a, "");
                    } else {
                        str = str3;
                    }
                    final anhy d = uxp.d(uviVar, uwmVar.a, str);
                    f.h(anfq.i(anfq.i(anht.q(d), new uwv(uviVar, uwmVar, str3, 1), uviVar.c()), new anfz() { // from class: uwu
                        @Override // defpackage.anfz
                        public final anhy a(Object obj2) {
                            final uvi uviVar2 = uvi.this;
                            anhy anhyVar = d;
                            final uwm uwmVar2 = uwmVar;
                            final String str4 = str3;
                            final uxq uxqVar = (uxq) anaf.W(anhyVar);
                            if (!uxqVar.c.isEmpty()) {
                                return anfq.i(anht.q(anfq.h(anht.q(uwo.a(uviVar2).a()), new fjz(uwmVar2.a, 17), uviVar2.c())), new anfz() { // from class: uww
                                    @Override // defpackage.anfz
                                    public final anhy a(Object obj3) {
                                        String str5 = str4;
                                        uwm uwmVar3 = uwmVar2;
                                        uvi uviVar3 = uviVar2;
                                        uxq uxqVar2 = uxqVar;
                                        if (!((String) obj3).equals(str5)) {
                                            return anhv.a;
                                        }
                                        if (uxa.c.containsKey(ammw.a(uwmVar3.a, str5))) {
                                            return anhv.a;
                                        }
                                        return uviVar3.e().a(uxqVar2.c);
                                    }
                                }, uviVar2.c());
                            }
                            return anhv.a;
                        }
                    }, uviVar.c()));
                }
            }
            return anaf.H(f.g()).a(gip.o, uviVar.c());
        }
        uvi uviVar2 = this.c;
        uwm uwmVar2 = this.a;
        return uxp.e(uviVar2, uwmVar2.a, this.b, (uxq) obj, uwmVar2.b, uwmVar2.e);
    }
}
