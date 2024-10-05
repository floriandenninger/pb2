package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arcq extends aonm implements aooz {
    public static final arcq a;
    private static volatile aopf m;
    public int b;
    public avgg c;
    public aqyg e;
    public int f;
    public aqyg g;
    public aqyg h;
    public aqyg i;
    public apxf j;
    public atdf k;
    private apxf n;
    private apmh o;
    private aota p;
    private byte q = 2;
    public aony d = emptyProtobufList();
    public aomf l = aomf.b;

    static {
        arcq arcqVar = new arcq();
        a = arcqVar;
        aonm.registerDefaultInstance(arcq.class, arcqVar);
    }

    private arcq() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0002\u000e\r\u0000\u0001\u000b\u0002ᐉ\u0001\u0003Л\u0004ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\u000b\fည\f\rင\u0003\u000eᐉ\n", new Object[]{"b", "c", "d", avfv.class, "e", "g", "h", "i", "j", "n", "k", "p", "l", "f", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new arcq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (arcq.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
