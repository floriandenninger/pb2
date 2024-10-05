package defpackage;

import android.content.Context;
import android.media.ThumbnailUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zwy extends vw {
    public final zxk d;
    public final ArrayList e = new ArrayList();
    public boolean f = false;
    public boolean g = false;
    private final Context h;

    public zwy(Context context, zxk zxkVar) {
        this.h = context;
        this.d = zxkVar;
    }

    @Override // defpackage.vw
    public final int b() {
        return this.e.size();
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        return new zwx(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.album_list_entry, viewGroup, false));
    }

    @Override // defpackage.vw
    public final /* synthetic */ void o(wv wvVar, int i) {
        zwx zwxVar = (zwx) wvVar;
        zwxVar.a.setOnClickListener(new zww(this, zwxVar));
        zwxVar.t.setImageBitmap(ThumbnailUtils.extractThumbnail(zwr.a(this.h, (DeviceLocalFile) ((zwv) this.e.get(i)).b.c(), null), 512, 512, 2));
        zwxVar.u.setText(((zwv) this.e.get(i)).d);
        zwxVar.v.setText(String.format(Locale.US, "%d", Integer.valueOf(((zwv) this.e.get(i)).c)));
    }
}
