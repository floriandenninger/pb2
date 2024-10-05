package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acub implements afve {
    private final Set a;
    private final /* synthetic */ int c;

    public acub(TrackingUrlModel trackingUrlModel, int i) {
        this.c = i;
        trackingUrlModel.getClass();
        this.a = trackingUrlModel.d;
    }

    @Override // defpackage.afve
    public final boolean a(asuq asuqVar) {
        if (this.c != 0) {
            return this.a.contains(asuqVar);
        }
        return this.a.contains(asuqVar);
    }

    public acub(asur[] asurVarArr, int i) {
        this.c = i;
        this.a = new HashSet();
        if (asurVarArr != null) {
            for (asur asurVar : asurVarArr) {
                Set set = this.a;
                asuq b = asuq.b(asurVar.c);
                if (b == null) {
                    b = asuq.UNKNOWN;
                }
                set.add(b);
            }
        }
    }
}
