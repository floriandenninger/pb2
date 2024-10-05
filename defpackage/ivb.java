package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ivb implements ajtu {
    final /* synthetic */ ivj a;

    public ivb(ivj ivjVar) {
        this.a = ivjVar;
    }

    @Override // defpackage.ajtu
    public final void a(ajcf ajcfVar) {
        if (ajcfVar instanceof BrowseResponseModel) {
            BrowseResponseModel browseResponseModel = (BrowseResponseModel) ajcfVar;
            arjv arjvVar = browseResponseModel.a;
            this.a.bq(arjvVar);
            this.a.bn(arjvVar.v);
            mfr mfrVar = this.a.bK;
            Object obj = browseResponseModel.b;
            if (mfrVar == null || obj == null || !(obj instanceof aamd)) {
                return;
            }
            mfrVar.b(arjvVar.v, ((aamd) obj).a);
        }
    }
}
