package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class luj implements ajwv {
    private final ajun a;
    private final ammy b = juz.n;

    public luj(ajun ajunVar) {
        this.a = ajunVar;
    }

    @Override // defpackage.ajwv
    public final /* bridge */ /* synthetic */ void b(Object obj, ajwu ajwuVar) {
        arev arevVar = ((askg) obj).af;
        if (arevVar == null) {
            arevVar = arev.a;
        }
        Iterator it = this.a.b(arevVar).iterator();
        while (it.hasNext()) {
            int i = ((arex) it.next()).b;
            if ((i & 256) != 0 || (i & 1) != 0 || (i & 8192) != 0 || (i & 8) != 0 || (i & 128) != 0 || (i & 512) != 0 || (i & 1024) != 0 || (i & 2) != 0 || (i & 16) != 0 || (i & 64) != 0 || (i & 32) != 0 || (i & 4) != 0) {
                aret aretVar = arevVar.c;
                if (aretVar == null) {
                    aretVar = aret.a;
                }
                if ((aretVar.b & 1) != 0) {
                    aret aretVar2 = arevVar.c;
                    if (aretVar2 == null) {
                        aretVar2 = aret.a;
                    }
                    Object obj2 = aretVar2.e;
                    if (obj2 == null) {
                        obj2 = arey.a;
                    }
                    ajwuVar.a(obj2);
                }
                ajwuVar.a(arevVar);
                return;
            }
        }
    }

    @Override // defpackage.ajwv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ajwv
    public final ammy e() {
        return this.b;
    }
}
