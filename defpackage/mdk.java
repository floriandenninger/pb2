package defpackage;

import android.content.res.Configuration;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mdk implements ayrs {
    public final /* synthetic */ mdm a;
    private final /* synthetic */ int b;

    public /* synthetic */ mdk(mdm mdmVar, int i) {
        this.b = i;
        this.a = mdmVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        gad gadVar;
        View view;
        ImageView imageView;
        gad gadVar2;
        View view2;
        if (this.b == 0) {
            this.a.n = (amsx) obj;
            return;
        }
        mdm mdmVar = this.a;
        Configuration configuration = (Configuration) obj;
        if (evr.bb(mdmVar.x) && (gadVar2 = mdmVar.m) != null && (view2 = gadVar2.a.b) != null) {
            mdmVar.f.d(view2);
        }
        boolean z = configuration.screenWidthDp < 320;
        if (mdmVar.t == z || (gadVar = mdmVar.m) == null || (view = gadVar.a.b) == null || (imageView = (ImageView) view.findViewById(R.id.youtube_logo)) == null) {
            return;
        }
        mdmVar.t = z;
        mdmVar.j(imageView);
    }
}
