package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jtj extends jso {
    private final Context a;
    private final fjs b;

    public jtj(azrw azrwVar, fjs fjsVar, Context context) {
        super(azrwVar, askh.class);
        this.b = fjsVar;
        this.a = context;
    }

    private static final auwg g(String str, boolean z, aqnf aqnfVar, int i) {
        aone createBuilder = auwi.a.createBuilder();
        aulm am = mcy.am(aqmy.REQUEST_TYPE_FILTER_CHANGE, aqnfVar, i);
        createBuilder.copyOnWrite();
        auwi auwiVar = (auwi) createBuilder.instance;
        am.getClass();
        auwiVar.c = am;
        auwiVar.b |= 1;
        auwi auwiVar2 = (auwi) createBuilder.build();
        aone createBuilder2 = auwg.a.createBuilder();
        createBuilder2.copyOnWrite();
        auwg auwgVar = (auwg) createBuilder2.instance;
        str.getClass();
        auwgVar.b |= 1;
        auwgVar.e = str;
        createBuilder2.copyOnWrite();
        auwg auwgVar2 = (auwg) createBuilder2.instance;
        auwgVar2.b |= 4;
        auwgVar2.g = z;
        createBuilder2.copyOnWrite();
        auwg auwgVar3 = (auwg) createBuilder2.instance;
        auwiVar2.getClass();
        auwgVar3.d = auwiVar2;
        auwgVar3.c = 3;
        return (auwg) createBuilder2.build();
    }

    @Override // defpackage.jso
    protected final /* bridge */ /* synthetic */ Object a(agsn agsnVar, amrz amrzVar) {
        if (this.b.j() || this.b.k()) {
            aqnf b = aqnf.b(((Integer) e(amrzVar, "downloads_page_filter_type")).intValue());
            int intValue = ((Integer) e(amrzVar, "downloads_page_downloads_section_items_to_show")).intValue();
            aone createBuilder = askh.a.createBuilder();
            aone createBuilder2 = aske.a.createBuilder();
            Context context = this.a;
            aone createBuilder3 = auwh.a.createBuilder();
            createBuilder3.aT(g(context.getString(R.string.downloads_page_playlists_and_videos_menu_item), aqnf.FILTER_TYPE_NONE == b, aqnf.FILTER_TYPE_NONE, intValue));
            createBuilder3.aT(g(context.getString(R.string.downloads_page_playlists_menu_item), aqnf.FILTER_TYPE_PLAYLISTS_ONLY == b, aqnf.FILTER_TYPE_PLAYLISTS_ONLY, intValue));
            createBuilder3.aT(g(context.getString(R.string.downloads_page_videos_menu_item), aqnf.FILTER_TYPE_VIDEOS_ONLY == b, aqnf.FILTER_TYPE_VIDEOS_ONLY, intValue));
            auwh auwhVar = (auwh) createBuilder3.build();
            if (auwhVar != null) {
                createBuilder2.copyOnWrite();
                aske askeVar = (aske) createBuilder2.instance;
                askeVar.c = auwhVar;
                askeVar.b |= 1;
            }
            createBuilder.copyOnWrite();
            askh askhVar = (askh) createBuilder.instance;
            aske askeVar2 = (aske) createBuilder2.build();
            askeVar2.getClass();
            askhVar.d = askeVar2;
            askhVar.b |= 2;
            if (this.b.e()) {
                aqyg g = ajcq.g(this.a.getString(R.string.downloaded_items_title));
                createBuilder.copyOnWrite();
                askh askhVar2 = (askh) createBuilder.instance;
                g.getClass();
                askhVar2.c = g;
                askhVar2.b |= 1;
            }
            return (askh) createBuilder.build();
        }
        return askh.a;
    }

    @Override // defpackage.jso
    protected final /* synthetic */ Object f() {
        return askh.a;
    }
}
