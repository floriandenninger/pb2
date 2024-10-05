package defpackage;

import android.content.Context;
import android.os.FileObserver;
import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class emo extends FileObserver {
    final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emo(String str, Context context) {
        super(str);
        this.a = context;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i == 2) {
            YouTubeBackupAgent.e(this.a);
        }
    }
}
