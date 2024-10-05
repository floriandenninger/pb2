package defpackage;

import com.google.android.youtube.R;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jfh implements aaha, ykl {
    private final ainy a;
    private final azrw b;
    private final zaw c;

    public jfh(ainy ainyVar, azrw azrwVar, zaw zawVar) {
        this.a = ainyVar;
        this.b = azrwVar;
        zawVar.getClass();
        this.c = zawVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.c.c(R.string.no_subtitles);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ((ahxt) this.b.get()).q((List) obj2);
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        this.a.C(this);
    }
}
