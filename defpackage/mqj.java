package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqj implements ajom {
    private final ajmv a;

    public mqj(ajnt ajntVar) {
        ajmv ajneVar;
        if (ajne.class.equals(ajnk.class)) {
            ajneVar = new ajnk(ajntVar.a, (ajop) ajntVar.b.get(), ajntVar.c);
        } else if (ajne.class.equals(ajne.class)) {
            ajneVar = new ajne(ajntVar.a, (ajop) ajntVar.b.get(), ajntVar.c);
        } else {
            throw new IllegalArgumentException("Unknown presenter class requested.");
        }
        this.a = ajneVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a.a();
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.b(ajosVar);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        this.a.oB(ajokVar, (ajni) obj);
    }
}
