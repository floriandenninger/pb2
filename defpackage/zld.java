package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zld {
    public final ajkj a;
    public AlertDialog b;

    public zld(Context context, ajjs ajjsVar, Track track, Runnable runnable, Runnable runnable2) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.audio_swap_track_change_dialog, (ViewGroup) null);
        ((YouTubeTextView) inflate.findViewById(R.id.audio_swap_track_title)).setText(track.a);
        ((YouTubeTextView) inflate.findViewById(R.id.audio_swap_track_artist)).setText(track.b);
        ((YouTubeTextView) inflate.findViewById(R.id.audio_swap_track_duration)).setText(vlu.g(context, track.c, false));
        if (track.f != null) {
            ((YouTubeTextView) inflate.findViewById(R.id.audio_swap_track_category_name)).setText(track.f);
        }
        ajkj ajkjVar = new ajkj(ajjsVar, (ImageView) inflate.findViewById(R.id.audio_swap_track_cover));
        this.a = ajkjVar;
        ajkjVar.n();
        avgg avggVar = track.e;
        if (avggVar == null) {
            ajkjVar.e(R.drawable.audio_swap_track_not_loaded);
        } else {
            ajkjVar.l(avggVar, new zlc(this));
        }
        ajkjVar.i(ImageView.ScaleType.CENTER_CROP);
        this.b = new AlertDialog.Builder(context).setCancelable(true).setPositiveButton(R.string.upload_edit_audio_swap_dialog_change_track, new zla(runnable, 0)).setNegativeButton(R.string.upload_edit_audio_swap_dialog_remove_track, new zla(runnable2, 1)).setView(inflate).create();
        inflate.findViewById(R.id.audio_swap_change_dialog_close_button).setOnClickListener(new zlb(this));
    }
}
