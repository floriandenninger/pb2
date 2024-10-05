package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aezz extends afai {
    private final aelf b;
    private int c;

    public aezz(aelf aelfVar, axj axjVar, FormatStreamModel[] formatStreamModelArr, afhs afhsVar, int[] iArr, bel belVar, int i, ate ateVar, int i2, afjf afjfVar, int i3, aevc[] aevcVarArr, PlayerConfigModel playerConfigModel, ysy ysyVar) {
        super(axjVar, formatStreamModelArr, afhsVar, iArr, belVar, i, ateVar, i2, afjfVar, i3, aevcVarArr, playerConfigModel, ysyVar);
        this.c = 0;
        this.b = aelfVar;
    }

    @Override // defpackage.afai, defpackage.bdr
    public final void c(long j, long j2, List list, bdp bdpVar) {
        boolean h = this.b.h();
        if (this.b.i()) {
            if (!h && this.c < 2) {
                HashSet hashSet = new HashSet();
                for (afah afahVar : this.a) {
                    hashSet.add(afahVar.a.a.c);
                }
                if (!this.b.g(hashSet)) {
                    return;
                } else {
                    this.c++;
                }
            }
            super.c(j, j2, list, bdpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afai
    public final bdn j(afah afahVar, ate ateVar, pms pmsVar, int i, Object obj, axk axkVar, axk axkVar2, long j) {
        axk axkVar3;
        axk axkVar4;
        if (((axi) afahVar.a.b.get(0)).a.contains("oda")) {
            axl b = this.b.b(afahVar.a.a.c);
            if (b == null || !this.b.i()) {
                return null;
            }
            axk axkVar5 = axkVar != null ? b.d : null;
            axkVar4 = axkVar2 != null ? b.g : null;
            axkVar3 = axkVar5;
        } else {
            axkVar3 = axkVar;
            axkVar4 = axkVar2;
        }
        return super.j(afahVar, ateVar, pmsVar, i, obj, axkVar3, axkVar4, j);
    }
}
