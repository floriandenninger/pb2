package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.libraries.glide.fife.ProvidedFifeUrl;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vkb {
    public static final amsx a = amsx.t("android.resource", "content", "file");
    private final ammv b;
    private final Resources c;
    private final aolb d = new aolb(null);

    public vkb(ammv ammvVar, Resources resources) {
        this.b = ammvVar;
        this.c = resources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [vkd] */
    private final con d(con conVar, Uri uri, aoae aoaeVar) {
        ArrayList arrayList = new ArrayList();
        for (vkc vkcVar : aoaeVar.b) {
            vkc vkcVar2 = vkc.CENTER_CROP;
            int ordinal = vkcVar.ordinal();
            if (ordinal == 0) {
                arrayList.add(new cxi());
            } else if (ordinal == 1) {
                arrayList.add(new cyo(this.c.getDimensionPixelSize(R.dimen.photo_picker_corner_crop_radius)));
            } else if (ordinal == 2) {
                arrayList.add(new cxk());
            } else if (ordinal == 3) {
                arrayList.add(new cyc());
            } else if (ordinal == 4) {
                arrayList.add(new cxj());
            }
        }
        con conVar2 = (con) ((con) conVar.L((cqr[]) arrayList.toArray(new cxh[0]))).u(axxp.a.get().l() ? csk.c : csk.a);
        if (this.d.i(uri)) {
            tcn tcnVar = new tcn();
            if (aoaeVar.b.contains(vkc.CENTER_CROP)) {
                tcnVar.b(33554432);
            }
            if (aoaeVar.b.contains(vkc.FORCE_MONOGRAM)) {
                tcnVar.b(268435456);
            }
            ammv ammvVar = this.b;
            uri = new vkd(new tcm(new ProvidedFifeUrl(uri.toString()), tcnVar, ammvVar.h() ? ((Integer) ((vjz) ammvVar.c()).a.e(-1)).intValue() : -1));
        }
        return (con) conVar2.h(uri).I(cwr.a, 7500);
    }

    public final con a(Context context, Uri uri, aoae aoaeVar) {
        return d(cnv.c(context).b(), uri, aoaeVar);
    }

    public final con b(Context context, Uri uri, aoae aoaeVar) {
        return d(cnv.c(context).c(), uri, aoaeVar);
    }

    public final void c(Uri uri, aoae aoaeVar, SquareImageView squareImageView) {
        ((con) a(squareImageView.getContext(), uri, aoaeVar).H(cof.NORMAL)).q(squareImageView.b);
    }
}
