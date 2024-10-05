package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abar extends aaru {
    public final List a;

    public abar(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("playlist/get_add_to_playlist", ajoyVar, afsxVar, null, null, null);
        this.a = new ArrayList();
    }

    @Override // defpackage.aaru
    public final /* synthetic */ aoox a() {
        aone createBuilder = arzj.a.createBuilder();
        if (this.a.isEmpty() || !TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(null) && this.a.isEmpty()) {
                createBuilder.copyOnWrite();
                throw null;
            }
        } else {
            List list = this.a;
            createBuilder.copyOnWrite();
            arzj arzjVar = (arzj) createBuilder.instance;
            aony aonyVar = arzjVar.d;
            if (!aonyVar.c()) {
                arzjVar.d = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) list, (List) arzjVar.d);
        }
        createBuilder.copyOnWrite();
        arzj arzjVar2 = (arzj) createBuilder.instance;
        arzjVar2.b |= 4;
        arzjVar2.e = false;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.O(this.a.isEmpty() ^ TextUtils.isEmpty(null), "GetAddToPlaylistServiceRequest must have videoIds XOR playlistId");
    }
}
