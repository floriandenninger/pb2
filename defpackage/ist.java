package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ist implements ayrv {
    public final /* synthetic */ itg a;
    private final /* synthetic */ int b;

    public /* synthetic */ ist(itg itgVar, int i) {
        this.b = i;
        this.a = itgVar;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ita itaVar = (ita) obj;
            return aypn.z(itaVar).j(this.a.e(itaVar));
        }
        if (i == 1) {
            ita itaVar2 = (ita) obj;
            return aypn.z(itaVar2).j(this.a.e(itaVar2));
        }
        if (i == 2) {
            return this.a.f((ita) obj);
        }
        if (i == 3) {
            Resources resources = this.a.g.getResources();
            int i2 = ((itb) obj).a;
            return resources.getQuantityString(R.plurals.upload_indicator_all_completed, i2, Integer.valueOf(i2));
        }
        if (i == 4) {
            itc itcVar = (itc) obj;
            Resources resources2 = this.a.g.getResources();
            int i3 = itcVar.a;
            int i4 = itcVar.b;
            if (i3 != i4) {
                return resources2.getQuantityString(R.plurals.upload_indicator_partial_fail, i4, Integer.valueOf(i3), Integer.valueOf(itcVar.b));
            }
            return resources2.getQuantityString(R.plurals.upload_indicator_all_failed, i3, Integer.valueOf(i3));
        }
        ite iteVar = (ite) obj;
        Resources resources3 = this.a.g.getResources();
        int i5 = iteVar.c;
        if (i5 == 0) {
            int i6 = iteVar.b;
            return resources3.getQuantityString(R.plurals.upload_indicator_all_uploading, i6, Integer.valueOf(i6));
        }
        Object[] objArr = {Integer.valueOf(i5)};
        int i7 = iteVar.b;
        return resources3.getString(R.string.upload_indicator_uploading_and_completed, resources3.getQuantityString(R.plurals.upload_indicator_uploading_and_completed_completed_part, i5, objArr), resources3.getQuantityString(R.plurals.upload_indicator_uploading_and_completed_uploading_part, i7, Integer.valueOf(i7)));
    }
}
