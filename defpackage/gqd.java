package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.livecreation.MainLiveCreationActivity;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gqd implements aaha {
    private final Activity a;
    private final akbz b;
    private final ainy c;
    private final ykz d;

    public gqd(Activity activity, ykz ykzVar, akbz akbzVar, ainy ainyVar) {
        this.a = activity;
        this.d = ykzVar;
        this.b = akbzVar;
        this.c = ainyVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Activity activity = this.a;
        Intent addFlags = new Intent(activity, (Class<?>) GalleryActivity.class).putExtra("navigation_endpoint", apxfVar.toByteArray()).putExtra("extra_gallery_secondary_action_class", MainLiveCreationActivity.class.getCanonicalName()).addFlags(536870912);
        ykj ykjVar = (ykj) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", ykj.class);
        if (adyu.cu(this.a)) {
            akbz akbzVar = this.b;
            akca m = akbzVar.m();
            m.k(this.a.getString(R.string.screencast_blocking_snackbar_text));
            m.j(false);
            akbzVar.o(m.b());
            return;
        }
        this.c.a();
        if (ykjVar != null) {
            this.d.a(addFlags, 1800, ykjVar);
        } else {
            this.a.startActivity(addFlags);
        }
    }
}
