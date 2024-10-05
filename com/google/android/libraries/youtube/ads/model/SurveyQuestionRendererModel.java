package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aamt;
import defpackage.aamu;
import defpackage.ajcq;
import defpackage.amkq;
import defpackage.aoye;
import defpackage.aqyg;
import defpackage.avbl;
import defpackage.avbn;
import defpackage.wbs;
import defpackage.xes;
import defpackage.yny;
import defpackage.zga;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SurveyQuestionRendererModel implements Parcelable, aamu {
    public static final Parcelable.Creator CREATOR = new xes(6);
    private final avbl a;
    private List b;
    private List c;

    public SurveyQuestionRendererModel(avbl avblVar) {
        avblVar.getClass();
        this.a = avblVar;
    }

    @Override // defpackage.aamu
    public final int a() {
        avbn avbnVar = this.a.f;
        if (avbnVar == null) {
            avbnVar = avbn.a;
        }
        if (avbnVar.b <= 0) {
            return 15;
        }
        avbn avbnVar2 = this.a.f;
        if (avbnVar2 == null) {
            avbnVar2 = avbn.a;
        }
        return avbnVar2.b;
    }

    @Override // defpackage.aamu
    public final int b() {
        return 0;
    }

    public final int c() {
        avbn avbnVar = this.a.f;
        if (avbnVar == null) {
            avbnVar = avbn.a;
        }
        if (avbnVar.c <= 0) {
            return 0;
        }
        avbn avbnVar2 = this.a.f;
        if (avbnVar2 == null) {
            avbnVar2 = avbn.a;
        }
        return avbnVar2.c;
    }

    @Override // defpackage.aamu
    public final aamt d() {
        int i = this.a.e;
        if (i <= 0) {
            return aamt.UNSUPPORTED;
        }
        if (i == 1) {
            return aamt.SINGLE_ANSWERS;
        }
        return aamt.MULTI_SELECT;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.aamu
    public final String e() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SurveyQuestionRendererModel) {
            return amkq.b(this.a, ((SurveyQuestionRendererModel) obj).a);
        }
        return false;
    }

    @Override // defpackage.aamu
    public final String f() {
        return "";
    }

    @Override // defpackage.aamu
    public final List h() {
        if (this.b == null) {
            this.b = new ArrayList();
            Iterator it = this.a.d.iterator();
            while (it.hasNext()) {
                this.b.add(ajcq.b((aqyg) it.next()).toString());
            }
        }
        return Collections.unmodifiableList(this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // defpackage.aamu
    public final boolean j() {
        return this.a.e > 1;
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

    @Override // defpackage.aamu
    public final String g() {
        aqyg aqygVar;
        avbl avblVar = this.a;
        int i = avblVar.b & 1;
        if (i == 0) {
            zga.b("Survey question doesn't contain any question text.");
            return "";
        }
        if (i != 0) {
            aqygVar = avblVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar).toString();
    }

    @Override // defpackage.aamu
    public final List i() {
        if ((this.a.b & 32) == 0) {
            return Collections.emptyList();
        }
        if (this.c == null) {
            this.c = new ArrayList();
            avbn avbnVar = this.a.f;
            if (avbnVar == null) {
                avbnVar = avbn.a;
            }
            Iterator it = avbnVar.d.iterator();
            while (it.hasNext()) {
                try {
                    this.c.add(wbs.ai(((aoye) it.next()).c));
                } catch (MalformedURLException unused) {
                    zga.l("Badly formed uri - ignoring");
                }
            }
        }
        return this.c;
    }
}
