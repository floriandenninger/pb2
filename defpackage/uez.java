package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uez {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public Object b;
    public final tyo c;

    public uez(tyo tyoVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = tyoVar;
    }

    public final void a(ueu ueuVar, Object obj) {
        if (obj == null) {
            return;
        }
        ues a = ueuVar.a(obj);
        a.a.add(this.c);
    }
}
