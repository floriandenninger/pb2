package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class swi implements szy {
    private final /* synthetic */ int f;
    public static final /* synthetic */ swi e = new swi(4);
    public static final /* synthetic */ swi d = new swi(3);
    public static final /* synthetic */ swi c = new swi(2);
    public static final /* synthetic */ swi b = new swi(1);
    public static final /* synthetic */ swi a = new swi(0);

    private /* synthetic */ swi(int i) {
        this.f = i;
    }

    @Override // defpackage.szy
    public final void a(ByteBuffer byteBuffer, aoam aoamVar) {
        int i = this.f;
        if (i == 0) {
            axof.aJ(byteBuffer, (axof) aoamVar);
            return;
        }
        if (i == 1) {
            axoy.aQ(byteBuffer, (axoy) aoamVar);
            return;
        }
        if (i == 2) {
            axof.aJ(byteBuffer, (axof) aoamVar);
        } else if (i != 3) {
            axof.aJ(byteBuffer, (axof) aoamVar);
        } else {
            axoy.aQ(byteBuffer, (axoy) aoamVar);
        }
    }
}
