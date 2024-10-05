package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fod {
    public static final String[] a = {"snap_zoom_initially_zoomed", fav.VIDEO_ZOOM_USER_EDUCATION_SHOWN, "inline_global_play_pause"};

    public static fof a(fof fofVar, fny fnyVar) {
        if (!fnyVar.a.h() && !fnyVar.b.h()) {
            return fofVar;
        }
        aone createBuilder = fof.a.createBuilder();
        if (fnyVar.b("snap_zoom_initially_zoomed")) {
            boolean c = fnyVar.c("snap_zoom_initially_zoomed");
            createBuilder.copyOnWrite();
            fof fofVar2 = (fof) createBuilder.instance;
            fofVar2.b |= 1;
            fofVar2.c = c;
        }
        if (fnyVar.b(fav.VIDEO_ZOOM_USER_EDUCATION_SHOWN)) {
            boolean c2 = fnyVar.c(fav.VIDEO_ZOOM_USER_EDUCATION_SHOWN);
            createBuilder.copyOnWrite();
            fof fofVar3 = (fof) createBuilder.instance;
            fofVar3.b |= 2;
            fofVar3.d = c2;
        }
        if (fnyVar.b("inline_global_play_pause")) {
            int a2 = fnyVar.a("inline_global_play_pause", -1);
            createBuilder.copyOnWrite();
            fof fofVar4 = (fof) createBuilder.instance;
            fofVar4.b |= 4;
            fofVar4.e = a2;
        }
        return (fof) createBuilder.build();
    }
}
