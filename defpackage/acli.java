package defpackage;

import com.google.android.libraries.youtube.livecreation.ui.view.DeveloperPanel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acli implements Runnable {
    final /* synthetic */ DeveloperPanel a;

    public acli(DeveloperPanel developerPanel) {
        this.a = developerPanel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.postDelayed(this, 1000L);
    }
}
