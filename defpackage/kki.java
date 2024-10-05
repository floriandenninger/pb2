package defpackage;

import android.graphics.PointF;
import android.view.View;
import com.google.android.libraries.youtube.player.features.markers.HeatMarkerView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kki implements Consumer {
    public final /* synthetic */ kkl a;
    private final /* synthetic */ int b;

    public /* synthetic */ kki(kkl kklVar, int i) {
        this.b = i;
        this.a = kklVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            ahtg ahtgVar = (ahtg) obj;
            yzr yzrVar = this.a.k;
            if (yzrVar != null) {
                ((HeatMarkerView) yzrVar.b).a(ahtgVar);
                return;
            }
            return;
        }
        if (i == 1) {
            ((View) obj).addOnLayoutChangeListener(this.a);
        } else {
            kkl kklVar = this.a;
            TimelineMarker timelineMarker = (TimelineMarker) obj;
            kklVar.c.add(new PointF(((float) timelineMarker.a) / ((float) kklVar.i), timelineMarker.d));
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
