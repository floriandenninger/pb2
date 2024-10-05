package defpackage;

import android.support.rastermill.FrameSequenceDrawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class szn {
    public final awnw a;
    public final sww b;
    private final awnw c;
    private FrameSequenceDrawable d;
    private final Object e;

    public szn(awnw awnwVar, awnw awnwVar2, sww swwVar, Object obj) {
        this.a = awnwVar;
        this.c = awnwVar2;
        this.b = swwVar;
        this.e = obj;
    }

    public final void a() {
        FrameSequenceDrawable frameSequenceDrawable = this.d;
        if (frameSequenceDrawable != null) {
            frameSequenceDrawable.setOnFinishedListener(null);
        }
        this.d = null;
    }

    public final void b(FrameSequenceDrawable frameSequenceDrawable) {
        this.d = frameSequenceDrawable;
        frameSequenceDrawable.setLoopBehavior(1);
        frameSequenceDrawable.setLoopCount(1);
        frameSequenceDrawable.setOnFinishedListener(new FrameSequenceDrawable.OnFinishedListener() { // from class: szm
            @Override // android.support.rastermill.FrameSequenceDrawable.OnFinishedListener
            public final void onFinished(FrameSequenceDrawable frameSequenceDrawable2) {
                szn sznVar = szn.this;
                awnw awnwVar = sznVar.a;
                if (awnwVar != null) {
                    sznVar.b.b(awnwVar, swu.a().a()).Q();
                }
                frameSequenceDrawable2.setLoopBehavior(1);
                frameSequenceDrawable2.setLoopCount(1);
                frameSequenceDrawable2.start();
            }
        });
    }

    public final void c() {
        FrameSequenceDrawable frameSequenceDrawable = this.d;
        if (frameSequenceDrawable != null) {
            frameSequenceDrawable.start();
            awnw awnwVar = this.c;
            if (awnwVar == null) {
                return;
            }
            this.b.b(awnwVar, null).Q();
        }
    }

    public final void d() {
        FrameSequenceDrawable frameSequenceDrawable = this.d;
        if (frameSequenceDrawable != null) {
            frameSequenceDrawable.stop();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof szn)) {
            return false;
        }
        szn sznVar = (szn) obj;
        Object obj2 = this.e;
        if (obj2 instanceof aoam) {
            Object obj3 = sznVar.e;
            if (obj3 instanceof aoam) {
                return szz.c((aoam) obj2, (aoam) obj3);
            }
        }
        return obj2.equals(sznVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
