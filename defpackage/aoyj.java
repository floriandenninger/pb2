package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoyj extends aonm implements aooz {
    public static final aoyj a;
    private static volatile aopf t;
    public aony d;
    public aony e;
    public aony f;
    public aony g;
    public aony h;
    public aony i;
    public aony j;
    public aony k;
    public aony l;
    public aony m;
    public aony n;
    public aony o;
    public aony p;
    public aony q;
    public aony r;
    public aony s;
    private byte u = 2;
    public aony b = emptyProtobufList();
    public aony c = emptyProtobufList();

    static {
        aoyj aoyjVar = new aoyj();
        a = aoyjVar;
        aonm.registerDefaultInstance(aoyj.class, aoyjVar);
    }

    private aoyj() {
        emptyProtobufList();
        emptyProtobufList();
        this.d = emptyProtobufList();
        emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = emptyProtobufList();
        this.h = emptyProtobufList();
        this.i = emptyProtobufList();
        this.j = emptyProtobufList();
        this.k = emptyProtobufList();
        this.l = emptyProtobufList();
        this.m = emptyProtobufList();
        this.n = emptyProtobufList();
        emptyProtobufList();
        this.o = emptyProtobufList();
        this.p = emptyProtobufList();
        this.q = emptyProtobufList();
        this.r = emptyProtobufList();
        this.s = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.u);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0000\u0001\u0016\u0012\u0000\u0012\u0012\u0001Л\u0002Л\u0005Л\u0007Л\bЛ\tЛ\nЛ\u000bЛ\fЛ\rЛ\u000eЛ\u000fЛ\u0010Л\u0012Л\u0013Л\u0014Л\u0015Л\u0016Л", new Object[]{"b", apxf.class, "c", apxf.class, "d", apxf.class, "e", apxf.class, "f", apxf.class, "g", apxf.class, "h", aozf.class, "i", apxf.class, "j", apxf.class, "k", apxf.class, "l", apxf.class, "m", apxf.class, "n", apxf.class, "o", apxf.class, "p", apxf.class, "q", apxf.class, "r", apxf.class, "s", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new aoyj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (aoyj.class) {
                        aopfVar = t;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            t = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
