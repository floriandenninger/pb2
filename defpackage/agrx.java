package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agrx extends aaru {
    public final aaea a;
    public final List b;
    public long c;
    public long d;
    public int s;
    public float t;

    public agrx(ajoy ajoyVar, afsx afsxVar, aaea aaeaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("offline/playlist_sync_check", ajoyVar, afsxVar, null, null, null);
        this.a = aaeaVar;
        this.b = new ArrayList();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arww.a.createBuilder();
        long j = this.c;
        createBuilder.copyOnWrite();
        arww arwwVar = (arww) createBuilder.instance;
        arwwVar.b |= 2;
        arwwVar.e = j;
        long j2 = this.d;
        createBuilder.copyOnWrite();
        arww arwwVar2 = (arww) createBuilder.instance;
        arwwVar2.b |= 4;
        arwwVar2.f = j2;
        int i = this.s;
        createBuilder.copyOnWrite();
        arww arwwVar3 = (arww) createBuilder.instance;
        arwwVar3.b |= 8;
        arwwVar3.g = i;
        float f = this.t;
        createBuilder.copyOnWrite();
        arww arwwVar4 = (arww) createBuilder.instance;
        arwwVar4.b |= 16;
        arwwVar4.h = f;
        List list = this.b;
        createBuilder.copyOnWrite();
        arww arwwVar5 = (arww) createBuilder.instance;
        aony aonyVar = arwwVar5.d;
        if (!aonyVar.c()) {
            arwwVar5.d = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) list, (List) arwwVar5.d);
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N(this.b.size() > 0);
        amkq.E(this.c >= 0);
        amkq.E(this.d >= 0);
        amkq.E(true);
        float f = this.t;
        amkq.E(f >= 0.0f && f <= 1.0f);
    }
}
