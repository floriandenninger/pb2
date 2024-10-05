package defpackage;

import com.google.protos.youtube.api.innertube.LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aazg extends aasw implements aasm {
    public final afsy a;
    public final aaze b;
    public final aasp c;
    public final aasp g;
    public final aasp h;
    public final aasp i;
    public final aasp j;
    public final aasp k;
    private final aasp l;
    private final Set m;

    public aazg(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, Set set, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.m = set;
        this.b = new aaze(aarmVar, yslVar);
        this.c = c(asav.a, aarmVar, aazd.c, aayn.n);
        this.l = c(artz.a, aarmVar, aazd.e, aayn.i);
        this.g = c(aruc.a, aarmVar, aazd.f, aayn.j);
        this.h = c(aruv.a, aarmVar, aazd.a, aayn.m);
        this.i = c(artx.a, aarmVar, aazd.d, aayn.h);
        this.j = c(arue.a, aarmVar, aaxq.u, aayn.k);
        this.k = c(arug.a, aarmVar, aazd.b, aayn.l);
    }

    @Override // defpackage.aasm
    public final /* bridge */ /* synthetic */ aaru a(ajce ajceVar) {
        aayy e = e();
        e.b = aayy.i(ajceVar.b());
        e.m(ajceVar.d());
        return e;
    }

    @Override // defpackage.aasm
    public final void b(aaru aaruVar, aasl aaslVar, afwx afwxVar) {
        this.b.j((aayy) aaruVar, aaslVar, afwxVar);
    }

    public final aayu d(apxf apxfVar) {
        aayu aayuVar = new aayu(this.f, this.a.c(), null, null, null);
        aayuVar.a = ((LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint) apxfVar.pX(LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.liveChatItemContextMenuEndpoint)).b;
        if ((apxfVar.b & 1) == 0) {
            aayuVar.k();
        } else {
            aayuVar.l(apxfVar.c);
        }
        return aayuVar;
    }

    public final aayy e() {
        return new aayy(this.f, this.a.c(), this.m, null, null, null);
    }

    public final void f(aayu aayuVar, afwx afwxVar) {
        this.l.e(aayuVar, afwxVar);
    }
}
