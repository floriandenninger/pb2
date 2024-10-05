package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wpx implements aapu {
    public final Set a = new HashSet();

    @Override // defpackage.aapu
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((woj) it.next()).i(playerResponseModel);
        }
    }
}
