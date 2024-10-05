package defpackage;

import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaxd implements afwx {
    final /* synthetic */ aaxe a;
    private final Map b;

    public aaxd(aaxe aaxeVar, Map map) {
        this.a = aaxeVar;
        this.b = map;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.d("Error flagging", cnqVar);
        this.a.a.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arqh arqhVar = (arqh) obj;
        Object s = yjj.s(this.b, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (arqhVar.g.size() > 0) {
            this.a.c.e(arqhVar.g, s);
        } else {
            whu.K(this.a.b, R.string.video_is_flagged, 1);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
