package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arpw extends aonm implements aooz {
    public static final arpw a;
    private static volatile aopf g;
    public int b;
    public aqyg d;
    public int f;
    private aota h;
    private apmh i;
    private apmh j;
    private apxf k;
    private apmh l;
    private byte m = 2;
    public aomf c = aomf.b;
    public aony e = emptyProtobufList();

    static {
        arpw arpwVar = new arpw();
        a = arpwVar;
        aonm.registerDefaultInstance(arpw.class, arpwVar);
    }

    private arpw() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ည\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tဌ\u0007", new Object[]{"b", "h", "c", "d", "e", arpx.class, "i", "j", "k", "l", "f", aqkw.a});
            case NEW_MUTABLE_INSTANCE:
                return new arpw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (arpw.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
