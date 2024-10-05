package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jsu extends jsn {
    public final aaea a;
    private final Context b;
    private final azrw c;

    public jsu(Context context, aaea aaeaVar, azrw azrwVar) {
        super(jhv.class, aubs.class);
        this.b = context;
        this.a = aaeaVar;
        this.c = azrwVar;
    }

    @Override // defpackage.jtc
    public final /* synthetic */ Object b(Object obj, amrz amrzVar) {
        ArrayList arrayList;
        jsu jsuVar = this;
        jhv jhvVar = (jhv) obj;
        int intValue = ((Integer) e(amrzVar, "downloaded_playlist_selected_video_index")).intValue();
        String str = (String) e(amrzVar, "watch_command_params");
        aomf aomfVar = (aomf) e(amrzVar, "watch_command_click_tracking_params");
        int size = evr.W(jsuVar.a) ? jhvVar.f : jhvVar.e.size();
        aong aongVar = (aong) aubs.a.createBuilder();
        String str2 = jhvVar.a;
        aongVar.copyOnWrite();
        aubs aubsVar = (aubs) aongVar.instance;
        str2.getClass();
        aubsVar.c |= 32;
        aubsVar.k = str2;
        aongVar.copyOnWrite();
        aubs aubsVar2 = (aubs) aongVar.instance;
        aubsVar2.c |= 8;
        aubsVar2.j = intValue;
        aongVar.copyOnWrite();
        aubs aubsVar3 = (aubs) aongVar.instance;
        aubsVar3.c |= 64;
        aubsVar3.m = size;
        int i = 0;
        aqyg g = ajcq.g(jsuVar.b.getResources().getQuantityString(R.plurals.playlist_size, size, Integer.valueOf(size)));
        aongVar.copyOnWrite();
        aubs aubsVar4 = (aubs) aongVar.instance;
        g.getClass();
        aubsVar4.n = g;
        aubsVar4.c |= 128;
        if (!TextUtils.isEmpty(jhvVar.b)) {
            String str3 = jhvVar.b;
            aongVar.copyOnWrite();
            aubs aubsVar5 = (aubs) aongVar.instance;
            str3.getClass();
            aubsVar5.c |= 1;
            aubsVar5.g = str3;
        }
        if (!TextUtils.isEmpty(jhvVar.c)) {
            aqyg h = ajcq.h(jhvVar.c);
            aongVar.copyOnWrite();
            aubs aubsVar6 = (aubs) aongVar.instance;
            h.getClass();
            aubsVar6.q = h;
            aubsVar6.c |= 2048;
        }
        if (jhvVar.d.isPresent()) {
            arfs arfsVar = (arfs) jhvVar.d.get();
            aongVar.copyOnWrite();
            aubs aubsVar7 = (aubs) aongVar.instance;
            aubsVar7.B = arfsVar;
            aubsVar7.d |= 1;
        }
        String str4 = jhvVar.a;
        amru amruVar = jhvVar.e;
        ArrayList arrayList2 = new ArrayList();
        while (i < amruVar.size()) {
            int i2 = intValue;
            jhv jhvVar2 = jhvVar;
            aong aongVar2 = aongVar;
            int i3 = i;
            ArrayList arrayList3 = arrayList2;
            amru amruVar2 = amruVar;
            String str5 = str4;
            String str6 = str;
            Optional ofNullable = Optional.ofNullable((aubw) ((jti) jsuVar.c.get()).g(jht.class, aubw.class, (jht) amruVar.get(i), amrz.o("downloaded_video_playlist_id", str4, "downloaded_video_list_index", Integer.valueOf(i), "downloaded_playlist_selected_video_index", Integer.valueOf(intValue), "watch_command_params", str, "watch_command_click_tracking_params", aomfVar)));
            if (ofNullable.isPresent()) {
                aone createBuilder = aubr.a.createBuilder();
                aubw aubwVar = (aubw) ofNullable.get();
                createBuilder.copyOnWrite();
                aubr aubrVar = (aubr) createBuilder.instance;
                aubrVar.c = aubwVar;
                aubrVar.b |= 1;
                aubr aubrVar2 = (aubr) createBuilder.build();
                arrayList = arrayList3;
                arrayList.add(aubrVar2);
            } else {
                arrayList = arrayList3;
            }
            i = i3 + 1;
            jsuVar = this;
            intValue = i2;
            aongVar = aongVar2;
            arrayList2 = arrayList;
            amruVar = amruVar2;
            jhvVar = jhvVar2;
            str4 = str5;
            str = str6;
        }
        aong aongVar3 = aongVar;
        aongVar3.copyOnWrite();
        aubs aubsVar8 = (aubs) aongVar3.instance;
        aubsVar8.a();
        aolo.addAll((Iterable) arrayList2, (List) aubsVar8.i);
        jhvVar.g.filter(new Predicate() { // from class: jst
            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate.CC.$default$and(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate negate() {
                return Predicate.CC.$default$negate(this);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate.CC.$default$or(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final boolean test(Object obj2) {
                return evr.W(jsu.this.a);
            }
        }).ifPresent(new jsy(aongVar3, 1));
        return (aubs) aongVar3.build();
    }
}
