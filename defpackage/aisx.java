package defpackage;

import java.util.Deque;
import org.chromium.net.PrivateKeyType;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisx extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        aiub aiubVar = (aiub) deque.peekFirst();
        if (aiubVar == null) {
            return;
        }
        aiud aiudVar = new aiud(aiubVar.c(ahbx.p(attributes, 0, "p")));
        aiudVar.b = ahbx.p(attributes, 0, "id");
        aiudVar.c = ahbx.u(attributes, new String[]{"i"});
        aiudVar.d = ahbx.u(attributes, new String[]{"u"});
        aiudVar.e = ahbx.u(attributes, new String[]{"b"});
        aiudVar.f = ahbx.p(attributes, 1, "of");
        aiudVar.g = ahbx.p(attributes, 100, "sz");
        aiudVar.h = ahbx.p(attributes, 0, "et");
        aiudVar.n = ahbx.t(attributes, "#000000", "ec");
        aiudVar.i = ahbx.p(attributes, 0, "fs");
        aiudVar.j = ahbx.t(attributes, "#FFFFFF", "fc");
        aiudVar.k = ahbx.p(attributes, PrivateKeyType.INVALID, "fo");
        aiudVar.l = ahbx.t(attributes, "#000000", "bc");
        aiudVar.m = ahbx.p(attributes, PrivateKeyType.INVALID, "bo");
        aiubVar.a.put(Integer.valueOf(aiudVar.b), aiudVar);
    }
}
