package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dyt {
    final List a = new ArrayList();

    public abstract dyn a(String str, dxk dxkVar, List list);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dyn b(String str) {
        if (this.a.contains(esv.x(str))) {
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
