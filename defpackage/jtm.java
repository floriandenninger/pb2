package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jtm extends jsn {
    public jtm() {
        super(agnv.class, atde.class);
    }

    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        String m = ((agnv) obj).m();
        String str = amrzVar != null ? (String) amrzVar.getOrDefault("downloaded_video_playlist_id", null) : null;
        aone createBuilder = atde.a.createBuilder();
        apxf e = fia.e(m, str);
        createBuilder.copyOnWrite();
        atde atdeVar = (atde) createBuilder.instance;
        e.getClass();
        atdeVar.e = e;
        atdeVar.b |= 8;
        return (atde) createBuilder.build();
    }
}
