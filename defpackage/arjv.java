package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arjv extends aonh implements aoni {
    public static final arjv a;
    private static volatile aopf y;
    private aota A;
    private aulq B;
    private aulq C;
    private byte D = 2;
    public int b;
    public arnd c;
    public arjq d;
    public aulq e;
    public arjw f;
    public arjx g;
    public arjs h;
    public aulp i;
    public aomf j;
    public arjz k;
    public aony m;
    public aony n;
    public aony o;
    public apxf p;
    public apxf q;
    public apxf r;
    public boolean s;
    public int t;
    public int u;
    public aony v;
    public aqzg w;
    public apxf x;
    private arjr z;

    static {
        arjv arjvVar = new arjv();
        a = arjvVar;
        aonm.registerDefaultInstance(arjv.class, arjvVar);
    }

    private arjv() {
        emptyProtobufList();
        this.j = aomf.b;
        this.m = emptyProtobufList();
        this.n = emptyProtobufList();
        this.o = emptyProtobufList();
        this.v = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.D);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.D = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0019\u0000\u0001\u0001̉\u0019\u0000\u0004\u0015\u0001ᐉ\u0000\tᐉ\u0006\nᐉ\t\fᐉ\u0005\rᐉ\u0001\u0010ည\f\u0012ᐉ\u0007\u0014ᐉ\b\u0017ᐉ\u000b\u001cᐉ\u0011\u001dЛ\u001eЛ\u001fဇ\u0015\"ဋ\u0016#ဋ\u0017$ᐉ\u0013%ᐉ\u0018&ᐉ\u0012'ᐉ\u0003(Л*ᐉ\u0014+ᐉ\u001a,Л-ᐉ\u001b̉ᐉ\u0019", new Object[]{"b", "c", "f", "i", "z", "d", "j", "g", "h", "A", "k", "n", apxf.class, "o", apxf.class, "s", "t", "u", "q", "B", "p", "e", "m", aulq.class, "r", "C", "v", aulq.class, "x", "w"});
            case NEW_MUTABLE_INSTANCE:
                return new arjv();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = y;
                if (aopfVar == null) {
                    synchronized (arjv.class) {
                        aopfVar = y;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            y = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
