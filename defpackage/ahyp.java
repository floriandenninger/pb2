package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahyp {
    public final ahyo a;
    public final TimelineMarker[] b;

    public ahyp(ahyo ahyoVar, List list) {
        ahyoVar.getClass();
        this.a = ahyoVar;
        this.b = new TimelineMarker[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.b[i] = (TimelineMarker) list.get(i);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ahyp)) {
            return false;
        }
        ahyp ahypVar = (ahyp) obj;
        return this.a == ahypVar.a && Arrays.equals(this.b, ahypVar.b);
    }

    public int hashCode() {
        return this.a.hashCode() ^ Arrays.hashCode(this.b);
    }
}
