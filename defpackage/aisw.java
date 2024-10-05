package defpackage;

import java.util.Deque;
import org.chromium.net.PrivateKeyType;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisw extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        aiub aiubVar = (aiub) deque.peekFirst();
        if (aiubVar == null) {
            return;
        }
        int p = ahbx.p(attributes, 0, "ws");
        aiug aiugVar = p != 0 ? new aiug(aiubVar.f(p)) : new aiug();
        aiugVar.b = ahbx.p(attributes, 0, "id");
        aiugVar.c = ahbx.p(attributes, 0, "mh");
        aiugVar.d = ahbx.p(attributes, 2, "ju");
        aiugVar.e = ahbx.p(attributes, 0, "pd");
        aiugVar.f = ahbx.p(attributes, 3, "sd");
        aiugVar.g = ahbx.p(attributes, 0, "wfc");
        aiugVar.h = ahbx.p(attributes, PrivateKeyType.INVALID, "wfo");
        aiugVar.i = ahbx.p(attributes, 0, "wbt");
        aiugVar.j = ahbx.p(attributes, 16777215, "wbc");
        aiubVar.b.put(Integer.valueOf(aiugVar.b), aiugVar);
    }
}
