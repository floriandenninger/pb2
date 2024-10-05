package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fai extends fan {
    final /* synthetic */ fap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fai(fap fapVar, fao faoVar) {
        super(fapVar, faoVar);
        this.a = fapVar;
    }

    @Override // defpackage.fan
    protected final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        return BrowseResponseModel.e(bArr, this.a.f);
    }

    @Override // defpackage.fan
    protected final /* synthetic */ byte[] b(Object obj) {
        return ((BrowseResponseModel) obj).k();
    }
}
