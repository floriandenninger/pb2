package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hcs implements Runnable {
    public final /* synthetic */ hda a;
    private final /* synthetic */ int b;

    public /* synthetic */ hcs(hda hdaVar, int i) {
        this.b = i;
        this.a = hdaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            hda hdaVar = this.a;
            hdaVar.p = false;
            for (int i = 1; i < hdaVar.f.size(); i++) {
                EditorButtonView editorButtonView = (EditorButtonView) hdaVar.f.get(i);
                if (editorButtonView.getVisibility() == 0) {
                    hda.l(editorButtonView);
                }
            }
            return;
        }
        this.a.i();
    }
}
