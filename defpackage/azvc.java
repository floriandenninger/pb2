package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azvc implements azuz {
    public final azuz a;
    public final aztu b;

    public azvc(azuz azuzVar, aztu aztuVar) {
        this.a = azuzVar;
        this.b = aztuVar;
    }

    @Override // defpackage.azuz
    public final Iterator a() {
        return new azvb(this);
    }
}
