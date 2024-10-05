package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aezy extends afaf {
    private final aelf d;

    public aezy(atd atdVar, afhs afhsVar, int i, int i2, aelf aelfVar, afjf afjfVar, int i3, aevc[] aevcVarArr, ysy ysyVar) {
        super(atdVar, afhsVar, i, i2, afjfVar, i3, aevcVarArr, ysyVar);
        this.d = aelfVar;
    }

    @Override // defpackage.afaf
    public final afai a(axj axjVar, FormatStreamModel[] formatStreamModelArr, afhs afhsVar, int[] iArr, bel belVar, int i, att attVar, afjf afjfVar, int i2, PlayerConfigModel playerConfigModel, ysy ysyVar) {
        return new aezz(this.d, axjVar, formatStreamModelArr, afhsVar, iArr, belVar, i, c(attVar), b(i), afjfVar, i2, this.b, playerConfigModel, ysyVar);
    }
}
