package defpackage;

import android.graphics.Rect;
import com.google.android.apps.youtube.app.common.rendering.elements.litho.datastore.MainAppPlayerOverlayDataProvider;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fqt implements ayrs {
    public final /* synthetic */ MainAppPlayerOverlayDataProvider a;
    private final /* synthetic */ int b;

    public /* synthetic */ fqt(MainAppPlayerOverlayDataProvider mainAppPlayerOverlayDataProvider, int i) {
        this.b = i;
        this.a = mainAppPlayerOverlayDataProvider;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            MainAppPlayerOverlayDataProvider mainAppPlayerOverlayDataProvider = this.a;
            kmb kmbVar = ((klw) obj).a;
            mainAppPlayerOverlayDataProvider.b = kmbVar.f;
            mainAppPlayerOverlayDataProvider.c = kmbVar.e;
            mainAppPlayerOverlayDataProvider.g();
            return;
        }
        if (i == 1) {
            MainAppPlayerOverlayDataProvider mainAppPlayerOverlayDataProvider2 = this.a;
            Rect rect = (Rect) obj;
            if (mainAppPlayerOverlayDataProvider2.a.equals(rect)) {
                return;
            }
            mainAppPlayerOverlayDataProvider2.a.set(rect);
            mainAppPlayerOverlayDataProvider2.g();
            return;
        }
        if (i == 2) {
            MainAppPlayerOverlayDataProvider mainAppPlayerOverlayDataProvider3 = this.a;
            ahcr ahcrVar = (ahcr) obj;
            mainAppPlayerOverlayDataProvider3.d = ahcrVar.b();
            int a = (int) (ahcrVar.a() * 100.0f);
            if (a == 25) {
                mainAppPlayerOverlayDataProvider3.e = 2;
            } else if (a == 50) {
                mainAppPlayerOverlayDataProvider3.e = 3;
            } else if (a == 75) {
                mainAppPlayerOverlayDataProvider3.e = 4;
            } else if (a == 100) {
                mainAppPlayerOverlayDataProvider3.e = 5;
            } else if (a == 125) {
                mainAppPlayerOverlayDataProvider3.e = 6;
            } else if (a == 150) {
                mainAppPlayerOverlayDataProvider3.e = 7;
            } else if (a == 175) {
                mainAppPlayerOverlayDataProvider3.e = 8;
            } else if (a != 200) {
                mainAppPlayerOverlayDataProvider3.e = 1;
            } else {
                mainAppPlayerOverlayDataProvider3.e = 9;
            }
            mainAppPlayerOverlayDataProvider3.g();
            return;
        }
        MainAppPlayerOverlayDataProvider mainAppPlayerOverlayDataProvider4 = this.a;
        switch (((ahej) obj).a()) {
            case 2:
                mainAppPlayerOverlayDataProvider4.f = 3;
                break;
            case 3:
                mainAppPlayerOverlayDataProvider4.f = 4;
                break;
            case 4:
            case 7:
                mainAppPlayerOverlayDataProvider4.f = 7;
                break;
            case 5:
                mainAppPlayerOverlayDataProvider4.f = 5;
                break;
            case 6:
            default:
                mainAppPlayerOverlayDataProvider4.f = 1;
                break;
            case 8:
                mainAppPlayerOverlayDataProvider4.f = 8;
                break;
            case 9:
                mainAppPlayerOverlayDataProvider4.f = 6;
                break;
        }
        mainAppPlayerOverlayDataProvider4.g();
    }
}
