package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class axku implements Iterator, Closeable, j$.util.Iterator, deg {
    public static final deb p = new axkt();
    protected ddx q;
    public axkv r;
    public deb s = null;
    long t = 0;
    long u = 0;
    long v = 0;
    public List w = new ArrayList();

    static {
        axna.d(axku.class);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.r.close();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // defpackage.deg
    public final ByteBuffer h(long j, long j2) {
        ByteBuffer e;
        axkv axkvVar = this.r;
        if (axkvVar != null) {
            synchronized (axkvVar) {
                e = this.r.e(this.u + j, j2);
            }
            return e;
        }
        ByteBuffer allocate = ByteBuffer.allocate(awxt.g(j2));
        long j3 = j + j2;
        long j4 = 0;
        for (deb debVar : this.w) {
            long b = debVar.b() + j4;
            if (b > j && j4 < j3) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                WritableByteChannel newChannel = Channels.newChannel(byteArrayOutputStream);
                debVar.e(newChannel);
                newChannel.close();
                if (j4 >= j && b <= j3) {
                    allocate.put(byteArrayOutputStream.toByteArray());
                } else if (j4 < j && b > j3) {
                    long j5 = j - j4;
                    allocate.put(byteArrayOutputStream.toByteArray(), awxt.g(j5), awxt.g((debVar.b() - j5) - (b - j3)));
                } else if (j4 < j && b <= j3) {
                    long j6 = j - j4;
                    allocate.put(byteArrayOutputStream.toByteArray(), awxt.g(j6), awxt.g(debVar.b() - j6));
                } else if (j4 >= j && b > j3) {
                    allocate.put(byteArrayOutputStream.toByteArray(), 0, awxt.g(debVar.b() - (b - j3)));
                }
            }
            j4 = b;
        }
        return (ByteBuffer) allocate.rewind();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        deb debVar = this.s;
        if (debVar == p) {
            return false;
        }
        if (debVar != null) {
            return true;
        }
        try {
            this.s = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.s = p;
            return false;
        }
    }

    @Override // defpackage.deg
    public final List i() {
        return (this.r == null || this.s == p) ? this.w : new axmz(this.w, this);
    }

    @Override // defpackage.deg
    public final List j(Class cls) {
        List i = i();
        ArrayList arrayList = null;
        deb debVar = null;
        for (int i2 = 0; i2 < i.size(); i2++) {
            deb debVar2 = (deb) i.get(i2);
            if (cls.isInstance(debVar2)) {
                if (debVar == null) {
                    debVar = debVar2;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList(2);
                        arrayList.add(debVar);
                    }
                    arrayList.add(debVar2);
                }
            }
        }
        if (arrayList != null) {
            return arrayList;
        }
        if (debVar != null) {
            return Collections.singletonList(debVar);
        }
        return Collections.emptyList();
    }

    @Override // defpackage.deg
    public final void k(WritableByteChannel writableByteChannel) {
        java.util.Iterator it = i().iterator();
        while (it.hasNext()) {
            ((deb) it.next()).e(writableByteChannel);
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public void t(axkv axkvVar, long j, ddx ddxVar) {
        this.r = axkvVar;
        long b = axkvVar.b();
        this.u = b;
        this.t = b;
        axkvVar.f(axkvVar.b() + j);
        this.v = axkvVar.b();
        this.q = ddxVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.w.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((deb) this.w.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long u() {
        long j = 0;
        for (int i = 0; i < i().size(); i++) {
            j += ((deb) this.w.get(i)).b();
        }
        return j;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final deb next() {
        deb a;
        deb debVar = this.s;
        if (debVar == null || debVar == p) {
            axkv axkvVar = this.r;
            if (axkvVar == null || this.t >= this.v) {
                this.s = p;
                throw new NoSuchElementException();
            }
            try {
                synchronized (axkvVar) {
                    this.r.f(this.t);
                    a = this.q.a(this.r, this);
                    this.t = this.r.b();
                }
                return a;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.s = null;
        return debVar;
    }

    public final void w(deb debVar) {
        if (debVar != null) {
            this.w = new ArrayList(i());
            debVar.g(this);
            this.w.add(debVar);
        }
    }

    public final List x(Class cls) {
        ArrayList arrayList = new ArrayList(2);
        List i = i();
        for (int i2 = 0; i2 < i.size(); i2++) {
            deb debVar = (deb) i.get(i2);
            if (cls.isInstance(debVar)) {
                arrayList.add(debVar);
            }
        }
        return arrayList;
    }
}
