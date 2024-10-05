package defpackage;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amve extends amvd implements Serializable {
    static final amvd a = new amve();
    private static final long serialVersionUID = 0;

    private amve() {
    }

    @Override // defpackage.amvd, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        amvf amvfVar = (amvf) obj;
        amvf amvfVar2 = (amvf) obj2;
        return amqd.b.c(amvfVar.b, amvfVar2.b).c(amvfVar.c, amvfVar2.c).a();
    }
}
