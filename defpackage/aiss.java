package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiss extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        aiud aiudVar;
        aiub aiubVar = (aiub) deque.peekFirst();
        if (aiubVar == null) {
            return;
        }
        String value = attributes.getValue("p");
        if (value != null) {
            aiudVar = aiubVar.c(zhq.b(value, 0));
        } else {
            aiudVar = aiubVar.g;
        }
        axoe axoeVar = new axoe(null);
        axoeVar.a = ahbx.p(attributes, 0, "t");
        ahbx.p(attributes, 0, "ac");
        String a = aiudVar.a();
        String replaceAll = str.replaceAll("\n", "<br/>");
        String b = aiudVar.b();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + String.valueOf(replaceAll).length() + String.valueOf(b).length());
        sb.append(a);
        sb.append(replaceAll);
        sb.append(b);
        axoeVar.b = sb.toString();
        aiubVar.e.add(axoeVar);
    }
}
