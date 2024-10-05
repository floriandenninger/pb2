package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class aitf {
    private final SparseArray a;
    private final boolean b;

    public aitf(TreeMap treeMap, SparseArray sparseArray, String str, boolean z) {
        treeMap.getClass();
        sparseArray.getClass();
        this.a = sparseArray;
        str.getClass();
        this.b = z;
    }

    public final synchronized List a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (!this.b) {
            for (aitd aitdVar : b()) {
                String str = aitdVar.b;
                if (str != null) {
                    arrayList.add(SubtitleTrack.n(new Locale(str).getDisplayName(Locale.getDefault()), "", aitdVar.b));
                }
            }
        } else {
            arrayList.add(SubtitleTrack.n("CC1", "rawcc", "0"));
            arrayList.add(SubtitleTrack.n("CC3", "rawcc", "1"));
        }
        return arrayList;
    }

    public final synchronized List b() {
        return this.b ? (List) this.a.get(1) : (List) this.a.get(2);
    }
}
