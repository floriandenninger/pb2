package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxx {
    final aeg a;
    final aeg b;
    final aeg c;
    public final Parcel d;
    private final SparseIntArray e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public bxx(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new aeg(), new aeg(), new aeg());
    }

    private final Class v(Class cls) {
        Class cls2 = (Class) this.c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls3);
        return cls3;
    }

    public final int a(int i, int i2) {
        return !s(i2) ? i : this.d.readInt();
    }

    public final Parcelable b(Parcelable parcelable, int i) {
        return !s(i) ? parcelable : this.d.readParcelable(getClass().getClassLoader());
    }

    public final bxy c() {
        String n = n();
        if (n == null) {
            return null;
        }
        bxx m = m();
        try {
            Method method = (Method) this.a.get(n);
            if (method == null) {
                method = Class.forName(n, true, bxx.class.getClassLoader()).getDeclaredMethod("read", bxx.class);
                this.a.put(n, method);
            }
            return (bxy) method.invoke(null, m);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(e4);
        }
    }

    public final CharSequence d(CharSequence charSequence, int i) {
        return !s(i) ? charSequence : (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.d);
    }

    public final String e(String str, int i) {
        return !s(i) ? str : n();
    }

    public final void f(boolean z, int i) {
        p(i);
        this.d.writeInt(z ? 1 : 0);
    }

    public final void g(CharSequence charSequence, int i) {
        p(i);
        TextUtils.writeToParcel(charSequence, this.d, 0);
    }

    public final void h(int i, int i2) {
        p(i2);
        q(i);
    }

    public final void i(Parcelable parcelable, int i) {
        p(i);
        this.d.writeParcelable(parcelable, 0);
    }

    public final void j(String str, int i) {
        p(i);
        r(str);
    }

    public final void k(bxy bxyVar) {
        if (bxyVar != null) {
            try {
                r(v(bxyVar.getClass()).getName());
                bxx m = m();
                try {
                    Class<?> cls = bxyVar.getClass();
                    Method method = (Method) this.b.get(cls.getName());
                    if (method == null) {
                        method = v(cls).getDeclaredMethod("write", cls, bxx.class);
                        this.b.put(cls.getName(), method);
                    }
                    method.invoke(null, bxyVar, m);
                    m.o();
                    return;
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    Throwable cause = e4.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(e4);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException(bxyVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
            }
        }
        r(null);
    }

    public final boolean l(boolean z, int i) {
        return s(i) ? this.d.readInt() != 0 : z;
    }

    protected final bxx m() {
        Parcel parcel = this.d;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new bxx(parcel, dataPosition, i, this.h + "  ", this.a, this.b, this.c);
    }

    public final String n() {
        return this.d.readString();
    }

    public final void o() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.e.get(i);
            int dataPosition = this.d.dataPosition();
            this.d.setDataPosition(i2);
            this.d.writeInt(dataPosition - i2);
            this.d.setDataPosition(dataPosition);
        }
    }

    public final void p(int i) {
        o();
        this.i = i;
        this.e.put(i, this.d.dataPosition());
        q(0);
        q(i);
    }

    public final void q(int i) {
        this.d.writeInt(i);
    }

    public final void r(String str) {
        this.d.writeString(str);
    }

    public final boolean s(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.d.setDataPosition(this.j);
            int readInt = this.d.readInt();
            this.k = this.d.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    public final bxy t(bxy bxyVar) {
        return !s(1) ? bxyVar : c();
    }

    public final void u(bxy bxyVar) {
        p(1);
        k(bxyVar);
    }

    private bxx(Parcel parcel, int i, int i2, String str, aeg aegVar, aeg aegVar2, aeg aegVar3) {
        this.a = aegVar;
        this.b = aegVar2;
        this.c = aegVar3;
        this.e = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.d = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
