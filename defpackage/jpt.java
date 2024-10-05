package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import j$.util.Optional;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jpt implements amml {
    private final /* synthetic */ int v;
    public static final /* synthetic */ jpt u = new jpt(20);
    public static final /* synthetic */ jpt t = new jpt(19);
    public static final /* synthetic */ jpt s = new jpt(18);
    public static final /* synthetic */ jpt r = new jpt(17);
    public static final /* synthetic */ jpt q = new jpt(16);
    public static final /* synthetic */ jpt p = new jpt(15);
    public static final /* synthetic */ jpt o = new jpt(14);
    public static final /* synthetic */ jpt n = new jpt(13);
    public static final /* synthetic */ jpt m = new jpt(12);
    public static final /* synthetic */ jpt l = new jpt(11);
    public static final /* synthetic */ jpt k = new jpt(10);
    public static final /* synthetic */ jpt j = new jpt(9);
    public static final /* synthetic */ jpt i = new jpt(8);
    public static final /* synthetic */ jpt h = new jpt(7);
    public static final /* synthetic */ jpt g = new jpt(6);
    public static final /* synthetic */ jpt f = new jpt(5);
    public static final /* synthetic */ jpt e = new jpt(4);
    public static final /* synthetic */ jpt d = new jpt(3);
    public static final /* synthetic */ jpt c = new jpt(2);
    public static final /* synthetic */ jpt b = new jpt(1);
    public static final /* synthetic */ jpt a = new jpt(0);

    private /* synthetic */ jpt(int i2) {
        this.v = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        aqmz aqmzVar;
        aqmz aqmzVar2;
        aqnc aqncVar;
        switch (this.v) {
            case 0:
                return fhe.q((String) obj);
            case 1:
                return fhe.h((String) obj);
            case 2:
                return fhe.s((String) obj);
            case 3:
                return fhe.x((String) obj);
            case 4:
                return (String) obj;
            case 5:
                return aqoy.d((String) obj);
            case 6:
                return Optional.ofNullable((WatchNextResponseModel) obj);
            case 7:
                return Optional.empty();
            case 8:
                aswn aswnVar = (aswn) obj;
                if ((aswnVar.b & 4) == 0) {
                    return amlr.a;
                }
                apxf apxfVar = aswnVar.d;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                return ammv.j(apxfVar);
            case 9:
                BrowseResponseModel browseResponseModel = new BrowseResponseModel((arjv) obj);
                browseResponseModel.i("browse_response_enable_logging", true);
                browseResponseModel.i("browse_response_new_response_needed", true);
                browseResponseModel.i("browse_response_is_loading_response", true);
                return browseResponseModel;
            case 10:
                BrowseResponseModel browseResponseModel2 = new BrowseResponseModel((arjv) obj);
                browseResponseModel2.i("browse_response_enable_logging", false);
                browseResponseModel2.i("browse_response_new_response_needed", true);
                browseResponseModel2.i("browse_response_is_loading_response", true);
                return browseResponseModel2;
            case 11:
                return amru.o((Collection) obj);
            case 12:
                return amru.n(amkq.bg((List) obj, juz.a));
            case 13:
                aone builder = ((fkh) obj).toBuilder();
                builder.copyOnWrite();
                fkh fkhVar = (fkh) builder.instance;
                fkhVar.b &= -2;
                fkhVar.c = fkh.a.c;
                return (fkh) builder.build();
            case 14:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 15:
                return Boolean.valueOf(((aqnd) obj).b == 2);
            case 16:
                aqnd aqndVar = (aqnd) obj;
                if (aqndVar.b == 2) {
                    aqmzVar = (aqmz) aqndVar.c;
                } else {
                    aqmzVar = aqmz.a;
                }
                aqnf b2 = aqnf.b(aqmzVar.d);
                return b2 == null ? aqnf.FILTER_TYPE_UNSPECIFIED : b2;
            case 17:
                aqnd aqndVar2 = (aqnd) obj;
                if (aqndVar2.b == 2) {
                    aqmzVar2 = (aqmz) aqndVar2.c;
                } else {
                    aqmzVar2 = aqmz.a;
                }
                aqmy b3 = aqmy.b(aqmzVar2.c);
                return b3 == null ? aqmy.REQUEST_TYPE_UNSPECIFIED : b3;
            case 18:
                aqnd aqndVar3 = (aqnd) obj;
                if (aqndVar3.b == 4) {
                    aqncVar = (aqnc) aqndVar3.c;
                } else {
                    aqncVar = aqnc.a;
                }
                aqnb b4 = aqnb.b(aqncVar.c);
                return b4 == null ? aqnb.REQUEST_TYPE_UNSPECIFIED : b4;
            case 19:
                return ((aioc) obj).V();
            default:
                return ((ajbl) obj).T();
        }
    }
}
