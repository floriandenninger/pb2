package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iaf {
    public final acqz a;
    public final agcm b;

    public iaf(agcm agcmVar, acqz acqzVar, byte[] bArr, byte[] bArr2) {
        this.b = agcmVar;
        this.a = acqzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(acqz acqzVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aooy m = ahbj.m((aulq) it.next());
            if (m instanceof auyb) {
                acqzVar.mM().D(new acqx(etx.I((auyb) m).I()));
            } else if (m instanceof auya) {
                acqzVar.mM().D(etx.E((auya) m));
            }
        }
    }
}
