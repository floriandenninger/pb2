package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeya {
    public static final aeya a = new aeya(null, null);
    public final aexz b;
    public final aexz c;
    public final amru d;

    public aeya(aexz aexzVar, aexz aexzVar2) {
        this.b = aexzVar;
        this.c = aexzVar2;
        amrp h = amru.h(2);
        if (aexzVar != null) {
            h.h(ovw.TRACK_TYPE_AUDIO);
        }
        if (aexzVar2 != null) {
            h.h(ovw.TRACK_TYPE_VIDEO);
        }
        this.d = h.g();
    }

    public final bel a(ovw ovwVar) {
        aexz aexzVar;
        aexz aexzVar2;
        if (ovwVar != ovw.TRACK_TYPE_AUDIO || (aexzVar2 = this.b) == null) {
            if (ovwVar != ovw.TRACK_TYPE_VIDEO || (aexzVar = this.c) == null) {
                return null;
            }
            return aexzVar.f();
        }
        return aexzVar2.f();
    }
}
