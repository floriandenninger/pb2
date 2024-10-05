package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mrr implements ajom {
    public apxf a;
    private final ajjz b;
    private final ImageView c;
    private final ajjv d;

    public mrr(Activity activity, ajjz ajjzVar, aahd aahdVar, ViewGroup viewGroup) {
        this.b = ajjzVar;
        viewGroup.getClass();
        ImageView imageView = (ImageView) LayoutInflater.from(activity).inflate(R.layout.playlist_collaborator, viewGroup, false);
        this.c = imageView;
        imageView.setOnClickListener(new mrp(this, aahdVar));
        ajju a = ajjv.a();
        a.b(R.drawable.missing_avatar);
        this.d = a.a();
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.e(this.c);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        avgg avggVar;
        aucb aucbVar = (aucb) obj;
        ajjz ajjzVar = this.b;
        ImageView imageView = this.c;
        apxf apxfVar = null;
        if ((aucbVar.b & 2) != 0) {
            avggVar = aucbVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        ajjzVar.k(imageView, avggVar, this.d);
        if ((aucbVar.b & 8) != 0 && (apxfVar = aucbVar.d) == null) {
            apxfVar = apxf.a;
        }
        this.a = apxfVar;
    }
}
