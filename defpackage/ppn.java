package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ppn implements plf {
    private final /* synthetic */ int c;
    public static final /* synthetic */ ppn b = new ppn(1);
    public static final /* synthetic */ ppn a = new ppn(0);

    private /* synthetic */ ppn(int i) {
        this.c = i;
    }

    @Override // defpackage.plf
    public final plg a(Bundle bundle) {
        if (this.c == 0) {
            ppo ppoVar = new ppo();
            CharSequence charSequence = bundle.getCharSequence(ppp.a(0));
            if (charSequence != null) {
                ppoVar.a = charSequence;
            }
            Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(ppp.a(1));
            if (alignment != null) {
                ppoVar.c = alignment;
            }
            Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(ppp.a(2));
            if (alignment2 != null) {
                ppoVar.d = alignment2;
            }
            Bitmap bitmap = (Bitmap) bundle.getParcelable(ppp.a(3));
            if (bitmap != null) {
                ppoVar.b = bitmap;
            }
            if (bundle.containsKey(ppp.a(4)) && bundle.containsKey(ppp.a(5))) {
                ppoVar.b(bundle.getFloat(ppp.a(4)), bundle.getInt(ppp.a(5)));
            }
            if (bundle.containsKey(ppp.a(6))) {
                ppoVar.e = bundle.getInt(ppp.a(6));
            }
            if (bundle.containsKey(ppp.a(7))) {
                ppoVar.f = bundle.getFloat(ppp.a(7));
            }
            if (bundle.containsKey(ppp.a(8))) {
                ppoVar.g = bundle.getInt(ppp.a(8));
            }
            if (bundle.containsKey(ppp.a(10)) && bundle.containsKey(ppp.a(9))) {
                ppoVar.c(bundle.getFloat(ppp.a(10)), bundle.getInt(ppp.a(9)));
            }
            if (bundle.containsKey(ppp.a(11))) {
                ppoVar.h = bundle.getFloat(ppp.a(11));
            }
            if (bundle.containsKey(ppp.a(12))) {
                ppoVar.i = bundle.getFloat(ppp.a(12));
            }
            if (bundle.containsKey(ppp.a(13))) {
                ppoVar.d(bundle.getInt(ppp.a(13)));
            }
            if (!bundle.getBoolean(ppp.a(14), false)) {
                ppoVar.j = false;
            }
            if (bundle.containsKey(ppp.a(15))) {
                ppoVar.k = bundle.getInt(ppp.a(15));
            }
            if (bundle.containsKey(ppp.a(16))) {
                ppoVar.l = bundle.getFloat(ppp.a(16));
            }
            return ppoVar.a();
        }
        return new asf(bundle.getInt(asf.c(0), -1), bundle.getInt(asf.c(1), -1), bundle.getInt(asf.c(2), -1), bundle.getByteArray(asf.c(3)));
    }
}
