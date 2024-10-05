package defpackage;

import android.text.Html;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiuo implements afts {
    private final List c = new ArrayList();
    public final List a = new ArrayList();
    public final List b = new ArrayList();

    @Override // defpackage.afts
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aiup a() {
        List list = this.c;
        List list2 = this.a;
        List list3 = this.b;
        ArrayList arrayList = new ArrayList(list3.size());
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Html.fromHtml((String) it.next()));
        }
        return new aiup(list, list2, arrayList);
    }

    public final void c(String str, long j, long j2) {
        if (!this.c.isEmpty() && j < ((Long) amkq.bj(this.c)).longValue()) {
            zga.l("subtitles are not given in non-decreasing start time order");
        }
        this.c.add(Long.valueOf(j));
        this.a.add(Long.valueOf(j2));
        this.b.add(str);
    }
}
