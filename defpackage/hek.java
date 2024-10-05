package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hek extends View.AccessibilityDelegate implements Runnable {
    public final View a;
    final /* synthetic */ hel b;
    private boolean c = false;

    public hek(hel helVar, View view) {
        this.b = helVar;
        this.a = view;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (!this.c && accessibilityEvent != null && accessibilityEvent.getEventType() == 32768) {
            this.c = true;
            this.a.setAccessibilityDelegate(null);
            run();
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.aM.sendAccessibilityEvent(8);
        this.b.aK();
    }
}
