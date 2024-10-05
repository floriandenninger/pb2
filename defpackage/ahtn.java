package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahtn {
    public final List a = new ArrayList();
    public final azqw b = azqy.ap();

    public final void a(amru amruVar) {
        this.a.clear();
        int size = amruVar.size();
        int i = 0;
        while (i < size) {
            ahte ahteVar = (ahte) amruVar.get(i);
            i++;
            if (ahteVar instanceof ahth) {
                this.a.addAll(((ahth) ahteVar).b);
                return;
            }
        }
    }
}
