package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azve implements azuz {
    public final CharSequence a;
    public final azty b;

    public azve(CharSequence charSequence, azty aztyVar) {
        this.a = charSequence;
        this.b = aztyVar;
    }

    @Override // defpackage.azuz
    public final Iterator a() {
        return new azvd(this);
    }
}
