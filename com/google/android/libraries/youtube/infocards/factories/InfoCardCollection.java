package com.google.android.libraries.youtube.infocards.factories;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aaaa;
import defpackage.ajcq;
import defpackage.amkq;
import defpackage.aqyg;
import defpackage.args;
import defpackage.argu;
import defpackage.argx;
import defpackage.argy;
import defpackage.argz;
import defpackage.xes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class InfoCardCollection implements Parcelable {
    public static final Parcelable.Creator CREATOR = new xes(18);
    public final argu a;
    private List b;

    public InfoCardCollection(argu arguVar) {
        arguVar.getClass();
        this.a = arguVar;
    }

    public final CharSequence a() {
        aqyg aqygVar;
        argu arguVar = this.a;
        if ((arguVar.b & 4) != 0) {
            aqygVar = arguVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    public final List b() {
        if (this.b == null) {
            this.b = new ArrayList();
            Iterator it = this.a.c.iterator();
            while (it.hasNext()) {
                argy argyVar = ((argz) it.next()).b;
                if (argyVar == null) {
                    argyVar = argy.a;
                }
                this.b.add(new aaaa(argyVar));
            }
        }
        return this.b;
    }

    public final byte[] c() {
        args argsVar = this.a.i;
        if (argsVar == null) {
            argsVar = args.a;
        }
        if ((argsVar.b & 2) == 0) {
            return null;
        }
        args argsVar2 = this.a.i;
        if (argsVar2 == null) {
            argsVar2 = args.a;
        }
        argx argxVar = argsVar2.c;
        if (argxVar == null) {
            argxVar = argx.a;
        }
        return argxVar.b.I();
    }

    public final byte[] d() {
        args argsVar = this.a.h;
        if (argsVar == null) {
            argsVar = args.a;
        }
        if ((argsVar.b & 2) == 0) {
            return null;
        }
        args argsVar2 = this.a.h;
        if (argsVar2 == null) {
            argsVar2 = args.a;
        }
        argx argxVar = argsVar2.c;
        if (argxVar == null) {
            argxVar = argx.a;
        }
        return argxVar.b.I();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        amkq.cm(parcel, this.a);
    }
}
