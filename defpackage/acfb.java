package defpackage;

import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acfb implements Runnable {
    final String a;
    final /* synthetic */ LiveCreationActivity b;

    public acfb(LiveCreationActivity liveCreationActivity) {
        this.b = liveCreationActivity;
        this.a = liveCreationActivity.C.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.q.a(this.a, null);
    }
}
