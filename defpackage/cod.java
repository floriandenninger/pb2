package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cod extends ContextWrapper {
    static final cos a = new cos();
    public final ctk b;
    public final col c;
    public final List d;
    public final Map e;
    public final csr f;
    public final int g;
    public final amsj h;
    private final cnu i;
    private dbx j;

    public cod(Context context, ctk ctkVar, col colVar, cnu cnuVar, Map map, List list, csr csrVar, amsj amsjVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(context.getApplicationContext());
        this.b = ctkVar;
        this.c = colVar;
        this.i = cnuVar;
        this.d = list;
        this.e = map;
        this.f = csrVar;
        this.h = amsjVar;
        this.g = 4;
    }

    public final synchronized dbx a() {
        if (this.j == null) {
            dbx a2 = this.i.a();
            a2.U();
            this.j = a2;
        }
        return this.j;
    }
}
