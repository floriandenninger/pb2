package com.google.android.libraries.youtube.innertube.model.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aamk;
import defpackage.aamq;
import defpackage.aamr;
import defpackage.aams;
import defpackage.afrd;
import defpackage.afre;
import defpackage.amkq;
import defpackage.aolo;
import defpackage.aomw;
import defpackage.aone;
import defpackage.aonm;
import defpackage.aonu;
import defpackage.aony;
import defpackage.aoob;
import defpackage.opn;
import defpackage.owm;
import defpackage.own;
import defpackage.yny;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Survey implements Parcelable, aamr, afre {
    public static final Parcelable.Creator CREATOR;
    public static final aamq a;
    public final owm b;
    private List c;

    static {
        new Survey();
        a = new aamq();
        CREATOR = new aamk(3);
    }

    private Survey() {
        this.b = owm.a;
    }

    @Override // defpackage.aamr
    public final List ah() {
        SurveyQuestion surveyQuestion;
        if (this.c == null) {
            this.c = new ArrayList();
            for (own ownVar : this.b.b) {
                List list = this.c;
                aone builder = ownVar.toBuilder();
                ArrayList arrayList = new ArrayList(ownVar.c);
                ArrayList arrayList2 = new ArrayList(ownVar.f);
                builder.copyOnWrite();
                ((own) builder.instance).f = aonm.emptyProtobufList();
                builder.copyOnWrite();
                own ownVar2 = (own) builder.instance;
                aony aonyVar = ownVar2.f;
                if (!aonyVar.c()) {
                    ownVar2.f = aonm.mutableCopy(aonyVar);
                }
                aolo.addAll((Iterable) arrayList2, (List) ownVar2.f);
                if (((own) builder.instance).j.size() <= 0) {
                    int t = opn.t(((own) builder.instance).e);
                    if (t == 0) {
                        t = 1;
                    }
                    aams a2 = aams.a(t, arrayList);
                    builder.copyOnWrite();
                    ((own) builder.instance).c = aonm.emptyProtobufList();
                    amkq.N(arrayList.size() == a2.a.size());
                    ArrayList arrayList3 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList3.add((String) arrayList.get(((Integer) a2.a.get(i)).intValue()));
                    }
                    for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                        String str = (String) arrayList3.get(i2);
                        builder.copyOnWrite();
                        own ownVar3 = (own) builder.instance;
                        str.getClass();
                        aony aonyVar2 = ownVar3.c;
                        if (!aonyVar2.c()) {
                            ownVar3.c = aonm.mutableCopy(aonyVar2);
                        }
                        ownVar3.c.add(str);
                    }
                    builder.copyOnWrite();
                    ((own) builder.instance).j = own.emptyIntList();
                    List list2 = a2.a;
                    builder.copyOnWrite();
                    own ownVar4 = (own) builder.instance;
                    aonu aonuVar = ownVar4.j;
                    if (!aonuVar.c()) {
                        ownVar4.j = aonm.mutableCopy(aonuVar);
                    }
                    aolo.addAll((Iterable) list2, (List) ownVar4.j);
                }
                try {
                    surveyQuestion = new SurveyQuestion((own) aonm.parseFrom(own.a, ((own) builder.build()).toByteArray(), aomw.b()));
                } catch (aoob unused) {
                    surveyQuestion = null;
                }
                list.add(surveyQuestion);
            }
            this.c = Collections.unmodifiableList(this.c);
        }
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass().equals(obj.getClass()) && amkq.b(ah(), ((Survey) obj).ah());
    }

    @Override // defpackage.afre
    public final /* bridge */ /* synthetic */ afrd h() {
        return new aamq(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{ah()});
    }

    public final String toString() {
        String valueOf = String.valueOf(ah().toString());
        return valueOf.length() != 0 ? "Survey ".concat(valueOf) : new String("Survey ");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yny.I(this.b, parcel);
    }

    public Survey(owm owmVar) {
        owmVar.getClass();
        amkq.N(owmVar.b.size() > 0);
        this.b = owmVar;
    }
}
