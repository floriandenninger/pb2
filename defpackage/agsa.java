package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agsa extends aaru {
    public final List a;
    public long b;

    public agsa(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("offline/offline_video_playback_position_sync", ajoyVar, afsxVar, null, null, null);
        this.a = new ArrayList();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = atqz.a.createBuilder();
        List list = this.a;
        createBuilder.copyOnWrite();
        atqz atqzVar = (atqz) createBuilder.instance;
        aony aonyVar = atqzVar.d;
        if (!aonyVar.c()) {
            atqzVar.d = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) list, (List) atqzVar.d);
        long j = this.b;
        createBuilder.copyOnWrite();
        atqz atqzVar2 = (atqz) createBuilder.instance;
        atqzVar2.b |= 2;
        atqzVar2.e = j;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.E(this.b >= 0);
        amkq.E(!this.a.isEmpty());
    }
}
