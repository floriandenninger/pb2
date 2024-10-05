package defpackage;

import java.util.ArrayList;
import java.util.Deque;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aist extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        aiug f;
        aiub aiubVar = (aiub) deque.peekFirst();
        if (aiubVar == null) {
            return;
        }
        aiud aiudVar = aiubVar.g;
        aiue d = aiubVar.d(ahbx.p(attributes, 0, "w"));
        aiuf e = d != null ? d.e : aiubVar.e(ahbx.p(attributes, 0, "wp"));
        if (d != null) {
            f = d.f;
        } else {
            f = aiubVar.f(ahbx.p(attributes, 0, "ws"));
        }
        aiuc aiucVar = new aiuc();
        aiucVar.e = aiudVar;
        aiucVar.a = ahbx.r(attributes, 0L, "t");
        aiucVar.b = ahbx.r(attributes, 0L, "d");
        if (d == null) {
            d = aiue.a;
        }
        aiucVar.c = d;
        aiucVar.d = ahbx.u(attributes, new String[]{"a"});
        aiucVar.f = e;
        aiucVar.g = f;
        aiucVar.h = ahbx.p(attributes, 0, "rc");
        aiucVar.i = ahbx.p(attributes, 0, "cc");
        String a = aiudVar.a();
        String replaceAll = str.replaceAll("\n", "<br/>");
        String b = aiudVar.b();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + String.valueOf(replaceAll).length() + String.valueOf(b).length());
        sb.append(a);
        sb.append(replaceAll);
        sb.append(b);
        aiucVar.k = sb.toString();
        aiuc aiucVar2 = aiubVar.f;
        if (aiucVar2 != null) {
            if (aiucVar2.b == 0) {
                aiucVar2.b = aiucVar.a - aiucVar2.a;
            }
            aiubVar.g(aiucVar2);
        }
        aiubVar.f = aiucVar;
        aiucVar.j = aiubVar.e;
        aiubVar.e = new ArrayList();
        aiubVar.g = aiud.a;
    }

    @Override // defpackage.wbs
    public final void G(Deque deque, Attributes attributes) {
        aiud c;
        aiub aiubVar = (aiub) deque.peekFirst();
        if (aiubVar == null) {
            return;
        }
        aiue d = aiubVar.d(ahbx.p(attributes, 0, "w"));
        String value = attributes.getValue("p");
        if (value != null) {
            c = aiubVar.c(zhq.b(value, 0));
        } else {
            c = d != null ? d.g : aiubVar.c(0);
        }
        aiubVar.g = c;
    }
}
