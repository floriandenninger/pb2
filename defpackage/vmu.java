package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vmu {
    public final vlm a;
    private final anib i;
    private final vli j;
    private final aocx k;
    private final ajoy m;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final aow d = new aow();
    public int e = 0;
    private boolean l = false;
    public boolean f = false;
    public boolean g = true;
    public ammv h = amlr.a;

    public vmu(anib anibVar, vli vliVar, aocx aocxVar, vlm vlmVar, ajoy ajoyVar, byte[] bArr) {
        this.i = anibVar;
        this.j = vliVar;
        this.k = aocxVar;
        this.a = vlmVar;
        this.m = ajoyVar;
    }

    public final synchronized void a() {
        if (this.f) {
            return;
        }
        if (this.g) {
            if (!this.l && this.e > this.b.size()) {
                this.l = true;
                aone createBuilder = aoda.a.createBuilder();
                aocx aocxVar = this.k;
                createBuilder.copyOnWrite();
                aoda aodaVar = (aoda) createBuilder.instance;
                aodaVar.c = aocxVar;
                aodaVar.b = 1 | aodaVar.b;
                vmg z = this.m.z(awzb.OBAKE_GOOGLE_PHOTOS_PAST_PROFILE_PHOTOS);
                z.b();
                if (this.h.h()) {
                    String str = (String) this.h.c();
                    createBuilder.copyOnWrite();
                    aoda aodaVar2 = (aoda) createBuilder.instance;
                    aodaVar2.b |= 2;
                    aodaVar2.d = str;
                }
                anaf.Y(anht.q(this.j.b((aoda) createBuilder.build())), new vmt(this, z), this.i);
            }
        }
    }
}
