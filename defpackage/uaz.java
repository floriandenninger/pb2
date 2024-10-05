package defpackage;

import android.os.Bundle;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uaz extends ubd {
    private static final Charset b = Charset.forName("UTF-8");
    private final uah c;
    private final txa d;

    public uaz(uah uahVar, txa txaVar) {
        this.c = uahVar;
        this.d = txaVar;
    }

    @Override // defpackage.ubd
    public final uag a(Bundle bundle, aoko aokoVar) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        List b2 = this.d.b(string, 4);
        TreeSet treeSet = new TreeSet();
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            treeSet.add(new String(((twz) it.next()).b, b));
        }
        uag c = this.c.c(string, new ArrayList(treeSet), aokoVar);
        if (!c.b() || !c.d) {
            this.d.d(string, b2);
        }
        return c;
    }

    @Override // defpackage.ubd
    protected final String b() {
        return "DeleteUserSubscriptionCallback";
    }

    @Override // defpackage.udr
    public final String f() {
        return "RPC_DELETE_USER_SUBSCRIPTION";
    }
}
