package defpackage;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aces implements DialogInterface.OnClickListener {
    public final /* synthetic */ LiveCreationActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ aces(LiveCreationActivity liveCreationActivity, int i) {
        this.b = i;
        this.a = liveCreationActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            LiveCreationActivity.an(this.a, Uri.parse("https://support.google.com/youtube/answer/2474026"));
            return;
        }
        if (i2 == 1) {
            LiveCreationActivity liveCreationActivity = this.a;
            if (adyu.cu(liveCreationActivity)) {
                adyu.cw(liveCreationActivity);
                liveCreationActivity.finish();
                return;
            } else {
                liveCreationActivity.s(true);
                liveCreationActivity.O = false;
                liveCreationActivity.aw();
                return;
            }
        }
        this.a.finish();
    }
}
