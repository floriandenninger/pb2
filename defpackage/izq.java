package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class izq implements ynl {
    public final /* synthetic */ afwx a;
    private final /* synthetic */ int b;

    public /* synthetic */ izq(afwx afwxVar, int i) {
        this.b = i;
        this.a = afwxVar;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.kZ((BrowseResponseModel) obj);
            return;
        }
        if (i == 1) {
            this.a.kZ((abci) obj);
            return;
        }
        if (i == 2) {
            this.a.kZ((arlt) obj);
            return;
        }
        if (i == 3) {
            this.a.kZ((arzq) obj);
        } else if (i != 4) {
            this.a.kZ((ased) obj);
        } else {
            this.a.kZ((ased) obj);
        }
    }
}
