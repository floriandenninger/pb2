package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agnn {
    public final agnm a;
    public final agnm b;
    public final long c;
    public final long d;
    public final boolean e;
    public final String f;
    public final boolean g;
    private final agnm h;

    public agnn(agnm agnmVar, agnm agnmVar2, boolean z) {
        long j;
        agnm agnmVar3 = agnmVar == null ? agnmVar2 : agnmVar;
        agnmVar3.getClass();
        this.h = agnmVar3;
        this.a = agnmVar;
        this.b = agnmVar2;
        this.e = z;
        if (agnmVar == null) {
            agnmVar = null;
            j = 0;
        } else {
            j = agnmVar.d;
        }
        this.c = j + (agnmVar2 == null ? 0L : agnmVar2.d);
        this.d = (agnmVar == null ? 0L : agnmVar.b()) + (agnmVar2 != null ? agnmVar2.b() : 0L);
        this.f = agnmVar3.l;
        String str = agnmVar3.l;
        boolean z2 = false;
        if (!TextUtils.isEmpty(str) && !str.startsWith("0000-0000")) {
            z2 = true;
        }
        this.g = z2;
    }

    public static agnn e(agnm agnmVar, agnm agnmVar2) {
        return new agnn(agnmVar, agnmVar2, true);
    }

    public final FormatStreamModel a() {
        agnm agnmVar = this.b;
        if (agnmVar != null) {
            return agnmVar.b;
        }
        return null;
    }

    public final FormatStreamModel b(List list) {
        agnm agnmVar = this.b;
        if (agnmVar != null && agnmVar.i() && this.b.j(list)) {
            return this.b.b;
        }
        return null;
    }

    public final FormatStreamModel c() {
        agnm agnmVar = this.a;
        if (agnmVar != null) {
            return agnmVar.b;
        }
        return null;
    }

    public final FormatStreamModel d(List list) {
        agnm agnmVar = this.a;
        if (agnmVar != null && agnmVar.i() && this.a.j(list)) {
            return this.a.b;
        }
        return null;
    }

    public final String f() {
        return this.h.g();
    }
}
