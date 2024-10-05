package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class laf implements lag {
    private final /* synthetic */ int f;
    public static final /* synthetic */ laf e = new laf(4);
    public static final /* synthetic */ laf d = new laf(3);
    public static final /* synthetic */ laf c = new laf(2);
    public static final /* synthetic */ laf b = new laf(1);
    public static final /* synthetic */ laf a = new laf(0);

    private /* synthetic */ laf(int i) {
        this.f = i;
    }

    @Override // defpackage.lag
    public final Object a(Object obj) {
        int i = this.f;
        if (i == 0) {
            avfv avfvVar = (avfv) obj;
            if ((avfvVar.b & 32768) == 0) {
                return null;
            }
            avfs avfsVar = avfvVar.l;
            return avfsVar == null ? avfs.a : avfsVar;
        }
        if (i == 1) {
            avfv avfvVar2 = (avfv) obj;
            if ((avfvVar2.b & 1) == 0) {
                return null;
            }
            avfk avfkVar = avfvVar2.c;
            return avfkVar == null ? avfk.a : avfkVar;
        }
        if (i == 2) {
            avfv avfvVar3 = (avfv) obj;
            if ((avfvVar3.b & 128) == 0) {
                return null;
            }
            avft avftVar = avfvVar3.f;
            return avftVar == null ? avft.a : avftVar;
        }
        if (i != 3) {
            avfv avfvVar4 = (avfv) obj;
            if ((avfvVar4.b & 16384) == 0) {
                return null;
            }
            avfx avfxVar = avfvVar4.k;
            return avfxVar == null ? avfx.a : avfxVar;
        }
        avfv avfvVar5 = (avfv) obj;
        if ((avfvVar5.b & 128) == 0) {
            return null;
        }
        avft avftVar2 = avfvVar5.f;
        return avftVar2 == null ? avft.a : avftVar2;
    }
}
