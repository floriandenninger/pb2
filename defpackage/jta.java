package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jta extends jsn {
    private final Context a;

    public jta(Context context) {
        super(fjs.class, apib.class);
        this.a = context;
    }

    private static int a(aqnf aqnfVar) {
        aqnf aqnfVar2 = aqnf.FILTER_TYPE_UNSPECIFIED;
        int ordinal = aqnfVar.ordinal();
        return ordinal != 2 ? ordinal != 3 ? R.string.no_offline_content_title : R.string.no_offline_videos_title : R.string.no_offline_playlists_title;
    }

    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        aqnf b = aqnf.b(((Integer) e(amrzVar, "downloads_page_filter_type")).intValue());
        aone createBuilder = apib.a.createBuilder();
        aone createBuilder2 = apid.a.createBuilder();
        arfr arfrVar = arfr.DOWNLOADS_PAGE_EMPTY;
        createBuilder2.copyOnWrite();
        apid apidVar = (apid) createBuilder2.instance;
        apidVar.c = arfrVar.pV;
        apidVar.b |= 1;
        createBuilder.copyOnWrite();
        apib apibVar = (apib) createBuilder.instance;
        apid apidVar2 = (apid) createBuilder2.build();
        apidVar2.getClass();
        apibVar.d = apidVar2;
        apibVar.c = 3;
        if (((fjs) obj).e()) {
            aqyg g = ajcq.g(this.a.getString(a(b)));
            createBuilder.copyOnWrite();
            apib apibVar2 = (apib) createBuilder.instance;
            g.getClass();
            apibVar2.f = g;
            apibVar2.b |= 2;
            aone createBuilder3 = apic.a.createBuilder();
            createBuilder3.copyOnWrite();
            apic apicVar = (apic) createBuilder3.instance;
            apicVar.c = 2;
            apicVar.b |= 1;
            createBuilder.copyOnWrite();
            apib apibVar3 = (apib) createBuilder.instance;
            apic apicVar2 = (apic) createBuilder3.build();
            apicVar2.getClass();
            apibVar3.j = apicVar2;
            apibVar3.b |= 256;
        } else {
            aqyg g2 = ajcq.g(this.a.getString(a(b)));
            createBuilder.copyOnWrite();
            apib apibVar4 = (apib) createBuilder.instance;
            g2.getClass();
            apibVar4.e = g2;
            apibVar4.b |= 1;
            String[] strArr = new String[1];
            strArr[0] = this.a.getString(b == aqnf.FILTER_TYPE_PLAYLISTS_ONLY ? R.string.no_offline_playlists_subtitle : R.string.no_offline_videos_subtitle);
            aqyg g3 = ajcq.g(strArr);
            createBuilder.copyOnWrite();
            apib apibVar5 = (apib) createBuilder.instance;
            g3.getClass();
            apibVar5.f = g3;
            apibVar5.b |= 2;
            aone createBuilder4 = apic.a.createBuilder();
            createBuilder4.copyOnWrite();
            apic apicVar3 = (apic) createBuilder4.instance;
            apicVar3.c = 1;
            apicVar3.b |= 1;
            createBuilder.copyOnWrite();
            apib apibVar6 = (apib) createBuilder.instance;
            apic apicVar4 = (apic) createBuilder4.build();
            apicVar4.getClass();
            apibVar6.j = apicVar4;
            apibVar6.b |= 256;
        }
        return (apib) createBuilder.build();
    }
}
