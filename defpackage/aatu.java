package defpackage;

import com.google.android.libraries.youtube.innertube.model.ads.AdBreakResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aatu extends aasu {
    final /* synthetic */ aatv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aatu(aatv aatvVar, aarm aarmVar) {
        super(aarmVar, aatvVar.e, aris.a, aatt.a, iom.j);
        this.a = aatvVar;
    }

    @Override // defpackage.aasu
    public final /* bridge */ /* synthetic */ Object h(aooy aooyVar) {
        return new AdBreakResponseModel((aris) aooyVar, this.a.c.d());
    }
}
