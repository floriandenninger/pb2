package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.youtube.R;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ggt implements ajut {
    private final EnumMap a = new EnumMap(arfr.class);
    private final EnumMap b = new EnumMap(arfr.class);
    private final Context c;
    private final ajut d;

    public ggt(Context context, ajut ajutVar) {
        this.c = context;
        this.d = ajutVar;
        b(arfr.DOWNLOADS_PAGE_EMPTY, R.attr.downloadsPageEmptyIcon, R.drawable.ic_downloads_page_empty_light);
        b(arfr.YOUTUBE_RED_ORIGINALS_BUTTON_RED, R.attr.youTubeOriginalsButtonIcon, R.drawable.youtube_originals_red);
        b(arfr.CREATE_LIVE_STREAM, R.attr.createLiveIcon, R.drawable.ic_yt_create_live_light);
        b(arfr.CREATE_POST, R.attr.createPostIcon, R.drawable.ic_yt_create_post_light);
        b(arfr.CREATE_REEL_ITEM, R.attr.createReelIcon, R.drawable.ic_yt_create_reel_light);
        b(arfr.CREATE_VIDEO, R.attr.createVodIcon, R.drawable.ic_yt_create_vod_light);
        b(arfr.SHOW_MORE, R.attr.expandButtonIcon, R.drawable.btn_expand_light);
        b(arfr.REELS_ADD, R.attr.reelsAddIcon, R.drawable.ic_yt_stories_add_light);
        b(arfr.STORIES_ADD_BADGE, R.attr.reelsAddIcon, R.drawable.ic_yt_stories_add_light);
        b(arfr.LOGGED_OUT_LIBRARY, R.attr.loggedOutLibrary, R.drawable.ic_logged_out_library_light);
        b(arfr.LOGGED_OUT_SUBS, R.attr.loggedOutSubs, R.drawable.ic_logged_out_subs_light);
        b(arfr.WATCH_HISTORY_PAUSED, R.attr.watchHistoryPausedIcon, R.drawable.ic_watch_history_paused_light);
        b(arfr.PREMIUM, R.attr.youtubePremiumBadge, R.drawable.youtube_premium_badge_light);
    }

    private final void b(arfr arfrVar, int i, int i2) {
        this.a.put((EnumMap) arfrVar, (arfr) Integer.valueOf(i));
        this.b.put((EnumMap) arfrVar, (arfr) Integer.valueOf(i2));
    }

    @Override // defpackage.ajut
    public final int a(arfr arfrVar) {
        if (this.a.containsKey(arfrVar)) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.c.getTheme();
            if (theme == null || !theme.resolveAttribute(((Integer) this.a.get(arfrVar)).intValue(), typedValue, true)) {
                return ((Integer) this.b.get(arfrVar)).intValue();
            }
            return typedValue.resourceId;
        }
        return this.d.a(arfrVar);
    }
}
