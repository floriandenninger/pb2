package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class swm {
    public static final /* synthetic */ int a = 0;
    private static final amnv b = amkq.x(gzp.e);

    /* JADX INFO: Access modifiers changed from: protected */
    public static ImageView a(Context context) {
        return new ImageView(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(dhe dheVar, float f) {
        if (f > 0.0f) {
            szq szqVar = new szq(f);
            int i = swg.C;
            swg.B(szqVar, dheVar.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(dim dimVar, dim dimVar2, dim dimVar3) {
        return (szz.c((aoam) dimVar.b, (aoam) dimVar.a) && szz.c((aoam) dimVar2.b, (aoam) dimVar2.a) && szz.c((aoam) dimVar3.b, (aoam) dimVar3.a)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(con conVar, dlo dloVar, aoam aoamVar) {
        String m;
        if (conVar == null || aoamVar.aa() == 0 || (m = aoamVar.ab(0).m()) == null) {
            return;
        }
        String scheme = sgf.n(m).getScheme();
        if (("http".equals(scheme) || "https".equals(scheme)) && dloVar.a > 0 && dloVar.b > 0) {
            ((con) conVar.clone().u(csk.b)).p(dloVar.a, dloVar.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void e(dhe dheVar, ImageView imageView, aoam aoamVar, aoam aoamVar2, aoam aoamVar3, ajzi ajziVar, Boolean bool, sxc sxcVar, szn sznVar, con conVar, dlo dloVar, syd sydVar, syj syjVar, boolean z) {
        if (conVar == null) {
            if (!z || sgf.p(dheVar.b)) {
                return;
            }
            int aa = aoamVar.aa();
            StringBuilder sb = new StringBuilder(207);
            sb.append("Failed to find a valid source for the image. Sources: ");
            sb.append(aa);
            sb.append(". Please make sure image source array is not empty and each image source has proper remote url / client resource name / serialized image data.");
            sydVar.c(23, sb.toString(), sxcVar);
            return;
        }
        conVar.a(new swl());
        if (bool != null && bool.booleanValue()) {
            imageView.setTag(R.id.elements_image, szz.h(aoamVar));
        }
        conVar.q(new swk(dloVar, imageView, aoamVar, ajziVar, aoamVar2, aoamVar3, sznVar, sydVar, syjVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(dhe dheVar, ImageView imageView, Boolean bool, szn sznVar) {
        Context context = dheVar.b;
        if (!sgf.p(context)) {
            cnv.c(context).i(imageView);
        }
        if (bool != null && bool.booleanValue()) {
            imageView.setTag(R.id.elements_image, null);
        }
        if (sznVar != null) {
            sznVar.d();
            sznVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void g(dhe dheVar, dhi dhiVar, aoam aoamVar, int i, aoam aoamVar2, aoam aoamVar3, baql baqlVar, baql baqlVar2) {
        Context context = dheVar.b;
        baqlVar2.a = new dlo(dhiVar.H(), dhiVar.C());
        con q = sgf.q(context, aoamVar, aoamVar2, aoamVar3, dhiVar.H(), dhiVar.C());
        if (q == null) {
            return;
        }
        if (i == 1) {
            q.k((cos) b.get());
        }
        baqlVar.a = q;
    }
}
