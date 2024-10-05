package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aph {
    public static final Class[] a = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final Map b;
    public final Map c;
    public final Map d;
    public final bub e;

    public aph() {
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new apf(this);
        this.b = new HashMap();
    }

    public aph(Map map) {
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new apf(this);
        this.b = new HashMap(map);
    }
}
