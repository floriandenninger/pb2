package defpackage;

import com.google.android.libraries.youtube.edit.audioswap.model.CategorySelection;
import com.google.android.libraries.youtube.edit.audioswap.model.FeaturedTrackSelection;
import com.google.android.libraries.youtube.edit.audioswap.model.OnDeviceTrackSelection;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zkz extends dk {
    private final List a;
    private final List c;
    private final List d;

    public zkz(dd ddVar, FeaturedTrackSelection featuredTrackSelection, CategorySelection categorySelection, OnDeviceTrackSelection onDeviceTrackSelection) {
        super(ddVar);
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.d = arrayList3;
        if (featuredTrackSelection != null) {
            zlu zluVar = new zlu();
            zluVar.b = featuredTrackSelection;
            arrayList.add(zluVar);
            arrayList2.add(featuredTrackSelection.b);
            arrayList3.add(acsb.c(10712));
        }
        if (categorySelection != null) {
            zlk zlkVar = new zlk();
            zlkVar.b = categorySelection;
            arrayList.add(zlkVar);
            arrayList2.add(categorySelection.a);
            arrayList3.add(acsb.c(10710));
        }
        if (onDeviceTrackSelection != null) {
            zlu zluVar2 = new zlu();
            zluVar2.b = onDeviceTrackSelection;
            arrayList.add(zluVar2);
            arrayList2.add(onDeviceTrackSelection.b);
            arrayList3.add(acsb.c(10711));
        }
    }

    @Override // defpackage.dk
    public final ce b(int i) {
        List list = this.a;
        yjj.B(i, list.size());
        return (ce) list.get(i);
    }

    @Override // defpackage.bxz
    public final int j() {
        return this.a.size();
    }

    @Override // defpackage.bxz
    public final CharSequence l(int i) {
        List list = this.c;
        yjj.B(i, list.size());
        return (CharSequence) list.get(i);
    }

    public final acsc o(int i) {
        List list = this.d;
        yjj.B(i, list.size());
        return (acsc) list.get(i);
    }
}
