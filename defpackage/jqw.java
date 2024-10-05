package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jqw extends agre {
    private final Context e;
    private final boolean f;

    public jqw(Context context, agsn agsnVar, String str, aadw aadwVar) {
        super(context, agsnVar, str);
        this.e = context;
        asvu asvuVar = aadwVar.b().e;
        this.f = (asvuVar == null ? asvu.a : asvuVar).bb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agre, defpackage.agpo
    public final Pair a() {
        if (g()) {
            List k = this.a.m().k();
            arfs arfsVar = null;
            if (k == null || k.isEmpty()) {
                return b(null, Collections.emptyList());
            }
            ArrayList arrayList = new ArrayList(k);
            Collections.sort(arrayList, bea.i);
            int size = arrayList.size();
            String string = this.e.getString(R.string.single_videos_playlist_title);
            String string2 = this.f ? this.e.getString(R.string.single_videos_playlist_subtitle) : null;
            if (this.f) {
                aong aongVar = (aong) arfs.a.createBuilder();
                arfr arfrVar = arfr.OFFLINE_PIN;
                aongVar.copyOnWrite();
                arfs arfsVar2 = (arfs) aongVar.instance;
                arfsVar2.c = arfrVar.pV;
                arfsVar2.b |= 1;
                arfsVar = (arfs) aongVar.build();
            }
            return b(agng.b(size, string, string2, arfsVar), arrayList);
        }
        return super.a();
    }
}
