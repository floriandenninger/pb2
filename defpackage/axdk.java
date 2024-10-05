package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axdk extends aonm implements axdl {
    private static final axdk a;
    private static volatile aopf b;
    private int c;
    private int d;
    private int e;
    private axdi f;
    private aorq g;
    private int h;
    private aony i = emptyProtobufList();
    private aorq j;
    private long k;
    private axep l;

    static {
        axdk axdkVar = new axdk();
        a = axdkVar;
        aonm.registerDefaultInstance(axdk.class, axdkVar);
    }

    private axdk() {
    }

    public void A(axcv axcvVar) {
        axcvVar.getClass();
        C();
        this.i.add(axcvVar);
    }

    public void B() {
        this.i = emptyProtobufList();
    }

    private void C() {
        aony aonyVar = this.i;
        if (aonyVar.c()) {
            return;
        }
        this.i = aonm.mutableCopy(aonyVar);
    }

    public void D(int i) {
        this.c |= 2;
        this.e = i;
    }

    public void E(aorq aorqVar) {
        aorqVar.getClass();
        this.g = aorqVar;
        this.c |= 8;
    }

    public void F(axdi axdiVar) {
        axdiVar.getClass();
        this.f = axdiVar;
        this.c |= 4;
    }

    public void G(int i) {
        this.c |= 1;
        this.d = i;
    }

    public static axdj j() {
        return (axdj) a.createBuilder();
    }

    public static axdk l() {
        return a;
    }

    public static axdk m(byte[] bArr, aomw aomwVar) {
        return (axdk) aonm.parseFrom(a, bArr, aomwVar);
    }

    public static /* synthetic */ void p(axdk axdkVar, int i) {
        axdkVar.G(i);
    }

    public static /* synthetic */ void q(axdk axdkVar, int i) {
        axdkVar.D(i);
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.i.size();
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.h;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004\u0006\u001b\u0007ဂ\u0006\tဉ\u0007\nဉ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i", axcv.class, "k", "l", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new axdk();
            case NEW_BUILDER:
                return new axdj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axdk.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public long e() {
        return this.k;
    }

    public aorq f() {
        aorq aorqVar = this.g;
        return aorqVar == null ? aorq.a : aorqVar;
    }

    public aorq g() {
        aorq aorqVar = this.j;
        return aorqVar == null ? aorq.a : aorqVar;
    }

    public axcv h(int i) {
        return (axcv) this.i.get(0);
    }

    public axdi i() {
        axdi axdiVar = this.f;
        return axdiVar == null ? axdi.a : axdiVar;
    }

    public axep n() {
        axep axepVar = this.l;
        return axepVar == null ? axep.a : axepVar;
    }

    public List o() {
        return this.i;
    }

    public boolean v() {
        return (this.c & 128) != 0;
    }

    public boolean w() {
        return (this.c & 8) != 0;
    }

    public boolean x() {
        return (this.c & 4) != 0;
    }

    public boolean y() {
        return (this.c & 32) != 0;
    }

    public boolean z() {
        return (this.c & 16) != 0;
    }
}
