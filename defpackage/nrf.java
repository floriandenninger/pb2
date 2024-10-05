package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nrf {
    public final azrw a;
    public final azrw b;
    public final Map c = new HashMap();
    public nqp d;
    public final aoae e;

    public nrf(azrw azrwVar, azrw azrwVar2, aoae aoaeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.e = aoaeVar;
    }

    public final nrb a(String str) {
        return (nrb) this.c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(String str) {
        return a(str) != null;
    }
}
