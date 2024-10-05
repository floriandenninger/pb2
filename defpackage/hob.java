package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hob implements Runnable {
    public final /* synthetic */ hoj a;
    public final /* synthetic */ ShortsCreationSelectedTrack b;
    private final /* synthetic */ int c;

    public /* synthetic */ hob(hoj hojVar, ShortsCreationSelectedTrack shortsCreationSelectedTrack, int i) {
        this.c = i;
        this.a = hojVar;
        this.b = shortsCreationSelectedTrack;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.a.z.c(this.b.g());
            return;
        }
        if (i == 1) {
            hoj hojVar = this.a;
            ShortsCreationSelectedTrack shortsCreationSelectedTrack = this.b;
            hojVar.z.d = Long.valueOf(shortsCreationSelectedTrack.a());
            return;
        }
        if (i != 2) {
            this.a.z.c(this.b.g());
        } else {
            hoj hojVar2 = this.a;
            ShortsCreationSelectedTrack shortsCreationSelectedTrack2 = this.b;
            hojVar2.z.e = (Long) shortsCreationSelectedTrack2.d().c();
        }
    }
}
