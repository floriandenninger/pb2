package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agem implements Runnable {
    public final /* synthetic */ ageo a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ agem(ageo ageoVar, String str, int i) {
        this.c = i;
        this.a = ageoVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            ageo ageoVar = this.a;
            String str = this.b;
            if (ageoVar.b.z()) {
                ((agil) ageoVar.a.get()).i.b.a().execSQL("UPDATE ad_videos SET playback_count = playback_count + 1 WHERE ad_video_id = ?", new Object[]{str});
                return;
            }
            return;
        }
        ageo ageoVar2 = this.a;
        String str2 = this.b;
        if (ageoVar2.b.z()) {
            ((agil) ageoVar2.a.get()).u(str2, amvs.a);
        }
    }
}
