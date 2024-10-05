package com.google.android.libraries.youtube.innertube.model.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.player.LoggingUrlModel;
import defpackage.aamk;
import defpackage.amkq;
import defpackage.amnv;
import defpackage.aone;
import defpackage.aonm;
import defpackage.aonu;
import defpackage.asuq;
import defpackage.asur;
import defpackage.asus;
import defpackage.owd;
import defpackage.yny;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LoggingUrlModel implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new aamk(16);
    public final String a;
    private final Set b;

    public LoggingUrlModel(owd owdVar) {
        this.a = (owdVar.b & 1) != 0 ? owdVar.c : "";
        final int i = 0;
        amkq.x(new amnv(this) { // from class: aapg
            public final /* synthetic */ LoggingUrlModel a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                return i != 0 ? Uri.parse(this.a.a) : Uri.parse(this.a.a);
            }
        });
        this.b = new HashSet();
        Iterator it = owdVar.d.iterator();
        while (it.hasNext()) {
            asuq b = asuq.b(((Integer) it.next()).intValue());
            if (b != null) {
                this.b.add(b);
            }
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((LoggingUrlModel) obj).a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aone createBuilder = owd.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        owd owdVar = (owd) createBuilder.instance;
        str.getClass();
        owdVar.b |= 1;
        owdVar.c = str;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            int i2 = ((asuq) it.next()).g;
            createBuilder.copyOnWrite();
            owd owdVar2 = (owd) createBuilder.instance;
            aonu aonuVar = owdVar2.d;
            if (!aonuVar.c()) {
                owdVar2.d = aonm.mutableCopy(aonuVar);
            }
            owdVar2.d.g(i2);
        }
        yny.I((owd) createBuilder.build(), parcel);
    }

    public LoggingUrlModel(asus asusVar) {
        final int i = 1;
        amkq.N(1 == (asusVar.b & 1));
        this.a = asusVar.c;
        amkq.x(new amnv(this) { // from class: aapg
            public final /* synthetic */ LoggingUrlModel a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                return i != 0 ? Uri.parse(this.a.a) : Uri.parse(this.a.a);
            }
        });
        this.b = new HashSet();
        if (asusVar.d.size() != 0) {
            for (asur asurVar : asusVar.d) {
                Set set = this.b;
                asuq b = asuq.b(asurVar.c);
                if (b == null) {
                    b = asuq.UNKNOWN;
                }
                set.add(b);
            }
        }
    }
}
