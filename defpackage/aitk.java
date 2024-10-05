package defpackage;

import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aitk extends wbs {
    final /* synthetic */ HashMap a;

    public aitk(HashMap hashMap) {
        this.a = hashMap;
    }

    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        Integer num = (Integer) this.a.get(attributes.getValue("mimeType"));
        if (num != null) {
            boolean z = true;
            if (num.intValue() == 1 || num.intValue() == 2) {
                aitn a = aitp.a(deque, true);
                aitc b = aitp.b(deque);
                if (a == null || b == null) {
                    return;
                }
                aitd aitdVar = a.b;
                if (!b.c && aitdVar.a != 1) {
                    z = false;
                }
                b.c = z;
                ((List) b.f.get(aitdVar.a)).add(aitdVar);
            }
        }
    }

    @Override // defpackage.wbs
    public final void G(Deque deque, Attributes attributes) {
        aitc b;
        Integer num = (Integer) this.a.get(attributes.getValue("mimeType"));
        if (num != null) {
            if ((num.intValue() == 1 || num.intValue() == 2) && (b = aitp.b(deque)) != null) {
                b.c = num.intValue() == 1;
                deque.push(new aitn(b, ((Integer) b.e.firstKey()).intValue(), new aitd(num.intValue(), attributes.getValue("lang"))));
            }
        }
    }
}
