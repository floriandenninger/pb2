package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jto extends jsn {
    private final azrw a;
    private final azrw b;

    public jto(azrw azrwVar, azrw azrwVar2) {
        super(agnp.class, atde.class);
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        String f = ((agnp) obj).f();
        String str = amrzVar != null ? (String) amrzVar.getOrDefault("downloaded_video_playlist_id", null) : null;
        agnv e = ((agof) this.b.get()).a().m().e(f);
        if (e != null) {
            return ((jti) this.a.get()).e(e, str);
        }
        aone createBuilder = atde.a.createBuilder();
        apxf e2 = fia.e(f, str);
        createBuilder.copyOnWrite();
        atde atdeVar = (atde) createBuilder.instance;
        e2.getClass();
        atdeVar.e = e2;
        atdeVar.b |= 8;
        return (atde) createBuilder.build();
    }
}
