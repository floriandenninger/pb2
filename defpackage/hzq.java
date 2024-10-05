package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hzq extends zys {
    private final ci a;
    private final ajjz b;
    private final iat c;

    public hzq(ci ciVar, ajjz ajjzVar, iat iatVar) {
        super(ciVar, ciVar.getSupportFragmentManager(), null, true, false);
        this.a = ciVar;
        this.b = ajjzVar;
        this.c = iatVar;
    }

    @Override // defpackage.zys
    protected final View a() {
        View inflate = LayoutInflater.from(new ContextThemeWrapper(this.a, R.style.ReelsBottomSheetDialog)).inflate(R.layout.link_sticker_usage_exceeded, (ViewGroup) null);
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.sticker_usage_exceeded_title);
        iat iatVar = this.c;
        Context applicationContext = this.a.getApplicationContext();
        int b = iatVar.b(2);
        if (b == 0) {
            b = 1;
        }
        youTubeTextView.setText(applicationContext.getResources().getQuantityString(R.plurals.sticker_dialog_title, b, Integer.valueOf(b)));
        this.b.g((ImageView) inflate.findViewById(R.id.artwork), Uri.parse("https://www.gstatic.com/youtube/img/stories/sticker_usage_exceeded_artwork.png"));
        return inflate;
    }

    @Override // defpackage.zys
    protected final CharSequence c() {
        return this.a.getResources().getString(R.string.stories_add_link_header);
    }
}
