package defpackage;

import android.app.PictureInPictureUiState;
import android.app.assist.AssistContent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class omx extends okv implements gop {
    private boolean j;

    @Override // android.app.Activity, defpackage.gop
    public final boolean isInMultiWindowMode() {
        return this.j;
    }

    protected goe n() {
        throw null;
    }

    @Override // defpackage.ci, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        this.j = z;
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        r(pictureInPictureUiState.isStashed());
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
        goe n = n();
        if (n == null) {
            return;
        }
        String str = n.a;
        if (str != null) {
            assistContent.setStructuredData(str);
        }
        assistContent.setWebUri(n.b);
    }

    protected void r(boolean z) {
        throw null;
    }

    public final boolean u() {
        return super.isInPictureInPictureMode();
    }
}
