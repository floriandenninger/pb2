package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqzx extends aonm implements aooz {
    public static final aqzx a;
    private static volatile aopf k;
    public int b;
    public aqyg c;
    public avgg d;
    public avgg e;
    public avgg f;
    public arfs g;
    public apmh i;
    public apmh j;
    private aota l;
    private byte m = 2;
    public aony h = emptyProtobufList();

    static {
        aqzx aqzxVar = new aqzx();
        a = aqzxVar;
        aonm.registerDefaultInstance(aqzx.class, aqzxVar);
    }

    private aqzx() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\t\u0001ᐉ\b\u0003ᐉ\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004\bЛ\tᐉ\u0005\nᐉ\u0006", new Object[]{"b", "l", "c", "d", "e", "f", "g", "h", aqyg.class, "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aqzx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (aqzx.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
