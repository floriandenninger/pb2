package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afaf {
    public final ysy a;
    public final aevc[] b;
    public final afhs c;
    private final atd d;
    private final int e;
    private final int f;
    private final afjf g;
    private final int h;

    public afaf(atd atdVar, afhs afhsVar, int i, int i2, afjf afjfVar, int i3, aevc[] aevcVarArr, ysy ysyVar) {
        this.d = atdVar;
        this.c = afhsVar;
        this.e = i;
        this.f = i2;
        this.g = afjfVar;
        this.h = i3;
        this.b = aevcVarArr;
        this.a = ysyVar;
    }

    protected afai a(axj axjVar, FormatStreamModel[] formatStreamModelArr, afhs afhsVar, int[] iArr, bel belVar, int i, att attVar, afjf afjfVar, int i2, PlayerConfigModel playerConfigModel, ysy ysyVar) {
        return new afai(axjVar, formatStreamModelArr, afhsVar, iArr, belVar, i, c(attVar), b(i), afjfVar, i2, this.b, playerConfigModel, ysyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b(int i) {
        return i == 1 ? this.f : this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ate c(att attVar) {
        ate a = this.d.a();
        if (attVar != null) {
            a.b(attVar);
        }
        return a;
    }

    public final bdr d(axj axjVar, FormatStreamModel[] formatStreamModelArr, int[] iArr, bel belVar, int i, att attVar, PlayerConfigModel playerConfigModel) {
        return a(axjVar, formatStreamModelArr, this.c, iArr, belVar, i, attVar, this.g, this.h, playerConfigModel, this.a);
    }
}
