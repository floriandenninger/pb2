package com.google.android.libraries.youtube.innertube.model.ads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.aamk;
import defpackage.aamt;
import defpackage.aamu;
import defpackage.amkq;
import defpackage.own;
import defpackage.yny;
import defpackage.zhq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SurveyQuestion implements Parcelable, aamu {
    public static final Parcelable.Creator CREATOR = new aamk(4);
    private final own a;
    private List b;

    public SurveyQuestion(own ownVar) {
        ownVar.getClass();
        this.a = ownVar;
        zhq.m(ownVar.b);
        amkq.N(aamt.a(ownVar.d) != aamt.UNSUPPORTED);
        amkq.N(ownVar.c.size() > 0);
    }

    @Override // defpackage.aamu
    public final int a() {
        return this.a.h;
    }

    @Override // defpackage.aamu
    public final int b() {
        return this.a.i;
    }

    public final List c() {
        return Collections.unmodifiableList(this.a.j);
    }

    @Override // defpackage.aamu
    public final aamt d() {
        return aamt.a(this.a.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.aamu
    public final String e() {
        return TextUtils.join(".", this.a.j);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        SurveyQuestion surveyQuestion = (SurveyQuestion) obj;
        return amkq.b(Integer.valueOf(b()), Integer.valueOf(surveyQuestion.b())) && amkq.b(d(), surveyQuestion.d()) && amkq.b(c(), surveyQuestion.c()) && amkq.b(g(), surveyQuestion.g()) && amkq.b(h(), surveyQuestion.h()) && amkq.b(i(), surveyQuestion.i()) && amkq.b(f(), surveyQuestion.f()) && amkq.b(Integer.valueOf(a()), Integer.valueOf(surveyQuestion.a()));
    }

    @Override // defpackage.aamu
    public final String f() {
        return this.a.g;
    }

    @Override // defpackage.aamu
    public final String g() {
        return this.a.b;
    }

    @Override // defpackage.aamu
    public final List h() {
        return Collections.unmodifiableList(this.a.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(b()), d(), c(), g(), h(), i(), f(), Integer.valueOf(a())});
    }

    @Override // defpackage.aamu
    public final List i() {
        this.b = new ArrayList();
        Iterator it = this.a.f.iterator();
        while (it.hasNext()) {
            this.b.add(Uri.parse((String) it.next()));
        }
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.aamu
    public final boolean j() {
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(d());
        String g = g();
        String valueOf2 = String.valueOf(h());
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(g).length() + String.valueOf(valueOf2).length());
        sb.append("Question [type: ");
        sb.append(valueOf);
        sb.append("question:\"");
        sb.append(g);
        sb.append("\" answers: ");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yny.I(this.a, parcel);
    }
}
