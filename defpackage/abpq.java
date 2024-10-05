package defpackage;

import com.google.android.libraries.youtube.livechat.ui.view.LiveChatPopUpItemContainerLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abpq implements Runnable {
    final /* synthetic */ LiveChatPopUpItemContainerLayout a;

    public abpq(LiveChatPopUpItemContainerLayout liveChatPopUpItemContainerLayout) {
        this.a = liveChatPopUpItemContainerLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.getChildCount() <= 0) {
            return;
        }
        this.a.a.computeScrollOffset();
        LiveChatPopUpItemContainerLayout liveChatPopUpItemContainerLayout = this.a;
        int i = liveChatPopUpItemContainerLayout.b;
        liveChatPopUpItemContainerLayout.b = liveChatPopUpItemContainerLayout.a.getCurrY();
        int scrollY = this.a.getScrollY();
        LiveChatPopUpItemContainerLayout liveChatPopUpItemContainerLayout2 = this.a;
        int i2 = scrollY + (liveChatPopUpItemContainerLayout2.b - i);
        int height = liveChatPopUpItemContainerLayout2.getHeight();
        int height2 = this.a.getChildAt(0).getHeight();
        this.a.scrollTo(0, height + i2 > height2 ? height2 - height : Math.min(i2, height2));
        if (this.a.a.isFinished()) {
            return;
        }
        this.a.post(this);
    }
}
