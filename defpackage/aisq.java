package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisq extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        String s;
        float f;
        aitz aitzVar = (aitz) deque.peekFirst();
        if (aitzVar == null || (s = ahbx.s(attributes, "start")) == null) {
            return;
        }
        int q = ahbx.q(Float.parseFloat(s));
        String[] strArr = {"dur"};
        int i = 0;
        while (true) {
            f = 5.0f;
            if (i > 0) {
                break;
            }
            String value = attributes.getValue(strArr[i]);
            if (value != null) {
                f = zhq.a(value, 5.0f);
                break;
            }
            i++;
        }
        aitzVar.c(0, str.replaceAll("\n", "<br/>"), q, ahbx.q(f) + q);
    }
}
