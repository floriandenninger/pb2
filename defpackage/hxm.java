package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hxm implements ayrv {
    public final /* synthetic */ ammw a;
    private final /* synthetic */ int b;

    public /* synthetic */ hxm(ammw ammwVar, int i) {
        this.b = i;
        this.a = ammwVar;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            apxf apxfVar = (apxf) this.a.b;
            iuy a = hxn.a();
            a.i(apxfVar);
            a.h((BrowseResponseModel) obj);
            a.k(true);
            a.l(false);
            a.j(false);
            return a.g();
        }
        if (i == 1) {
            BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
            apxf apxfVar2 = (apxf) this.a.b;
            iuy a2 = hxn.a();
            a2.i(apxfVar2);
            a2.h(browseResponseModel);
            a2.k(((Boolean) browseResponseModel.h("browse_response_enable_logging", false)).booleanValue());
            a2.l(((Boolean) browseResponseModel.h("browse_response_new_response_needed", true)).booleanValue());
            a2.j(((Boolean) browseResponseModel.h("browse_response_is_loading_response", true)).booleanValue());
            return a2.g();
        }
        if (i == 2) {
            ammw ammwVar = this.a;
            BrowseResponseModel browseResponseModel2 = (BrowseResponseModel) obj;
            int i2 = ivj.cs;
            apxf apxfVar3 = (apxf) ammwVar.b;
            iuy a3 = iuz.a();
            a3.c(apxfVar3);
            a3.b(browseResponseModel2);
            a3.e(((Boolean) browseResponseModel2.h("browse_response_enable_logging", false)).booleanValue());
            a3.f(((Boolean) browseResponseModel2.h("browse_response_new_response_needed", true)).booleanValue());
            a3.d(((Boolean) browseResponseModel2.h("browse_response_is_loading_response", true)).booleanValue());
            return a3.a();
        }
        ammw ammwVar2 = this.a;
        int i3 = ivj.cs;
        apxf apxfVar4 = (apxf) ammwVar2.b;
        iuy a4 = iuz.a();
        a4.c(apxfVar4);
        a4.b((BrowseResponseModel) obj);
        a4.e(true);
        a4.f(false);
        a4.d(false);
        return a4.a();
    }
}
