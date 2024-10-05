package defpackage;

import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahxq implements DialogInterface.OnClickListener {
    final /* synthetic */ ArrayAdapter a;
    final /* synthetic */ ahxs b;

    public ahxq(ArrayAdapter arrayAdapter, ahxs ahxsVar) {
        this.a = arrayAdapter;
        this.b = ahxsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.ps((SubtitleTrack) this.a.getItem(i));
        dialogInterface.dismiss();
    }
}
