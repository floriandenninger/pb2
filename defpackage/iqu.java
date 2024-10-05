package defpackage;

import com.google.android.libraries.youtube.metadataeditor.geo.Place;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iqu implements afoi {
    public asty a;
    final /* synthetic */ iqw b;
    public ayue c;

    public iqu(iqw iqwVar) {
        this.b = iqwVar;
    }

    @Override // defpackage.afoi
    public final void d() {
        this.b.z();
        ayue ayueVar = this.c;
        if (ayueVar != null) {
            ayueVar.a();
        }
    }

    @Override // defpackage.afoi
    public final void e(Place place) {
        asty astyVar = this.a;
        if ((astyVar.c & 1) != 0) {
            aone createBuilder = astz.a.createBuilder();
            String str = place.b;
            createBuilder.copyOnWrite();
            astz astzVar = (astz) createBuilder.instance;
            str.getClass();
            astzVar.b |= 2;
            astzVar.c = str;
            String str2 = place.a;
            createBuilder.copyOnWrite();
            astz astzVar2 = (astz) createBuilder.instance;
            str2.getClass();
            astzVar2.b |= 4;
            astzVar2.d = str2;
            this.b.y.b(astyVar.d, ((astz) createBuilder.build()).toByteArray());
            if (!place.a.equals(astyVar.f)) {
                aone createBuilder2 = awqu.a.createBuilder();
                createBuilder2.copyOnWrite();
                awqu awquVar = (awqu) createBuilder2.instance;
                awquVar.b |= 1;
                awquVar.c = true;
                this.b.y.b(astyVar.e, ((awqu) createBuilder2.build()).toByteArray());
            }
        }
        this.b.z();
        ayue ayueVar = this.c;
        if (ayueVar != null) {
            ayueVar.a();
        }
    }
}
