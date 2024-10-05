package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aumq extends aonm implements aooz {
    public static final aumq a;
    private static volatile aopf l;
    public int b;
    public Object d;
    public aqyg e;
    public aqyg f;
    public apxf g;
    public aump h;
    public aumn j;
    private aqyg m;
    private aulq n;
    private aulq o;
    private aulq p;
    private aota q;
    public int c = 0;
    private byte r = 2;
    public aony i = emptyProtobufList();
    public aomf k = aomf.b;

    static {
        aumq aumqVar = new aumq();
        a = aumqVar;
        aonm.registerDefaultInstance(aumq.class, aumqVar);
    }

    private aumq() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0001\f\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐼ\u0000\u0004ᐉ\u0006\u0005ᐉ\u000b\u0006ည\f\u0007ᐼ\u0000\bဉ\b\tЛ\nᐉ\u0003\u000bᐉ\u0007\fᐉ\u0001\rᐉ\t\u000eᐉ\n", new Object[]{"d", "c", "b", "e", "f", apsq.class, "h", "q", "k", arfs.class, "j", "i", aumo.class, "g", "n", "m", "o", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new aumq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aumq.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
