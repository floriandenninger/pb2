package defpackage;

import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wxo implements wxq {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final Executor e;
    private final azrw f;

    public wxo(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, Executor executor, azrw azrwVar5) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = executor;
        this.f = azrwVar5;
    }

    @Override // defpackage.wxq
    public final wxl a(wxk wxkVar, xgh xghVar) {
        if (xghVar.g(apae.SLOT_TYPE_PLAYER_BYTES, Arrays.asList(xdb.class, xej.class))) {
            return new wxj(wxkVar, (aaea) this.d.get(), (wqg) this.a.get(), (wxw) this.c.get(), xghVar, (ypa) this.b.get(), this.e, (wxc) this.f.get());
        }
        if (xghVar.h(apae.SLOT_TYPE_PLAYER_BYTES, xdj.class)) {
            return wxn.a.a(wxkVar, xghVar);
        }
        throw new wxp("PlayerBytesSlotAdapterFactory received unsupported metadata");
    }
}
